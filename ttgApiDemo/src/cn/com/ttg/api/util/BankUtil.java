package cn.com.ttg.api.util;

import java.util.Arrays;
import java.util.List;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import cn.com.ttg.Json.JsonUtil;
import cn.com.ttg.Param.ActionUtil;
import cn.com.ttg.Param.ParaUtil;
import cn.com.ttg.Param.Param;
import cn.com.ttg.Param.UrlUtil;
import cn.com.ttg.entity.Bank;
import cn.com.ttg.util.HttpRequest;

@SuppressWarnings("static-access")
public class BankUtil {

	/**
	 * 返回所有的银行数据
	 * 
	 * @param p
	 * @return
	 */
	public static List<Bank> getBank(Param p) {

		// 获取 服务器返回的json格式的字符串

		String json = HttpRequest.sendGet(UrlUtil.url, p.toString());
		System.out.println(json);
		JSONObject jo = JsonUtil.formStringToJson(json);
		JSONArray data = jo.getJSONArray("data");
		Bank[] bankarray = (Bank[]) data.toArray(data, Bank.class);
		// 返回式 转换成 list
		List<Bank> bankList = Arrays.asList(bankarray);
		System.out.println(bankList);
		return bankList;
	}

	public static void main(String[] args) {
		Param p = new Param();
		p.put(ParaUtil.action, ActionUtil.getBankAction);
		BankUtil.getBank(p);
	}

}
