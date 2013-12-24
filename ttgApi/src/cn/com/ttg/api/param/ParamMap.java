package cn.com.ttg.api.param;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

/**
 * 封装的参数 继承 HashMap
 * 
 * @author leon
 * 
 */
public class ParamMap extends HashMap<String, String> {

	private static final long serialVersionUID = 3530303875200578968L;

	private String timestamp = ParaUtil.getTimestamp();
	// private ParamCheck paramCheck;

	/**
	 * Action 必选参数的验证
	 */
	private ParamVerifyInterface ationVerify;

	private ParamVerify paramVerify;

	// TODO 注入参数验证
	public ParamMap() {
		addAuthorize();
		ationVerify = new ParamActionVerify();
		paramVerify = new ParamVerify();
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
	 * 将封装的 好的 转换成 正常的url 参数 同时进行必须参数验证
	 */
	@Override
	public String toString() {
		ationVerify.verify(this);
		StringBuffer paraString = new StringBuffer();
		for (Iterator<Entry<String, String>> itr = this.entrySet().iterator(); itr
				.hasNext();) {
			Entry<String, String> param = itr.next();
			paramVerify.verify(param.getKey(), param.getValue());
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
		ParamMap p = new ParamMap();
		System.out.println(p);
	}

	public String getTimestamp() {
		return timestamp;
	}

	public void setAtionVerify(ParamVerifyInterface ationVerify) {
		this.ationVerify = ationVerify;
	}

	public void setParamVerify(ParamVerify paramVerify) {
		this.paramVerify = paramVerify;
	}

}
