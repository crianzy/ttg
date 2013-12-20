package cn.com.ttg.test;

public class TestClassForName {
	public int a = 1;
	
	public static void main(String[] args) throws ClassNotFoundException {
		Class<?> t = Class.forName("cn.com.ttg.test.testClassForName");
		System.out.println(t.getSimpleName());
	}

}
