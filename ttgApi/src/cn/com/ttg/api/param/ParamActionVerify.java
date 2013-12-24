package cn.com.ttg.api.param;

import java.io.File;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.List;

import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import cn.com.ttg.api.Config;
import cn.com.ttg.api.exception.TTGException;

public class ParamActionVerify implements ParamVerifyInterface {
	private static final String filename = "actionParamCheck.xml";
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
	public List<String> verify(ParamMap param) {
		List<String> lackPs = new ArrayList<String>();
		boolean lack = false;
		String action = param.get(ParaUtil.action);
		if(action==null){
			throw new TTGException("参数错误  action 为空");
		}
		List<Element> actionelms = root.elements("actionName");
		for (Element actionelm : actionelms) {
			if (actionelm.attributeValue("name").equals(action)) {
				List<Element> mustelems = actionelm.elements("mustParam");
				for (Element mustelm : mustelems) {
					String mustParm = mustelm.getStringValue();
					System.out.println(mustParm);
					if (!param.containsKey(mustParm)) {
						lackPs.add(mustParm);
						lack = true;
					}
				}
				Element oneOf = actionelm.element("OneOfParam");
				if (oneOf != null) {
					List<Element> oneOfs = oneOf.elements("param");
					boolean have = false;
					boolean error = false;
					boolean isnull = true;
					for (Element element : oneOfs) {
						String para = element.getStringValue();
						lackPs.add(para);
						if (!have && param.containsKey(para)) {
							isnull = false;
							have = true;
							continue;
						}
						if (have && param.containsKey(para)) {
							error = true;
							continue;
						}
					}
					if (error || isnull) {
						throw new TTGException(action + " 的（多选一）参数列表 "
								+ lackPs.toString() + " 必选且只能选其中一个参数");
					}
				}
				break;
			}
		}
		if (lack) {
			throw new TTGException(action + "的必须参数" + lackPs.toString() + "缺失");
		}
		return lackPs;
	}

	public static void main(String[] args) {
		ParamMap param = new ParamMap();
		param.put(ParaUtil.action, ActionUtil.getCouponBranchAction);
		// param.put(ParaUtil.couid, "12123");
		// param.put(ParaUtil.svcid, "24234");
		// param.put("asdasd", "24234");
		// param.put(ParaUtil.cardno, ParaUtil.cardTestNo);
		new ParamActionVerify().verify(param);
	}
}
