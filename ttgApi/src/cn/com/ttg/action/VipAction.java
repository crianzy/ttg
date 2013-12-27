package cn.com.ttg.action;

import com.opensymphony.xwork2.ActionContext;

import cn.com.ttg.api.bean.Clazz;
import cn.com.ttg.api.bean.Page;
import cn.com.ttg.api.bean.VipCard;
import cn.com.ttg.api.bean.service.DataDictionaryService;
import cn.com.ttg.api.bean.service.VipService;
import cn.com.ttg.api.param.ActionUtil;
import cn.com.ttg.api.param.ParaUtil;
import cn.com.ttg.api.param.ParamMap;

public class VipAction extends BaseAction{

	private static final long serialVersionUID = 4439403388990807775L;

	private VipService vipService = client.getVipService();
	private DataDictionaryService dataDictionaryService = client
			.getDataDictionaryService();
	//private CouponService couponService = client.getCouponService();

	ParamMap param = new ParamMap(client.getParamActionVerify(),
			client.getParamVerify());
	private int pageno = 1;
	
	public String index(){
		// 添加商户分类数据
		param.clear();
		param.addAuthorize();
		Clazz allClazz = dataDictionaryService.getAllGradingClazzList(param);
		ActionContext.getContext().put("allClazz", allClazz.getChildrenList());
		// 添加会员卡数据
		param.clear();
		param.addAuthorize();
		param.put(ParaUtil.action, ActionUtil.getVipCardAction);
		param.put(ParaUtil.province, "江西");
		param.put(ParaUtil.city, "南昌");
		param.put(ParaUtil.page, pageno+"");
		param.put(ParaUtil.state, "2");
		param.put(ParaUtil.pagesize, "6");
		Page<VipCard> page = vipService.getVipCard(param);
		ActionContext.getContext().put("page", page);
		
		return "index";
	}

	public int getPageno() {
		return pageno;
	}

	public void setPageno(int pageno) {
		this.pageno = pageno;
	}
	
	
}
