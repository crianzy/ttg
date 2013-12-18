package cn.com.ttg.entity;

import java.util.List;

public class ImpressionCount {

	private List<Count> counts;
	private Page page;

	public List<Count> getCounts() {
		return counts;
	}

	public void setCounts(List<Count> counts) {
		this.counts = counts;
	}

	public Page getPage() {
		return page;
	}

	public void setPage(Page page) {
		this.page = page;
	}

}
