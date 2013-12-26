package cn.com.ttg.api.bean.service;

import java.util.Arrays;
import java.util.List;

import org.apache.log4j.Logger;
import org.codehaus.jackson.map.ObjectMapper;

import cn.com.ttg.api.Config;
import cn.com.ttg.api.ConfigKey;
import cn.com.ttg.api.TTGExecutor;
import cn.com.ttg.api.TTGRequest;
import cn.com.ttg.api.TTGRequest.Method;
import cn.com.ttg.api.TTGResponse;
import cn.com.ttg.api.bean.Count;
import cn.com.ttg.api.bean.Coupon;
import cn.com.ttg.api.bean.Impression;
import cn.com.ttg.api.bean.ImpressionCount;
import cn.com.ttg.api.bean.Page;
import cn.com.ttg.api.bean.Shop;
import cn.com.ttg.api.bean.ShopComment;
import cn.com.ttg.api.bean.ShopCoupon;
import cn.com.ttg.api.bean.ShopImage;
import cn.com.ttg.api.bean.ShopInfo;
import cn.com.ttg.api.bean.VipCard;
import cn.com.ttg.api.exception.TTGException;
import cn.com.ttg.api.json.JSONArray;
import cn.com.ttg.api.json.JSONException;
import cn.com.ttg.api.json.JSONObject;
import cn.com.ttg.api.param.ParamMap;

public class ShopService extends BaseService {
	private static String urlPath = Config.getProperties(ConfigKey.urlpath);
	private static Logger logger = Logger.getLogger(DataDictionaryService.class
			.getName());
	private static String TAG = "DataDictionaryService ";

	public ShopService(TTGExecutor executor, ObjectMapper objectMapper) {
		super(executor, objectMapper);
	}

	/**
	 * 返回商户的分店信息
	 * 
	 * @param param
	 * @return
	 */
	public Page<Shop> getShopBranch(ParamMap param) {
		TTGRequest request = new TTGRequest(urlPath, Method.GET, param);
		TTGResponse response = executor.execute(request);
		Page<Shop> page = null;
		Shop[] shops = null;
		JSONObject data;
		try {
			data = new JSONObject(response.getResponse().toString());
			JSONObject pages = data.getJSONObject("pages");
			JSONArray list = data.getJSONArray("list");
			page = mapper.readValue(pages.toString(), Page.class);
			shops = mapper.readValue(list.toString(), Shop[].class);
		} catch (Exception e) {
			e.printStackTrace();
			logger.error(TAG + "解析 josn 错误");
			throw new TTGException(TAG + "解析json 错误", e);
		}
		page.setList(Arrays.asList(shops));
		return page;
	}

	/**
	 * 返回商店 优惠劵
	 * 
	 * @param param
	 * @return
	 */
	public Page<ShopCoupon> getShopCoupon(ParamMap param) {
		TTGRequest request = new TTGRequest(urlPath, Method.GET, param);
		TTGResponse response = executor.execute(request);
		Page<ShopCoupon> page = null;
		ShopCoupon[] shopcoupons = null;
		JSONObject data;
		try {
			data = new JSONObject(response.getResponse().toString());
			JSONObject pages = data.getJSONObject("pages");
			JSONArray list = data.getJSONArray("list");
			page = mapper.readValue(pages.toString(), Page.class);
			shopcoupons = mapper.readValue(list.toString(), ShopCoupon[].class);
		} catch (Exception e) {
			e.printStackTrace();
			logger.error(TAG + "解析 josn 错误");
			throw new TTGException(TAG + "解析json 错误", e);
		}
		page.setList(Arrays.asList(shopcoupons));
		return page;
	}

	/**
	 * 获得 商户口碑
	 * 
	 * @param param
	 * @return
	 */
	public ImpressionCount<Impression> shopImpression(ParamMap param) {
		TTGRequest request = new TTGRequest(urlPath, Method.GET, param);
		TTGResponse response = executor.execute(request);
		JSONObject data;
		Count[] counts;
		Impression[] impressions;
		Page<Impression> page;
		try {
			data = new JSONObject(response.getResponse().toString());

			JSONArray count = data.getJSONArray("count");
			JSONObject pages = data.getJSONObject("pages");
			JSONArray list = data.getJSONArray("list");
			counts = mapper.readValue(count.toString(), Count[].class);
			impressions = mapper.readValue(list.toString(), Impression[].class);
			page = mapper.readValue(pages.toString(), Page.class);
		} catch (Exception e) {
			e.printStackTrace();
			logger.error(TAG + "解析 josn 错误");
			throw new TTGException(TAG + "解析json 错误", e);
		}
		page.setList(Arrays.asList(impressions));
		ImpressionCount<Impression> impressionCount = new ImpressionCount<Impression>();
		impressionCount.setPage(page);
		impressionCount.setCounts(Arrays.asList(counts));
		impressionCount.setList(Arrays.asList(impressions));
		return impressionCount;
	}

