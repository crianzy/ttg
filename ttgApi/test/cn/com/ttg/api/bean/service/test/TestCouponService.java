package cn.com.ttg.api.bean.service.test;

import org.junit.Test;

import cn.com.ttg.api.TTGClient;
import cn.com.ttg.api.bean.service.CouponService;
import cn.com.ttg.api.param.ActionUtil;
import cn.com.ttg.api.param.ParaUtil;
import cn.com.ttg.api.param.ParamMap;

public class TestCouponService {
	TTGClient client = new TTGClient();
	ParamMap param = new ParamMap(client.getParamActionVerify(),
			client.getParamVerify());
	CouponService couponService = client
			.getCouponService();
	
	@Test
	public void testGetCoupon(){
		param.put(ParaUtil.action, ActionUtil.getCouponAction);
		param.put(ParaUtil.state, "1");
		param.put(ParaUtil.clsid, "1");
		param.put(ParaUtil.shopcolumn, "abcdefghi");
		param.put(ParaUtil.coucolumn, "abcdefghi");
		param.put(ParaUtil.page, "2");
		couponService.getCoupon(param);

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
		//param.put(ParaUtil.couid, "111519");
		param.put(ParaUtil.svcid, "2342");
		System.out.println(couponService.getCouponBranch(param));
	}
	
	@Test
	public void testGetUserCoupon() {
		param.put(ParaUtil.action, ActionUtil.getUserCouponAction);
		//TODO 加上时间后会出错 
		//Fatal error: Call to undefined function isdate() in D:\\www\\openapi\\ulpos\\usercoupon.php on line 57
		//param.put(ParaUtil.usestime, "2013-3-1");
		//param.put(ParaUtil.useetime, "2013-4-1");
		param.put(ParaUtil.coucolumn, "abcefghijkl");
		System.out.println(couponService.getUserCoupon(param));
	}

}
