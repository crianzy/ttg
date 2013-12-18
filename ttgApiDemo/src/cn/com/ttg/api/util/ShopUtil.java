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
import cn.com.ttg.entity.Coupon;
import cn.com.ttg.entity.Impression;
import cn.com.ttg.entity.ImpressionCount;
import cn.com.ttg.entity.Page;
import cn.com.ttg.entity.Shop;
import cn.com.ttg.entity.ShopComment;
import cn.com.ttg.entity.ShopCoupon;
import cn.com.ttg.entity.ShopImage;
import cn.com.ttg.entity.ShopInfo;
import cn.com.ttg.entity.SimpleCoupon;
import cn.com.ttg.entity.VipCard;
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
		// 解析相应的bean
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

	/**
	 * 返回商店 优惠劵
	 * 
	 * @param p
	 * @return 带分页信息
	 */
	@SuppressWarnings("unchecked")
	public Page<ShopCoupon> getShopCoupon(Param p) {
		String json = HttpRequest.sendGet(UrlUtil.url, p.toString());
		System.out.println("jsonString = " + json);
		JSONObject jo = JsonUtil.formStringToJson(json);
		JSONObject data = jo.getJSONObject("data");
		JSONObject pages = data.getJSONObject("pages");
		JSONArray list = data.getJSONArray("list");
		Page<ShopCoupon> page = (Page<ShopCoupon>) pages.toBean(pages,
				Page.class);
		ShopCoupon[] coupons = (ShopCoupon[]) list.toArray(list,
				ShopCoupon.class);
		List<ShopCoupon> couponList = Arrays.asList(coupons);
		page.setList(couponList);
		return page;
	}

	/**
	 * 返回商户的图片
	 * 
	 * @param p
	 * @return
	 */
	public List<ShopImage> getshopimage(Param p) {
		String json = HttpRequest.sendGet(UrlUtil.url, p.toString());
		System.out.println("jsonString = " + json);
		JSONObject jo = JsonUtil.formStringToJson(json);
		JSONArray data = jo.getJSONArray("data");
		ShopImage[] pics = (ShopImage[]) data.toArray(data, ShopImage.class);
		List<ShopImage> piclist = Arrays.asList(pics);
		return piclist;
	}

	/**
	 * 返回对商户评论
	 * 
	 * @param p
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public Page<ShopComment> shopComment(Param p) {
		String json = HttpRequest.sendGet(UrlUtil.url, p.toString());
		System.out.println("jsonString = " + json);
		JSONObject jo = JsonUtil.formStringToJson(json);
		JSONObject data = jo.getJSONObject("data");
		JSONObject pages = data.getJSONObject("pages");
		JSONArray list = data.getJSONArray("list");
		Page<ShopComment> page = (Page<ShopComment>) pages.toBean(pages,
				Page.class);
		ShopComment[] shopComments = (ShopComment[]) list.toArray(list,
				ShopComment.class);
		List<ShopComment> shopCommentList = Arrays.asList(shopComments);
		page.setList(shopCommentList);
		return page;
	}

	/**
	 * 返回商户的 信息
	 * 
	 * @param p
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public ShopInfo shopinfo(Param p) {
		String json = HttpRequest.sendGet(UrlUtil.url, p.toString());
		System.out.println("jsonString = " + json);
		JSONObject jo = JsonUtil.formStringToJson(json);
		JSONObject data = jo.getJSONObject("data");
		Shop shop = (Shop) JSONObject.toBean(data.getJSONArray("shop")
				.getJSONObject(0), Shop.class);
		
		SimpleCoupon[] coupons = null;
		VipCard[] vipcards = null;
		ShopComment[] comments = null;
		Shop[] branchstore = null;
		if (data.containsKey("coupons")) {
			// coupons = (Coupon[]) JSONArray.toArray(
			// data.getJSONArray("coupons"), Coupon.class);
			JSONArray test = data.getJSONArray("coupons");
			coupons = (SimpleCoupon[]) JSONArray.toArray(test, SimpleCoupon.class);
		}
		if (data.containsKey("vipcards")) {
			vipcards = (VipCard[]) JSONArray.toArray(
					data.getJSONArray("vipcards"), VipCard.class);
		}
		if (data.containsKey("comments")) {
			comments = (ShopComment[]) JSONArray.toArray(
					data.getJSONArray("comments"), ShopComment.class);
		}
		if (data.containsKey("branchstore")) {
			branchstore = (Shop[]) JSONArray.toArray(
					data.getJSONArray("branchstore"), Shop.class);
		}
		// ImpressionCount 需要进行两次 count + Impression
		Count[] counts = (Count[]) JSONArray.toArray(
				data.getJSONObject("impression").getJSONArray("count"),
				Count.class);
		Impression[] list = (Impression[]) JSONArray.toArray(data
				.getJSONObject("impression").getJSONArray("list"),
				Impression.class);
		ImpressionCount<Impression> impression = new ImpressionCount<Impression>();
		impression.setCounts(Arrays.asList(counts));
		impression.setList(Arrays.asList(list));

		ShopInfo shopInfo = new ShopInfo();
		shopInfo.setBranchstore(branchstore);
		shopInfo.setComments(comments);
		shopInfo.setCoupons(coupons);
		shopInfo.setImpression(impression);
		shopInfo.setShop(shop);
		shopInfo.setVipcards(vipcards);
		return shopInfo;
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

		// p.put(ParaUtil.action, ActionUtil.getShopCouponAction);
		// p.put(ParaUtil.shopid, "100068");
		// // p.remove(ParaUtil.appkey);
		// p.put(ParaUtil.brcolumn, "abcdefghijklmn");
		// shopUtil.getShopCoupon(p);

		// p.put(ParaUtil.action, ActionUtil.getShopImageAction);
		// p.put(ParaUtil.shopid, "100068");
		// shopUtil.getshopimage(p);

		// p.put(ParaUtil.action, ActionUtil.getShopCommentAction);
		// p.put(ParaUtil.shopid, "100068");
		// p.put(ParaUtil.comcolumn, "abcdefghijklmnopqrstuvw");
		// shopUtil.shopComment(p);

		p.put(ParaUtil.action, ActionUtil.shopInfoAction);
		p.put(ParaUtil.shopid, "106499");
		p.put(ParaUtil.shopcolumn, "abcdefghijklmnopqrstuvwxyz");
		p.put(ParaUtil.coupons, "5");
		p.put(ParaUtil.coucolumn, "abcdefghijklmn");
		p.put(ParaUtil.comments, "5");
		p.put(ParaUtil.comcolumn, "abcdefgh");
		p.put(ParaUtil.brcolumn, "5");
		p.put(ParaUtil.branchstore, "12");
		p.put(ParaUtil.impressions, "5");
		p.put(ParaUtil.impcolumn, "abcdefgh");
		shopUtil.shopinfo(p);

	}
}
