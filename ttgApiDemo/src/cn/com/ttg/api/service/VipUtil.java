package cn.com.ttg.api.service;

import java.util.Arrays;
import java.util.List;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import cn.com.ttg.Param.ActionUtil;
import cn.com.ttg.Param.ParaUtil;
import cn.com.ttg.Param.Param;
import cn.com.ttg.Param.UrlUtil;
import cn.com.ttg.api.entity.Page;
import cn.com.ttg.api.entity.Shop;
import cn.com.ttg.api.entity.VipCard;
import cn.com.ttg.api.entity.VipCardLog;
import cn.com.ttg.api.entity.VipUserCard;
import cn.com.ttg.api.json.JsonUtil;

@SuppressWarnings("unchecked")
public class VipUtil {

	/**
	 * 获取所有的会员卡数据
	 * 
	 * @param p
	 * @return
	 */
	public Page<VipCard> getVipCard(Param p) {
		JSONObject jo = JsonUtil.sendGet(UrlUtil.url, p);
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

	/**
	 * 银行卡绑定 会员卡
	 * 
	 * @param p
	 * @return
	 */
	public VipCardLog addVipCard(Param p) {
		JSONObject jo = JsonUtil.sendGet(UrlUtil.url, p);
		JSONArray data = jo.getJSONArray("data");
		JSONObject jsvipcardLog = data.getJSONObject(0);
		VipCardLog vipcardLog = (VipCardLog) JSONObject.toBean(jsvipcardLog,
				VipCardLog.class);

		return vipcardLog;
	}

	/**
	 * 用户会员卡 查询 （查询与绑定的会员卡）
	 * 
	 * @param p
	 * @return 返回绑定的日子信息
	 */
	public Page<VipUserCard> userVipVard(Param p) {
		JSONObject jo = JsonUtil.sendGet(UrlUtil.url, p);
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

	public List<Shop> getCouponBranch(Param p) {
		return new CouponUtil().getCouponBranch(p);
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
