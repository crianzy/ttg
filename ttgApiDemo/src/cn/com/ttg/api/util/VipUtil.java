package cn.com.ttg.api.util;

import java.util.Arrays;
import java.util.List;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import cn.com.ttg.Json.JsonUtil;
import cn.com.ttg.Param.ActionUtil;
import cn.com.ttg.Param.ParaUtil;
import cn.com.ttg.Param.Param;
import cn.com.ttg.Param.UrlUtil;
import cn.com.ttg.entity.Coupon;
import cn.com.ttg.entity.Page;
import cn.com.ttg.entity.VipCard;
import cn.com.ttg.entity.VipCardLog;
import cn.com.ttg.entity.VipUserCard;
import cn.com.ttg.util.HttpRequest;

public class VipUtil {

	@SuppressWarnings("unchecked")
	public Page<VipCard> getVipCard(Param p) {
		String json = HttpRequest.sendGet(UrlUtil.url, p.toString());
		System.out.println(json);
		JSONObject jo = JsonUtil.formStringToJson(json);
		JSONObject data = jo.getJSONObject("data");
		JSONObject pages = data.getJSONObject("pages");
		JSONArray list = data.getJSONArray("list");
		Page<VipCard> page = (Page<VipCard>) JSONObject.toBean(pages,
				Page.class);
		VipCard[] cards = (VipCard[]) JSONArray.toArray(list, VipCard.class);
		List<VipCard> cardList = Arrays.asList(cards);
		page.setList(cardList);
		return page;
	}

	public VipCardLog addVipCard(Param p) {
		String json = HttpRequest.sendGet(UrlUtil.url, p.toString());
		System.out.println(json);
		JSONObject jo = JsonUtil.formStringToJson(json);
		JSONArray data = jo.getJSONArray("data");
		JSONObject jsvipcardLod = data.getJSONObject(0);
		VipCardLog vipcardLod = (VipCardLog) JSONObject.toBean(jsvipcardLod,
				VipCardLog.class);

		return vipcardLod;
	}

	@SuppressWarnings("unchecked")
	public Page<VipUserCard> userVipVard(Param p) {
		String json = HttpRequest.sendGet(UrlUtil.url, p.toString());
		System.out.println(json);
		JSONObject jo = JsonUtil.formStringToJson(json);
		JSONObject data = jo.getJSONObject("data");
		JSONObject pages = data.getJSONObject("pages");
		JSONArray list = data.getJSONArray("list");
		Page<VipUserCard> page = (Page<VipUserCard>) JSONObject.toBean(pages,
				Page.class);
		VipUserCard[] cards = (VipUserCard[]) JSONArray.toArray(list,
				VipUserCard.class);
		List<VipUserCard> cardList = Arrays.asList(cards);
		page.setList(cardList);

		return page;

	}

	public List<Coupon> getcouponbranch(Param p) {
		return new CouponUtil().getcouponbranch(p);

	}

	public static void main(String[] args) {
		Param p = new Param();
		p.put(ParaUtil.action, ActionUtil.getVipCardAction);
		p.put(ParaUtil.clsid, "1");
		p.put(ParaUtil.shopcolumn, "abcdefghi");
		p.put(ParaUtil.coucolumn, "abcefghijkl");
		VipUtil vipUtil = new VipUtil();
		vipUtil.getVipCard(p);
	}
}
