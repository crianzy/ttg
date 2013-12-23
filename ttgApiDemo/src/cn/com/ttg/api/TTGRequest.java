package cn.com.ttg.api;

import java.util.Map;

public class TTGRequest {
	public static enum Method {
		PUT, DELETE, POST, GET
	}

	private String path;

	private Method method;

	private Map<String, String> textParams;

	public TTGRequest(String path, Method method, Map<String, String> textParams) {
		super();
		this.path = path;
		this.method = method;
		this.textParams = textParams;
	}

	/**
	 * 获取当前API请求的路径
	 * 
	 * @return API的路径
	 */
	public String getPath() {
		return path;
	}

	/**
	 * 获取当前API请求的HTTP Method
	 * 
	 * @return Method
	 */
	public Method getMethod() {
		return method;
	}

	/**
	 * 获取当前API所有的Key-Value形式的文本请求参数集合。其中：
	 * <ul>
	 * <li>Key: 请求参数名</li>
	 * <li>Value: 请求参数值</li>
	 * </ul>
	 * 
	 * @return 文本请求参数集合
	 */
	public Map<String, String> getTextParams() {
		return textParams;
	}

	@Override
	public String toString() {
		return "RennRequest [path=" + path + ", method=" + method
				+ ", textParams=" + textParams + "]";
	}

}
