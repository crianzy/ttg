package cn.com.ttg.entity;

import java.util.Date;

public class ShopComment {
	private int comid;
	private String comcontent;
	private Date comtime;
	private int userid;
	private String username;
	private String sex;
	private String headsml;
	private String headmid;
	private String headbig;
	private int r;

	public int getComid() {
		return comid;
	}

	public void setComid(int comid) {
		this.comid = comid;
	}

	public String getComcontent() {
		return comcontent;
	}

	public void setComcontent(String comcontent) {
		this.comcontent = comcontent;
	}

	public Date getComtime() {
		return comtime;
	}

	public void setComtime(Date comtime) {
		this.comtime = comtime;
	}

	public int getUserid() {
		return userid;
	}

	public void setUserid(int userid) {
		this.userid = userid;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getHeadsml() {
		return headsml;
	}

	public void setHeadsml(String headsml) {
		this.headsml = headsml;
	}

	public String getHeadmid() {
		return headmid;
	}

	public void setHeadmid(String headmid) {
		this.headmid = headmid;
	}

	public String getHeadbig() {
		return headbig;
	}

	public void setHeadbig(String headbig) {
		this.headbig = headbig;
	}

	public int getR() {
		return r;
	}

	public void setR(int r) {
		this.r = r;
	}

}
