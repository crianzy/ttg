package cn.com.ttg.api.param;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.Map.Entry;

/**
 * 封装的参数 继承 HashMap
 * 
 * @author leon
 * 
 */
public class Param extends HashMap<String, String> {

	private static final long serialVersionUID = 3530303875200578968L;

	private String timestamp = ParaUtil.getTimestamp();
	//private ParamCheck paramCheck;

	//TODO 注入参数验证 
	public Param() {
		addAuthorize();
	}

	/**
	 * 添加授权信息
	 */
	public void addAuthorize() {
		this.put(ParaUtil.appkey, ParaUtil.appkeyValue);
		this.put(ParaUtil.timestamp, timestamp);
		this.put(ParaUtil.sign, ParaUtil.getSign(timestamp));
	}

	/**
	 * 将封装的 好的 转换成 正常的url 参数 
	 * 同时进行必须参数验证
	 */
	@Override
	public String toString() {
		// param chcek
		// if (this.get(ParaUtil.action) != null) {
		// paramCheck = ActionUtil.actionCheckClassMap.get(this
		// .get(ParaUtil.action));
		// paramCheck.setParam(this);
		// paramCheck.checkParam();
		// }
		StringBuffer paraString = new StringBuffer();
		for (Iterator<Entry<String, String>> itr = this.entrySet()
				.iterator(); itr.hasNext();) {
			Entry<String, String> param = itr.next();
			try {
				paraString.append(URLEncoder.encode(param.getKey(), "UTF-8"))
						.append("=")
						.append(URLEncoder.encode(param.getValue(), "UTF-8"));
			} catch (UnsupportedEncodingException e) {
				new RuntimeException(e.getMessage(), e);
			}
			if (itr.hasNext()) {
				paraString.append("&");
			}
		}
		return paraString.toString();
	}

	public static void main(String[] args) {
		Param p = new Param();
		System.out.println(p);
	}

	// public void setParamCheck(ParamCheck paramCheck) {
	// this.paramCheck = paramCheck;
	// }

	public String getTimestamp() {
		return timestamp;
	}

}
