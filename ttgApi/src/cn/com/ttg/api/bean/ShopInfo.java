package cn.com.ttg.api.bean;

import java.io.Serializable;
import java.util.List;

/**
 * 商户的信息
 * @author leon
 *
 */
public class ShopInfo implements Serializable {

	private static final long serialVersionUID = 5864818855828814823L;
	private Shop shop;
	private List<Coupon> coupons;
	private List<VipCard> vipcards;
	private List<ShopComment> comments;
	private List<Shop> branchstore;
	private ImpressionCount<Impression> impression;
	public Shop getShop() {
		return shop;
	}
	public void setShop(Shop shop) {
		this.shop = shop;
	}
	public List<Coupon> getCoupons() {
		return coupons;
	}
	public void setCoupons(List<Coupon> coupons) {
		this.coupons = coupons;
	}
	public List<VipCard> getVipcards() {
		return vipcards;
	}
	public void setVipcards(List<VipCard> vipcards) {
		this.vipcards = vipcards;
	}
	public List<ShopComment> getComments() {
		return comments;
	}
	public void setComments(List<ShopComment> comments) {
		this.comments = comments;
	}
	public List<Shop> getBranchstore() {
		return branchstore;
	}
	public void setBranchstore(List<Shop> branchstore) {
		this.branchstore = branchstore;
	}
	public ImpressionCount<Impression> getImpression() {
		return impression;
	}
	public void setImpression(ImpressionCount<Impression> impression) {
		this.impression = impression;
	}


}
