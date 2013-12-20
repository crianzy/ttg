package cn.com.ttg.Param.check;

import cn.com.ttg.Param.ActionUtil;

public class GetUserCouponActionCheck extends ParamCheck {


	@Override
	public void setActionName() {
		this.ActionName = ActionUtil.getUserCouponAction;
	}

	@Override
	public void setMustParamList() {

	}

}
