package cn.com.ttg.api.util;

import net.sf.json.JSONObject;
import cn.com.ttg.Param.ActionUtil;
import cn.com.ttg.Param.ParaUtil;
import cn.com.ttg.Param.Param;
import cn.com.ttg.Param.UrlUtil;
import cn.com.ttg.entity.City;
import cn.com.ttg.util.HttpRequest;

public class CityUtil {

	/**
	 * 
	 * @param province  省份
	 * @param city		  城市
	 * @param county	  乡县
	 * @return
	 */
	public static City getCity(Param p) {
		String province = p.get(ParaUtil.province);
		String county = p.get(ParaUtil.county);
		String city = p.get(ParaUtil.city);
		if(!"".equals(province)&&province!=null){
			p.put(ParaUtil.province, province);
		}
		if(!"".equals(city)&&city!=null){
			p.put(ParaUtil.city, city);
		}
		if(!"".equals(county)&&county!=null){
			p.put(ParaUtil.county, county);
		}
		//获取 服务器返回的json格式的字符串
		String json = HttpRequest.sendGet(UrlUtil.url, p.toString());
		System.out.println(json);
		//将字符串解析为JSONObject 
		JSONObject jo = JSONObject.fromObject(json);
		JSONObject data = jo.getJSONObject("data");
		//从data 中解析除City 装载道 City bean 中
		City citytemp = (City) data.toBean(data, City.class);
		System.out.println(citytemp.getProvince());
		System.out.println(citytemp.getCity());
		System.out.println(citytemp.getCountsy());
		System.out.println(citytemp.getArea_name());
		return citytemp;
	}
	public static void main(String[] args) {
		Param p = new Param();
		p.put(ParaUtil.action, ActionUtil.getCityAction);
		p.put(ParaUtil.province, "江西");
		CityUtil.getCity(p);
	}
}
