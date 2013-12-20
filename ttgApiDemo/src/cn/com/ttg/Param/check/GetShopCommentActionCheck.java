package cn.com.ttg.Param.check;

import cn.com.ttg.Param.ActionUtil;
import cn.com.ttg.Param.ParaUtil;

public class GetShopCommentActionCheck extends ParamCheck{


	@Override
	public void setActionName() {
		this.ActionName = ActionUtil.getShopCommentAction;
	}

	@Override
	public void setMustParamList() {
		this.mustParamList.add(ParaUtil.shopid);
	}

}
