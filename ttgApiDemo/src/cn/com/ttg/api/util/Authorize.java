package cn.com.ttg.api.util;

import net.sf.json.JSONObject;
import cn.com.ttg.Json.JsonUtil;
import cn.com.ttg.Param.ActionUtil;
import cn.com.ttg.Param.ParaUtil;
import cn.com.ttg.Param.Param;
import cn.com.ttg.Param.UrlUtil;

public class Authorize {

	public static boolean checkAuthorize(Param p) {
		JSONObject jo = JsonUtil.sendGet(UrlUtil.url, p);
		return jo.getInt("ret") == 0;
	}

	/**
	 * 根据银行卡号判断 是哪家银行
	 * 
	 * @param p
	 * @return
	 */
	public static String checkCardno(Param p) {
		p.put(ParaUtil.action, ActionUtil.checkCardonNoAction);
		JSONObject jo = JsonUtil.sendGet(UrlUtil.url, p);
		int result = jo.getJSONArray("data").getJSONObject(0).getInt("result");
		return Notify.banktypeList.get(result - 1);
	}

	/**
	 * 根据银行卡号判断 是哪家银行
	 * 
	 * @param p
	 * @return
	 */
	public static String checkCardno(String cardNo) {
		Param p = new Param();
		p.put(ParaUtil.cardno, cardNo);
		p.put(ParaUtil.action, ActionUtil.checkCardonNoAction);
		JSONObject jo = JsonUtil.sendGet(UrlUtil.url, p);
		int result = jo.getJSONArray("data").getJSONObject(0).getInt("result");
		return Notify.banktypeList.get(result - 1);
	}
}
