package cn.com.ttg.api.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * 银行的信息
 * 
 * @author leon
 * 
 */
public class Bank implements Serializable {
	private static final long serialVersionUID = -3915964909271955407L;

	private Integer bankid;
	private String bankname;
	private String banklogo;
	private Integer result;
	
	public static List<String>  bankCardtype = new ArrayList<String>(5);
	
	static{
		bankCardtype.add("银行卡校验未通过");
		bankCardtype.add("贷记卡(信用卡)");
		bankCardtype.add("借记卡(普通银行卡)");
		bankCardtype.add("预付费卡");
		bankCardtype.add("准贷记卡");
	}
	//TODO 枚举问题 如果result=0表示银行卡校验未通过，result>0表示卡校验已通过
	//result=1贷记卡(信用卡)，result=2借记卡(普通银行卡)，result=3预付费卡，result=4准贷记卡)
	
	public int getBankid() {
		return bankid;
	}
	public void setBankid(int bankid) {
		this.bankid = bankid;
	}
	public String getBankname() {
		return bankname;
	}
	public void setBankname(String bankname) {
		this.bankname = bankname;
	}
	public String getBanklogo() {
		return banklogo;
	}
	public void setBanklogo(String banklogo) {
		this.banklogo = banklogo;
	}
	public int getResult() {
		return result;
	}
	public void setResult(int result) {
		this.result = result;
	}


}
