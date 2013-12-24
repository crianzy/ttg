package cn.com.ttg.api.bean.service;

import java.io.IOException;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

import cn.com.ttg.api.Config;
import cn.com.ttg.api.ConfigKey;
import cn.com.ttg.api.TTGClient;
import cn.com.ttg.api.TTGExecutor;
import cn.com.ttg.api.TTGRequest;
import cn.com.ttg.api.TTGRequest.Method;
import cn.com.ttg.api.TTGResponse;
import cn.com.ttg.api.bean.Bank;
import cn.com.ttg.api.exception.TTGException;
import cn.com.ttg.api.param.ActionUtil;
import cn.com.ttg.api.param.ParaUtil;
import cn.com.ttg.api.param.ParamMap;

public class AuthorizeService {

	private TTGExecutor executor;

	private ObjectMapper mapper;

	public AuthorizeService(TTGExecutor executor, ObjectMapper mapper) {
		this.executor = executor;
		this.mapper = mapper;
	}


	/**
	 * 根据银行卡号判断 是哪家银行 和 银行卡类型
	 * 
	 * @param p
	 * @return 建设银行,借记卡(普通银行卡)
	 * @throws TTGException
	 */
	public String checkCardno(ParamMap param) throws TTGException {
		TTGRequest request = new TTGRequest(
				Config.getProperties(ConfigKey.urlpath), Method.GET, param);
		TTGResponse response = executor.execute(request);
		Bank[] banks = null;
		try {
			banks = (Bank[]) mapper.readValue(
					response.getResponse().toString(), Bank[].class);
		} catch (JsonParseException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return banks[0].getBankname() + ","
				+ Bank.bankCardtype.get(banks[0].getResult());

	}

	public static void main(String[] args) throws TTGException {
		TTGClient client = new TTGClient();
		ParamMap param = new ParamMap();
		param.put(ParaUtil.action, ActionUtil.checkCardNoAction);
		param.put(ParaUtil.cardno, ParaUtil.cardTestNo);
		param.put("asd", ParaUtil.cardTestNo);
		String s = client.getAuthorizeService().checkCardno(param);
		System.out.println(s);
	}
}
