package cn.com.ttg.Json;

import net.sf.ezmorph.bean.MorphDynaBean;
import net.sf.json.JSONObject;
import cn.com.ttg.entity.City;

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
		MorphDynaBean jo = (MorphDynaBean) data;
		//this.city = jo.
	}
	

}
