package cn.com.ttg.api.bean.service.test;

import org.junit.Test;

import cn.com.ttg.api.TTGClient;
import cn.com.ttg.api.bean.service.ShopService;
import cn.com.ttg.api.param.ActionUtil;
import cn.com.ttg.api.param.ParaUtil;
import cn.com.ttg.api.param.ParamMap;

public class TestShopService {
	TTGClient client = new TTGClient();
	ParamMap param = new ParamMap(client.getParamActionVerify(),
			client.getParamVerify());
	ShopService shopService = client.getShopService();
	
	@Test
	public void testGetShopBranch() {
		param.put(ParaUtil.action, ActionUtil.getShopBranchAction);
		param.put(ParaUtil.shopid, "100068");
		param.put(ParaUtil.brcolumn, "abcdefghijklmnopqrstuvw");
		shopService.getShopBranch(param);
	}
	
	@Test
	public void testShopImpression() {
		param.put(ParaUtil.action, ActionUtil.shopImpressionAction);
		param.put(ParaUtil.shopid, "100068");
		param.put(ParaUtil.brcolumn, "abcdefghijklmn");
		shopService.shopImpression(param);
	}
	
	@Test
	public void testGetShopCoupon() {
		param.put(ParaUtil.action, ActionUtil.getShopCouponAction);
		param.put(ParaUtil.shopid, "100068");
		// param.remove(ParaUtil.appkey);
		param.put(ParaUtil.brcolumn, "abcdefghijklmn");
		shopService.getShopCoupon(param);
	}
	
	@Test
	public void testShopComment() {
		param.put(ParaUtil.action, ActionUtil.getShopCommentAction);
		param.put(ParaUtil.shopid, "100068");
		param.put(ParaUtil.comcolumn, "abcdefghijklmnopqrstuvw");
		shopService.shopComment(param);
	}

}
