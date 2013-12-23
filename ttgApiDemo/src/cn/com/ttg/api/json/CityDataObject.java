package cn.com.ttg.api.json;

import cn.com.ttg.api.entity.City;

public class CityDataObject extends JsonDataObject{

	private City city ;
	
	@Override
	public Object getData() {
		System.out.println(city.getProvince());
		return city;
	}

	@Override
	public void setData(Object data) {
		super.setData(data);
		//MorphDynaBean jo = (MorphDynaBean) data;
		//this.city = jo.
	}
	

}
