package cn.com.ttg.api;

import java.util.Map;

import cn.com.ttg.api.param.Param;

public class TTGRequest {

	public static enum Method {
		PUT, DELETE, POST, GET
	}

	private String path;

	private Method method;

	private Param param;

	// TODO param have some question seem to user Param like Map
	public TTGRequest(String path, Method method, Param param ) {
		super();
		this.path = path;
		this.method = method;
		this.param = param;
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

	@Override
	public String toString() {
		return "RennRequest [path=" + path + ", method=" + method
				+ ", textParams=" + param + "]";
	}

	public Param getParam() {
		return param;
	}
	
	

}
