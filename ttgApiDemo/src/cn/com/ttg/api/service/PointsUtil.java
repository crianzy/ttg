package cn.com.ttg.api.service;

import cn.com.ttg.Param.Param;
import cn.com.ttg.Param.UrlUtil;
import cn.com.ttg.api.entity.Points;
import cn.com.ttg.util.HttpRequest;

public class PointsUtil {

	/**
	 * 积分充值
	 * 
	 * @param p
	 *            Param 类型 封装后的参数
	 * @returns
	 */
	public Points chargePoints(Param p) {
		String json = HttpRequest.sendGet(UrlUtil.url, p.toString());
		System.out.println(json);
		//TODO 积分没有搞定
		//		JSONObject jo = JsonUtil.formStringToJson(json);
		return null;
		// JSONArray data = jo.getJSONArray("data");
		// Points points = (Points) data.getJSONObject(0).toBean(
		// data.getJSONObject(0), Points.class);
		// return points;
	}

	public static void main(String[] args) {
		
	}
}
