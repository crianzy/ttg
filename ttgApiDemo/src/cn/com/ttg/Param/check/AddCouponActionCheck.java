package cn.com.ttg.Param.check;

import cn.com.ttg.Param.ActionUtil;
import cn.com.ttg.Param.ParaUtil;

public class AddCouponActionCheck extends ParamCheck{


	@Override
	public void setActionName() {
		this.ActionName = ActionUtil.addCouponAction;
	}

	@Override
	public void setMustParamList() {
		this.mustParamList.add(ParaUtil.couid);
		this.mustParamList.add(ParaUtil.mobile);
		this.mustParamList.add(ParaUtil.card);
		this.mustParamList.add(ParaUtil.orderid);
	}

}
