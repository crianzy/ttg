package cn.com.ttg.api.util;

import java.util.Arrays;
import java.util.List;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import cn.com.ttg.Json.JsonUtil;
import cn.com.ttg.Param.Param;
import cn.com.ttg.Param.UrlUtil;
import cn.com.ttg.entity.Bank;
import cn.com.ttg.entity.City;
import cn.com.ttg.entity.Clazz;

public class DataDictionary {

	/**
	 * 返回所有的银行数据
	 * 
	 * @param p
	 * @return
	 */
	public static List<Bank> getBank(Param p) {
		// TODO 是否判断参数
		// 获取 服务器返回的json格式的字符串
		JSONObject jo = JsonUtil.sendGet(UrlUtil.url, p);
		JSONArray data = jo.getJSONArray("data");
		Bank[] bankarray = (Bank[]) JSONArray.toArray(data, Bank.class);
		// 返回式 转换成 list
		List<Bank> bankList = Arrays.asList(bankarray);
		System.out.println("bankList = " + bankList);
		return bankList;
	}

	/**
	 * 获取相应的省份 城市 信息
	 * 
	 * @param p
	 *            封装后的参数
	 * @return
	 */
	public static City getALLCity(Param p) {
		JSONObject jo = JsonUtil.sendGet(UrlUtil.url, p);
		JSONObject data = jo.getJSONObject("data");
		// 从data 中解析除City 装载道 City bean 中
		City citytemp = (City) JSONObject.toBean(data, City.class);
		System.out.println(citytemp.getProvince());
		System.out.println(citytemp.getCity());
		System.out.println(citytemp.getCounty());
		System.out.println(citytemp.getArea_name());
		return citytemp;
	}

	/**
	 * 获取相应的商户分类数据
	 * 
	 * @param p
	 * @return 返回list 格式
	 */
	public static List<Clazz> getClazzList(Param p) {
		JSONObject jo = JsonUtil.sendGet(UrlUtil.url, p);
		JSONArray data = jo.getJSONArray("data");
		Clazz[] clazzarray = (Clazz[]) JSONArray.toArray(data, Clazz.class);
		return Arrays.asList(clazzarray);
	}
}
