package cn.com.ttg.api.bean;

import java.io.Serializable;

/**
 * 评论统计相关
 * 
 * @author leon
 * 
 */
public class Count implements Serializable {

	private static final long serialVersionUID = 179863910951184014L;
	/**
	 * 相对应的描述
	 */
	private String imp;
	private double score;

	public String getImp() {
		return imp;
	}

	public void setImp(String imp) {
		this.imp = imp;
	}

	public double getScore() {
		return score;
	}

	public void setScore(double score) {
		this.score = score;
	}

}
