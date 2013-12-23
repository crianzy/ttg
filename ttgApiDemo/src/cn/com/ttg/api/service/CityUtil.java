package cn.com.ttg.api.service;

import java.util.Arrays;
import java.util.List;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import cn.com.ttg.Param.ActionUtil;
import cn.com.ttg.Param.ParaUtil;
import cn.com.ttg.Param.Param;
import cn.com.ttg.Param.UrlUtil;
import cn.com.ttg.api.entity.City;
import cn.com.ttg.api.json.JsonUtil;

public class CityUtil {

	/**
	 * 获取所有的省
	 * 
	 * @return
	 */
	public static List<String> getProvince() {
		Param p = new Param();
		p.put(ParaUtil.action, ActionUtil.getCityAction);
		JSONObject jo = JsonUtil.sendGet(UrlUtil.url, p);
		JSONObject data = jo.getJSONObject("data");
		String[] provinces = (String[]) JSONArray.toArray(
				data.getJSONArray("province"), String.class);
		return Arrays.asList(provinces);
	}

	/**
	 * 获取该省下的所有市
	 * 
	 * @param province
	 *            省名
	 * @return
	 */
	public static List<String> getCity(String province) {
		Param p = new Param();
		p.put(ParaUtil.action, ActionUtil.getCityAction);
		p.put(ParaUtil.province, province);
		JSONObject jo = JsonUtil.sendGet(UrlUtil.url, p);
		JSONObject data = jo.getJSONObject("data");
		String[] citys = (String[]) JSONArray.toArray(
				data.getJSONArray("city"), String.class);
		return Arrays.asList(citys);
	}

	/**
	 * 获取该市下的所有 乡县
	 * 
	 * @param province
	 *            省名
	 * @param city
	 *            市名
	 * @return
	 */
	public static List<String> getCounty(String province, String city) {
		Param p = new Param();
		p.put(ParaUtil.action, ActionUtil.getCityAction);
		p.put(ParaUtil.city, city);
		p.put(ParaUtil.province, province);
		JSONObject jo = JsonUtil.sendGet(UrlUtil.url, p);
		JSONObject data = jo.getJSONObject("data");
		String[] countys = (String[]) JSONArray.toArray(
				data.getJSONArray("county"), String.class);
		return Arrays.asList(countys);
	}

	/**
	 * 获取该县下的 地方区域名
	 * 
	 * @param province
	 *            省名
	 * @param city
	 *            市名
	 * @param county
	 *            乡县名
	 * @return
	 */
	public static List<String> getArea_name(String province, String city,
			String county) {
		Param p = new Param();
		p.put(ParaUtil.action, ActionUtil.getCityAction);
		p.put(ParaUtil.county, county);
		p.put(ParaUtil.city, city);
		p.put(ParaUtil.province, province);
		JSONObject jo = JsonUtil.sendGet(UrlUtil.url, p);
		JSONObject data = jo.getJSONObject("data");
		String[] area_name = (String[]) JSONArray.toArray(
				data.getJSONArray("area_name"), String.class);
		return Arrays.asList(area_name);
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

	public static void main(String[] args) {
		Param p = new Param();
		p.put(ParaUtil.action, ActionUtil.getCityAction);
		p.put(ParaUtil.province, "广东");
		p.put(ParaUtil.city, "深圳");
		p.put(ParaUtil.county, "市辖区");
		CityUtil.getALLCity(p);
	}
}
