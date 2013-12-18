package cn.com.ttg.entity;

import java.util.Date;

public class VipCardLog {

	// TODO int 可能要换 long
	private int uvcid;
	private int vipcardnum;
	private int shopid;
	private int svcid;
	private Date addtime;
	private String orderid;
	private String extra;
	private String extra2;

	public int getUvcid() {
		return uvcid;
	}

	public void setUvcid(int uvcid) {
		this.uvcid = uvcid;
	}

	public int getVipcardnum() {
		return vipcardnum;
	}

	public void setVipcardnum(int vipcardnum) {
		this.vipcardnum = vipcardnum;
	}

	public int getShopid() {
		return shopid;
	}

	public void setShopid(int shopid) {
		this.shopid = shopid;
	}

	public int getSvcid() {
		return svcid;
	}

	public void setSvcid(int svcid) {
		this.svcid = svcid;
	}

	public Date getAddtime() {
		return addtime;
	}

	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public String getOrderid() {
		return orderid;
	}

	public void setOrderid(String orderid) {
		this.orderid = orderid;
	}

	public String getExtra() {
		return extra;
	}

	public void setExtra(String extra) {
		this.extra = extra;
	}

	public String getExtra2() {
		return extra2;
	}

	public void setExtra2(String extra2) {
		this.extra2 = extra2;
	}

}
