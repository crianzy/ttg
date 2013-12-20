package cn.com.ttg.Param.check;

import cn.com.ttg.Param.ActionUtil;
import cn.com.ttg.Param.ParaUtil;

public class GetShopImageActionCheck extends ParamCheck{


	@Override
	public void setActionName() {
		this.ActionName = ActionUtil.getShopImageAction;
	}

	@Override
	public void setMustParamList() {
		this.mustParamList.add(ParaUtil.shopid);
	}

}
