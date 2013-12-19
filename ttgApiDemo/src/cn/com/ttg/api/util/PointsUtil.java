package cn.com.ttg.api.util;

import cn.com.ttg.Param.ActionUtil;
import cn.com.ttg.Param.ParaUtil;
import cn.com.ttg.Param.Param;
import cn.com.ttg.Param.UrlUtil;
import cn.com.ttg.entity.Points;
import cn.com.ttg.util.HttpRequest;

public class PointsUtil {

	/**
	 * 积分充值
	 * 
	 * @param p
	 *            Param 类型 封装后的参数
	 * @returns
	 */
	public Points chargepoints(Param p) {
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
		Param p = new Param();
		PointsUtil pointsUtil = new PointsUtil();
		p.put(ParaUtil.action, ActionUtil.chargePointsAction);
		p.put(ParaUtil.mobile, "13800138001");
		p.put(ParaUtil.card, "6225888877779999");
		// ptype 报 ptype ；类型错误
		p.put(ParaUtil.ptype, "CMCC");
		p.put(ParaUtil.amount, "100");
		p.put(ParaUtil.orderid, "123456789");
		pointsUtil.chargepoints(p);
	}
}
