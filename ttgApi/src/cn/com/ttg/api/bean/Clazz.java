package cn.com.ttg.api.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * 商户信息
 * 
 * @author leon
 * 
 */
public class Clazz implements Serializable {
	private static final long serialVersionUID = -5852051567777913719L;
	private Integer clsid;
	private String clsname;
	private Integer pid;
	private List<Clazz> childrenList = new ArrayList<Clazz>();

	public List<Clazz> getChildrenList() {
		return childrenList;
	}

	public void setChildrenList(List<Clazz> childrenList) {
		this.childrenList = childrenList;
	}

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
