package cn.com.ttg.Param.check;

import cn.com.ttg.Param.ActionUtil;

public class GetVipCardActionCheck extends ParamCheck{


	@Override
	public void setActionName() {
		this.ActionName = ActionUtil.getVipCardAction;
	}

	@Override
	public void setMustParamList() {
	}

}
