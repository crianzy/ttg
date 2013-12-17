package cn.com.ttg.Param;

import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Set;

public class Param extends HashMap<String, String> {

	private static final long serialVersionUID = 3530303875200578968L;

	private String timestamp = ParaUtil.getTimestamp();
	
	public Param() {
		addAuthorize();
	}

	public void addAuthorize() {
		this.put(ParaUtil.appkey, ParaUtil.appkeyValue);
		this.put(ParaUtil.timestamp	, timestamp);
		this.put(ParaUtil.sign, ParaUtil.getSign(timestamp));
	}

	@Override
	public String toString() {
		StringBuffer paraString = new StringBuffer();
		Set<String> paraSet = this.keySet();
		for (String key : paraSet) {
			paraString.append(key+"="+this.get(key)+"&");
		}
		String s1 = paraString.toString();
		String s2 = null;
		try {
			s2 = new String(s1.getBytes(), "utf-8");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		return s2;
	}
	
	public static void main(String[] args) {
		Param p = new Param();
		System.out.println(p);
	}

}
