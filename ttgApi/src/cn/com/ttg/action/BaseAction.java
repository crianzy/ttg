package cn.com.ttg.action;

import cn.com.ttg.api.TTGClient;

import com.opensymphony.xwork2.ActionSupport;

public abstract class BaseAction extends ActionSupport {

	private static final long serialVersionUID = -7040003673613175976L;

	protected TTGClient client = new TTGClient();
	//TODO 将所在城市写入cookie

}
