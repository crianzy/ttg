package cn.com.ttg.Param.check;

import java.util.List;

import cn.com.ttg.Param.ActionUtil;
import cn.com.ttg.Param.ParaUtil;
import cn.com.ttg.api.exception.CustomException;

public class GetCouponBranchActionCheck extends ParamCheck {


	@Override
	public void setActionName() {
		this.ActionName = ActionUtil.getCouponBranchAction;
	}

	@Override
	public void setMustParamList() {
		this.mustParamList.add(ParaUtil.couid);
		this.mustParamList.add(ParaUtil.svcid);
	}

	@Override
	public List<String> checkParam() {
		String couid = p.get(ParaUtil.couid);
		String svcid = p.get(ParaUtil.svcid);
		if ((couid != null && !couid.equals(""))
				&& (svcid != null && !svcid.equals(""))) {
			throw new CustomException("优惠券编号couid与会员卡编号svcid 不能同时存在");
		}

		return null;
	}
}
