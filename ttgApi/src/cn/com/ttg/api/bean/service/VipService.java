package cn.com.ttg.api.bean.service;

import java.util.Arrays;
import java.util.List;

import org.apache.log4j.Logger;
import org.codehaus.jackson.map.ObjectMapper;

import cn.com.ttg.api.Config;
import cn.com.ttg.api.ConfigKey;
import cn.com.ttg.api.TTGExecutor;
import cn.com.ttg.api.TTGRequest;
import cn.com.ttg.api.TTGRequest.Method;
import cn.com.ttg.api.TTGResponse;
import cn.com.ttg.api.bean.Page;
import cn.com.ttg.api.bean.Shop;
import cn.com.ttg.api.bean.VipCard;
import cn.com.ttg.api.bean.VipCardLog;
import cn.com.ttg.api.bean.VipUserCard;
import cn.com.ttg.api.exception.TTGException;
import cn.com.ttg.api.json.JSONArray;
import cn.com.ttg.api.json.JSONObject;
import cn.com.ttg.api.param.ParamMap;

public class VipService extends BaseService {
	private static String urlPath = Config.getProperties(ConfigKey.urlpath);
	private static Logger logger = Logger.getLogger(DataDictionaryService.class
			.getName());
	private static String TAG = "DataDictionaryService ";

	public VipService(TTGExecutor executor, ObjectMapper objectMapper) {
		super(executor, objectMapper);
	}

	/**
	 * 获取所有的会员卡数据
	 * 
	 * @param param
	 * @return
	 */
	public Page<VipCard> getVipCard(ParamMap param) {
		TTGRequest request = new TTGRequest(urlPath, Method.GET, param);
		TTGResponse response = executor.execute(request);
		Page<VipCard> page = null;
		VipCard[] vipcards = null;
		JSONObject data;
		try {
			data = new JSONObject(response.getResponse().toString());
			JSONObject pages = data.getJSONObject("pages");
			JSONArray list = data.getJSONArray("list");
			page = mapper.readValue(pages.toString(), Page.class);
			vipcards = mapper.readValue(list.toString(), VipCard[].class);
		} catch (Exception e) {
			e.printStackTrace();
			logger.error(TAG + "解析 josn 错误");
			throw new TTGException(TAG + "解析json 错误", e);
		}
		page.setList(Arrays.asList(vipcards));
		return page;
	}

	/**
	 * 绑定会员卡
	 * @param param
	 * @return
	 */
	public VipCardLog addVipCard(ParamMap param) {
		TTGRequest request = new TTGRequest(urlPath, Method.GET, param);
		TTGResponse response = executor.execute(request);
		VipCardLog[] vipcardLogs = null;
		try {
			vipcardLogs = mapper.readValue(response.getResponse().toString(),
					VipCardLog[].class);
		} catch (Exception e) {
			e.printStackTrace();
			logger.error(TAG + "解析 josn 错误");
			throw new TTGException(TAG + "解析json 错误", e);
		}
		if(vipcardLogs!=null&&vipcardLogs.length>0){
			return vipcardLogs[0];
		}
		return null;
	}
	
	/**
	 * 用户会员卡查询
	 * @param param
	 * @return
	 */
	public Page<VipUserCard> userVipCard(ParamMap param){
		TTGRequest request = new TTGRequest(urlPath, Method.GET, param);
		TTGResponse response = executor.execute(request);
		Page<VipUserCard> page = null;
		VipUserCard[] vipcards = null;
		JSONObject data;
		try {
			data = new JSONObject(response.getResponse().toString());
			JSONObject pages = data.getJSONObject("pages");
			JSONArray list = data.getJSONArray("list");
			page = mapper.readValue(pages.toString(), Page.class);
			vipcards = mapper.readValue(list.toString(), VipUserCard[].class);
		} catch (Exception e) {
			e.printStackTrace();
			logger.error(TAG + "解析 josn 错误");
			throw new TTGException(TAG + "解析json 错误", e);
		}
		page.setList(Arrays.asList(vipcards));
		return page;
	}
	
	/**
	 * 获取与 会员卡相关联的  shop
	 * @param param
	 * @return
	 */
	public List<Shop> getCouponBranch(ParamMap param) {
		TTGRequest request = new TTGRequest(urlPath, Method.GET, param);
		TTGResponse response = executor.execute(request);
		Shop[] shops;
		try {
			shops = mapper.readValue(response.getResponse().toString(), Shop[].class);
		} catch (Exception e) {
			e.printStackTrace();
			logger.error(TAG + "解析 josn 错误");
			throw new TTGException(TAG + "解析json 错误", e);
		}
		
		return Arrays.asList(shops);
	}
	
}
