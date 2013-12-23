package cn.com.ttg.api;


public class TTGClient {
	public static String appkeyValue = "10304";
	public static String appSecretValue = "f4bafa4d96624d85ad5746202f253597";


	/**
	 * 客户端ID。应用的App ID。
	 */
	private String clientId;

	/**
	 * 客户端密钥。应用的Secret Key。
	 */
	private String clientSecret;

	/**
	 * API执行器
	 */
	private TTGExecutor executor;

	public TTGClient(String clientId, String clientSecret) {
        this.clientId = clientId;
        this.clientSecret = clientSecret;
        this.executor = new DefaultTTGExecutor();
	}

}
