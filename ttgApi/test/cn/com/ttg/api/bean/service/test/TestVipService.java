package cn.com.ttg.api.bean.service.test;

import org.junit.Test;

import cn.com.ttg.api.TTGClient;
import cn.com.ttg.api.bean.service.VipService;
import cn.com.ttg.api.param.ActionUtil;
import cn.com.ttg.api.param.ParaUtil;
import cn.com.ttg.api.param.ParamMap;

public class TestVipService {
	TTGClient client = new TTGClient();
	ParamMap param = new ParamMap(client.getParamActionVerify(),
			client.getParamVerify());
	VipService vipService = client.getVipService();
	
	@Test
	public void testGetVipCard() {
		param.put(ParaUtil.action, ActionUtil.getVipCardAction);
		param.put(ParaUtil.clsid, "1");
		param.put(ParaUtil.shopcolumn, "abcdefghi");
		param.put(ParaUtil.coucolumn, "abcefghijkl");
		System.out.println(vipService.getVipCard(param));
	}
	
	@Test
	public void testAddVipCard() {
		param.put(ParaUtil.action, ActionUtil.addVipCardAction);
		param.put(ParaUtil.mobile, "13800135012");
		param.put(ParaUtil.card, "6227002012081062348");
		// 会员卡好 一张银行卡 绑定 一张会员卡
		param.put(ParaUtil.svcid, "2121");
		// orderid 订单号 需唯一
		param.put(ParaUtil.orderid, "567f25a");
		param.put(ParaUtil.extra, "hello");
		System.out.println(vipService.addVipCard(param));
	}
	
	@Test
	public void testUserVipVard() {
		param.put(ParaUtil.action, ActionUtil.userVipCardAction);
		param.put(ParaUtil.uvccolumn, "abcdefgh");
		System.out.println(vipService.userVipCard(param));
	}

}
