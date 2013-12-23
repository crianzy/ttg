package cn.com.ttg.api.entity;

import java.io.Serializable;

/**
 * 评论统计相关
 * 
 * @author leon
 * 
 */
public class Count  implements Serializable{

	private static final long serialVersionUID = 179863910951184014L;
	/**
	 * 相对应的描述
	 */
	private String imp;
	private Integer score;

	public String getImp() {
		return imp;
	}

	public void setImp(String imp) {
		this.imp = imp;
	}

	public Integer getScore() {
		return score;
	}

	public void setScore(Integer score) {
		this.score = score;
	}

}
