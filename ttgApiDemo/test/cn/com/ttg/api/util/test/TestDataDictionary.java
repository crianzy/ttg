package cn.com.ttg.api.util.test;

import org.junit.Test;

import cn.com.ttg.Param.ActionUtil;
import cn.com.ttg.Param.ParaUtil;
import cn.com.ttg.Param.Param;
import cn.com.ttg.api.util.DataDictionary;

public class TestDataDictionary {
	Param p = new Param();

	@Test
	public void testgetBank() {
		p.put(ParaUtil.action, ActionUtil.getBankAction);
		System.out.println("bankList = " + DataDictionary.getBank(p));
	}
	@Test
	public void testgetClazzList() {
		p.put(ParaUtil.action, ActionUtil.getClazzAction);
		System.out.println("ClazzList = " + DataDictionary.getBank(p));
	}
}
