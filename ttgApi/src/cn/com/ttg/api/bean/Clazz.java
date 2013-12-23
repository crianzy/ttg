package cn.com.ttg.api.bean;

import java.io.Serializable;

/**
 * 商户信息
 * 
 * @author leon
 * 
 */
public class Clazz  implements Serializable{
	private static final long serialVersionUID = -5852051567777913719L;
	private Integer clsid;
	private String clsname;
	private Integer pid;

	public Integer getClsid() {
		return clsid;
	}

	public void setClsid(Integer clsid) {
		this.clsid = clsid;
	}

	public String getClsname() {
		return clsname;
	}

	public void setClsname(String clsname) {
		this.clsname = clsname;
	}

	public Integer getPid() {
		return pid;
	}

	public void setPid(Integer pid) {
		this.pid = pid;
	}

}
