package cn.com.ttg.api.param;

import java.util.List;

public interface ParamVerifyInterface {

	
	/**
	 * 返回错误参数列表
	 * @param param 
	 * @return
	 */
	public List<String> verify(ParamMap param);
}
