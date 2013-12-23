package cn.com.ttg.api;

import cn.com.ttg.api.bean.service.AuthorizeService;
import cn.com.ttg.api.mapper.ObjectMapper;

public class TTGClient {

	/**
	 * API执行器
	 */
	private TTGExecutor executor;
	
    /**
     * JSON到对象映射策略对象
     */
    private ObjectMapper objectMapper;

	private AuthorizeService authorizeService;
	
	public TTGClient(){
        this.executor = new DefaultTTGExecutor();
        this.objectMapper = new ObjectMapper();
	}

	public AuthorizeService getAuthorizeService() {
		if (authorizeService == null){
			authorizeService = new AuthorizeService(executor,objectMapper);
		}
		return authorizeService;
	}

}
