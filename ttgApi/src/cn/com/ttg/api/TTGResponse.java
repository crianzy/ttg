package cn.com.ttg.api;

import cn.com.ttg.api.json.JSONArray;
import cn.com.ttg.api.json.JSONObject;


public class TTGResponse {
	/**
	 * Maybe {@link JSONObject} or {@link JSONArray}
	 */
	private Object response;

	public Object getResponse() {
		return response;
	}

	public TTGResponse(Object response) {
		super();
		this.response = response;
	}

	public boolean isJSONArrayResponse() {
		return response == null ? false : response instanceof JSONArray ? true
				: false;
	}

	@Override
	public String toString() {
		return "TTGResponse [response=" + response + "]";
	}
}
