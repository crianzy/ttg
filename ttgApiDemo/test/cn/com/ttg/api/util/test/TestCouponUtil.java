package cn.com.ttg.api.util.test;

import org.junit.Test;

import cn.com.ttg.Param.ActionUtil;
import cn.com.ttg.Param.ParaUtil;
import cn.com.ttg.Param.Param;
import cn.com.ttg.api.util.CouponUtil;

public class TestCouponUtil {
	Param p = new Param();
	CouponUtil couponUtil = new CouponUtil();

	@Test
	public void testCoupon() {
		p.put(ParaUtil.action, ActionUtil.getCouponAction);
		p.put(ParaUtil.state, "1");
		p.put(ParaUtil.clsid, "1");
		p.put(ParaUtil.shopcolumn, "abcdefghi");
		p.put(ParaUtil.coucolumn, "abcdefghi");
		p.put(ParaUtil.page, "2");
		//Coupon p =  couponUtil.Coupon(p);
		System.out.println(couponUtil.Coupon(p));
	}

	@Test
	public void testAddCoupon() {
		p.put(ParaUtil.action, ActionUtil.addCouponAction);
		p.put(ParaUtil.couid, "111519");
		p.put(ParaUtil.mobile, "18779161018");
		p.put(ParaUtil.card, "6225888877779999");
		couponUtil.addCoupon(p);
	}

	@Test
	public void testGetcouponbranch() {
		p.put(ParaUtil.action, ActionUtil.getCouponBranchAction);
		p.put(ParaUtil.couid, "111519");
		//p.put(ParaUtil.svcid, "2342");
		System.out.println(couponUtil.getCouponBranch(p));
	}

	@Test
	public void testPostcallback() {
		
	}

	@Test
	public void testGetUserCoupon() {
		p.put(ParaUtil.action, ActionUtil.getUserCouponAction);
		// p.put(ParaUtil.usestime, "2012-3-1");
		// p.put(ParaUtil.useetime, "2012-4-1");
		// p.put(ParaUtil.coucolumn, "abcefghijkl");
		System.out.println(couponUtil.getUserCoupon(p));
	}
}
