package cn.com.ttg.action;

import cn.com.ttg.api.service.CityUtil;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class TestAction extends ActionSupport {

	private static final long serialVersionUID = 2654869467126429356L;

	@Override
	public String execute() throws Exception {
		return super.execute();
	}

	public String test() {
		ActionContext.getContext().getSession()
				.put("province", CityUtil.getProvince());
		System.out.println(CityUtil.getProvince());
		ActionContext.getContext().put("province", CityUtil.getProvince());
		return "test";
	}

}
