package cn.com.ttg.entity;

import java.io.Serializable;

public class ShopImage implements Serializable {

	private static final long serialVersionUID = -8723180798059896573L;
	private Integer picid;
	private String picurl;
	private String picname;
	private String piclink;

	public Integer getPicid() {
		return picid;
	}

	public void setPicid(Integer picid) {
		this.picid = picid;
	}

	public String getPicurl() {
		return picurl;
	}

	public void setPicurl(String picurl) {
		this.picurl = picurl;
	}

	public String getPicname() {
		return picname;
	}

	public void setPicname(String picname) {
		this.picname = picname;
	}

	public String getPiclink() {
		return piclink;
	}

	public void setPiclink(String piclink) {
		this.piclink = piclink;
	}

}
