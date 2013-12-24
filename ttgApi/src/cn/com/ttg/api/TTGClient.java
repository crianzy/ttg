package cn.com.ttg.api;

import org.codehaus.jackson.map.ObjectMapper;

import cn.com.ttg.api.bean.service.AuthorizeService;

public class TTGClient {

	/**
	 * API执行器
	 */
	private TTGExecutor executor;
	
    /**
     * JSON到对象映射策略对象
     */
    private ObjectMapper objectMapper;
    
    //参数验证器

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
