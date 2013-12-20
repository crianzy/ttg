package cn.com.ttg.api.util.test;

import org.junit.Test;

import cn.com.ttg.Param.ActionUtil;
import cn.com.ttg.Param.ParaUtil;
import cn.com.ttg.Param.Param;
import cn.com.ttg.api.util.ShopUtil;

public class TestShopUtil {
	Param p = new Param();
	ShopUtil shopUtil = new ShopUtil();

	@Test
	public void testGetShopBranch() {
		p.put(ParaUtil.action, ActionUtil.getShopBranchAction);
		p.put(ParaUtil.shopid, "100068");
		p.put(ParaUtil.brcolumn, "abcdefghijklmnopqrstuvw");
		shopUtil.getShopBranch(p);
	}

	@Test
	public void testShopImpression() {
		p.put(ParaUtil.action, ActionUtil.shopImpressionAction);
		p.put(ParaUtil.shopid, "100068");
		p.put(ParaUtil.brcolumn, "abcdefghijklmn");
		shopUtil.shopImpression(p);
	}

	@Test
	public void testGetShopCoupon() {
		p.put(ParaUtil.action, ActionUtil.getShopCouponAction);
		p.put(ParaUtil.shopid, "100068");
		// p.remove(ParaUtil.appkey);
		p.put(ParaUtil.brcolumn, "abcdefghijklmn");
		shopUtil.getShopCoupon(p);
	}

	@Test
	public void testGetshopimage() {
		p.put(ParaUtil.action, ActionUtil.getShopImageAction);
		p.put(ParaUtil.shopid, "100068");
		shopUtil.getshopimage(p);
	}

	@Test
	public void testShopComment() {
		p.put(ParaUtil.action, ActionUtil.getShopCommentAction);
		p.put(ParaUtil.shopid, "100068");
		p.put(ParaUtil.comcolumn, "abcdefghijklmnopqrstuvw");
		shopUtil.shopComment(p);
	}

	@Test
	public void testShopinfo() {
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
		shopUtil.shopinfo(p);;
	}
}
