package cn.com.ttg.Param.check;

import cn.com.ttg.Param.ActionUtil;

public class GetClazzActionCheck extends ParamCheck {


	@Override
	public void setActionName() {
		this.ActionName = ActionUtil.getClazzAction;
	}

	@Override
	public void setMustParamList() {
	}

}
