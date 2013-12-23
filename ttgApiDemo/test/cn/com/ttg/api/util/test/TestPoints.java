package cn.com.ttg.api.util.test;

import org.junit.Test;

import cn.com.ttg.Param.ActionUtil;
import cn.com.ttg.Param.ParaUtil;
import cn.com.ttg.Param.Param;
import cn.com.ttg.api.service.PointsUtil;

public class TestPoints {

	Param p = new Param();
	PointsUtil pointsUtil = new PointsUtil();

	@Test
	public void testChargePoints(Param p) {
		p.put(ParaUtil.action, ActionUtil.chargePointsAction);
		p.put(ParaUtil.mobile, "13800138001");
		p.put(ParaUtil.card, "6225888877779999");
		// TODO ptype 报 ptype ；类型错误
		p.put(ParaUtil.ptype, "CMCC");
		p.put(ParaUtil.amount, "100");
		p.put(ParaUtil.orderid, "123456789");
		pointsUtil.chargePoints(p);
	}
}
