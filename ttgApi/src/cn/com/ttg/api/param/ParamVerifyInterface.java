package cn.com.ttg.api.param;

public interface ParamVerifyInterface {

	/**
	 *  验证 参数值 是否符合规范
	 * @param key
	 * @param value
	 */
	public void verify(String key, String value);
}
