package cn.com.ttg.api.bean.service;

import java.io.IOException;

import org.apache.log4j.Logger;
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

public class AuthorizeService extends BaseService {

	private static String urlPath = Config.getProperties(ConfigKey.urlpath);
	private static Logger logger = Logger.getLogger(AuthorizeService.class
			.getName());
	private static String TAG = "AuthorizeService ";

	public AuthorizeService(TTGExecutor executor, ObjectMapper mapper) {
		super(executor, mapper);
	}

	/**
	 * 根据银行卡号判断 是哪家银行 和 银行卡类型
	 * 
	 * @param p
	 * @return 建设银行,借记卡(普通银行卡)
	 * @throws TTGException
	 */
	public String checkCardno(ParamMap param) throws TTGException {
		TTGRequest request = new TTGRequest(urlPath, Method.GET, param);
		TTGResponse response = executor.execute(request);
		Bank[] banks = null;
		try {
			banks = mapper.readValue(response.getResponse().toString(),
					Bank[].class);
		} catch (Exception e) {
			throw new TTGException(TAG + "解析json 错误", e);
		}
		if (banks == null || banks.length == 0) {
			logger.error(TAG + "银行卡参数错误 返回数据为空");
			throw new TTGException(TAG + "银行卡参数错误 返回数据为空");
		}
		return banks[0].getBankname() + ","
				+ Bank.bankCardtype.get(banks[0].getResult());

	}

	public static void main(String[] args) throws TTGException {
		TTGClient client = new TTGClient();
		ParamMap param = new ParamMap(client.getParamActionVerify(),
				client.getParamVerify());
		param.put(ParaUtil.action, ActionUtil.checkCardNoAction);
		// param.put(ParaUtil.cardno, ParaUtil.cardTestNo);
		param.put(ParaUtil.cardno, "123123123123");
		String s = client.getAuthorizeService().checkCardno(param);
		System.out.println(s);
	}
}
