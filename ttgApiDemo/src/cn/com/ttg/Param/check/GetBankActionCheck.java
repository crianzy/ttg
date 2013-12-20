package cn.com.ttg.Param.check;

import cn.com.ttg.Param.ActionUtil;

public class GetBankActionCheck extends ParamCheck{


	@Override
	public void setActionName() {
		this.ActionName = ActionUtil.getBankAction;
	}

	@Override
	public void setMustParamList() {
	}

}
