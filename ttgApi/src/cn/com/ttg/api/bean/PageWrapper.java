package cn.com.ttg.api.bean;

import java.io.Serializable;
import java.util.List;

import org.codehaus.jackson.type.JavaType;

public class PageWrapper<T> implements Serializable {
	private static final long serialVersionUID = 1227947466084989424L;

	private Pages pages;
	private List<T> list;

	public List<T> getList() {
		return list;
	}

	public Pages getPages() {
		return pages;
	}

	public void setPages(Pages pages) {
		this.pages = pages;
	}

	public void setList(List<T> list) {
		this.list = list;
	}

}
