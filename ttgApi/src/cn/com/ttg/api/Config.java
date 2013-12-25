package cn.com.ttg.api;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.net.URLDecoder;
import java.util.Properties;

import org.apache.log4j.Logger;

import cn.com.ttg.api.exception.TTGException;

public class Config {
	private static Logger logger = Logger.getLogger(Config.class.getName());
	private static String TAG = "Config ";
	
	public static final Properties prop = new Properties();
	private static final String filename = "config.properties";
	static {
		String classpath;
		try {
			classpath = URLDecoder.decode(Config.class.getResource("/")
					.getPath(), "UTF-8");
			FileInputStream fin = new FileInputStream(classpath + filename);
			logger.info(TAG+"读取配置文件"+classpath + filename);
			prop.load(fin);
			FileOutputStream fos = new FileOutputStream(classpath + filename);
			prop.store(fos, "");
			fos.close();
		} catch (Exception e) {
			// TODO 读取配置文件错误
			e.printStackTrace();
			throw new TTGException("配置文件读取错误");
		}
	}

	public static String getProperties(String key) {
		return prop.getProperty(key);
	}

	public static int getIntegerProperties(String key) {
		return Integer.parseInt(prop.getProperty(key));
	}

}
