package cn.com.ttg.api.json;



public class JsonDataObject {
	/**
	 * 值为0或1,为0表示当前没有错误，为1表示当前有错误
	 */
	private int ret;

	/**
	 * 错误描述
	 */
	private String msg;

	/**
	 * 错误代码(-1=表示授权有错误，0=无错或警告)
	 */
	private int errcode;

	private Object data;

	public int getRet() {
		return ret;
	}

	public void setRet(int ret) {
		this.ret = ret;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public int getErrcode() {
		return errcode;
	}

	public void setErrcode(int errcode) {
		this.errcode = errcode;
	}


	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}
	
	

}
