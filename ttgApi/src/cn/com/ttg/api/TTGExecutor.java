package cn.com.ttg.api;

import cn.com.ttg.api.exception.TTGException;

public interface TTGExecutor {

	public final static String API_SERVER = Config.getProperties(ConfigKey.apiserver);

	public static final int DEFAULT_HTTP_PORT = Config.getIntegerProperties(ConfigKey.httpport);

	public static final String USER_AGENT = Config.getProperties(ConfigKey.useragent);

	public TTGResponse execute(TTGRequest request) throws TTGException;
}
