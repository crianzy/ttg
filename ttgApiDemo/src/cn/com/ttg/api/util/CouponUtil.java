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
import cn.com.ttg.entity.CouponBackLog;
import cn.com.ttg.entity.Page;
import cn.com.ttg.entity.Shop;
import cn.com.ttg.util.HttpRequest;

@SuppressWarnings("unchecked")
public class CouponUtil {

	/**
	 * 获取所有的优惠卷的数据
	 * 
	 * @param p
	 *            Param 类型 封装后的参数
	 * @return 带有分页信息
	 */
	public Page<Coupon> Coupon(Param p) {
		JSONObject jo = JsonUtil.sendGet(UrlUtil.url, p);
		JSONObject data = jo.getJSONObject("data");
		JSONObject pages = data.getJSONObject("pages");
		JSONArray list = data.getJSONArray("list");
		Page<Coupon> page = (Page<Coupon>) JSONObject.toBean(pages, Page.class);
		Coupon[] coupons = (Coupon[]) JSONArray.toArray(list, Coupon.class);
		List<Coupon> couponList = Arrays.asList(coupons);
		page.setList(couponList);
		return page;
	}

	/**
	 * 添加优惠卷 到银行卡
	 * 
	 * @param p
	 *            包含有银行卡相关数据 Param 类型 封装后的参数
	 * @return
	 */
	public CouponBackLog addCoupon(Param p) {
		JSONObject jo = JsonUtil.sendGet(UrlUtil.url, p);
		JSONArray data = jo.getJSONArray("data");
		CouponBackLog addCouponBackLog = (CouponBackLog) JSONObject.toBean(
				data.getJSONObject(0), CouponBackLog.class);
		return addCouponBackLog;
	}

	/**
	 * 获取优惠券/会员卡关联的分店
	 * 
	 * @param p
	 *            Param 类型 封装后的参数
	 * @return List<Shop>
	 */
	public List<Shop> getCouponBranch(Param p) {
		JSONObject jo = JsonUtil.sendGet(UrlUtil.url, p);
		JSONArray data = jo.getJSONArray("data");
		Shop[] ShopList = (Shop[]) JSONArray.toArray(data, Shop.class);
		List<Shop> couponList = Arrays.asList(ShopList);
		return couponList;
	}

	/**
	 * 优惠券回调通知 post 发送 优惠卷 绑定/使用信息 json格式
	 * 
	 * @param couponBackLog
	 *            优惠卷 绑定/使用信息bean
	 * @param p
	 */
	// TODO 关于 call bank post json 没有搞定
	public void postcallback(CouponBackLog couponBackLog, Param p) {
		JSONObject data = JSONObject.fromObject(couponBackLog);
		JSONObject json = new JSONObject();
		p.remove(ParaUtil.appkey);
		json.element(ParaUtil.timestamp, p.get(ParaUtil.timestamp));
		json.element(ParaUtil.sign, p.get(ParaUtil.sign));
		// json.element(ParaUtil.appkey, p.get(ParaUtil.appkey));
		json.element("data", data);
		System.out.println(json.toString());
		// System.out.println(HttpRequest.sendJsonPost(
		// "http://localhost:8080/ttgApiDemo/",
		// p.toString() + "data="+data.toString()));
		System.out.println(HttpRequest.sendJsonPost(UrlUtil.url, p.toString()
				+ "data=" + data.toString()));
		// System.out.println(HttpRequest.sendPost("http://localhost:8080/ttgApiDemo/",
		// "a=1"));
	}

	/**
	 * 获取用户下载的优惠券
	 * 
	 * @param p
	 * @return
	 */
	public Page<CouponBackLog> getUserCoupon(Param p) {
		JSONObject jo = JsonUtil.sendGet(UrlUtil.url, p);
		JSONObject data = jo.getJSONObject("data");
		JSONObject pages = data.getJSONObject("pages");
		JSONArray list = data.getJSONArray("list");
		Page<CouponBackLog> page = (Page<CouponBackLog>) JSONObject.toBean(
				pages, Page.class);
		CouponBackLog[] couponBLogs = (CouponBackLog[]) JSONArray.toArray(list,
				CouponBackLog.class);
		page.setList(Arrays.asList(couponBLogs));
		return page;

	}

	public static void main(String[] args) {
		Param p = new Param();
		CouponUtil couponUtil = new CouponUtil();
		// p.put(ParaUtil.action, ActionUtil.getCouponAction);
		// p.put(ParaUtil.state, "1");
		// p.put(ParaUtil.clsid, "1");
		// p.put(ParaUtil.shopcolumn, "abcdefghi");
		// p.put(ParaUtil.coucolumn, "abcdefghi");
		// p.put(ParaUtil.page, "2");
		// CouponUtil.Coupon(p);

		// p.put(ParaUtil.action, ActionUtil.addCouponAction);
		// p.put(ParaUtil.couid, "111519");
		// p.put(ParaUtil.mobile, "18779161018");
		// p.put(ParaUtil.card, "6225888877779999");
		// addCoupon(p);

		// p.put(ParaUtil.action, ActionUtil.getCouponBranchAction);
		// p.put(ParaUtil.couid, "111519");
		// getcouponbranch(p);
		// CouponBackLog couponBackLog = new CouponBackLog();
		// couponBackLog.setUnid(123);
		// couponBackLog.setRatio(.01);
		// couponBackLog.setAddtime(new Date());
		// couponBackLog.setSettle(1.02);
		// couponBackLog.setSettle_state(1);
		// couponBackLog.setOrder_id("10144");
		// couponBackLog.setOrder_money(100.26);
		// couponBackLog.setOrder_points(0);
		// couponBackLog.setOrder_addtime(new Date());
		// couponBackLog.setOrder_endtime(new Date());
		// couponBackLog.setOrder_state(1);
		// couponBackLog.setUnion_notify_url("http://www.abc.com");
		// couponBackLog.setUseshopid(10000);
		// couponBackLog.setUnion_orderid("13418058677227874");
		// couponBackLog.setCou_bdstate("00");
		// couponBackLog.setCou_bank("招商银行");
		// couponBackLog.setCou_bankno("6225887800001111");
		// couponBackLog.setCou_mobile("13800138999");
		// couponBackLog.setUvcid(111);
		// couponUtil.postcallback(couponBackLog, p);

		p.put(ParaUtil.action, ActionUtil.getUserCouponAction);
		// p.put(ParaUtil.usestime, "2012-3-1");
		// p.put(ParaUtil.useetime, "2012-4-1");
		// p.put(ParaUtil.coucolumn, "abcefghijkl");
		couponUtil.getUserCoupon(p);

	}
}
