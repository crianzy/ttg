package cn.com.ttg.api;


public interface TTGExecutor {
	public final static String API_SERVER = "openapi.ttg.cn/coupon/v1";

	public static final int DEFAULT_HTTP_PORT = 80;

	public static final String USER_AGENT = "Renn API2.0 SDK Java v0.1";

	public TTGResponse execute(TTGRequest request) throws TTGException;

}
