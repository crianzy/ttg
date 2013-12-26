<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>

<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>My JSP 'test.jsp' starting page</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

</head>

<body>

	<li>遍历集合：<br /> <s:iterator value="{1, 2, 3}">
			<s:property /> |
          </s:iterator></li>
	<li>自定义变量：<br /> <s:iterator value="{'aaa', 'bbb', 'ccc'}"
			var="x">
			<s:property value="#x.toUpperCase()" /> |
          </s:iterator></li>
	<li>使用status:<br /> <s:iterator value="{'aaa', 'bbb', 'ccc'}"
			status="status">
			<s:property /> |
               遍历过的元素总数：<s:property value="#status.count" /> |
               遍历过的元素索引：<s:property value="#status.index" /> |
               当前是偶数？：<s:property value="#status.even" /> |
               当前是奇数？：<s:property value="#status.odd" /> |
               是第一个元素吗？：<s:property value="#status.first" /> |
               是最后一个元素吗？：<s:property value="#status.last" />
			<br />
		</s:iterator></li>

	<li><s:iterator value="#{1:'a', 2:'b', 3:'c'}">
			<s:property value="key" /> | <s:property value="value" />
			<br />
		</s:iterator></li>

	<li><s:iterator value="#{1:'a', 2:'b', 3:'c'}" var="x">
			<s:property value="#x.key" /> | <s:property value="#x.value" />
			<br />
		</s:iterator></li>
	</br> ---------------------------------------------
	</br>
	<s:iterator value="allClazz" status="status" step="2">
		${clsname }	
		<s:iterator value="childrenList">
			${clsname }
			<s:if test="#status.even">
				</br>
			</s:if>	
		</s:iterator>
		<s:if test="#status.even">
			</br>
		</s:if>	
	</s:iterator>
</body>
</html>
