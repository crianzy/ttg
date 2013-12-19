package cn.com.ttg.Json;

import cn.com.ttg.Param.Param;
import cn.com.ttg.Param.UrlUtil;
import cn.com.ttg.exception.CustomException;
import cn.com.ttg.util.HttpRequest;
import net.sf.json.JSONObject;

public class JsonUtil {

	/**
	 * 向服务器发送 get请求 同时将 返回的数据转换成JsonObject 如果返回的信息有错有 这回抛出异常
	 * 
	 * @param url
	 * @param p
	 * @return
	 */
	public static JSONObject sendGet(String url, Param p) {
		String json = HttpRequest.sendGet(UrlUtil.url, p.toString());
		System.out.println("jsonString = " + json);
		JSONObject jo = JSONObject.fromObject(json);
		int errcode = jo.getInt("errcode");
		if (errcode != 0) {
			String msg = jo.getString("msg");
			throw new CustomException(msg);
		}
		return jo;
	}

	/**
	 * 将String 转换成 Json 格式的数据 JSONObject
	 * 
	 * @param json
	 * @return
	 */
	public static JSONObject formStringToJson(String json) {
		JSONObject jo = JSONObject.fromObject(json);
		int errcode = jo.getInt("errcode");
		if (errcode != 0) {
			String msg = jo.getString("msg");
			throw new CustomException(msg);
		}
		return jo;
	}

}
