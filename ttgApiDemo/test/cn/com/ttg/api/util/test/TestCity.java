package cn.com.ttg.api.util.test;

import org.junit.Test;

import cn.com.ttg.Param.ActionUtil;
import cn.com.ttg.Param.ParaUtil;
import cn.com.ttg.Param.Param;
import cn.com.ttg.api.service.CityUtil;

public class TestCity {

	@Test
	public void testgetProvince() {
		System.out.println(CityUtil.getProvince());
	}

	@Test
	public void testgetCity() {
		System.out.println(CityUtil.getCity("江西"));
	}

	@Test
	public void testgetCounty() {
		System.out.println(CityUtil.getCounty("江西", "南昌"));
	}

	@Test
	public void testgetAreaName() {
		System.out.println(CityUtil.getArea_name("江西", "南昌", "新建县"));
	}

	@Test
	public void testgetALLCity() {
		Param p = new Param();
		p.put(ParaUtil.action, ActionUtil.getCityAction);
		p.put(ParaUtil.province, "广东");
		p.put(ParaUtil.city, "深圳");
		// p.put(ParaUtil.county, "市辖区");
		System.out.println(CityUtil.getALLCity(p));
	}
}
