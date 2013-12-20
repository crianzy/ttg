package cn.com.ttg.Param.check;

import java.util.ArrayList;
import java.util.List;

import cn.com.ttg.Param.ActionUtil;

public class GetCityActionCheck extends ParamCheck{


	@Override
	public List<String> checkParam() {
		return null;
	}

	@Override
	public void setActionName() {
		this.ActionName = ActionUtil.getCityAction;
	}

	@Override
	public void setMustParamList() {
		this.mustParamList = new ArrayList<String>();
	}

}
