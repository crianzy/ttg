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
	private List<String> county;
	private List<String> area_name;

	public City() {
	}

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

	public List<String> getCounty() {
		return county;
	}

	public void setCounty(List<String> county) {
		this.county = county;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public List<String> getArea_name() {
		return area_name;
	}

	public void setArea_name(List<String> area_name) {
		this.area_name = area_name;
	}

}
