package cn.com.ttg.Param.check;

import cn.com.ttg.Param.ActionUtil;
import cn.com.ttg.Param.ParaUtil;

public class ChargePointsActionCheck extends ParamCheck {


	@Override
	public void setActionName() {
		this.ActionName = ActionUtil.chargePointsAction;
	}

	@Override
	public void setMustParamList() {
		this.mustParamList.add(ParaUtil.mobile);
		this.mustParamList.add(ParaUtil.card);
		this.mustParamList.add(ParaUtil.ptype);
		this.mustParamList.add(ParaUtil.amount);
		this.mustParamList.add(ParaUtil.orderid);
		this.mustParamList.add(ParaUtil.notify_url);

	}
}
