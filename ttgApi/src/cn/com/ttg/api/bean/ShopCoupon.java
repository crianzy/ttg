package cn.com.ttg.api.bean;

import java.io.Serializable;
import java.util.Date;

/**
 * 商户的优惠 信息
 * @author leon
 *
 */
public class ShopCoupon implements Serializable {

	private static final long serialVersionUID = 5209741039208843751L;
	private Integer couid;
	private String couname;
	private Integer coubranchs;
	private String pic;
	private Date effect;
	private Date expired;
	private Integer bankid;
	private String bankname;
	private Date updatetime;
	private Integer actid;
	private String nums;
	private Integer coutype;
	private Integer amount;
	private String giftid;
	private String giftinfo;
	private Integer state;
	private Integer cardtype;
	private Integer minamount;
	private String maxamount;
	private Integer r;
	private String discount;

	
	public String getDiscount() {
		return discount;
	}

	public void setDiscount(String discount) {
		this.discount = discount;
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

	public Date getUpdatetime() {
		return updatetime;
	}

	public void setUpdatetime(Date updatetime) {
		this.updatetime = updatetime;
	}

	public Integer getActid() {
		return actid;
	}

	public void setActid(Integer actid) {
		this.actid = actid;
	}

	public String getNums() {
		return nums;
	}

	public void setNums(String nums) {
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

	public String getGiftid() {
		return giftid;
	}

	public void setGiftid(String giftid) {
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

	public String getMaxamount() {
		return maxamount;
	}

	public void setMaxamount(String maxamount) {
		this.maxamount = maxamount;
	}

	public Integer getR() {
		return r;
	}

	public void setR(Integer r) {
		this.r = r;
	}
}
