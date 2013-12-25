package cn.com.ttg.api.bean.service.test;

import org.junit.Test;

import cn.com.ttg.api.TTGClient;
import cn.com.ttg.api.bean.service.DataDictionaryService;
import cn.com.ttg.api.param.ActionUtil;
import cn.com.ttg.api.param.ParaUtil;
import cn.com.ttg.api.param.ParamMap;

public class TestDateDictionary {

	TTGClient client = new TTGClient();
	ParamMap param = new ParamMap(client.getParamActionVerify(),
			client.getParamVerify());
	DataDictionaryService dataDictionaryService = client.getDataDictionaryService();
	
	@Test
	public void testGetClazzList() {
		param.put(ParaUtil.action, ActionUtil.getClazzAction);
		param.put(ParaUtil.clsid, "1");
		dataDictionaryService.getClazzList(param);
	}
	
	@Test
	public void testGetALlcity() {
		param.put(ParaUtil.action, ActionUtil.getCityAction);
		param.put(ParaUtil.province, "广东");
		param.put(ParaUtil.city, "深圳");
		param.put(ParaUtil.county, "市辖区");
		dataDictionaryService.getAllCity(param);
	}
	
	@Test
	public void testGetBankList(){
		param.put(ParaUtil.action, ActionUtil.getBankAction);
		System.out.println("bankList = " + dataDictionaryService.getBankList(param));
	}

}
