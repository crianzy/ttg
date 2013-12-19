package cn.com.ttg.entity;

/**
 * 银行的信息
 * 
 * @author leon
 * 
 */
public class Bank {
	private Integer bankid;
	private String bankname;
	private String banklogo;

	public Integer getBankid() {
		return bankid;
	}

	public void setBankid(Integer bankid) {
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

}
