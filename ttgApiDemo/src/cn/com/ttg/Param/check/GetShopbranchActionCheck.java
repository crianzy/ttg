package cn.com.ttg.Param.check;

import cn.com.ttg.Param.ActionUtil;
import cn.com.ttg.Param.ParaUtil;

public class GetShopbranchActionCheck extends ParamCheck{


	@Override
	public void setActionName() {
		this.ActionName = ActionUtil.getShopBranchAction;
	}

	@Override
	public void setMustParamList() {
		this.mustParamList.add(ParaUtil.shopid);
	}

}
