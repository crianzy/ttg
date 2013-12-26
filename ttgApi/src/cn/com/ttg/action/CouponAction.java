package cn.com.ttg.action;

import cn.com.ttg.api.bean.Clazz;
import cn.com.ttg.api.bean.Coupon;
import cn.com.ttg.api.bean.Page;
import cn.com.ttg.api.bean.service.CouponService;
import cn.com.ttg.api.bean.service.DataDictionaryService;
import cn.com.ttg.api.param.ActionUtil;
import cn.com.ttg.api.param.ParaUtil;
import cn.com.ttg.api.param.ParamMap;

import com.opensymphony.xwork2.ActionContext;

public class CouponAction extends BaseAction {

	private static final long serialVersionUID = 5124601808624977537L;

	private DataDictionaryService dataDictionaryService = client
			.getDataDictionaryService();
	private CouponService couponService = client.getCouponService();

	ParamMap param = new ParamMap(client.getParamActionVerify(),
			client.getParamVerify());

	private int pageno = 1;

	public String index() {
		// 添加商户分类数据
		param.clear();
		param.addAuthorize();
		Clazz allClazz = dataDictionaryService.getAllGradingClazzList(param);
		ActionContext.getContext().put("allClazz", allClazz.getChildrenList());
		// 添加优惠券数据
		param.clear();
		param.addAuthorize();
		param.put(ParaUtil.action, ActionUtil.getCouponAction);
		param.put(ParaUtil.province, "江西");
		param.put(ParaUtil.city, "南昌");
		param.put(ParaUtil.state, "1");
		param.put(ParaUtil.pagesize, "30");
		param.put("orderby", "4");
		if(pageno>0){
			param.put(ParaUtil.page, pageno+"");
		}

		Page<Coupon> page = couponService.getCoupon(param);
		ActionContext.getContext().put("page", page);
		return "index";
	}

	public String test() {
		Clazz allClazz = dataDictionaryService.getAllGradingClazzList(param);
		ActionContext.getContext().put("allClazz", allClazz.getChildrenList());
		return "test";
	}

	public int getPageno() {
		return pageno;
	}

	public void setPageno(int pageno) {
		this.pageno = pageno;
	}

}
