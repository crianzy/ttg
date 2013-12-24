package cn.com.ttg.api.bean.service.test;

import org.junit.Test;

import cn.com.ttg.api.TTGClient;
import cn.com.ttg.api.param.ActionUtil;
import cn.com.ttg.api.param.ParaUtil;
import cn.com.ttg.api.param.ParamMap;

public class TestAuthorizeService {
	ParamMap param = new ParamMap();
	TTGClient client = new TTGClient();

	@Test
	public void testcheckCardno() {
		param.put(ParaUtil.action, ActionUtil.checkCardNoAction);
		param.put(ParaUtil.cardno, ParaUtil.cardTestNo);
		System.out.println(client.getAuthorizeService().checkCardno(param));
	}

}
