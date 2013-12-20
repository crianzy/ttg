package cn.com.ttg.Param.check;

import cn.com.ttg.Param.ActionUtil;
import cn.com.ttg.Param.ParaUtil;

public class GetShopCouponActionCheck extends ParamCheck {

	@Override
	public void setActionName() {
		this.ActionName = ActionUtil.getShopCouponAction;
	}

	@Override
	public void setMustParamList() {
		this.mustParamList.add(ParaUtil.shopid);
	}

}
