package cn.com.ttg.test;

import net.sf.json.JSONObject;

class Student {
	
	// "{\"address\":\"chian\", "
	//		+ "\"email\":\"email@123.com\",\"id\":22,\"name\":\"tom\"}";
	String address;
	String email;
	String id;
	String name;
	
	
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}


}

public class JsonTest {

	public static void main(String[] args) {
		String json = "{\"address\":\"chian\", "
				+ "\"email\":\"email@123.com\",\"id\":22,\"name\":\"tom\"}";

		JSONObject js = JSONObject.fromObject(json);
		System.out.println(js.getString("address"));
	}
}
