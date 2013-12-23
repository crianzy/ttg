package cn.com.ttg.api.entity;

import java.io.Serializable;

/**
 * 商户的信息
 * @author leon
 *
 */
public class ShopInfo implements Serializable {

	private static final long serialVersionUID = 5864818855828814823L;
	private Shop shop;
	private Coupon[] coupons;
	private VipCard[] vipcards;
	private ShopComment[] comments;
	private Shop[] branchstore;
	private ImpressionCount<Impression> impression;

	public Shop getShop() {
		return shop;
	}

	public void setShop(Shop shop) {
		this.shop = shop;
	}

	public Coupon[] getCoupons() {
		return coupons;
	}

	public void setCoupons(Coupon[] coupons) {
		this.coupons = coupons;
	}

	public VipCard[] getVipcards() {
		return vipcards;
	}

	public void setVipcards(VipCard[] vipcards) {
		this.vipcards = vipcards;
	}

	public ShopComment[] getComments() {
		return comments;
	}

	public void setComments(ShopComment[] comments) {
		this.comments = comments;
	}

	public Shop[] getBranchstore() {
		return branchstore;
	}

	public void setBranchstore(Shop[] branchstore) {
		this.branchstore = branchstore;
	}

	public ImpressionCount<Impression> getImpression() {
		return impression;
	}

	public void setImpression(ImpressionCount<Impression> impression) {
		this.impression = impression;
	}

}
