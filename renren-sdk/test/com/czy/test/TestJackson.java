package com.czy.test;

import org.junit.Test;

import com.renren.api.json.JSONException;
import com.renren.api.json.JSONObject;

public class TestJackson {
	String jsonString = "[1,2,3,4]";
	
	@Test
	public void testGetJsonObject() throws JSONException{
		JSONObject jo = new JSONObject(jsonString);
		System.out.println(jo);
	}

}