	/**
	 * 返回商户的图片
	 * 
	 * @param param
	 * @return
	 */
	public List<ShopImage> getshopimage(ParamMap param) {
		TTGRequest request = new TTGRequest(urlPath, Method.GET, param);
		TTGResponse response = executor.execute(request);
		ShopImage[] shopimgs = null;
		try {
			shopimgs = mapper.readValue(response.getResponse().toString(),
					ShopImage[].class);
		} catch (Exception e) {
			e.printStackTrace();
			logger.error(TAG + "解析 josn 错误");
			throw new TTGException(TAG + "解析json 错误", e);
		}
		return Arrays.asList(shopimgs);
	}

	/**
	 * 返回对商户评论
	 * 
	 * @param param
	 * @return
	 */
	public Page<ShopComment> shopComment(ParamMap param) {
		TTGRequest request = new TTGRequest(urlPath, Method.GET, param);
		TTGResponse response = executor.execute(request);
		Page<ShopComment> page = null;
		ShopComment[] shopcomments = null;
		JSONObject data;
		try {
			data = new JSONObject(response.getResponse().toString());
			JSONObject pages = data.getJSONObject("pages");
			JSONArray list = data.getJSONArray("list");
			page = mapper.readValue(pages.toString(), Page.class);
			shopcomments = mapper.readValue(list.toString(),
					ShopComment[].class);
		} catch (Exception e) {
			e.printStackTrace();
			logger.error(TAG + "解析 josn 错误");
			throw new TTGException(TAG + "解析json 错误", e);
		}
		page.setList(Arrays.asList(shopcomments));
		return page;
	}

	public ShopInfo shopInfo(ParamMap param) {
		TTGRequest request = new TTGRequest(urlPath, Method.GET, param);
		TTGResponse response = executor.execute(request);
		Shop shop = null;
		Coupon[] coupons = null;
		VipCard[] vipcards = null;
		ShopComment[] comments = null;
		Shop[] branchstore = null;
		Count[] counts = null;
		Impression[] impressions = null;
		ImpressionCount<Impression> impression = null;
		JSONObject data;
		try {
			data = new JSONObject(response.getResponse().toString());
			shop = mapper.readValue(
					data.getJSONArray("shop").getJSONObject(0).toString(),
					Shop.class);
			if (data.has("coupons")) {
			coupons = mapper.readValue(data.getJSONArray("coupons").toString(),
					Coupon[].class);
			}
			if (data.has("vipcards")) {
			vipcards = mapper.readValue(data.getJSONArray("vipcards")
					.toString(), VipCard[].class);
			}
			if (data.has("comments")) {
			comments = mapper.readValue(data.getJSONArray("comments")
					.toString(), ShopComment[].class);
			}
			if (data.has("branchstore")) {
			branchstore = mapper.readValue(data.getJSONArray("branchstore")
					.toString(), Shop[].class);
			}
			if (data.has("impression")) {
			counts = mapper.readValue(data.getJSONObject("impression")
					.getJSONArray("count").toString(), Count[].class);
			impressions = mapper.readValue(data.getJSONObject("impression")
					.getJSONArray("list").toString(), Impression[].class);
			impression = new ImpressionCount<Impression>();
			impression.setCounts(Arrays.asList(counts));
			impression.setList(Arrays.asList(impressions));
			}
		} catch (Exception e) {
			e.printStackTrace();
			logger.error(TAG + "解析 josn 错误");
			throw new TTGException(TAG + "解析json 错误", e);
		}
		
		ShopInfo shopInfo = new ShopInfo();
		shopInfo.setBranchstore(Arrays.asList(branchstore));
		shopInfo.setComments(Arrays.asList(comments));
		shopInfo.setCoupons(Arrays.asList(coupons));
		shopInfo.setImpression(impression);
		shopInfo.setShop(shop);
		shopInfo.setVipcards(Arrays.asList(vipcards));
		return shopInfo;
	}
}
