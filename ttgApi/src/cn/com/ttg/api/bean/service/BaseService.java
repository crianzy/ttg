package cn.com.ttg.api.bean.service;

import org.codehaus.jackson.map.ObjectMapper;

import cn.com.ttg.api.TTGExecutor;

public class BaseService {

	protected TTGExecutor executor;

	protected ObjectMapper mapper;

	public BaseService(TTGExecutor executor, ObjectMapper objectMapper) {
		this.executor = executor;
		this.mapper = objectMapper;
	}

	public TTGExecutor getExecutor() {
		return executor;
	}

	public void setExecutor(TTGExecutor executor) {
		this.executor = executor;
	}

	public ObjectMapper getMapper() {
		return mapper;
	}

	public void setMapper(ObjectMapper mapper) {
		this.mapper = mapper;
	}
	
	
}
