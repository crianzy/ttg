package cn.com.ttg.entity;

import java.io.Serializable;
import java.util.List;

/**
 * 省 市 乡镇 的信息
 * 
 * @author leon
 * 
 */
public class City implements Serializable {
	private static final long serialVersionUID = -4605865742983702971L;
	private List<String> province;
	private List<String> city;
	private List<String> countsy;
	private List<String> area_name;

	public City() {
	}

	// public City(String province, String city, String county) {
	// getCity(province, city, county);
	// }

	// public void getCity(String province, String city, String county) {
	// Param p = new Param();
	// p.put(ParaUtil.action, ActionUtil.getCityAction);
	// p.put(ParaUtil.province, province);
	// p.put(ParaUtil.city, city);
	// p.put(ParaUtil.county, county);
	// String json = HttpRequest.sendGet(UrlUtil.url, p.toString());
	// System.out.println(json);
	// JSONObject jo = JSONObject.fromObject(json);
	// JSONObject data = jo.getJSONObject("data");
	// this = (City) data.toBean(data, City.class);
	// System.out.println(this.getProvince());
	// System.out.println(this.getCity());
	// System.out.println(this.getCounty());
	// }

	public List<String> getProvince() {
		return province;
	}

	public void setProvince(List<String> province) {
		this.province = province;
	}

	public List<String> getCity() {
		return city;
	}

	public void setCity(List<String> city) {
		this.city = city;
	}

	public List<String> getCountsy() {
		return countsy;
	}

	public void setCountsy(List<String> countsy) {
		this.countsy = countsy;
	}

	public List<String> getArea_name() {
		return area_name;
	}

	public void setArea_name(List<String> area_name) {
		this.area_name = area_name;
	}

}
