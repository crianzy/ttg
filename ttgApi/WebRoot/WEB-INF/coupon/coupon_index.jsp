<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ page import="com.opensymphony.xwork2.ActionContext"%>
<%@ page import="cn.com.ttg.api.bean.*"%>
<%@taglib uri="/struts-tags" prefix="s"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!doctype html>
<html>
<head>
<base href="<%=basePath%>">
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=Edge" />
<title>优惠券 - U联生活</title>
<link type="text/css" rel="stylesheet"
	href="http://www.ulpos.com/css/common.css">
<link type="text/css" rel="stylesheet"
	href="http://www.ulpos.com/css/coupon.css">
<script src="http://www.ulpos.com/js/jquery.js" type="text/javascript"></script>
<script src="http://www.ulpos.com/js/common.js" type="text/javascript"></script>
<script src="http://www.ulpos.com/js/jquery.Xslider.js"
	type="text/javascript"></script>
<script src="http://www.ulpos.com/js/jquery.slide.js"
	type="text/javascript"></script>
<script src="http://www.ulpos.com/js/coupon.js" type="text/javascript"></script>
<script src="http://www.ulpos.com/js/wbox.js" type="text/javascript"></script>
<!--[if IE 6]>
<script type="text/javascript" src="/js/DD_belatedPNG.js"></script>
<script>
DD_belatedPNG.fix('background-image,ul,li,p,input,b,i,a,span,.mobile_a,.hover,.nav,.fanli,.m_tab_box,.hd,em,.pp_box_list,#prev,#next,#ts,.m_tab_box a,.copy,.img img,.bg2,.ico_alert,.ico,.map_ts,.mod,.sina_img,.qq_img,.ico_info,.zhoubian_menu,.zhoubian_menu,.s_info,.img,.img1,.img2,.img3,.m_alert_mod .bg,.about_l .bg,#map_canvas img,.ts,a img');
</script>
<![endif]-->
<!--<script type="text/javascript">
(function() {
	var UA = navigator.userAgent;
	if (UA.indexOf('Android') > -1 || UA.indexOf('iPhone') > -1 || UA.indexOf('iPod') > -1 || UA.indexOf('Symbian') > -1) {
		location.href = 'http://m.ulpos.com';
	}
})()
</script>-->

