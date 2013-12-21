package com.czy.sshdemo.action;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

@Controller
@Scope("prototype")
public class TestAction extends ActionSupport {
	public TestAction(){
		System.out.println("________________________________________");
	}

	private static final long serialVersionUID = -7329405392125304740L;

	public String test() {
		ActionContext.getContext().put("test", "test");
		return "test";
	}

}
