package cn.com.ttg.api.param;

import cn.com.ttg.api.util.Md5Util;

/**
 * 参数工具 防止硬编码
 * 
 * @author leon
 * 
 */
public class ParaUtil {

	public static String appkeyValue = "10304";
	public static String appSecretValue = "f4bafa4d96624d85ad5746202f253597";
	public static String cardTestNo = "6227002022081063435";

	public static String appkey = "appkey";
	public static String sign = "sign";
	public static String timestamp = "timestamp";
	public static String action = "action";
	/**
	 * 银行卡卡号
	 */
	public static String cardno = "cardno";
	/**
	 * 省
	 */
	public static String province = "province";
	/**
	 * 市
	 */
	public static String city = "city";
	/**
	 * 县 乡
	 */
	public static String county = "county";

	/**
	 * 商户的id
	 */
	public static String clsid = "clsid";
	/**
	 * 父级分类编号 为0时分主分类,不传值显示全部
	 */
	public static String pid = "pid";

	/**
	 * 银行编号
	 */
	public static String bankid = "bankid";

	/**
	 * 商户编号
	 */
	public static String shopid = "shopid";
	/**
	 * 优惠券编号
	 */
	public static String couid = "couid";
	/**
	 * 关键词
	 */
	public static String keyword = "keyword";

	/**
	 * 经度 只有当lat,lng,range三个参数同时存在，才会触发range公里范围内的商户优惠。
	 */
	public static String lng = "lng";
	/**
	 * 纬度 只有当lat,lng,range三个参数同时存在，才会触发range公里范围内的商户优惠。
	 */
	public static String lat = "lng";
	/**
	 * 范围公里(1->9) 只有当lat,lng,range三个参数同时存在，才会触发range公里范围内的商户优惠。
	 */
	public static String range = "range";

	/**
	 * 优惠类型(1定额优惠，2：折扣优惠，3赠品券，4积分返利券，5固定金额优惠券， 多种同时请求时请用逗号隔开，如：coutype=1,2,3)
	 */
	public static String coutype = "coutype";
	/**
	 * 页数
	 */
	public static String page = "page";

	/**
	 * 每页返回的数据量，最大20
	 */
	public static String pagesize = "pagesize";

	/**
	 * 状态 （优惠券状态(1,2)，1为正常2为已过期，不传值显示全部）
	 */
	public static String state = "state";

	/**
	 * 商户字段(a->x)，可以根据应用的实际开发情况选择合适的字段，以节约流量，不传值或者传*将输出全部字段
	 */
	public static String shopcolumn = "shopcolumn";

	/**
	 * 优惠券字段(a->s)，可以根据应用的实际开发情况选择合适的字段，以节约流量，不传值或者传*将输出全部字段
	 */
	public static String coucolumn = "coucolumn";
	/**
	 * 只列出指定时间及以后更新的所有优惠券（时间格式为：2012-08-09 06:12:01），不能只包含日期，否则功能无效
	 */
	public static String updatetime = "updatetime";

	/**
	 * 用户手机号码
	 */
	public static String mobile = "mobile";

	/**
	 * 完整的银行卡号，中间不能有任何空格或者字符，纯数字
	 */
	public static String card = "card";

	/**
	 * 订单号（每次提交的订单号必须唯一，不能重复）
	 */
	public static String orderid = "orderid";

	/**
	 * 备注1
	 */
	public static String extra = "extra";
	/**
	 * 备注1
	 */
	public static String extra2 = "extra2";

	/**
	 * 交易状态通知地址URL
	 */
	public static String notify_url = "notify_url";

	/**
	 * 会员卡编号
	 */
	public static String svcid = "svcid";
	/**
	 * post 发送json 数据时的data
	 */
	public static String data = "data";
	/**
	 * 积分类型（具体参数值请与ttg工作人员联系，最长20位长度）
	 */
	public static String ptype = "ptype";
	/**
	 * 充值的积分数量（不能小于0,可以为0，为0表示开户）
	 */
	public static String amount = "amount";

	/**
	 * 会员卡字段(a->l)，可以根据应用的实际开发情况选择合适的字段，以节约流量，不传值或者传*将输出全部字段
	 */
	public static String svccolumn = "svccolumn";
	/**
	 * 分店字段(a->w)，可以根据应用的实际开发情况选择合适的字段，以节约流量，不传值或者传*将输出全部字段
	 */
	public static String brcolumn = "brcolumn";
	/**
	 * 口碑字段(a->o)，可以根据应用的实际开发情况选择合适的字段，以节约流量，不传值或者传*将输出全部字段
	 */
	public static String impcolumn = "impcolumn";
	/**
	 * 优惠券字段(a->r)，可以根据应用的实际开发情况选择合适的字段，以节约流量，不传值或者传*将输出全部字段
	 */
	public static String comcolumn = "comcolumn";
	/**
	 * 会员卡字段(a->s)，可以根据应用的实际开发情况选择合适的字段，以节约流量，不传值或者传*将输出全部字段
	 */
	public static String uvccolumn = "uvccolumn";

	/**
	 * 优惠券数量，最多10条，不传不返回优惠券数据
	 */
	public static String coupons = "coupons";

	/**
	 * 会员卡数量，最多10条，不传不返回会员卡数据
	 */
	public static String vipcards = "vipcards";
	/**
	 * 评论数量，最多10条，不传不返回评论数据
	 */
	public static String comments = "comments";
	/**
	 * 分店数量，最多10条，不传不返回分店数据
	 */
	public static String branchstore = "branchstore";
	/**
	 * 口碑数量，最多10条，不传不返回口碑数据
	 */
	public static String impressions = "impressions";

	/**
	 * 订单是否已完成(1,0),1已完成，0未完成，当为1时将按优惠券结束时间排序，否则按unid编号大至小排序
	 */
	public static String used = "used";
	/**
	 * 消费的开始时间，与useetime同时使用
	 */
	public static String usestime = "usestime";
	/**
	 * 消费的结束时间,与usestime同时使用
	 */
	public static String useetime = "useetime";
	/**
	 * 添加的开始时间，与addetime同时使用
	 */
	public static String addstime = "addstime";
	/**
	 * 添加的结束时间，与addstime同时使用
	 */
	public static String addetime = "addetime";
	/**
	 * 指定的用户编号
	 */
	public static String uid = "uid";

	/**
	 * sign=md5(appkey+timestamp+appsecret)
	 * 
	 * @return
	 */
	public static String getSign(String timestamp) {
		String sign = Md5Util.MD5(appkeyValue + timestamp + appSecretValue);
		System.out.println("sign=" + sign);
		return sign;
	}

	/**
	 * 获取时间戳timestamp
	 * 
	 * @return
	 */
	public static String getTimestamp() {
		String timeStamp = String.valueOf(System.currentTimeMillis() / 1000);
		System.out.println("timeStamp=" + timeStamp);
		return timeStamp;
	}

}
