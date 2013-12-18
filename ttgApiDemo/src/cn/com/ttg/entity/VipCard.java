package cn.com.ttg.entity;

import java.util.Date;
import java.util.List;

import net.sf.json.JSONArray;

public class VipCard {

	private int shopid;
	private String shopname;
	private String bname;
	private String logo;
	private String logo2;
	private String province;
	private String city;
	private String county;
	private String area;
	private String tel;
	private String address;
	private String openhours;
	private String bus;
	private String lng;
	private String lat;
	private int comments;
	private int impressions;
	private int coupons;
	private int branchs;
	private int clsid;
	private String clsname;
	private String support;
	private String tags;
	private String intro;
	private int headid;
	private int svcid;
	private int levelsnum;
	private String svcshopname;
	private String svclogo;
	private int allnum;
	private int usednum;
	private int blance;
	private String recommend;
	private String discount;
	private Date stime;
	private Date etime;
	private Date lasttime;
	private Date updatetime;
	private double range;
	private int r;

	private VipLevel[] levels;

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

	public String getLogo() {
		return logo;
	}

	public void setLogo(String logo) {
		this.logo = logo;
	}

	public String getLogo2() {
		return logo2;
	}

	public void setLogo2(String logo2) {
		this.logo2 = logo2;
	}

	public String getProvince() {
		return province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCounty() {
		return county;
	}

	public void setCounty(String county) {
		this.county = county;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getOpenhours() {
		return openhours;
	}

	public void setOpenhours(String openhours) {
		this.openhours = openhours;
	}

	public String getBus() {
		return bus;
	}

	public void setBus(String bus) {
		this.bus = bus;
	}

	public String getLng() {
		return lng;
	}

	public void setLng(String lng) {
		this.lng = lng;
	}

	public String getLat() {
		return lat;
	}

	public void setLat(String lat) {
		this.lat = lat;
	}

	public int getComments() {
		return comments;
	}

	public void setComments(int comments) {
		this.comments = comments;
	}

	public int getImpressions() {
		return impressions;
	}

	public void setImpressions(int impressions) {
		this.impressions = impressions;
	}

	public int getCoupons() {
		return coupons;
	}

	public void setCoupons(int coupons) {
		this.coupons = coupons;
	}

	public int getBranchs() {
		return branchs;
	}

	public void setBranchs(int branchs) {
		this.branchs = branchs;
	}

	public int getClsid() {
		return clsid;
	}

	public void setClsid(int clsid) {
		this.clsid = clsid;
	}

	public String getClsname() {
		return clsname;
	}

	public void setClsname(String clsname) {
		this.clsname = clsname;
	}

	public String getSupport() {
		return support;
	}

	public void setSupport(String support) {
		this.support = support;
	}

	public String getTags() {
		return tags;
	}

	public void setTags(String tags) {
		this.tags = tags;
	}

	public String getIntro() {
		return intro;
	}

	public void setIntro(String intro) {
		this.intro = intro;
	}

	public int getHeadid() {
		return headid;
	}

	public void setHeadid(int headid) {
		this.headid = headid;
	}

	public int getSvcid() {
		return svcid;
	}

	public void setSvcid(int svcid) {
		this.svcid = svcid;
	}

	public int getLevelsnum() {
		return levelsnum;
	}

	public void setLevelsnum(int levelsnum) {
		this.levelsnum = levelsnum;
	}

	public String getSvcshopname() {
		return svcshopname;
	}

	public void setSvcshopname(String svcshopname) {
		this.svcshopname = svcshopname;
	}

	public String getSvclogo() {
		return svclogo;
	}

	public void setSvclogo(String svclogo) {
		this.svclogo = svclogo;
	}

	public int getAllnum() {
		return allnum;
	}

	public void setAllnum(int allnum) {
		this.allnum = allnum;
	}

	public int getUsednum() {
		return usednum;
	}

	public void setUsednum(int usednum) {
		this.usednum = usednum;
	}

	public int getBlance() {
		return blance;
	}

	public void setBlance(int blance) {
		this.blance = blance;
	}

	public String getRecommend() {
		return recommend;
	}

	public void setRecommend(String recommend) {
		this.recommend = recommend;
	}

	public String getDiscount() {
		return discount;
	}

	public void setDiscount(String discount) {
		this.discount = discount;
	}

	public Date getStime() {
		return stime;
	}

	public void setStime(Date stime) {
		this.stime = stime;
	}

	public Date getEtime() {
		return etime;
	}

	public void setEtime(Date etime) {
		this.etime = etime;
	}

	public Date getLasttime() {
		return lasttime;
	}

	public void setLasttime(Date lasttime) {
		this.lasttime = lasttime;
	}

	public Date getUpdatetime() {
		return updatetime;
	}

	public void setUpdatetime(Date updatetime) {
		this.updatetime = updatetime;
	}

	public double getRange() {
		return range;
	}

	public void setRange(double range) {
		this.range = range;
	}

	public int getR() {
		return r;
	}

	public void setR(int r) {
		this.r = r;
	}

	public VipLevel[] getLevels() {
		return levels;
	}

	public void setLevels(VipLevel[] levels) {
		this.levels = levels;
	}

}
