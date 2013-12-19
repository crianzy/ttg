package cn.com.ttg.api.util.test;

import org.junit.Test;

import cn.com.ttg.Param.ActionUtil;
import cn.com.ttg.Param.ParaUtil;
import cn.com.ttg.Param.Param;
import cn.com.ttg.api.util.Authorize;

public class TestAuthorize {
	Param p = new Param();

	@Test
	public void testCheckCardno() {
		p.put(ParaUtil.action, ActionUtil.checkCardonNoAction);
		p.put(ParaUtil.cardno, ParaUtil.cardTestNo);
		System.out.println(Authorize.checkCardno(p));
	}
	
	@Test
	public void testAuthorize() {
		System.out.println(Authorize.checkAuthorize(p));
	}
}
