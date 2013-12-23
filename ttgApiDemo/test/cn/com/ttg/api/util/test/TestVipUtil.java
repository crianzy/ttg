package cn.com.ttg.api.util.test;

import org.junit.Test;

import cn.com.ttg.Param.ActionUtil;
import cn.com.ttg.Param.ParaUtil;
import cn.com.ttg.Param.Param;
import cn.com.ttg.api.service.VipUtil;

public class TestVipUtil {
	Param p = new Param();
	VipUtil vipUtil = new VipUtil();

	@Test
	public void testGetVipCard() {
		p.put(ParaUtil.action, ActionUtil.getVipCardAction);
		p.put(ParaUtil.clsid, "1");
		p.put(ParaUtil.shopcolumn, "abcdefghi");
		p.put(ParaUtil.coucolumn, "abcefghijkl");
		System.out.println(vipUtil.getVipCard(p));
	}

	@Test
	public void testAddVipCard() {
		p.put(ParaUtil.action, ActionUtil.addVipCardAction);
		p.put(ParaUtil.mobile, "13800135012");
		p.put(ParaUtil.card, "6227002022081063497");
		// 会员卡好 一张银行卡 绑定 一张会员卡
		p.put(ParaUtil.svcid, "1741");
		// orderid 订单号 需唯一
		p.put(ParaUtil.orderid, "567256");
		p.put(ParaUtil.extra, "hello");
		System.out.println(vipUtil.addVipCard(p));
	}

	@Test
	public void testUserVipVard() {
		p.put(ParaUtil.action, ActionUtil.userVipCardAction);
		p.put(ParaUtil.uvccolumn, "abcdefgh");
		System.out.println(vipUtil.userVipVard(p));
	}

	@Test
	public void testGetCouponBranch() {
		p.put(ParaUtil.action, ActionUtil.getBankAction);
		p.put(ParaUtil.svcid, "couid=123456");
		System.out.println(vipUtil.getCouponBranch(p));
	}
}
