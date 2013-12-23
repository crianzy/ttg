package cn.com.ttg.api;

import java.net.HttpURLConnection;

import org.apache.log4j.Logger;

import cn.com.ttg.api.exception.TTGException;
import cn.com.ttg.api.http.HttpRequest;
import cn.com.ttg.api.json.JSONException;
import cn.com.ttg.api.json.JSONObject;

public class DefaultTTGExecutor implements TTGExecutor {

	private static Logger logger = Logger.getLogger(DefaultTTGExecutor.class
			.getName());

	@Override
	public TTGResponse execute(TTGRequest request) throws TTGException {

		String path = request.getPath();
		TTGRequest.Method method = request.getMethod();
		
		if (logger.isDebugEnabled()) {
			logger.debug("Execute request: " + request);
		}

		StringBuffer baseUrl = new StringBuffer();
		// TODO seem should judge http or httpss
		baseUrl.append(Config.getProperties(ConfigKey.http)).append(API_SERVER).append(path);
		String query = request.getParam().toString();
		StringBuffer url = new StringBuffer();
		url.append(baseUrl);
		if (query != null && query.length() > 0) {
			url.append("?" + query);
		}

		HttpRequest httpRequest;
		switch (method) {
		case PUT:
			httpRequest = HttpRequest.put(url);
			break;
		case DELETE:
			httpRequest = HttpRequest.delete(url);
			break;
		case POST:
			httpRequest = HttpRequest.post(url);
			break;
		case GET:
			httpRequest = HttpRequest.get(url);
			break;
		default:
			httpRequest = HttpRequest.get(url);
		}
		int statusCode = httpRequest.code();
		String body = httpRequest.body();

		if (logger.isInfoEnabled()) {
			logger.info("Response body: " + body);
		}

		try {
			JSONObject respObj = new JSONObject(body);
			if (HttpURLConnection.HTTP_OK == statusCode) {
				if(respObj.getInt("ret") == 0){
					Object resp = respObj.get("data");
					return new TTGResponse(resp);
				}else{
					int code = respObj.getInt("errcode");
					String message = respObj.getString("msg");
					//TODO 拋服务器返回的错误异常
					throw new TTGException(message);
				}
			} else {
				// TODO 拋连接服务器失败的异常
				throw new TTGException();
			}
		} catch (JSONException e) {
			throw new RuntimeException(e.getMessage(), e);
		}
	}
}