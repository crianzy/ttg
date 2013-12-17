package cn.com.ttg.api.util;

import java.util.Arrays;
import java.util.List;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import cn.com.ttg.Param.ActionUtil;
import cn.com.ttg.Param.ParaUtil;
import cn.com.ttg.Param.Param;
import cn.com.ttg.Param.UrlUtil;
import cn.com.ttg.entity.Clazz;
import cn.com.ttg.util.HttpRequest;

public class ClazzUtil {

	public static Clazz[] getClazzArray(Param p) {
		// 获取 服务器返回的json格式的字符串
		String json = HttpRequest.sendGet(UrlUtil.url, p.toString());
		System.out.println(json);
		JSONObject jo = JSONObject.fromObject(json);
		JSONArray data = jo.getJSONArray("data");
		// clazzLsit = data.toList(data, Clazz.class);
		Clazz[] clazzarray = (Clazz[]) data.toArray(data, Clazz.class);
		System.out.println(clazzarray);
		return clazzarray;
	}

	public static List<Clazz> getClazzList(Param p) {
		// 获取 服务器返回的json格式的字符串
		String json = HttpRequest.sendGet(UrlUtil.url, p.toString());
		System.out.println(json);
		JSONObject jo = JSONObject.fromObject(json);
		JSONArray data = jo.getJSONArray("data");
		Clazz[] clazzarray = (Clazz[]) data.toArray(data, Clazz.class);
		// System.out.println("getClsname ="+clazzarray[1].getClsname());
		// 返回式 转换成 list
		return Arrays.asList(clazzarray);
	}

	public static void main(String[] args) {
		Param p = new Param();
		p.put(ParaUtil.action, ActionUtil.getClazzAction);
		p.put(ParaUtil.clsid, "1");
		ClazzUtil.getClazzList(p);
		ClazzUtil.getClazzArray(p);
	}
}
