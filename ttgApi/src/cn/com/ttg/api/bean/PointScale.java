package cn.com.ttg.api.bean;

import java.io.Serializable;

public class PointScale implements Serializable {
	private static final long serialVersionUID = -1145409806683015328L;

	private int shopid;

	private String shopname;

	private String bname;

	private String ptype;

	private String pname;

	private int scale;

	public int getShopid() {
		return shopid;
	}

	public void setShopid(int shopid) {
		this.shopid = shopid;
	}

	public String getShopname() {
		return shopname;
	}

	public void setShopname(String shopname) {
		this.shopname = shopname;
	}

	public String getBname() {
		return bname;
	}

	public void setBname(String bname) {
		this.bname = bname;
	}

	public String getPtype() {
		return ptype;
	}

	public void setPtype(String ptype) {
		this.ptype = ptype;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public int getScale() {
		return scale;
	}

	public void setScale(int scale) {
		this.scale = scale;
	}

}
