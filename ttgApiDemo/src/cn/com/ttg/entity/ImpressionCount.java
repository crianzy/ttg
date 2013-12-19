package cn.com.ttg.entity;

import java.io.Serializable;
import java.util.List;

public class ImpressionCount<T> implements Serializable {

	private static final long serialVersionUID = 7420263202369186899L;
	private List<Count> counts;
	private Page<T> page;
	private List<T> list;

	public List<Count> getCounts() {
		return counts;
	}

	public void setCounts(List<Count> counts) {
		this.counts = counts;
	}

	public Page<T> getPage() {
		return page;
	}

	public void setPage(Page<T> page) {
		this.page = page;
	}

	public List<T> getList() {
		return list;
	}

	public void setList(List<T> list) {
		this.list = list;
	}

}
