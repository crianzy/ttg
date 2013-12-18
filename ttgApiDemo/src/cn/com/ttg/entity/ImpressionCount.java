package cn.com.ttg.entity;

import java.util.List;

public class ImpressionCount<T> {

	private List<Count> counts;
	private Page<T> page;

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

}
