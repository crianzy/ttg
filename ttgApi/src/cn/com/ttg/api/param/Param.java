package cn.com.ttg.api.param;

public class Param {

	/**
	 * 银行卡卡号
	 */
	public String cardno;

	/**
	 * 省
	 */
	public String province;
	/**
	 * 市
	 */
	public String city;
	/**
	 * 县 乡
	 */
	public String county;

	/**
	 * 商户的id
	 */
	public String clsid;
	/**
	 * 父级分类编号 为0时分主分类,不传值显示全部
	 */
	public String pid;

	/**
	 * 银行编号
	 */
	public String bankid;

	/**
	 * 商户编号
	 */
	public String shopid;
	/**
	 * 优惠券编号
	 */
	public String couid;
	/**
	 * 关键词
	 */
	public String keyword;

	/**
	 * 经度 只有当lat,lng,range三个参数同时存在，才会触发range公里范围内的商户优惠。
	 */
	public String lng;
	/**
	 * 纬度 只有当lat,lng,range三个参数同时存在，才会触发range公里范围内的商户优惠。
	 */
	public String lat;
	/**
	 * 范围公里(1->9) 只有当lat,lng,range三个参数同时存在，才会触发range公里范围内的商户优惠。
	 */
	public String range;

	/**
	 * 优惠类型(1定额优惠，2：折扣优惠，3赠品券，4积分返利券，5固定金额优惠券， 多种同时请求时请用逗号隔开，如：coutype=1,2,3)
	 */
	public String coutype;
	/**
	 * 页数
	 */
	public String page;

	/**
	 * 每页返回的数据量，最大20
	 */
	public String pagesize;

	/**
	 * 状态 （优惠券状态(1,2)，1为正常2为已过期，不传值显示全部）
	 */
	public String state;

	/**
	 * 商户字段(a->x)，可以根据应用的实际开发情况选择合适的字段，以节约流量，不传值或者传*将输出全部字段
	 */
	public String shopcolumn;

	/**
	 * 优惠券字段(a->s)，可以根据应用的实际开发情况选择合适的字段，以节约流量，不传值或者传*将输出全部字段
	 */
	public String coucolumn;
	/**
	 * 只列出指定时间及以后更新的所有优惠券（时间格式为：2012-08-09 06:12:01），不能只包含日期，否则功能无效
	 */
	public String updatetime;

	/**
	 * 用户手机号码
	 */
	public String mobile;

	/**
	 * 完整的银行卡号，中间不能有任何空格或者字符，纯数字
	 */
	public String card;

	/**
	 * 订单号（每次提交的订单号必须唯一，不能重复）
	 */
	public String orderid;

	/**
	 * 备注1
	 */
	public String extra;
	/**
	 * 备注1
	 */
	public String extra2;

	/**
	 * 交易状态通知地址URL
	 */
	public String notify_url;

	/**
	 * 会员卡编号
	 */
	public String svcid;
	/**
	 * post 发送json 数据时的data
	 */
	public String data;
	/**
	 * 积分类型（具体参数值请与ttg工作人员联系，最长20位长度）
	 */
	public String ptype;
	/**
	 * 充值的积分数量（不能小于0,可以为0，为0表示开户）
	 */
	public String amount;

	/**
	 * 会员卡字段(a->l)，可以根据应用的实际开发情况选择合适的字段，以节约流量，不传值或者传*将输出全部字段
	 */
	public String svccolumn;
	/**
	 * 分店字段(a->w)，可以根据应用的实际开发情况选择合适的字段，以节约流量，不传值或者传*将输出全部字段
	 */
	public String brcolumn;
	/**
	 * 口碑字段(a->o)，可以根据应用的实际开发情况选择合适的字段，以节约流量，不传值或者传*将输出全部字段
	 */
	public String impcolumn;
	/**
	 * 优惠券字段(a->r)，可以根据应用的实际开发情况选择合适的字段，以节约流量，不传值或者传*将输出全部字段
	 */
	public String comcolumn;
	/**
	 * 会员卡字段(a->s)，可以根据应用的实际开发情况选择合适的字段，以节约流量，不传值或者传*将输出全部字段
	 */
	public String uvccolumn;

	/**
	 * 优惠券数量，最多10条，不传不返回优惠券数据
	 */
	public String coupons;

	/**
	 * 会员卡数量，最多10条，不传不返回会员卡数据
	 */
	public String vipcards;
	/**
	 * 评论数量，最多10条，不传不返回评论数据
	 */
	public String comments;
	/**
	 * 分店数量，最多10条，不传不返回分店数据
	 */
	public String branchstore;
	/**
	 * 口碑数量，最多10条，不传不返回口碑数据
	 */
	public String impressions;

