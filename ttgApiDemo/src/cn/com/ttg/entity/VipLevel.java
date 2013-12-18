package cn.com.ttg.entity;

public class VipLevel {
	private int seqid;
	private String seqname;
	private double upgrade;
	private int degrade;
	private String seqdiscount;

	public int getSeqid() {
		return seqid;
	}

	public void setSeqid(int seqid) {
		this.seqid = seqid;
	}

	public String getSeqname() {
		return seqname;
	}

	public void setSeqname(String seqname) {
		this.seqname = seqname;
	}

	public double getUpgrade() {
		return upgrade;
	}

	public void setUpgrade(double upgrade) {
		this.upgrade = upgrade;
	}

	public int getDegrade() {
		return degrade;
	}

	public void setDegrade(int degrade) {
		this.degrade = degrade;
	}

	public String getSeqdiscount() {
		return seqdiscount;
	}

	public void setSeqdiscount(String seqdiscount) {
		this.seqdiscount = seqdiscount;
	}

}
