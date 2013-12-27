package cn.com.ttg.api.bean.service.test;

import java.util.Date;

import org.junit.Test;

import cn.com.ttg.api.TTGClient;
import cn.com.ttg.api.bean.Coupon;
import cn.com.ttg.api.bean.CouponBackLog;
import cn.com.ttg.api.bean.Page;
import cn.com.ttg.api.bean.service.CouponService;
import cn.com.ttg.api.param.ActionUtil;
import cn.com.ttg.api.param.ParaUtil;
import cn.com.ttg.api.param.ParamMap;

public class TestCouponService {
	TTGClient client = new TTGClient();
	ParamMap param = new ParamMap(client.getParamActionVerify(),
			client.getParamVerify());
	CouponService couponService = client.getCouponService();

	@Test
	public void testGetCoupon() {
		// param.put(ParaUtil.action, ActionUtil.getCouponAction);
		// param.put(ParaUtil.state, "1");
		// param.put(ParaUtil.clsid, "1");
		// param.put(ParaUtil.shopcolumn, "abcdefghi");
		// param.put(ParaUtil.coucolumn, "abcdefghi");
		// param.put(ParaUtil.page, "2");
		// couponService.getCoupon(param);
//		param.clear();
//		param.put(ParaUtil.action, ActionUtil.getCouponAction);
//		param.addAuthorize();
//		param.put(ParaUtil.province, "江西");
//		param.put(ParaUtil.city, "南昌");
//		param.put(ParaUtil.state, "1");
//		param.put(ParaUtil.pagesize, "30");
		
		param.clear();
		param.addAuthorize();
		//lat":"28.675714","lng":"115.896128"
		//TODO 加入 了 经纬度和范围是 服务器返回空  DefaultTTGExecutor StatusCode = 200 Response body:
		param.put(ParaUtil.lng,  "115.896128");
		param.put(ParaUtil.lat,  "28.675714");
		param.put(ParaUtil.range, "30");
		param.put(ParaUtil.action, ActionUtil.getCouponAction);
		
		Page<Coupon> page = couponService.getCoupon(param);

	}

	@Test
	public void testAddCoupon() {
		param.put(ParaUtil.action, ActionUtil.addCouponAction);
		param.put(ParaUtil.couid, "111519");
		param.put(ParaUtil.mobile, "18779161019");
		param.put(ParaUtil.card, "6225888877779949");
		param.put(ParaUtil.orderid, "2abddfa");
		couponService.addCoupon(param);
	}

	@Test
	public void testGetcouponbranch() {
		param.put(ParaUtil.action, ActionUtil.getCouponBranchAction);
		// param.put(ParaUtil.couid, "111519");
		param.put(ParaUtil.svcid, "2342");
		System.out.println(couponService.getCouponBranch(param));
	}

	@Test
	public void testGetUserCoupon() {
		param.put(ParaUtil.action, ActionUtil.getUserCouponAction);
		// TODO 加上时间后会出错
		// Fatal error: Call to undefined function isdate() in
		// D:\\www\\openapi\\ulpos\\usercoupon.php on line 57
		// param.put(ParaUtil.usestime, "2013-3-1");
		// param.put(ParaUtil.useetime, "2013-4-1");
		param.put(ParaUtil.coucolumn, "abcefghijkl");
		System.out.println(couponService.getUserCoupon(param));
	}

	@Test
	public void testpostcallback() {
		//param.put(ParaUtil.action, ActionUtil.getCouponBranchAction);
		//param.put(ParaUtil.couid, "111519");
		CouponBackLog couponBackLog = new CouponBackLog();
		couponBackLog.setUnid(123);
		couponBackLog.setRatio(.01);
		couponBackLog.setAddtime(new Date());
		couponBackLog.setSettle(1.02);
		couponBackLog.setSettle_state(1);
		couponBackLog.setOrder_id("10144");
		couponBackLog.setOrder_money(100.26);
		couponBackLog.setOrder_points(0);
		//couponBackLog.setOrder_addtime(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
		//couponBackLog.setOrder_endtime(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
		couponBackLog.setOrder_addtime(new Date());
		couponBackLog.setOrder_endtime(new Date());
		couponBackLog.setOrder_state(1);
		couponBackLog.setUnion_notify_url("http://www.abc.com");
		couponBackLog.setUseshopid(10000);
		couponBackLog.setUnion_orderid("13418058677227874");
		couponBackLog.setCou_bdstate("00");
		couponBackLog.setCou_bank("招商银行");
		couponBackLog.setCou_bankno("6225887800001111");
		couponBackLog.setCou_mobile("13800138999");
		couponBackLog.setUvcid(111);
		couponService.postcallback(couponBackLog, param);
	}

}
