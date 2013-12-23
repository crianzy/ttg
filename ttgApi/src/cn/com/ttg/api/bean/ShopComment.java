package cn.com.ttg.api.bean;

import java.io.Serializable;
import java.util.Date;

/**
 * 针对商户的评论信息
 * @author leon
 *
 */
public class ShopComment implements Serializable {
	private static final long serialVersionUID = 5452753103006190183L;
	private Integer comid;
	private String comcontent;
	private Date comtime;
	private Integer userid;
	private String username;
	private String sex;
	private String headsml;
	private String headmid;
	private String headbig;
	private Integer r;

	public Integer getComid() {
		return comid;
	}

	public void setComid(Integer comid) {
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

	public Integer getUserid() {
		return userid;
	}

	public void setUserid(Integer userid) {
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

	public Integer getR() {
		return r;
	}

	public void setR(Integer r) {
		this.r = r;
	}

}
