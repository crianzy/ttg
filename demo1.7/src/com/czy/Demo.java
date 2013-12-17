package com.czy;

import java.util.Date;
public class Demo extends Date{
    public static void main(String[]  args) {
    	
//       new Demo().test();
    	int a=0;
    	int c=0;
    	do{
    		c--;
    		System.out.println(c);
    		a = a-1;
    	}while(a>0);
    	System.out.println(c);
    	
    }
   
    public void test(){
       System.out.println(super.getClass().getName());
    }
}
