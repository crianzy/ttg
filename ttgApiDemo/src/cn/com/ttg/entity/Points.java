package cn.com.ttg.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * 积分信息
 * 
 * @author leon
 * 
 */
public class Points implements Serializable {
	private static final long serialVersionUID = 7858331294879857599L;
	private Integer pid;
	private Integer tradetype;
	private String cou_mobile;
	private String cou_bankno;
	private Integer amount;
	private String ptype;
	private Integer union_orderid;
	private Date order_addtime;
	private String union_notify_url;

	public Integer getPid() {
		return pid;
	}

	public void setPid(Integer pid) {
		this.pid = pid;
	}

	public Integer getTradetype() {
		return tradetype;
	}

	public void setTradetype(Integer tradetype) {
		this.tradetype = tradetype;
	}

	public String getCou_mobile() {
		return cou_mobile;
	}

	public void setCou_mobile(String cou_mobile) {
		this.cou_mobile = cou_mobile;
	}

	public String getCou_bankno() {
		return cou_bankno;
	}

	public void setCou_bankno(String cou_bankno) {
		this.cou_bankno = cou_bankno;
	}

	public Integer getAmount() {
		return amount;
	}

	public void setAmount(Integer amount) {
		this.amount = amount;
	}

	public String getPtype() {
		return ptype;
	}

	public void setPtype(String ptype) {
		this.ptype = ptype;
	}

	public Integer getUnion_orderid() {
		return union_orderid;
	}

	public void setUnion_orderid(Integer union_orderid) {
		this.union_orderid = union_orderid;
	}

	public Date getOrder_addtime() {
		return order_addtime;
	}

	public void setOrder_addtime(Date order_addtime) {
		this.order_addtime = order_addtime;
	}

	public String getUnion_notify_url() {
		return union_notify_url;
	}

	public void setUnion_notify_url(String union_notify_url) {
		this.union_notify_url = union_notify_url;
	}

}