</head>
<body>
	<header>
		<div class="login">
			<div class="main3">
				<div class="right mobile_a">
					<a href="/down/">手机版</a><i class="gray4">|</i><a href="/help/shop/">商户入驻</a><i
						class="gray4">|</i><a href="http://crm.ulpos.com" target="_blank">CRM平台</a><i
						class="gray4">|</i><a href="/help/">帮助</a>
				</div>
				<div class="l">
					<ul id="usertips">
						<li>欢迎您！</li>
						<li><span class="red2 bold"><a href="/user/">crianzy(1175982)</a>
						</span></li>
						<li><i class="gray4">|</i></li>
						<li><span class="hz_login p_re2"><i><a
									href="/user/">我的U联</a><b></b> </i>
								<div class="hz_login_list" id="u_list">
									<div>
										<a href="/user/coupons/">我的优惠券</a>
									</div>
									<div>
										<a href="/user/tuangou/">我的团购</a>
									</div>
									<div>
										<a href="/user/vipcard/">我的会员卡</a>
									</div>
									<div>
										<a href="/user/points/">我的积分</a>
									</div>
									<div>
										<a href="/user/bankcard/">我的银行卡</a>
									</div>
									<div>
										<a href="/user/info/">我的资料</a>
									</div>
									<div class="last">
										<a href="/user/">查看更多</a>
									</div>
								</div> </span>
						</li>
						<li><i class="gray4">|</i></li>
						<li><a href="/user/logout/">退出</a></li>
					</ul>
				</div>


			</div>
			<div class="clear"></div>
		</div>
		<div class="clear"></div>
		<div class="nav">
			<div class="main3">
				<h1>
					<a href="/"><img src="/images/logo.jpg" alt="U联生活" /> </a>
				</h1>


				<div class="city">
					<p>南昌</p>
					<i><a href="/city/">[切换城市]</a> </i>
				</div>
				<!-- 搜索商户 地址 -->
				<form action="/query/" method="get"
					onsubmit="if($('#keyword').val()=='商户或地址 …'){$('#keyword').val('')}">
					<div class="search">
						<input type="text" name="keyword" id="keyword"
							onFocus="if(this.value == '商户或地址 …') {this.value='';this.style.color='#333'}"
							onBlur="if(this.value == '') { this.value='商户或地址 …';this.style.color='#999'}"
							value="商户或地址 …" style="color:#999;">
						<button class="go" type="submit"></button>
					</div>
				</form>
				<div class="navs">
					<a href="/">首页</a> <a class="hover" href="/coupons/">优惠券</a> <a
						href="/card/">会员卡</a> <a href="/points/">返积分</a> <a
						href="/tuangou/">团购</a> <a href="/map/">查地图</a> <a href="/event/">活动汇</a>

				</div>
			</div>
		</div>
		<div class="clear"></div>
	</header>
	<section>
		<div class="main3">
			<div class="member_box1">
				<div class="member_step">
					<div class="hd">简单3步 畅享优惠</div>
					<div class="step_list">
						<ul>
							<li><span>1</span>注册并<em class="red2">关联</em>银行卡</li>
							<li><span>2</span>优惠券<em class="red2">放入</em>银行卡</li>
							<li><span>3</span>刷卡消费，<em class="red2">享特惠</em></li>
						</ul>
					</div>
					<i></i> <b></b>
				</div>
				<div id="slide">
					<div class="conbox">
						<div>
							<a title="U联优惠券" target="_blank" href="0"><img
								src="http://upload.ulpos.com/upload/201306/20130618155904.jpg"
								width="760" height="280" /> </a>
						</div>
					</div>
					<div class="switcher">
						<a href="javascript:void(0);" class="cur">1</a>
					</div>
				</div>
			</div>
		</div>
	</section>
	<section>
		<div class="main3">
			<div class="member_bg top16">
				<div class="member_menu">
					<div class="hd" id="lock">按分类选择</div>
					<h3>
						<em>商户类别</em>
					</h3>
					<!-- 商户分类循环 -->
					<%
						List<Clazz> allClazz = (List<Clazz>)ActionContext.getContext().get("allClazz");
						for (Iterator<Clazz> it = allClazz.iterator();it.hasNext();) {
							Clazz clazz1 = it.next();
							Clazz clazz2 = it.next();
							if(clazz1.getChildrenList().isEmpty()&&clazz1.getChildrenList().isEmpty()){
								continue;
							}
							
					%>
						<div class="fenlei">
							<span><a href="?clsid=0"><%=clazz1.getClsname() %></a> </span>
							<span><a href="?clsid=0"><%=clazz2.getClsname() %></a> </span>
						
							<div id="show_menu">
								<dl>
									<dt><%=clazz2.getClsname() %></dt>
									<dd>
										<% 
											for (Iterator<Clazz> it1 = clazz1.getChildrenList().iterator();it1.hasNext();) {
												Clazz clazz = it1.next();
										%>
											<a href="?clsid=<%=clazz.getClsid() %>"><%=clazz.getClsname() %></a>｜
										<% 
											}
										%>
									</dd>
								</dl>
								<dl>
									<dt><%=clazz2.getClsname() %></dt>
									<dd>
										<% 
											for (Iterator<Clazz> it2 = clazz2.getChildrenList().iterator();it2.hasNext();) {
												Clazz clazz = it2.next();
										%>
											<a href="?clsid=<%=clazz.getClsid() %>"><%=clazz.getClsname() %></a>｜
										<% 
											}
										%>
									</dd>
								</dl>
							</div>
						</div>
					<%
						}
					%>
					
				<h3>
					<em>商区/商圈</em>
				</h3>
				<h3>
					<em>人均消费</em>
				</h3>
				<%
				//TODO 人均消费的 没做
				 %>
				<div class="fenlei">
					<span><a href="?avg=">全部</a> </span><span><a href="?avg=1">30元以下</a>
					</span>
				</div>
				<div class="fenlei">
					<span><a href="?avg=2">30-50元</a> </span><span><a
						href="?avg=3">50-80元</a> </span>
				</div>
				<div class="fenlei">
					<span><a href="?avg=4">80-120元</a> </span><span><a
						href="?avg=5">120-200元</a> </span>
				</div>
				<div class="fenlei">
					<span><a href="?avg=6">200元以上</a> </span>
				</div>
			</div>
			<!--2013-12-26 10:18:08-->
			<div class="member_r">
				<div class="love">
					<div class="hd">
					<% 
						//TODO 猜你喜欢没做
					%>
						<a href="/user/love/" title="设置"></a><span class="yahe">猜您<i
							class="green2">喜欢</i> </span><span class="left10 size_12 gray3">设置您居住、工作或学校的地址，常去的商圈，吃喝玩乐的喜好，以便能更准确的为您推荐。</span>
					</div>
					<div class="pp_box_list">
						<a href="javascript:void(0);" id="prev"></a>
						<div id="marquee">
							<ul>
								<li>
									<div class="mod">
										<a class="imgbg" href="/shop109861/"></a>
										<div class="img">
											<img
												src="http://upload.ulpos.com/upload/201312/20131210153641.jpg"/ >
										</div>
										<div class="txt">
											<span class="right right10">全单7折</span> <span
												class="left10 bold"><a class="t_link"
												href="/shop109861/">名媛国际SPA养生会所</a> </span>
										</div>
									</div>
								</li>
								<li>
									<div class="mod">
										<a class="imgbg" href="/shop109335/"></a>
										<div class="img">
											<img
												src="http://upload.ulpos.com/upload/201312/20131203114352.jpg"/ >
										</div>
										<div class="txt">
											<span class="right right10">全单8.8折</span> <span
												class="left10 bold"><a class="t_link"
												href="/shop109335/">豪亨世家牛排</a> </span>
										</div>
									</div>
								</li>
								<li>
									<div class="mod">
										<a class="imgbg" href="/shop110258/"></a>
										<div class="img">
											<img
												src="http://upload.ulpos.com/upload/201312/20131213172215.jpg"/ >
										</div>
										<div class="txt">
											<span class="right right10">满1000减150</span> <span
												class="left10 bold"><a class="t_link"
												href="/shop110258/">韩亚养生</a> </span>
										</div>
									</div>
								</li>
								<li>
									<div class="mod">
										<a class="imgbg" href="/shop110001/"></a>
										<div class="img">
											<img
												src="http://upload.ulpos.com/upload/201312/20131211153035.jpg"/ >
										</div>
										<div class="txt">
											<span class="right right10">全单9折</span> <span
												class="left10 bold"><a class="t_link"
												href="/shop110001/">HANBIN</a> </span>
										</div>
									</div>
								</li>
								<li>
									<div class="mod">
										<a class="imgbg" href="/shop104262/"></a>
										<div class="img">
											<img
												src="http://upload.ulpos.com/upload/201305/20130527172547.jpg"/ >
										</div>
										<div class="txt">
											<span class="right right10">全单8.8折</span> <span
												class="left10 bold"><a class="t_link"
												href="/shop104262/">今视觉摄影工作室</a> </span>
										</div>
									</div>
								</li>
								<li>
									<div class="mod">
										<a class="imgbg" href="/shop109478/"></a>
										<div class="img">
											<img
												src="http://upload.ulpos.com/upload/201312/20131204171602.jpg"/ >
										</div>
										<div class="txt">
											<span class="right right10">全单8.8折</span> <span
												class="left10 bold"><a class="t_link"
												href="/shop109478/">捡到宝汽车用品销售部</a> </span>
										</div>
									</div>
								</li>
							</ul>
						</div>
						<a href="javascript:void(0);" id="next"></a>
					</div>
				</div>
				<!-- end 猜你喜欢 -->
				<div class="member_tab" id="dblist">
					<div class="m_tab_box">
						<div class="hd">
							<ul class="left">
								<!--箭头的五种状态：当前cur 绿色向下green_down 绿色向上green_up 灰色向下gray_down 灰色向上gray_up-->
								<% 
									//TODO 关于有优惠卷的排序没有做
								%>
								<li><a class="cur" href="?orderby=1#dblist">默认<b></b> </a>
								</li>
								<li><a class="gray_up" href="?orderby=2#dblist">人气<b></b>
								</a></li>
								<li><a class="gray_up" href="?orderby=4#dblist">评分<b></b>
								</a></li>
								<li><a class="gray_up" href="?orderby=6#dblist">最新<b></b>
								</a></li>
							</ul>
							<ul class="right">
								<span class="pic"><a class="cur" href="?viewby=1#dblist"
									title="橱窗方式"></a> </span>
								<span class="list"><a href="?viewby=2#dblist"
									title="列表方式"></a> </span>
							</ul>
						</div>
						<%
							//TODO 优惠卷 列表
						 %>
						<div class="m_tab_list">
							<ul>
								<s:iterator value="#page.list">
									<li>
										<b></b>
										<div class="shadow">
										<div class="mod">
										<a class="imgbg" href="shop?shopid=${shopid }"></a>
										<div class="img"><img src="${pic }" /></div>
										<p class="w170">
										<s:if test="impressions==0.0">
												<span class="right ">
												暂无评论
												</span>
										</s:if>
										<s:else>
											<span class="right red3">
													${impressions }分
											</span>
										</s:else>
										<span class="bold green2"><a href="shop?shopid=${shopid }">${shopname }</a></span></p>
										<p>优惠：<span class="red3 bold">${discount }</span></p>
										<p class="add">人均消费：${shopavg } 元</p>
										<p class="add">有效期：<s:date name="effect" format="yyyy-MM-dd" />
													 - <s:date name="expired" format="yyyy-MM-dd" /></p>
										</div>
										<div class="shears">
										<p><span class="right"><a href="javascript:addcou(${couid })">放入银行卡</a></span><span><a href="javascript:branch(104105)">参与门店（1）</a></span></p>
										</div>
										</div>
									</li>
								</s:iterator>
							</ul>
						</div>

						<div class="clear"></div>
						<div align="center">
							<div class="page">
								<!--分页开始-->
								<% 
									Page pages = (Page)ActionContext.getContext().get("page");
									int totalPage = pages.getTotalpage();
									int curPage = pages.getPage();
									int pagesize = pages.getPagesize();
									int qian = 0;
									int hou = 0;
									int appratPageSize = 11;
									if(totalPage<10){
										qian = curPage -1;
										hou = totalPage - curPage;
									}else if((totalPage-curPage)<appratPageSize/2){
										hou = totalPage-curPage;//当前页 后显示多少页
										qian = appratPageSize - hou - 1;//当前页前显示多少页
									}else if(curPage < appratPageSize/2) {
											qian = curPage - 1;
											hou = appratPageSize - curPage;
									}else{
										qian = appratPageSize/2;
										hou = appratPageSize/2;
									}
									
								%>
									<s:if test="#page.page == 1">
										<a href="javascript:void(0)" <s:if test="#page.page == 1"> class="no" </s:if> >上一页</a>
									</s:if>
									<s:else>
										<a href="coupon/index?pageno=<%=curPage-1 %>#dblist"  >上一页</a>
									</s:else>
									<%
										for(int i = curPage-qian;i<curPage && i>0;i++){
										//当前页前
									%>
											<a href="coupon/index?pageno=<%=i %>#dblist"><%=i %></a>
									<% 
										}
									%>
										<!-- 当前页 -->
											<a href="javascript:void(0)" class="cur"><%=curPage %></a>
									<% 
										for(int i = curPage+1;i<=curPage+hou;i++){
										//当前页后
									%>
											<a href="coupon/index?pageno=<%=i %>#dblist"><%=i %></a>
									<% 
										}
									%>
									<s:if test="#page.page == #page.totalpage">
										<a href="javascript:void(0)" class="last no" >下一页</a>
									</s:if>
									<s:else>
										<a href="coupon/index?pageno=<%=curPage+1 %>#dblist" class="last" >下一页</a>
									</s:else>
							</div>
						</div>

					</div>
				</div>
			</div>
			<div class="clear"></div>
		</div>
		</div>
		<div class="clear"></div>
	</section>
	<!--页脚-->
	<footer>
		<div class="footer">
			<div class="footer_link">
				<a href="/about/">关于我们</a>|<a href="http://open.ulpos.com"
					target="_blank">开放平台</a>|<a href="/help/">帮助中心</a>|<a
					href="/about/contactus/">联系我们</a>|<a href="/down/">手机客户端</a>
			</div>
			<div class="copy">
				<p>银联商务有限公司 粤ICP备10008596号-3</p>
				<p>联系邮箱：services@ulpos.com</p>
			</div>
		</div>
	</footer>

	<!--意见反馈、返回顶部-->
	<div class="right_sroll">
		<p id="back-to-top">
			<a title="返回顶部" href="#top"></a>
		</p>
	</div>
	<!-- 1.1345229148865 -->
</body>
</html>