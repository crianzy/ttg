package cn.com.ttg.entity;

import java.io.Serializable;

public class VipLevel implements Serializable {
	private static final long serialVersionUID = -3324662228048982933L;
	private Integer seqid;
	private String seqname;
	private Double upgrade;
	private Integer degrade;
	private String seqdiscount;

	public Integer getSeqid() {
		return seqid;
	}

	public void setSeqid(Integer seqid) {
		this.seqid = seqid;
	}

	public String getSeqname() {
		return seqname;
	}

	public void setSeqname(String seqname) {
		this.seqname = seqname;
	}

	public Double getUpgrade() {
		return upgrade;
	}

	public void setUpgrade(Double upgrade) {
		this.upgrade = upgrade;
	}

	public Integer getDegrade() {
		return degrade;
	}

	public void setDegrade(Integer degrade) {
		this.degrade = degrade;
	}

	public String getSeqdiscount() {
		return seqdiscount;
	}

	public void setSeqdiscount(String seqdiscount) {
		this.seqdiscount = seqdiscount;
	}

}
