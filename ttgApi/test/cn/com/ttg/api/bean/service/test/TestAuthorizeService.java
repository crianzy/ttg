package cn.com.ttg.api.bean.service.test;

import org.junit.Test;

import cn.com.ttg.api.TTGClient;
import cn.com.ttg.api.param.ActionUtil;
import cn.com.ttg.api.param.ParaUtil;
import cn.com.ttg.api.param.ParamMap;

public class TestAuthorizeService {
	TTGClient client = new TTGClient();
	ParamMap param = new ParamMap(client.getParamActionVerify(),client.getParamVerify());

	@Test
	public void testcheckCardno() {
		param.put(ParaUtil.action, ActionUtil.checkCardNoAction);
		param.put(ParaUtil.cardno, ParaUtil.cardTestNo);
		System.out.println(client.getAuthorizeService().checkCardno(param));
	}

}
