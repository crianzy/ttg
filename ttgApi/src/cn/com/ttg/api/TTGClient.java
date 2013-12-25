package cn.com.ttg.api;

import java.text.SimpleDateFormat;

import org.apache.log4j.Logger;
import org.codehaus.jackson.map.ObjectMapper;

import cn.com.ttg.api.bean.service.AuthorizeService;
import cn.com.ttg.api.bean.service.CouponService;
import cn.com.ttg.api.bean.service.DataDictionaryService;
import cn.com.ttg.api.bean.service.ShopService;
import cn.com.ttg.api.bean.service.VipService;
import cn.com.ttg.api.param.ParamActionVerify;
import cn.com.ttg.api.param.ParamActionVerifyInterface;
import cn.com.ttg.api.param.ParamVerify;
import cn.com.ttg.api.param.ParamVerifyInterface;

public class TTGClient {
	private static Logger logger = Logger.getLogger(TTGClient.class.getName());
	private static String TAG = "TTGClient ";

	/**
	 * API执行器
	 */
	private TTGExecutor executor;

	/**
	 * JSON到对象映射策略对象
	 */
	private ObjectMapper objectMapper;

	/**
	 * action 必须参数校验器
	 */
	private ParamActionVerifyInterface paramActionVerify;

	/**
	 * 参数类型 以及范围校验器
	 */
	private ParamVerifyInterface paramVerify;

	private AuthorizeService authorizeService;
	private DataDictionaryService dataDictionaryService;
	private CouponService couponService;
	private VipService vipService;
	private ShopService shopService;

	public TTGClient() {
		this.executor = new DefaultTTGExecutor();
		this.objectMapper = new ObjectMapper();
		objectMapper.setDateFormat(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"));
	}

	public TTGExecutor getExecutor() {
		if (executor == null) {
			executor = new DefaultTTGExecutor();
		}
		return executor;
	}

	public void setExecutor(TTGExecutor executor) {
		this.executor = executor;
	}

	public ObjectMapper getObjectMapper() {
		if (objectMapper == null) {
			objectMapper = new ObjectMapper();
		}
		return objectMapper;
	}

	public void setObjectMapper(ObjectMapper objectMapper) {
		this.objectMapper = objectMapper;
	}

	public ParamActionVerifyInterface getParamActionVerify() {
		if (paramActionVerify == null) {
			paramActionVerify = new ParamActionVerify();
		}
		return paramActionVerify;
	}

	public void setParamActionVerify(
			ParamActionVerifyInterface paramActionVerify) {
		this.paramActionVerify = paramActionVerify;
	}

	public ParamVerifyInterface getParamVerify() {
		if (paramVerify == null) {
			paramVerify = new ParamVerify();
		}
		return paramVerify;
	}

	public void setParamVerify(ParamVerifyInterface paramVerify) {
		this.paramVerify = paramVerify;
	}

	public AuthorizeService getAuthorizeService() {
		if (authorizeService == null) {
			authorizeService = new AuthorizeService(executor, objectMapper);
		}
		return authorizeService;
	}

	public void setAuthorizeService(AuthorizeService authorizeService) {
		this.authorizeService = authorizeService;
	}


	public DataDictionaryService getDataDictionaryService() {
		if(dataDictionaryService == null){
			dataDictionaryService =  new DataDictionaryService(executor, objectMapper);
		}
		return dataDictionaryService;
	}

	public void setDataDictionaryService(
			DataDictionaryService dataDictionaryService) {
		this.dataDictionaryService = dataDictionaryService;
	}

	public CouponService getCouponService() {
		if(couponService == null){
			couponService = new CouponService(executor, objectMapper);
		}
		return couponService;
	}

	public void setCouponService(CouponService couponService) {
		this.couponService = couponService;
	}

	public VipService getVipService() {
		if(vipService == null){
			vipService = new VipService(executor, objectMapper);
		}
		return vipService;
	}

	public void setVipService(VipService vipService) {
		this.vipService = vipService;
	}

	public ShopService getShopService() {
		if(shopService == null){
			shopService = new ShopService(executor, objectMapper);
		}
		return shopService;
	}

	public void setShopService(ShopService shopService) {
		this.shopService = shopService;
	}
	
	

	
}
