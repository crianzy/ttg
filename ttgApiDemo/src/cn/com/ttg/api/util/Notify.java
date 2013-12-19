package cn.com.ttg.api.util;

import java.util.ArrayList;
import java.util.List;

public class Notify {

	public static List<String> banktypeList = new ArrayList<String>();

	static {
		banktypeList.add("贷记卡(信用卡)");
		banktypeList.add("借记卡(普通银行卡)");
		banktypeList.add("预付费卡");
		banktypeList.add("准贷记卡");
	}
	
}
