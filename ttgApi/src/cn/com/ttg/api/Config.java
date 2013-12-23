package cn.com.ttg.api;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.Properties;

public class Config {
	public static final Properties prop = new Properties();
	private static final String filename = "config.properties";
	static {
		String classpath;
		try {
			classpath = URLDecoder.decode(Config.class.getResource("/")
					.getPath(), "UTF-8");
			FileInputStream fin = new FileInputStream(classpath + filename);
			prop.load(fin);
			prop.setProperty("password", "1223");
			FileOutputStream fos = new FileOutputStream(classpath + filename);
			prop.store(fos, "");
			fos.close();
		} catch (Exception e) {
			// TODO 读取配置文件错误
			e.printStackTrace();
		}
	}
	
	public static String getProperties(String key){
		return prop.getProperty(key);
	}
	
	public static int getIntegerProperties(String key){
		return Integer.parseInt(prop.getProperty(key));
	}

}
