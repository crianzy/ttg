package cn.com.ttg.api.bean;

import java.io.Serializable;
import java.util.Date;

/**
 * 优惠券信息
 * 
 * @author leon
 * 
 */
public class Coupon implements Serializable {
	private static final long serialVersionUID = -6586453070577566996L;
	private Integer shopid;
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
	private Double lng;
	private Double lat;
	private Integer comments;
	private Integer impressions;
	private Integer coupons;
	private Integer branchs;
	private Integer clsid;
	private String clsname;
	private String support;
	private String tags;
	private String intro;
	private Integer headid;
	private Integer shopavg;
	private Integer couid;
	private String couname;
	private Integer coubranchs;
	private String pic;
	private Date effect;
	private Date expired;
	private Integer bankid;
	private String bankname;
	private Date upDatetime;
	private Integer actid;
	private Integer nums;
	private Integer coutype;
	private Integer amount;
	private Integer giftid;
	private String giftinfo;
	private Integer state;
	private Integer cardtype;
	private Integer minamount;
	private Integer maxamount;
	private String discount;
	private Integer range;
	private Integer r;

	private Date updatetime;

	public Integer getShopid() {
		return shopid;
	}

	public void setShopid(Integer shopid) {
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

	public Double getLng() {
		return lng;
	}

	public void setLng(Double lng) {
		this.lng = lng;
	}

	public Double getLat() {
		return lat;
	}

	public void setLat(Double lat) {
		this.lat = lat;
	}

	public Integer getComments() {
		return comments;
	}

	public void setComments(Integer comments) {
		this.comments = comments;
	}

	public Integer getImpressions() {
		return impressions;
	}

	public void setImpressions(Integer impressions) {
		this.impressions = impressions;
	}

	public Integer getCoupons() {
		return coupons;
	}

	public Date getUpdatetime() {
		return updatetime;
	}

	public void setUpdatetime(Date updatetime) {
		this.updatetime = updatetime;
	}

	public void setCoupons(Integer coupons) {
		this.coupons = coupons;
	}

	public Integer getBranchs() {
		return branchs;
	}

	public void setBranchs(Integer branchs) {
		this.branchs = branchs;
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

	public Integer getHeadid() {
		return headid;
	}

	public void setHeadid(Integer headid) {
		this.headid = headid;
	}

	public Integer getShopavg() {
		return shopavg;
	}

	public void setShopavg(Integer shopavg) {
		this.shopavg = shopavg;
	}

	public Integer getCouid() {
		return couid;
	}

	public void setCouid(Integer couid) {
		this.couid = couid;
	}

	public String getCouname() {
		return couname;
	}

	public void setCouname(String couname) {
		this.couname = couname;
	}

	public Integer getCoubranchs() {
		return coubranchs;
	}

	public void setCoubranchs(Integer coubranchs) {
		this.coubranchs = coubranchs;
	}

	public String getPic() {
		return pic;
	}

	public void setPic(String pic) {
		this.pic = pic;
	}

	public Date getEffect() {
		return effect;
	}

	public void setEffect(Date effect) {
		this.effect = effect;
	}

	public Date getExpired() {
		return expired;
	}

	public void setExpired(Date expired) {
		this.expired = expired;
	}

	public Integer getBankid() {
		return bankid;
	}

	public void setBankid(Integer bankid) {
		this.bankid = bankid;
	}

	public String getBankname() {
		return bankname;
	}

	public void setBankname(String bankname) {
		this.bankname = bankname;
	}

	public Date getUpDatetime() {
		return upDatetime;
	}

	public void setUpDatetime(Date upDatetime) {
		this.upDatetime = upDatetime;
	}

	public Integer getActid() {
		return actid;
	}

	public void setActid(Integer actid) {
		this.actid = actid;
	}

	public Integer getNums() {
		return nums;
	}

	public void setNums(Integer nums) {
		this.nums = nums;
	}

	public Integer getCoutype() {
		return coutype;
	}

	public void setCoutype(Integer coutype) {
		this.coutype = coutype;
	}

	public Integer getAmount() {
		return amount;
	}

	public void setAmount(Integer amount) {
		this.amount = amount;
	}

	public Integer getGiftid() {
		return giftid;
	}

	public void setGiftid(Integer giftid) {
		this.giftid = giftid;
	}

	public String getGiftinfo() {
		return giftinfo;
	}

	public void setGiftinfo(String giftinfo) {
		this.giftinfo = giftinfo;
	}

	public Integer getState() {
		return state;
	}

	public void setState(Integer state) {
		this.state = state;
	}

	public Integer getCardtype() {
		return cardtype;
	}

	public void setCardtype(Integer cardtype) {
		this.cardtype = cardtype;
	}

	public Integer getMinamount() {
		return minamount;
	}

	public void setMinamount(Integer minamount) {
		this.minamount = minamount;
	}

	public Integer getMaxamount() {
		return maxamount;
	}

	public void setMaxamount(Integer maxamount) {
		this.maxamount = maxamount;
	}

	public String getDiscount() {
		return discount;
	}

	public void setDiscount(String discount) {
		this.discount = discount;
	}

	public Integer getRange() {
		return range;
	}

	public void setRange(Integer range) {
		this.range = range;
	}

	public Integer getR() {
		return r;
	}

	public void setR(Integer r) {
		this.r = r;
	}

	// -------------------------
	// -------------------------

}
