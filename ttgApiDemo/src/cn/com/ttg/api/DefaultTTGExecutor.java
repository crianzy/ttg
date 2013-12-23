package cn.com.ttg.api;

import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.URLEncoder;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

import net.sf.json.JSONException;
import net.sf.json.JSONObject;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import cn.com.ttg.api.http.HttpRequest;

public class DefaultTTGExecutor implements TTGExecutor {
	private static Log logger = LogFactory.getLog(DefaultTTGExecutor.class
			.getName());

	@Override
	public TTGResponse execute(TTGRequest request) throws TTGException {

		String path = request.getPath();
		TTGRequest.Method method = request.getMethod();
		Map<String, String> textParams = request.getTextParams();

		if (logger.isDebugEnabled()) {
			logger.debug("Execute request: " + request);
		}

		StringBuffer baseUrl = new StringBuffer();
		//TODO  http 硬编码
		baseUrl.append("http://").append(API_SERVER).append(path);

		StringBuffer query = new StringBuffer();
		// TODO 添加 授权验证信息
		if (textParams != null && textParams.size() > 0) {
			for (Iterator<Entry<String, String>> itr = textParams.entrySet()
					.iterator(); itr.hasNext();) {
				Entry<String, String> param = itr.next();
				try {
					query.append(URLEncoder.encode(param.getKey(), "UTF-8"))
							.append("=")
							.append(URLEncoder.encode(param.getValue(), "UTF-8"));
				} catch (UnsupportedEncodingException e) {
					new RuntimeException(e.getMessage(), e);
				}
				if (itr.hasNext()) {
					query.append("&");
				}
			}
		}

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
			JSONObject respObj = JSONObject.fromObject(body);
			if (HttpURLConnection.HTTP_OK == statusCode
					|| respObj.getInt("ret") != 0) {
				Object resp = respObj.get("data");
				return new TTGResponse(resp);
			} else {
				int code = respObj.getInt("code");
				String message = respObj.getString("msg");
				// TODO 抛出 有服务端 返回的错误信息的
				throw new TTGException("code:" + code + ",msg:" + message);
			}
		} catch (JSONException e) {
			throw new RuntimeException(e.getMessage(), e);
		}
	}
}
