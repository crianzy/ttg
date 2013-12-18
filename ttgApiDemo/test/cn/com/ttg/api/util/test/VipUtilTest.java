package cn.com.ttg.api.util.test;

import org.junit.Test;

import cn.com.ttg.Param.ActionUtil;
import cn.com.ttg.Param.ParaUtil;
import cn.com.ttg.Param.Param;
import cn.com.ttg.api.util.VipUtil;

public class VipUtilTest {
	private Param p = new Param();
	VipUtil vipUtil = new VipUtil();
	
	@Test
	public void testgetVipCard(){
		p.put(ParaUtil.action, ActionUtil.getVipCardAction);
		p.put(ParaUtil.clsid, "1");
		p.put(ParaUtil.shopcolumn, "abcdefghi");
		p.put(ParaUtil.coucolumn, "abcefghijkl");
		VipUtil vipUtil = new VipUtil();
		vipUtil.getVipCard(p);
	}
	
	@Test
	public void testaddVipCard(){
		p.put(ParaUtil.action, ActionUtil.addVipCardAction);
		p.put(ParaUtil.mobile, "13800138001");
		p.put(ParaUtil.card, "6216611800003755774");
		p.put(ParaUtil.svcid, "1741");
		p.put(ParaUtil.orderid, "678456507");
		p.put(ParaUtil.extra, "hello");
		vipUtil.addVipCard(p);
	}
	@Test
	public void testuserVipVard(){
		p.put(ParaUtil.action, ActionUtil.userVipCardAction);
		p.put(ParaUtil.uvccolumn, "abcefghijkl");
		vipUtil.userVipVard(p);
	}

}
