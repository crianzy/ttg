package cn.com.ttg.api.bean;

import java.io.Serializable;
import java.util.List;

/**
 * 分页信息 带有数据信息
 * 
 * @author leon
 * 
 */
public class Page<T> implements Serializable {
	private static final long serialVersionUID = 2415403900631168605L;
	private int totalnum;
	private int totalpage;
	private int pagesize;
	private int page;
	private List<T> list;

	public List<T> getList() {
		return list;
	}

	public void setList(List<T> list) {
		this.list = list;
	}

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
