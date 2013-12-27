package cn.com.ttg.api.bean;

import java.io.Serializable;
import java.util.List;

/**
 * 商户口碑 数据 List<Count> counts， Page<T> page， List<T> list
 * 
 * @author leon
 * 
 * @param <T>
 */
public class ImpressionCount<T> implements Serializable {

	private static final long serialVersionUID = 7420263202369186899L;
	private List<Count> counts;
	private Page<T> page;
	private List<T> list;
	private Double average = null;

	
	public Double getAverage() {
		if(counts.get(0).getScore() !=0.0){
			average = counts.get(0).getScore();
		}
		// System.out.println("*********************************"+average);
		// System.out.println("*********************************"+counts.get(0).getScore());
		return average;
	}

	public void setAverage(Double average) {
		this.average = average;
	}

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
