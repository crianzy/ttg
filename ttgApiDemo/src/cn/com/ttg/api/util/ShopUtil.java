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
import cn.com.ttg.entity.Count;
import cn.com.ttg.entity.Impression;
import cn.com.ttg.entity.ImpressionCount;
import cn.com.ttg.entity.Page;
import cn.com.ttg.entity.Picture;
import cn.com.ttg.entity.Shop;
import cn.com.ttg.entity.ShopCoupon;
import cn.com.ttg.util.HttpRequest;

@SuppressWarnings("static-access")
public class ShopUtil {

	/**
	 * 返回商户的分店信息
	 * 
	 * @param p
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public Page<Shop> getShopBranch(Param p) {
		String json = HttpRequest.sendGet(UrlUtil.url, p.toString());
		System.out.println(json);
		JSONObject jo = JsonUtil.formStringToJson(json);
		JSONObject data = jo.getJSONObject("data");
		JSONObject pageJson = data.getJSONObject("pages");
		Page<Shop> page = (Page<Shop>) pageJson.toBean(pageJson, Page.class);
		JSONArray list = data.getJSONArray("list");
		Shop[] shops = (Shop[]) list.toArray(list, Shop.class);
		List<Shop> shopList = Arrays.asList(shops);
		System.out.println(shopList);
		page.setList(shopList);
		return page;
	}

	/**
	 * 获得 商户口碑
	 * 
	 * @param p
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public ImpressionCount<Impression> shopImpression(Param p) {
		ImpressionCount<Impression> impressionCount = new ImpressionCount<Impression>();
		String json = HttpRequest.sendGet(UrlUtil.url, p.toString());
		System.out.println("jsonString = " + json);
		JSONObject jo = JsonUtil.formStringToJson(json);
		JSONObject data = jo.getJSONObject("data");
		JSONArray count = data.getJSONArray("count");
		JSONObject pages = data.getJSONObject("pages");
		JSONArray list = data.getJSONArray("list");
		// 解析除相应的bean
		Count[] counts = (Count[]) count.toArray(count, Count.class);
		List<Count> countList = Arrays.asList(counts);
		Impression[] impressions = (Impression[]) list.toArray(list,
				Impression.class);
		List<Impression> impressionlList = Arrays.asList(impressions);
		Page<Impression> page = (Page<Impression>) pages.toBean(pages,
				Page.class);
		page.setList(impressionlList);
		impressionCount.setPage(page);
		impressionCount.setCounts(countList);
		return impressionCount;
	}

	@SuppressWarnings("unchecked")
	public Page<ShopCoupon> getShopCoupon(Param p) {
		String json = HttpRequest.sendGet(UrlUtil.url, p.toString());
		System.out.println("jsonString = " + json);
		JSONObject jo = JsonUtil.formStringToJson(json);
		JSONObject data = jo.getJSONObject("data");
		JSONObject pages = data.getJSONObject("pages");
		JSONArray list = data.getJSONArray("list");
		Page<ShopCoupon> page = (Page<ShopCoupon>) pages.toBean(pages, Page.class);
		ShopCoupon[] coupons = (ShopCoupon[]) list.toArray(list,
				ShopCoupon.class);
		List<ShopCoupon> couponList = Arrays.asList(coupons);
		page.setList(couponList);
		return page;
	}
	
	public List<Picture> getshopimage(Param p){
		String json = HttpRequest.sendGet(UrlUtil.url, p.toString());
		System.out.println("jsonString = " + json);
		JSONObject jo = JsonUtil.formStringToJson(json);
		JSONObject data = jo.getJSONObject("data");
		return null;
	}

	public static void main(String[] args) {

		Param p = new Param();
		ShopUtil shopUtil = new ShopUtil();
		// p.put(ParaUtil.action, ActionUtil.getShopBranchAction);
		// p.put(ParaUtil.shopid, "100068");
		// p.put(ParaUtil.brcolumn, "abcdefghijklmnopqrstuvw");
		// shopUtil.getShopBranch(p);

		// p.put(ParaUtil.action, ActionUtil.shopImpressionAction);
		// p.put(ParaUtil.shopid, "100068");
		// p.put(ParaUtil.brcolumn, "abcdefghijklmn");
		// shopUtil.shopImpression(p);
		p.put(ParaUtil.action, ActionUtil.getShopCouponAction);
		p.put(ParaUtil.shopid, "100068");
		//p.remove(ParaUtil.appkey);
		p.put(ParaUtil.brcolumn, "abcdefghijklmn");
		shopUtil.getShopCoupon(p);

	}
}
