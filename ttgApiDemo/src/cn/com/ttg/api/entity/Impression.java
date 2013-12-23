package cn.com.ttg.api.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * 用户的评论
 * 
 * @author leon
 * 
 */
public class Impression implements Serializable {

	private static final long serialVersionUID = 7034441582026866925L;
	private Integer impid;
	private String impression;
	private Date imptime;
	private Integer userid;
	private String username;
	private String sex;
	private String headsml;
	private String headmid;
	private String headbig;
	private String impcpp;
	private Integer score;
	private Integer score1;
	private Integer score2;
	private Integer score3;
	private Integer score4;
	private Integer score5;
	private Integer r;

	public Integer getImpid() {
		return impid;
	}

	public void setImpid(Integer impid) {
		this.impid = impid;
	}

	public String getImpression() {
		return impression;
	}

	public void setImpression(String impression) {
		this.impression = impression;
	}

	public Date getImptime() {
		return imptime;
	}

	public void setImptime(Date imptime) {
		this.imptime = imptime;
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

	public String getImpcpp() {
		return impcpp;
	}

	public void setImpcpp(String impcpp) {
		this.impcpp = impcpp;
	}

	public Integer getScore() {
		return score;
	}

	public void setScore(Integer score) {
		this.score = score;
	}

	public Integer getScore1() {
		return score1;
	}

	public void setScore1(Integer score1) {
		this.score1 = score1;
	}

	public Integer getScore2() {
		return score2;
	}

	public void setScore2(Integer score2) {
		this.score2 = score2;
	}

	public Integer getScore3() {
		return score3;
	}

	public void setScore3(Integer score3) {
		this.score3 = score3;
	}

	public Integer getScore4() {
		return score4;
	}

	public void setScore4(Integer score4) {
		this.score4 = score4;
	}

	public Integer getScore5() {
		return score5;
	}

	public void setScore5(Integer score5) {
		this.score5 = score5;
	}

	public Integer getR() {
		return r;
	}

	public void setR(Integer r) {
		this.r = r;
	}

}
