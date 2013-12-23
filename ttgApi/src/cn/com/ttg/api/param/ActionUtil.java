package cn.com.ttg.api.param;


/**
 * action 参数名称 防止硬编码
 * 
 * @author leon
 * 
 */
public class ActionUtil {

	/**
	 * 验证银行卡号
	 */
	public static String checkCardNoAction = "checkcardno";
	/**
	 * 全国省份城市区县数据
	 */
	public static String getCityAction = "getcity";
	/**
	 * 商户分类数据
	 */
	public static String getClazzAction = "getclass";
	/**
	 * 银行数据
	 */
	public static String getBankAction = "getbank";

	/**
	 * 优惠券数据
	 */
	public static String getCouponAction = "getcoupon";
	/**
	 * 添加优惠券
	 */
	public static String addCouponAction = "addcoupon";
	/**
	 * 优惠券/会员卡关联的分店
	 */
	public static String getCouponBranchAction = "getcouponbranch";

	/**
	 * 积分充值
	 */
	public static String chargePointsAction = "chargepoints";

	/**
	 * 会员卡数据
	 */
	public static String getVipCardAction = "getvipcard";

	/**
	 * 获取商户分店
	 */
	public static String getShopBranchAction = "getshopbranch";

	/**
	 * 商户口碑
	 */
	public static String shopImpressionAction = "shopimpression";
	/**
	 * 商户优惠
	 */
	public static String getShopCouponAction = "getshopcoupon";

	/**
	 * 商户图片
	 */
	public static String getShopImageAction = "getshopimage";
	/**
	 * 商户评论
	 */
	public static String getShopCommentAction = "getshopcomment";
	/**
	 * 商户数据
	 */
	public static String shopInfoAction = "shopinfo";
	/**
	 * 绑定会员卡
	 */
	public static String addVipCardAction = "addvipcard";
	/**
	 * 用户会员卡查询
	 */
	public static String userVipCardAction = "uservipcard";
	/**
	 * 优惠券/会员卡关联的分店
	 */
	public static String getUserCouponAction = "getusercoupon";
	
	// public static Map<String,ParamCheck> actionCheckClassMap = new
	// HashMap<String,ParamCheck>();
	//
	// static{
	// actionCheckClassMap.put(checkCardNoAction, new CheckCardNoActionCheck());
	// actionCheckClassMap.put(getCityAction, new GetCityActionCheck());
	// actionCheckClassMap.put(getClazzAction, new GetClazzActionCheck());
	// actionCheckClassMap.put(getBankAction, new GetBankActionCheck());
	// actionCheckClassMap.put(getCouponAction, new GetCouponActionCheck());
	// actionCheckClassMap.put(getCouponBranchAction, new
	// GetCouponBranchActionCheck());
	// actionCheckClassMap.put(chargePointsAction, new
	// ChargePointsActionCheck());
	// actionCheckClassMap.put(getVipCardAction, new GetVipCardActionCheck());
	// actionCheckClassMap.put(getShopBranchAction, new
	// GetShopbranchActionCheck());
	// actionCheckClassMap.put(shopImpressionAction, new
	// ShopImpressionActionCheck());
	// actionCheckClassMap.put(getShopCouponAction, new
	// GetShopCouponActionCheck());
	// actionCheckClassMap.put(getShopImageAction, new
	// GetShopImageActionCheck());
	// actionCheckClassMap.put(getShopCommentAction, new
	// GetShopCommentActionCheck());
	// actionCheckClassMap.put(shopInfoAction, new ShopInfoActionCheck());
	// actionCheckClassMap.put(addVipCardAction, new AddVipCardActionCheck());
	// actionCheckClassMap.put(userVipCardAction, new UserVipCardActionCheck());
	// actionCheckClassMap.put(getUserCouponAction, new
	// GetUserCouponActionCheck());
	// actionCheckClassMap.put(addVipCardAction, new AddVipCardActionCheck());
	// actionCheckClassMap.put(addCouponAction, new AddCouponActionCheck());
	// }
}
