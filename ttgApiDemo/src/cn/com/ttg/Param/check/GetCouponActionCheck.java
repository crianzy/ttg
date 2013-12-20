package cn.com.ttg.Param.check;

import cn.com.ttg.Param.ActionUtil;

public class GetCouponActionCheck extends ParamCheck{


	@Override
	public void setActionName() {
		this.ActionName = ActionUtil.getCouponAction;
	}

	@Override
	public void setMustParamList() {
		
	}

}
