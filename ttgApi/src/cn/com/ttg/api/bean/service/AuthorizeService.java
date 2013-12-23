package cn.com.ttg.api.bean.service;

import cn.com.ttg.api.Config;
import cn.com.ttg.api.ConfigKey;
import cn.com.ttg.api.TTGClient;
import cn.com.ttg.api.TTGExecutor;
import cn.com.ttg.api.TTGRequest;
import cn.com.ttg.api.TTGRequest.Method;
import cn.com.ttg.api.TTGResponse;
import cn.com.ttg.api.bean.Bank;
import cn.com.ttg.api.exception.TTGException;
import cn.com.ttg.api.json.JSONException;
import cn.com.ttg.api.mapper.JsonMappingException;
import cn.com.ttg.api.mapper.ObjectMapper;
import cn.com.ttg.api.param.ActionUtil;
import cn.com.ttg.api.param.ParaUtil;
import cn.com.ttg.api.param.Param;

public class AuthorizeService {

	private TTGExecutor executor;

	private ObjectMapper mapper;

	public AuthorizeService(TTGExecutor executor, ObjectMapper mapper) {
		this.executor = executor;
		this.mapper = mapper;
	}

	/**
	 * 根据银行卡号判断 是哪家银行
	 * 
	 * @param p
	 * @return
	 * @throws TTGException
	 */
	public Bank checkCardno(Param param) throws TTGException {
		param.put(ParaUtil.action, ActionUtil.checkCardNoAction);
		TTGRequest request = new TTGRequest(
				Config.getProperties(ConfigKey.urlpath), Method.GET, param);
		TTGResponse response = executor.execute(request);
		Bank[] banks = null;
		try {
			banks = (Bank[]) mapper.mapCommon(response.toString(),
					Bank[].class);
		} catch (JsonMappingException e) {
			e.printStackTrace();
		}
		return banks[0];
	}

	public static void main(String[] args) throws TTGException {
		TTGClient client = new TTGClient();
		Param param = new Param();
		param.put(ParaUtil.cardno, ParaUtil.cardTestNo);
		client.getAuthorizeService().checkCardno(param);

	}
}
