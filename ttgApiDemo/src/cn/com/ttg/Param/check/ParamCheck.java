package cn.com.ttg.Param.check;

import java.util.ArrayList;
import java.util.List;

import cn.com.ttg.Param.ParaUtil;
import cn.com.ttg.Param.Param;
import cn.com.ttg.api.exception.CustomException;

public abstract class ParamCheck {

	protected Param p;

	protected String ActionName;

	protected List<String> mustParamList = new ArrayList<String>();
	
	public ParamCheck(){
		this.setActionName();
		this.setMustParamList();
	}

	/**
	 * 返回缺少的参数列表
	 * 
	 * @return
	 */
	public List<String> checkParam() {
		List<String> lackPs = new ArrayList<String>();
		boolean lack = false;
		String pAction = p.get(ParaUtil.action);
		if(pAction == null&& this.ActionName==null){
			return lackPs;
		}
			
		if (!this.ActionName.equals(pAction)) {
			throw new CustomException("Action 错误");
		}
		for (String mustP : mustParamList) {
			if (p.get(mustP) == null) {
				lackPs.add(mustP);
				lack = true;
			}
		}
		if (lack) {
			throw new CustomException(this.ActionName + "的必须参数"
					+ lackPs.toString() + "缺失");
		}
		return lackPs;
	}

	public void setParam(Param p) {
		this.p = p;
	}

	public abstract void setActionName();

	public abstract void setMustParamList();

}
