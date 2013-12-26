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
import cn.com.ttg.api.bean.Bank;
import cn.com.ttg.api.bean.City;
import cn.com.ttg.api.bean.Clazz;
import cn.com.ttg.api.exception.TTGException;
import cn.com.ttg.api.param.ActionUtil;
import cn.com.ttg.api.param.ParaUtil;
import cn.com.ttg.api.param.ParamMap;

public class DataDictionaryService extends BaseService {

	private static String urlPath = Config.getProperties(ConfigKey.urlpath);
	private static Logger logger = Logger.getLogger(DataDictionaryService.class
			.getName());
	private static String TAG = "DataDictionaryService ";

	public DataDictionaryService(TTGExecutor executor, ObjectMapper objectMapper) {
		super(executor, objectMapper);
	}

	/**
	 * 
	 * @param param
	 * @return
	 */
	public List<Clazz> getClazzList(ParamMap param) {
		TTGRequest request = new TTGRequest(urlPath, Method.GET, param);
		TTGResponse response = executor.execute(request);
		Clazz[] clazzs = null;
		try {
			// 使用数组 在转 list 如果直接使用list 由于泛型问题 会将动态bean 注入list 中 不是 Clazz
			clazzs = mapper.readValue(response.getResponse().toString(),
					Clazz[].class);
		} catch (Exception e) {
			logger.error(TAG + "解析 josn 错误");
			throw new TTGException(TAG + "解析json 错误", e);
		}
		return Arrays.asList(clazzs);
	}

	/**
	 * 获取所有已经 处理好父子关系的 商户类型
	 * 
	 * @return
	 */
	public Clazz getAllGradingClazzList(ParamMap param) {
		param.put(ParaUtil.action, ActionUtil.getClazzAction);
		// param.put(ParaUtil.cardno, "0");
		Clazz allClazz = new Clazz();
		allClazz.setClsname("全部");
		allClazz.setClsid(0);
		Clazz allClazzt = new Clazz();
		allClazzt.setClsname("全部");
		allClazzt.setClsid(0);
		allClazz.getChildrenList().add(allClazzt);
		
		List<Clazz> allList = getClazzList(param);
		for (Clazz clazz : allList) {
			if(clazz.getPid() == allClazz.getClsid()){
				allClazz.getChildrenList().add(clazz);
				continue;
			}
			for (Clazz child : allClazz.getChildrenList()) {
				if(clazz.getPid() == child.getClsid()){
					child.getChildrenList().add(clazz);
				}
			}
		}
		return allClazz;
	}

	/**
	 * 获取所有的省
	 * 
	 * @return
	 */
	public List<String> getProvince(ParamMap param) {
		return this.getAllCity(param).getProvince();
	}

	/**
	 * 获取所有的省下面的市区
	 * 
	 * @return
	 */
	public List<String> getCity(ParamMap param) {
		return this.getAllCity(param).getCity();
	}

	/**
	 * 获取所有的市下面的 县乡镇
	 * 
	 * @return
	 */
	public List<String> getCounty(ParamMap param) {
		return this.getAllCity(param).getCounty();
	}

	/**
	 * 获取所有的县下面的 热门区域
	 * 
	 * @return
	 */
	public List<String> getArea_name(ParamMap param) {
		return this.getAllCity(param).getArea_name();
	}

	public City getAllCity(ParamMap param) {
		TTGRequest request = new TTGRequest(urlPath, Method.GET, param);
		TTGResponse response = executor.execute(request);
		City city = null;
		try {
			city = mapper.readValue(response.getResponse().toString(),
					City.class);
		} catch (Exception e) {
			logger.error(TAG + "解析 josn 错误");
			throw new TTGException(TAG + "解析json 错误", e);
		}
		return city;
	}

	public List<Bank> getBankList(ParamMap param) {
		TTGRequest request = new TTGRequest(urlPath, Method.GET, param);
		TTGResponse response = executor.execute(request);
		Bank[] banks = null;
		try {
			banks = mapper.readValue(response.getResponse().toString(),
					Bank[].class);
		} catch (Exception e) {
			logger.error(TAG + "解析 josn 错误");
			throw new TTGException(TAG + "解析json 错误", e);
		}
		return Arrays.asList(banks);

	}

}
