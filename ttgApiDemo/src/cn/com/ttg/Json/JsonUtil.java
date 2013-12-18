package cn.com.ttg.Json;

import cn.com.ttg.Param.Param;
import cn.com.ttg.Param.UrlUtil;
import cn.com.ttg.exception.CustomException;
import cn.com.ttg.util.HttpRequest;
import net.sf.json.JSONObject;

public class JsonUtil {

	public static JSONObject SendGet(String url, Param p) {
		String json = HttpRequest.sendGet(UrlUtil.url, p.toString());
		System.out.println("jsonString = " + json);
		JSONObject jo = JSONObject.fromObject(json);
		int errcode = jo.getInt("errcode");
		if (errcode != 0) {
			String msg = jo.getString("msg");
			throw new CustomException(msg);
		}
		JSONObject data = jo.getJSONObject("data");
		return data;
	}

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
