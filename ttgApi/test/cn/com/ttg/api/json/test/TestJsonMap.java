package cn.com.ttg.api.json.test;

import java.io.IOException;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.junit.Test;

public class TestJsonMap {

	@Test
	public void testjson() {
		String json = "{\"id1\":\"1\",\"name\":\"haha\",\"id2\":\"2\"}";
		ObjectMapper mapper = new ObjectMapper();
		TestBean bean = null;
		try {
			bean = (TestBean) mapper.readValue(json, TestBean.class);
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (JsonParseException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println(bean);

	}
}