	/**
	 * 订单是否已完成(1,0),1已完成，0未完成，当为1时将按优惠券结束时间排序，否则按unid编号大至小排序
	 */
	public String used;
	/**
	 * 消费的开始时间，与useetime同时使用
	 */
	public String usestime;
	/**
	 * 消费的结束时间,与usestime同时使用
	 */
	public String useetime;
	/**
	 * 添加的开始时间，与addetime同时使用
	 */
	public String addstime;
	/**
	 * 添加的结束时间，与addstime同时使用
	 */
	public String addetime;
	/**
	 * 指定的用户编号
	 */
	public String uid;
	public String getCardno() {
		return cardno;
	}
	public void setCardno(String cardno) {
		this.cardno = cardno;
	}
	public String getProvince() {
		return province;
	}
	public void setProvince(String province) {
		this.province = province;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCounty() {
		return county;
	}
	public void setCounty(String county) {
		this.county = county;
	}
	public String getClsid() {
		return clsid;
	}
	public void setClsid(String clsid) {
		this.clsid = clsid;
	}
	public String getPid() {
		return pid;
	}
	public void setPid(String pid) {
		this.pid = pid;
	}
	public String getBankid() {
		return bankid;
	}
	public void setBankid(String bankid) {
		this.bankid = bankid;
	}
	public String getShopid() {
		return shopid;
	}
	public void setShopid(String shopid) {
		this.shopid = shopid;
	}
	public String getCouid() {
		return couid;
	}
	public void setCouid(String couid) {
		this.couid = couid;
	}
	public String getKeyword() {
		return keyword;
	}
	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}
	public String getLng() {
		return lng;
	}
	public void setLng(String lng) {
		this.lng = lng;
	}
	public String getLat() {
		return lat;
	}
	public void setLat(String lat) {
		this.lat = lat;
	}
	public String getRange() {
		return range;
	}
	public void setRange(String range) {
		this.range = range;
	}
	public String getCoutype() {
		return coutype;
	}
	public void setCoutype(String coutype) {
		this.coutype = coutype;
	}
	public String getPage() {
		return page;
	}
	public void setPage(String page) {
		this.page = page;
	}
	public String getPagesize() {
		return pagesize;
	}
	public void setPagesize(String pagesize) {
		this.pagesize = pagesize;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getShopcolumn() {
		return shopcolumn;
	}
	public void setShopcolumn(String shopcolumn) {
		this.shopcolumn = shopcolumn;
	}
	public String getCoucolumn() {
		return coucolumn;
	}
	public void setCoucolumn(String coucolumn) {
		this.coucolumn = coucolumn;
	}
	public String getUpdatetime() {
		return updatetime;
	}
	public void setUpdatetime(String updatetime) {
		this.updatetime = updatetime;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getCard() {
		return card;
	}
	public void setCard(String card) {
		this.card = card;
	}
	public String getOrderid() {
		return orderid;
	}
	public void setOrderid(String orderid) {
		this.orderid = orderid;
	}
	public String getExtra() {
		return extra;
	}
	public void setExtra(String extra) {
		this.extra = extra;
	}
	public String getExtra2() {
		return extra2;
	}
	public void setExtra2(String extra2) {
		this.extra2 = extra2;
	}
	public String getNotify_url() {
		return notify_url;
	}
	public void setNotify_url(String notify_url) {
		this.notify_url = notify_url;
	}
	public String getSvcid() {
		return svcid;
	}
	public void setSvcid(String svcid) {
		this.svcid = svcid;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public String getPtype() {
		return ptype;
	}
	public void setPtype(String ptype) {
		this.ptype = ptype;
	}
	public String getAmount() {
		return amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}
	public String getSvccolumn() {
		return svccolumn;
	}
	public void setSvccolumn(String svccolumn) {
		this.svccolumn = svccolumn;
	}
	public String getBrcolumn() {
		return brcolumn;
	}
	public void setBrcolumn(String brcolumn) {
		this.brcolumn = brcolumn;
	}
	public String getImpcolumn() {
		return impcolumn;
	}
	public void setImpcolumn(String impcolumn) {
		this.impcolumn = impcolumn;
	}
	public String getComcolumn() {
		return comcolumn;
	}
	public void setComcolumn(String comcolumn) {
		this.comcolumn = comcolumn;
	}
	public String getUvccolumn() {
		return uvccolumn;
	}
	public void setUvccolumn(String uvccolumn) {
		this.uvccolumn = uvccolumn;
	}
	public String getCoupons() {
		return coupons;
	}
	public void setCoupons(String coupons) {
		this.coupons = coupons;
	}
	public String getVipcards() {
		return vipcards;
	}
	public void setVipcards(String vipcards) {
		this.vipcards = vipcards;
	}
	public String getComments() {
		return comments;
	}
	public void setComments(String comments) {
		this.comments = comments;
	}
	public String getBranchstore() {
		return branchstore;
	}
	public void setBranchstore(String branchstore) {
		this.branchstore = branchstore;
	}
	public String getImpressions() {
		return impressions;
	}
	public void setImpressions(String impressions) {
		this.impressions = impressions;
	}
	public String getUsed() {
		return used;
	}
	public void setUsed(String used) {
		this.used = used;
	}
	public String getUsestime() {
		return usestime;
	}
	public void setUsestime(String usestime) {
		this.usestime = usestime;
	}
	public String getUseetime() {
		return useetime;
	}
	public void setUseetime(String useetime) {
		this.useetime = useetime;
	}
	public String getAddstime() {
		return addstime;
	}
	public void setAddstime(String addstime) {
		this.addstime = addstime;
	}
	public String getAddetime() {
		return addetime;
	}
	public void setAddetime(String addetime) {
		this.addetime = addetime;
	}
	public String getUid() {
		return uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}
	
	
}
