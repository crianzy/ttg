package cn.com.ttg.test;

import java.util.ArrayList;
import java.util.List;

class A {
	private int a;
	private B[] b;

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public B[] getB() {
		return b;
	}

	public void setB(B[] b) {
		this.b = b;
	}

}

class B {
	private int b;

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

}

class C {
	private List<A> list;

	public List<A> getList() {
		return list;
	}

	public void setList(List<A> list) {
		this.list = list;
	}
}

public class TestList {
	public static void main(String[] args) {
		A a = new A();
		a.setA(1);
		B[] b = new B[2];
		a.setB(b);
		C c = new C();
		List<A> list = new ArrayList<A>();
		list.add(a);
		list.add(a);
		list.add(a);
		c.setList(list);
	}
}
