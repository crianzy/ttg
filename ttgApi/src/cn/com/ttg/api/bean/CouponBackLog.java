package cn.com.ttg.api.bean;

import java.io.Serializable;
import java.util.Date;

/**
 * 优惠券 使用 添加 的log 信息
 * 
 * @author leon
 * 
 */
public class CouponBackLog implements Serializable {

	private static final long serialVersionUID = 1752634930595532341L;
	private int unid;
	private double ratio;
	private Date addtime;
	private double settle;
	private int settle_state;
	private String order_id;
	private double order_money;
	private int order_points;
	private Date order_addtime;
	private Date order_endtime;
	private int order_state;
	private String union_notify_url;
	private String union_extra;
	private String union_extra2;
	private int useshopid;
	private String union_orderid;
	private String cou_bdstate;
	private String cou_bank;
	private String cou_bankno;
	private String cou_mobile;
	private int uvcid;
	private int r;

	public int getUnid() {
		return unid;
	}

	public void setUnid(int unid) {
		this.unid = unid;
	}

	public double getRatio() {
		return ratio;
	}

	public void setRatio(double ratio) {
		this.ratio = ratio;
	}

	public Date getAddtime() {
		return addtime;
	}

	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public double getSettle() {
		return settle;
	}

	public void setSettle(double settle) {
		this.settle = settle;
	}

	public int getSettle_state() {
		return settle_state;
	}

	public void setSettle_state(int settle_state) {
		this.settle_state = settle_state;
	}

	public String getOrder_id() {
		return order_id;
	}

	public void setOrder_id(String order_id) {
		this.order_id = order_id;
	}

	public double getOrder_money() {
		return order_money;
	}

	public void setOrder_money(double order_money) {
		this.order_money = order_money;
	}

	public int getOrder_points() {
		return order_points;
	}

	public void setOrder_points(int order_points) {
		this.order_points = order_points;
	}

	public Date getOrder_addtime() {
		return order_addtime;
	}

	public void setOrder_addtime(Date order_addtime) {
		this.order_addtime = order_addtime;
	}

	public Date getOrder_endtime() {
		return order_endtime;
	}

	public void setOrder_endtime(Date order_endtime) {
		this.order_endtime = order_endtime;
	}

	public int getOrder_state() {
		return order_state;
	}

	public void setOrder_state(int order_state) {
		this.order_state = order_state;
	}

	public String getUnion_notify_url() {
		return union_notify_url;
	}

	public void setUnion_notify_url(String union_notify_url) {
		this.union_notify_url = union_notify_url;
	}

	public String getUnion_extra() {
		return union_extra;
	}

	public void setUnion_extra(String union_extra) {
		this.union_extra = union_extra;
	}

	public String getUnion_extra2() {
		return union_extra2;
	}

	public void setUnion_extra2(String union_extra2) {
		this.union_extra2 = union_extra2;
	}

	public int getUseshopid() {
		return useshopid;
	}

	public void setUseshopid(int useshopid) {
		this.useshopid = useshopid;
	}

	public String getUnion_orderid() {
		return union_orderid;
	}

	public void setUnion_orderid(String union_orderid) {
		this.union_orderid = union_orderid;
	}

	public String getCou_bdstate() {
		return cou_bdstate;
	}

	public void setCou_bdstate(String cou_bdstate) {
		this.cou_bdstate = cou_bdstate;
	}

	public String getCou_bank() {
		return cou_bank;
	}

	public void setCou_bank(String cou_bank) {
		this.cou_bank = cou_bank;
	}

	public String getCou_bankno() {
		return cou_bankno;
	}

	public void setCou_bankno(String cou_bankno) {
		this.cou_bankno = cou_bankno;
	}

	public String getCou_mobile() {
		return cou_mobile;
	}

	public void setCou_mobile(String cou_mobile) {
		this.cou_mobile = cou_mobile;
	}

	public int getUvcid() {
		return uvcid;
	}

	public void setUvcid(int uvcid) {
		this.uvcid = uvcid;
	}

	public int getR() {
		return r;
	}

	public void setR(int r) {
		this.r = r;
	}

}
