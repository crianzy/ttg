package cn.com.ttg.api.bean;

import java.io.Serializable;

public class Pages implements Serializable{
	private static final long serialVersionUID = -4666978078651328587L;
	
	private int totalnum;
	private int totalpage;
	private int pagesize;
	private int page;
	public int getTotalnum() {
		return totalnum;
	}
	public void setTotalnum(int totalnum) {
		this.totalnum = totalnum;
	}
	public int getTotalpage() {
		return totalpage;
	}
	public void setTotalpage(int totalpage) {
		this.totalpage = totalpage;
	}
	public int getPagesize() {
		return pagesize;
	}
	public void setPagesize(int pagesize) {
		this.pagesize = pagesize;
	}
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page = page;
	}
	
	
}
