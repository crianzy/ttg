package cn.com.ttg.action;

import java.util.List;

import cn.com.ttg.api.bean.Coupon;
import cn.com.ttg.api.bean.Page;
import cn.com.ttg.api.bean.ShopImage;
import cn.com.ttg.api.bean.ShopInfo;
import cn.com.ttg.api.bean.service.CouponService;
import cn.com.ttg.api.bean.service.ShopService;
import cn.com.ttg.api.param.ActionUtil;
import cn.com.ttg.api.param.ParaUtil;
import cn.com.ttg.api.param.ParamMap;

import com.opensymphony.xwork2.ActionContext;

public class ShopAction extends BaseAction {

	private static final long serialVersionUID = -1080995691448196635L;

	private ShopService shopService = client.getShopService();
	private CouponService couponService = client.getCouponService();

	ParamMap param = new ParamMap(client.getParamActionVerify(),
			client.getParamVerify());
	
	private String shopid = "105482";

	public String shop() {
		param.put(ParaUtil.action, ActionUtil.shopInfoAction);
		//param.put(ParaUtil.shopid, "109807");
		param.put(ParaUtil.shopid, shopid);
		param.put(ParaUtil.coupons, "10");
		param.put(ParaUtil.vipcards, "10");
		param.put(ParaUtil.comments, "10");
		param.put(ParaUtil.branchstore, "10");
		param.put(ParaUtil.impressions, "10");
		ShopInfo shopInfo = shopService.shopInfo(param);
		ActionContext.getContext().put("shopInfo", shopInfo);
		// 商户图片
		param.clear();
		param.addAuthorize();
		param.put(ParaUtil.action, ActionUtil.getShopImageAction);
		param.put(ParaUtil.shopid, shopid);
		List<ShopImage> shopImageList = shopService.getshopimage(param);
		ActionContext.getContext().put("shopImageList", shopImageList);
		//周边商户 优惠券
		param.clear();
		param.addAuthorize();
		// param.put(ParaUtil.lng, shopInfo.getShop().getLng()+"");
		// param.put(ParaUtil.lat, shopInfo.getShop().getLat()+"");
		// param.put(ParaUtil.range, "9");
		 param.put(ParaUtil.action, ActionUtil.getCouponAction);
		 List<Coupon> arroundCoupon = couponService.getCoupon(param).getList();
		ActionContext.getContext().put("arroundCoupon", arroundCoupon);
		
		return SUCCESS;
	}

	public String getShopid() {
		return shopid;
	}

	public void setShopid(String shopid) {
		this.shopid = shopid;
	}

}
