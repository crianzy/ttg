<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
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
<title>会员卡 - U联生活</title>
<link type="text/css" rel="stylesheet"
	href="http://www.ulpos.com/css/common.css">
<link type="text/css" rel="stylesheet"
	href="http://www.ulpos.com/css/member.css">
<script src="http://www.ulpos.com/js/jquery.js" type="text/javascript"></script>
<script src="http://www.ulpos.com/js/common.js" type="text/javascript"></script>
<script src="http://www.ulpos.com/js/jquery.Xslider.js"
	type="text/javascript"></script>
<script src="http://www.ulpos.com/js/jquery.slide.js"
	type="text/javascript"></script>
<script src="http://www.ulpos.com/js/member.js" type="text/javascript"></script>
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
						</span>
						</li>
						<li><i class="gray4">|</i>
						</li>
						<li><span class="hz_login p_re2"><i><a
									href="/user/">我的U联</a><b></b>
							</i>
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
								</div> </span></li>
						<li><i class="gray4">|</i>
						</li>
						<li><a href="/user/logout/">退出</a>
						</li>
					</ul>
				</div>


			</div>
			<div class="clear"></div>
		</div>
		<div class="clear"></div>
		<div class="nav">
			<div class="main3">
				<h1>
					<a href="/"><img src="/images/logo.jpg" alt="U联生活" />
					</a>
				</h1>


				<div class="city">
					<p>南昌</p>
					<i><a href="/city/">[切换城市]</a>
					</i>
				</div>

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
					<a href="/">首页</a> <a href="/coupons/">优惠券</a> <a class="hover"
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
					<div class="hd">告别卡族 一卡搞定</div>
					<div class="step_list">
						<ul>
							<li><span>1</span>注册并<em class="red2">关联</em>银行卡</li>
							<li><span>2</span>银行卡<em class="red2">升级</em>为会员卡</li>
							<li><span>3</span>刷卡消费，<em class="red2">享特惠</em>
							</li>
						</ul>
					</div>
					<i></i> <b></b>
				</div>
				<div id="slide">
					<div class="conbox">
						<div>
							<a title="U联会员卡" target="_blank" href="0"><img
								src="http://upload.ulpos.com/upload/201306/20130618170046.jpg"
								width="760" height="280" />
							</a>
						</div>
					</div>
					<div class="switcher">
						<a href="javascript:void(0);" class="cur">1</a>
					</div>
				</div>
			</div>
		</div>
	</section>
	<!--内容-->
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
					<div class="fenlei">
						<span><a href="?avg=">全部</a>
						</span><span><a href="?avg=1">30元以下</a>
						</span>
					</div>
					<div class="fenlei">
						<span><a href="?avg=2">30-50元</a>
						</span><span><a href="?avg=3">50-80元</a>
						</span>
					</div>
					<div class="fenlei">
						<span><a href="?avg=4">80-120元</a>
						</span><span><a href="?avg=5">120-200元</a>
						</span>
					</div>
					<div class="fenlei">
						<span><a href="?avg=6">200元以上</a>
						</span>
					</div>
				</div>
				<!--2013-12-27 13:26:01-->
				<div class="member_r">

					<div class="love">
						<div class="hd">
							<a href="/user/love/" title="设置"></a><span class="yahe">猜您<i
								class="green2">喜欢</i>
							</span><span class="left10 size_12 gray3">设置您居住、工作或学校的地址，常去的商圈，吃喝玩乐的喜好，以便能更准确的为您推荐。</span>
						</div>
						<div class="pp_box_list">
							<div id="prev"></div>
							<div id="marquee">
								<ul>
									<li>
										<div class="mod m_card_1">
											<a href="/shop108342/"></a>
											<div class="tit">车立方汽车美容会所会员卡</div>
											<div class="img">
												<img
													src="http://upload.ulpos.com/upload/201311/20131108175654.png"/ >
											</div>
											<div class="txt card_txt">
												<span class="right">最高可享全单8.5折</span>
											</div>
											<div class="show_mod hover">
												<p>
													<span class="right gray4">有效期：2013.09.11 -
														2014.09.10</span><span class="bold white">会员卡等级</span>
												</p>
												<p class="top10">
													<span class="bold gray">体验卡：</span> <span class="gray3">0元≤累计消费＜2000元，享</span><span
														class="red2">全单8.5折</span>
												</p>
												<p>
													<span class="bold gray">普通卡：</span> <span class="gray3">2000元≤累计消费＜5000元，享</span><span
														class="red2">全单8折</span>
												</p>
												<p>
													<span class="bold gray">贵宾卡：</span> <span class="gray3">5000元≤累计消费＜10000元，享</span><span
														class="red2">全单7.5折</span>
												</p>
												<p>
													<span class="bold gray">白银卡：</span> <span class="gray3">累计消费≥10000元，享</span><span
														class="red2">全单7折</span>
												</p>
											</div>
										</div></li>
									<li>
										<div class="mod m_card_1">
											<a href="/shop109255/"></a>
											<div class="tit">颜如玉化妆品会员卡</div>
											<div class="img">
												<img
													src="http://upload.ulpos.com/upload/201312/20131202174108.png"/ >
											</div>
											<div class="txt card_txt">
												<span class="right">最高可享全单9折</span>
											</div>
											<div class="show_mod hover">
												<p>
													<span class="right gray4">有效期：2013.10.17 -
														2014.10.16</span><span class="bold white">会员卡等级</span>
												</p>
												<p class="top10">
													<span class="bold gray">体验卡：</span> <span class="gray3">0元≤累计消费＜300元，享</span><span
														class="red2">全单9折</span>
												</p>
												<p>
													<span class="bold gray">普通卡：</span> <span class="gray3">300元≤累计消费＜800元，享</span><span
														class="red2">全单8.5折</span>
												</p>
												<p>
													<span class="bold gray">贵宾卡：</span> <span class="gray3">800元≤累计消费＜1500元，享</span><span
														class="red2">全单8折</span>
												</p>
												<p>
													<span class="bold gray">白银卡：</span> <span class="gray3">累计消费≥1500元，享</span><span
														class="red2">全单7.7折</span>
												</p>
											</div>
										</div></li>
									<li>
										<div class="mod m_card_1">
											<a href="/shop109836/"></a>
											<div class="tit">美丽小铺会员卡</div>
											<div class="img">
												<img
													src="http://upload.ulpos.com/upload/201312/20131225094223.png"/ >
											</div>
											<div class="txt card_txt">
												<span class="right">最高可享全单9.5折</span>
											</div>
											<div class="show_mod hover">
												<p>
													<span class="right gray4">有效期：2013.10.29 -
														2014.10.28</span><span class="bold white">会员卡等级</span>
												</p>
												<p class="top10">
													<span class="bold gray">体验卡：</span> <span class="gray3">0元≤累计消费＜288元，享</span><span
														class="red2">全单9.5折</span>
												</p>
												<p>
													<span class="bold gray">普通卡：</span> <span class="gray3">累计消费≥288元，享</span><span
														class="red2">全单8.8折</span>
												</p>
											</div>
										</div></li>
									<li>
										<div class="mod m_card_1">
											<a href="/shop110012/"></a>
											<div class="tit">嘉宝多名车服务中心会员卡</div>
											<div class="img">
												<img
													src="http://upload.ulpos.com/upload/201312/20131217171640.png"/ >
											</div>
											<div class="txt card_txt">
												<span class="right">最高可享满2000减20</span>
											</div>
											<div class="show_mod hover">
												<p>
													<span class="right gray4">有效期：2013.11.11 -
														2014.11.10</span><span class="bold white">会员卡等级</span>
												</p>
												<p class="top10">
													<span class="bold gray">体验卡：</span> <span class="gray3">0元≤累计消费＜3000元，享</span><span
														class="red2">满2000减20</span>
												</p>
												<p>
													<span class="bold gray">普通卡：</span> <span class="gray3">3000元≤累计消费＜10000元，享</span><span
														class="red2">满3000减50</span>
												</p>
												<p>
													<span class="bold gray">贵宾卡：</span> <span class="gray3">10000元≤累计消费＜30000元，享</span><span
														class="red2">满5000减80</span>
												</p>
												<p>
													<span class="bold gray">白银卡：</span> <span class="gray3">30000元≤累计消费＜60000元，享</span><span
														class="red2">满6800减100</span>
												</p>
												<p>
													<span class="bold gray">铂金卡：</span> <span class="gray3">60000元≤累计消费＜100000元，享</span><span
														class="red2">满7400减150</span>
												</p>
												<p>
													<span class="bold gray">钻石卡：</span> <span class="gray3">累计消费≥100000元，享</span><span
														class="red2">满10000减200</span>
												</p>
											</div>
										</div></li>
									<li>
										<div class="mod m_card_1">
											<a href="/shop110422/"></a>
											<div class="tit">诗洋晶典会员卡</div>
											<div class="img">
												<img
													src="http://upload.ulpos.com/upload/201312/20131216180447.png"/ >
											</div>
											<div class="txt card_txt">
												<span class="right">最高可享全单7折</span>
											</div>
											<div class="show_mod hover">
												<p>
													<span class="right gray4">有效期：2013.10.19 -
														2014.10.18</span><span class="bold white">会员卡等级</span>
												</p>
												<p class="top10">
													<span class="bold gray">体验卡：</span> <span class="gray3">0元≤累计消费＜1000元，享</span><span
														class="red2">全单7折</span>
												</p>
												<p>
													<span class="bold gray">普通卡：</span> <span class="gray3">1000元≤累计消费＜3000元，享</span><span
														class="red2">全单6.5折</span>
												</p>
												<p>
													<span class="bold gray">贵宾卡：</span> <span class="gray3">3000元≤累计消费＜5000元，享</span><span
														class="red2">全单6折</span>
												</p>
												<p>
													<span class="bold gray">白银卡：</span> <span class="gray3">5000元≤累计消费＜10000元，享</span><span
														class="red2">全单5.8折</span>
												</p>
												<p>
													<span class="bold gray">铂金卡：</span> <span class="gray3">10000元≤累计消费＜50000元，享</span><span
														class="red2">全单5.5折</span>
												</p>
												<p>
													<span class="bold gray">钻石卡：</span> <span class="gray3">累计消费≥50000元，享</span><span
														class="red2">全单5折</span>
												</p>
											</div>
										</div></li>
								</ul>
							</div>
							<div id="next"></div>
						</div>
					</div>
					<div class="member_tab" id="dblist">

						<div class="m_tab_tit">
							<ul>
								<li class="hover">免费<i>领取场</i><span>限时限量，不容错过！</span>
								</li>
								<li class="last"><a href="/card/convert/">积分<i>兑换场</i><span>高等级会员卡随意兑！</span>
								</a>
								</li>
							</ul>
						</div>
						<div class="m_tab_box">
							<div class="hd">
								<ul class="left">
									<li><a class="cur" href="?orderby=1#dblist">默认<b></b>
									</a>
									</li>
									<li><a class="gray_up" href="?orderby=2#dblist">人气<b></b>
									</a>
									</li>
									<li><a class="gray_up" href="?orderby=4#dblist">评分<b></b>
									</a>
									</li>
									<li><a class="gray_up" href="?orderby=6#dblist">最新<b></b>
									</a>
									</li>
								</ul>
								<ul class="right">
									<span class="pic"><a class="cur" href="?viewby=1#dblist"
										title="橱窗方式"></a>
									</span>
									<span class="list"><a href="?viewby=2#dblist"
										title="列表方式"></a>
									</span>
								</ul>
							</div>
							<div class="m_tab_list">
								<div id="ts">
									<a href="javascript:void(0);"></a>
								</div>
								<ul>
								<!-- 遍历会员卡 -->
									<s:iterator value="#page.list">
									<li>
										<div class="mod m_card_1">
											<a href="shop?shopid=${shopid }"></a>
											<div class="tit">${shopname }会员卡</div>
											<div class="img">
												<img src="${svclogo }"/ >
											</div>
											<div class="txt card_txt">
												<span class="right">
													最高可享${discount }
												</span>
											</div>
											<div class="show_mod hover">
												<p>
													<span class="right gray4">有效期：
													<s:date name="stime" format="yyyy-MM-dd" />
													-
													<s:date name="etime" format="yyyy-MM-dd" />
													</span>
													<span class="bold white">会员卡等级</span>
												</p>
												<s:iterator value="levels">
													<s:if test="status.first">
														<p class="top10">
													</s:if>
													<s:else>
														<p>
													</s:else>
														<span class="bold gray">${seqname }：</span> <span class="gray3">${upgrade }元≤累计消费＜${degrade }元，享</span><span
															class="red2">${seqdiscount }</span>
													</p>
												</s:iterator>
											</div>
										</div>
										<div class="info">
											<div class="left lh_22">
												<p class="gray3 top10">
													<%//TODO  会员卡 剩余多少天还没做 %>
													剩时：<span class="green2"><strong>318</strong>天<strong>10</strong>小时</span>
												</p>
											</div>
											<div class="right">
												<a class="bnt m_bnt" href="javascript:addvipcard(2341)">升级银行卡</a>
											</div>
										</div></li>
									</s:iterator>
								</ul>
							</div>

							<div class="clear"></div>
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
										<a href="vip/index?pageno=<%=curPage-1 %>#dblist"  >上一页</a>
									</s:else>
									<%
										for(int i = curPage-qian;i<curPage && i>0;i++){
										//当前页前
									%>
											<a href="vip/index?pageno=<%=i %>#dblist"><%=i %></a>
									<% 
										}
									%>
										<!-- 当前页 -->
											<a href="javascript:void(0)" class="cur"><%=curPage %></a>
									<% 
										for(int i = curPage+1;i<=curPage+hou;i++){
										//当前页后
									%>
											<a href="vip/index?pageno=<%=i %>#dblist"><%=i %></a>
									<% 
										}
									%>
									<s:if test="#page.page == #page.totalpage">
										<a href="coupon/vip?pageno=<%=curPage+1 %>#dblist" class="last no" >下一页</a>
									</s:if>
									<s:else>
										<a href="javascript:void(0)" class="last" >下一页</a>
									</s:else>
							</div>							</div>
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
	<!-- 0.22689008712769 -->
</body>
</html>
