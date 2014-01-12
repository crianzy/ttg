package cn.com.ttg.api.param;

import java.io.File;
import java.net.URLDecoder;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.regex.Pattern;

import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import cn.com.ttg.api.Config;
import cn.com.ttg.api.exception.TTGException;
import cn.com.ttg.api.json.JSONArray;
import cn.com.ttg.api.json.JSONException;
import cn.com.ttg.api.json.JSONObject;

public class ParamVerify implements ParamVerifyInterface {
	private static final String filename = "paramCheck.xml";
	private static Element root;
	static {
		SAXReader reader = new SAXReader();
		try {
			String classpath = URLDecoder.decode(Config.class.getResource("/")
					.getPath(), "UTF-8");
			Document document = reader.read(new File(classpath + filename));
			root = document.getRootElement();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void verify(String key, String value) {
		List<Element> paramList = root.elements("param");
		boolean isKnowParam = false;
		for (Element param : paramList) {
			if (param.attributeValue("name").equals(key)) {
				isKnowParam = true;
				List<Element> propertys = param.elements("property");
				for (Element propert : propertys) {
					String name = propert.attributeValue("name");
					String val = propert.attributeValue("value");
					if (val == null) {
						val = name;
					}
					Type type = Type.valueOf(Type.class, val);
					if (!check(type, value, propert)) {
						// TODO param exception
						throw new TTGException(key + " 该参数 值错误  ");
					}
				}
			}
		}
		if (!isKnowParam) {// 表示 该参数不再参数列表中 是不明参数
			throw new TTGException(key + " 该参数不再参数列表中 是不明参数  ");
		}
		// System.out.println("yes");
	}

	public static boolean isEmpty(String value) {
		if (value == null || "".equals(value)) {
			return true;
		}
		return false;
	}

	public boolean isNumber(String p) {
		Pattern pattern = Pattern.compile("[0-9]*");
		return pattern.matcher(p).matches();
	}

	public boolean isMobile(String p) {
		return isNumber(p) && p.length() == 11;
	}

	public boolean isDouble(String p) {
		try {
			Double.parseDouble(p);
		} catch (Exception e) {
			return false;
		}
		return true;
	}

	public static boolean isDate(String value, String format) {

		SimpleDateFormat sdf = null;
		ParsePosition pos = new ParsePosition(0);// 指定从所传字符串的首位开始解析

		if (value == null || isEmpty(format)) {
			return false;
		}
		try {
			sdf = new SimpleDateFormat(format);
			sdf.setLenient(false);
			Date date = sdf.parse(value, pos);
			if (date == null) {
				return false;
			} else {
				// System.out.println("-------->pos : " + pos.getIndex());
				// System.out.println("-------->date : " + sdf.format(date));
				// 更为严谨的日期,如2011-03-024认为是不合法的
				if (pos.getIndex() > sdf.format(date).length()) {
					return false;
				}
				return true;
			}
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	public boolean isString(String p) {
		return true;
	}

	public boolean isjson(String jsonStr) {
		try {
			if (jsonStr.startsWith("[")) {
				new JSONArray(jsonStr);

			} else if (jsonStr.startsWith("{")) {
				new JSONObject(jsonStr);
			}
		} catch (JSONException e) {
			return false;
		}
		return true;
	}

	public boolean isRange(String p, String min, String max) {
		int intmin = 0;
		int intmax = Integer.MAX_VALUE;
		if (min != null && !min.equals("")) {
			intmin = Integer.parseInt(min);
		}
		if (max != null && !max.equals("")) {
			intmax = Integer.parseInt(max);
		}
		int intp = Integer.parseInt(p);

		return (intp <= intmax) && (intp >= intmin);
	}

	public enum Type {
		number, string, doubles, date, mobile, range, json
	}

	public boolean check(Type type, String value, Element propert) {
		switch (type) {
		case number:
			return isNumber(value);
		case string:
			return isString(value);
		case doubles:
			return isDouble(value);
		case date:
			return isDate(value, propert.attributeValue("format"));
		case mobile:
			return isMobile(value);
		case json:
			return isjson(value);
		case range:
			return isRange(value, propert.attributeValue("min"),
					propert.attributeValue("max"));
		}
		return false;
	}

	public static void main(String[] args) {
		ParamVerify paramverfy = new ParamVerify();
		Date date = new Date();
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String dateString = formatter.format(date);
		paramverfy.verify("addstime", dateString);

		paramverfy.verify("amount", "-32");
	}

}
