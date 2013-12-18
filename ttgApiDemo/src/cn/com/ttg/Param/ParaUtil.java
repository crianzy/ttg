package cn.com.ttg.Param;

import cn.com.ttg.util.HttpRequest;
import cn.com.ttg.util.Md5Util;

/**
 *  参数工具 防止硬编码
 * @author leon
 *
 */
public class ParaUtil {

	public static String appkeyValue = "10304";
	public static String appSecretValue = "f4bafa4d96624d85ad5746202f253597";
	public static String cardTestNo = "6225887899991234";
	
	
	public static String appkey = "appkey";
	public static String sign = "sign";
	public static String timestamp = "timestamp";
	public static String action = "action";
	public static String cardno = "cardno";
	public static String province = "province";
	public static String city = "city";
	public static String county = "county";
	public static String clsid = "clsid";
	public static String pid = "pid";
	
	public static String bankid = "bankid";
	public static String shopid = "shopid";
	public static String couid = "couid";
	public static String keyword = "keyword";
	public static String lng = "lng";
	public static String lat = "lng";
	public static String range = "range";
	public static String coutype = "coutype";
	public static String page = "page";
	public static String pagesize = "pagesize";
	public static String state = "state";
	public static String shopcolumn = "shopcolumn";
	public static String coucolumn = "coucolumn";
	public static String updatetime = "updatetime";
	
	public static String mobile = "mobile";
	public static String card = "card";
	public static String orderid = "orderid";
	public static String extra = "extra";
	public static String extra2 = "extra2";
	public static String notify_url = "notify_url";
	public static String svcid = "svcid";
	public static String ptype = "ptype";
	public static String amount = "amount";
	
	
	/**
	 * sign=md5(appkey+timestamp+appsecret)
	 * @return
	 */
	public static String getSign(String timestamp) {
		String sign = Md5Util.MD5(appkeyValue+timestamp+appSecretValue);
		System.out.println("sign="+sign);
		return sign;
	}
	
	/**
	 * 获取服务器的是时间戳timestamp
	 * @return
	 */
	public static String getTimestamp(){
		String timeStamp = HttpRequest.sendGet("http://openapi.ttg.cn/", "");
		System.out.println("timeStamp="+timeStamp);
		return timeStamp;
	}

}
