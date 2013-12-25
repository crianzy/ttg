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
import cn.com.ttg.api.bean.Coupon;
import cn.com.ttg.api.bean.CouponBackLog;
import cn.com.ttg.api.bean.Page;
import cn.com.ttg.api.bean.Shop;
import cn.com.ttg.api.exception.TTGException;
import cn.com.ttg.api.json.JSONArray;
import cn.com.ttg.api.json.JSONObject;
import cn.com.ttg.api.param.ParamMap;

public class CouponService extends BaseService {
	private static String urlPath = Config.getProperties(ConfigKey.urlpath);
	private static Logger logger = Logger.getLogger(CouponService.class
			.getName());
	private static String TAG = "CouponService ";

	public CouponService(TTGExecutor executor, ObjectMapper objectMapper) {
		super(executor, objectMapper);
	}

	/**
	 * 获取所有的优惠卷的数据
	 * 
	 * @param p
	 *            Param 类型 封装后的参数
	 * @return 带有分页信息
	 */
	@SuppressWarnings("unchecked")
	public Page<Coupon> getCoupon(ParamMap param) {
		TTGRequest request = new TTGRequest(urlPath, Method.GET, param);
		TTGResponse response = executor.execute(request);
		Page<Coupon> page = null;
		Coupon[] coupons = null;
		JSONObject data;
		try {
			data = new JSONObject(response.getResponse().toString());
			JSONObject pages = data.getJSONObject("pages");
			JSONArray list = data.getJSONArray("list");
			page = mapper.readValue(pages.toString(), Page.class);
			coupons = mapper.readValue(list.toString(), Coupon[].class);
		} catch (Exception e) {
			logger.error(TAG + "解析 josn 错误");
			throw new TTGException(TAG + "解析json 错误", e);
		}
		page.setList(Arrays.asList(coupons));
		return page;
	}

	/**
	 * 绑定优惠卷
	 * @param param
	 * @return
	 */
	public CouponBackLog addCoupon(ParamMap param) {
		TTGRequest request = new TTGRequest(urlPath, Method.GET, param);
		TTGResponse response = executor.execute(request);
		CouponBackLog[] addCouponBackLogs = null;
		try {
			addCouponBackLogs = mapper.readValue(response.getResponse()
					.toString(), CouponBackLog[].class);
		} catch (Exception e) {
			e.printStackTrace();
			logger.error(TAG + "解析 josn 错误");
			throw new TTGException(TAG + "解析json 错误", e);
		}
		if (addCouponBackLogs != null && addCouponBackLogs.length > 0) {
			return addCouponBackLogs[0];
		}
		return null;
	}

	/**
	 * 获取与优惠卷相关的 shop
	 * @param param
	 * @return
	 */
	public List<Shop> getCouponBranch(ParamMap param) {
		TTGRequest request = new TTGRequest(urlPath, Method.GET, param);
		TTGResponse response = executor.execute(request);
		Shop[] shops;
		try {
			shops = mapper.readValue(response.getResponse().toString(), Shop[].class);
		} catch (Exception e) {
			e.printStackTrace();
			logger.error(TAG + "解析 josn 错误");
			throw new TTGException(TAG + "解析json 错误", e);
		}
		
		return Arrays.asList(shops);
	}
	
	/**
	 * 用户下载的优惠卷
	 * @param param
	 * @return
	 */
	public Page<CouponBackLog> getUserCoupon(ParamMap param){
		TTGRequest request = new TTGRequest(urlPath, Method.GET, param);
		TTGResponse response = executor.execute(request);
		Page<CouponBackLog> page = null;
		CouponBackLog[] couponBackLogs = null;
		JSONObject data;
		try {
			data = new JSONObject(response.getResponse().toString());
			JSONObject pages = data.getJSONObject("pages");
			JSONArray list = data.getJSONArray("list");
			page = mapper.readValue(pages.toString(), Page.class);
			couponBackLogs = mapper.readValue(list.toString(), CouponBackLog[].class);
		} catch (Exception e) {
			e.printStackTrace();
			logger.error(TAG + "解析 josn 错误");
			throw new TTGException(TAG + "解析json 错误", e);
		}
		page.setList(Arrays.asList(couponBackLogs));
		return page;
	}
	
	/**
	 * 优惠券回调通知 post 发送 优惠卷 绑定/使用信息 json格式
	 * 
	 * @param couponBackLog
	 *            优惠卷 绑定/使用信息bean
	 * @param p
	 */
	// TODO 关于 call bank post json 没有搞定
	public void postcallback(CouponBackLog couponBackLog, ParamMap param) {
		
	}

}
