package cn.com.ttg.api.bean.service.test;

import org.junit.Test;

import cn.com.ttg.api.TTGClient;
import cn.com.ttg.api.param.ActionUtil;
import cn.com.ttg.api.param.ParaUtil;
import cn.com.ttg.api.param.ParamMap;

/**
 * 授权验证 相关的 service
 * @author leon
 *
 * 2013-12-25 下午12:39:23
 */
public class TestAuthorizeService {
	
	TTGClient client = new TTGClient();
	ParamMap param = new ParamMap(client.getParamActionVerify(),client.getParamVerify());

	@Test
	public void testcheckCardno() {
		param.put(ParaUtil.action, ActionUtil.checkCardNoAction);
		param.put(ParaUtil.cardno, "123123123");
		System.out.println(client.getAuthorizeService().checkCardno(param));
	}

}
