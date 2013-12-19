package cn.com.ttg.entity;

import java.io.Serializable;
import java.util.Date;

public class VipCardLog implements Serializable {

	private static final long serialVersionUID = -2866538447996749000L;
	// TODO int 可能要换 long
	private Integer uvcid;
	private Integer vipcardnum;
	private Integer shopid;
	private Integer svcid;
	private Date addtime;
	private String orderid;
	private String extra;
	private String extra2;
	public Integer getUvcid() {
		return uvcid;
	}
	public void setUvcid(Integer uvcid) {
		this.uvcid = uvcid;
	}
	public Integer getVipcardnum() {
		return vipcardnum;
	}
	public void setVipcardnum(Integer vipcardnum) {
		this.vipcardnum = vipcardnum;
	}
	public Integer getShopid() {
		return shopid;
	}
	public void setShopid(Integer shopid) {
		this.shopid = shopid;
	}
	public Integer getSvcid() {
		return svcid;
	}
	public void setSvcid(Integer svcid) {
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
