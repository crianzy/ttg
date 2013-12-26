<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
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
<title>伊静藤日本料理 - U联生活</title>
<link type="text/css" rel="stylesheet"
	href="http://www.ulpos.com/css/common.css">
<link type="text/css" rel="stylesheet"
	href="http://www.ulpos.com/css/shop.css">
<script type="text/javascript">var shopid=103898;</script>
<script src="http://www.ulpos.com/js/jquery.js" type="text/javascript"></script>
<script src="http://www.ulpos.com/js/common.js" type="text/javascript"></script>
<script src="http://www.ulpos.com/js/shop.js" type="text/javascript"></script>
<script src="http://www.ulpos.com/js/miaov.js" type="text/javascript"></script>
<script src="http://www.ulpos.com/js/jquery.slide.js"
	type="text/javascript"></script>
<script src="http://www.ulpos.com/js/wbox.js" type="text/javascript"></script>
<script src="http://www.ulpos.com/js/yiyaface.js" type="text/javascript"></script>
<script type="text/javascript"
	src="http://app.mapabc.com/apis?&t=ajaxmap&v=2.1.2&key=849d7df9dc3c81d962bfc05fbedf4c61984d806d6277ca5fb4e724ac9e82c9c94348715b9fabc658"></script>
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
					<a href="/">首页</a> <a href="/coupons/">优惠券</a> <a href="/card/">会员卡</a>
					<a href="/points/">返积分</a> <a href="/tuangou/">团购</a> <a
						href="/map/">查地图</a> <a href="/event/">活动汇</a>

				</div>
			</div>
		</div>
		<div class="clear"></div>
	</header>
	<!--内容-->
	<section>
		<div class="main3">
			<div class="slides">
				<div id="slides_box">
					<ul id="pic_list" class="">
						<s:iterator value="shopImageList">
							<li>
							<a href="${piclink }" > <img width="600" height="304"
								src="${picurl }" alt="${shopInfo.shop.shopname }" /> </a>
							</li>
						</s:iterator>
					</ul>
					<div class="mark"></div>
					<ul id="text_list">
						<s:iterator value="shopImageList">
							<li class="">
								<h2>
									<a href="#">${shopInfo.shop.shopname }</a>
								</h2>
							</li>
						</s:iterator>
					</ul>
					<div id="ico_list" >
						<ul>
							<s:iterator value="shopImageList">
								<li class=""><a href="javascript:void(0);"> <img
										src="${picurl }" height="100" /> </a></li>
							</s:iterator>
						</ul>
						<a href="javascript:void(0);" id="btn_prev" class="btn"></a> <a
							href="javascript:void(0);" id="btn_next" class="btn "></a>
					</div>
				</div>

				<div class="slide_r">
					<div class="mod">
						<div class="ceat">
							<img
								src="${shopInfo.shop.logo }"
								width="50" height="50" /><span class="green2 bold size_16 yahe">${shopInfo.shop.shopname }</span>
						</div>
						<div class="top10 ceat">
							评分：<span class="shop_pingfen"><i style="width:97%"></i> </span><span
								class="red3"><b class="size_16">4.88</b>分</span>
						</div>
						<!--i的宽度控制星号-->
						<div>类别：${shopInfo.shop.clsid }</div>
						<div>商圈：${shopInfo.shop.county }</div>
						<div>人均消费：${shopInfo.shop.shopavg } 元</div>
						<div>推荐理由：暂无</div>

					</div>
					<a class="link01" id="mobilesite" href="/down/">手机访问</a>
					<div class="left p_re" id="weibo">
						<a class="link02" href="javascript:void(0)">微博分享</a>
						<div class="show_weibo">
							<a class="sina" href="/user/open/share?to=sina&shopid=103898"
								target="_blank">新浪微博</a> <a class="qq"
								href="/user/open/share?to=tencent&shopid=103898" target="_blank">腾讯微博</a>
						</div>
					</div>
				</div>
				<div class="clear"></div>
			</div>
		</div>
		<div class="main">
			<div class="top20">
				<div class="shop_menu" id="float">
					<a href="#01">商户优惠</a> <a href="#02">商户介绍</a> <a href="#03">商户评价</a>
					<a href="#04">其它推荐</a>
				</div>
			</div>
		</div>
	</section>
	<section>
		<div class="main3" id="01" style="_margin-top:67px;">
			<div class="shop_coupon">
				<div class="hd">
					<b></b> <span class="right"><a class="hide_bnt"
						href="javascript:void(0)">显示过期优惠</a> </span>
					<h3>
						商户<span class=" size_24">优惠</span>
					</h3>
				</div>
				<div class="clear"></div>
				<div class="s_c_list">
					<ul>
						<s:iterator value="shopInfo.coupons">
						<li id="img01"><b></b>
							<div class="l">
								<a href=""><img
									src="${pic }"
									width="194" height="150" /> </a>
							</div>
							<div class="c">
								<div class="t">
									<span class="left">${discount }</span>
								</div>
								<div class="clear"></div>

								<p>
									<span>说明：</span>把该优惠券放入您的银行卡，刷卡消费享全单9折优惠。活动不支持店内折扣同时享受。
								</p>
								<p>
									<span>有效期：</span>
									<s:date name="effect" format="yyyy-MM-dd" /> 至 <s:date name="expired" format="yyyy-MM-dd" />
								</p>
								<p>
									<span>地址：</span>${shopInfo.shop.address } <br> <span>电话：</span>${shopInfo.shop.tel }
								</p>
							</div>
							<div class="r">
								<div>
									<a class="bnt s_bnt" href="javascript:addcou(104555)">放入银行卡</a>
								</div>
								<!--<div>放入银行卡，刷卡消费自动享优惠</div>-->
							</div>
							<div class="clear"></div>
						</li>
						</s:iterator>
						<div class="clear"></div>
					</ul>
				</div>
			</div>
		</div>
	</section>
	<section>
		<div class="main3" id="02">
			<div class="shop_about">
				<div class="hd">
					<b></b>
					<h3>
						商户<span class="size_24">介绍</span>
					</h3>
				</div>
				<div class="clear"></div>
				<div class="s_a_mod">
					<h4>商户简介</h4>
					<p class="top16">伊静藤就是一家正宗的日本料理店，位于南昌市榕门路127号，装修风格采用了日本原汁原味的装修风格，一点一滴透入出日本料理店的博大精深，木制结构的桌椅和摆设，带你走进日本饮食文化的天堂，其主食以米饭，面条为主，日本人比较喜欢吃面食，当然清酒也是一大特色，伊静藤最出名就是和食，将烹调时尽量保持材料本身的原味注重“色、香、味、器”四者合一，视觉也是一种享受。</p>
				</div>
				<div class="s_a_line"></div>
				<div class="s_a_mod">
					<h4>
						商户印象<span class="gray3 size_14 simsun left20">(点击下面标签添加印象)</span>
					</h4>
					<div id="yx">
						<table class="w" width="940" border="0" cellspacing="0"
							cellpadding="0" id="appraise">
							<tr>
								<td width="176"><a href="javascript:;">有WiFi</a><i></i></td>
								<td width="176"><a href="javascript:;">无线上网</a><i></i></td>
								<td width="176"><a href="javascript:;">免费停车位</a><i></i></td>
								<td width="176"><a href="javascript:;">收费停车位</a><i></i></td>
							</tr>
							<tr>
								<td width="176"><a href="javascript:;">有包房</a><i></i></td>
								<td width="176"><a href="javascript:;">大型宴会</a><i></i></td>
								<td width="176"><a href="javascript:;">有表演</a><i></i></td>
								<td width="176"><a href="javascript:;">休闲静谧</a><i></i></td>
							</tr>
							<tr>
								<td width="176"><a href="javascript:;">情侣约会</a><i></i></td>
								<td width="176"><a href="javascript:;">朋友聚餐</a><i></i></td>
								<td width="176"><a href="javascript:;">家庭聚会</a><i></i></td>
								<td width="176"><a href="javascript:;">有游乐区</a><i></i></td>
							</tr>
							<tr></tr>
						</table>
					</div>
				</div>
				<div class="s_a_line"></div>
				<div class="s_a_mod pb">
					<h4>参与门店</h4>
					<div class="p_re">
						<div class="add_roll">
							<div>
								<ul>

								</ul>
							</div>
						</div>
						<div class="map_t" href="">
							<b></b>展开地图
						</div>
					</div>
					<div class="clear"></div>
					<div class="shop_map_box">
						<div id="map_canvas"></div>
					</div>

					<script type="text/javascript">
var jsonshop=[{"lat":"28.677655","lng":"115.883081","ShopID":"103898","ShopName":"伊静藤日本料理","ShopAddress":"榕门路127号(独一处寿福城对面) ","ShopTel":"0791-6709983","ShopBus":"公交：省农业银行站下车，向北200米即到","TagCoupon":1,"TagPoint":0,"TagVipCard":0,"ShopHours":"11:00-21:00"}];var mapObj;
var lng=0;
var lat=0;
$(function(){
	var mapOptions = new MMapOptions();//构建地图辅助类
	mapOptions.zoom=15;//设置地图zoom级别
	mapOptions.center=new MLngLat(114.0378,22.5430);   //设置地图中心点
	mapOptions.minZoomLevel = 10;//设置地图上可显示的最小缩放级别，默认为3
	mapOptions.maxZoomLevel = 18;//设置地图上可显示的最大缩放级别，默认为17,最大缩放级别小于等于20
	mapObj = new MMap("map_canvas", mapOptions); //地图初始化
	var maptools=new MMapTools(mapObj);  
	var str="";
	var lat=0;
	var content="";
	$.each(jsonshop,function(i,item){ 
		var markerOption = new MMarkerOptions();
		markerOption.imageUrl ="/images/icon/n/"+(i+1)+".png";
		markerOption.imageSize=new MSize(27,37);

		var tipOption = new MTipOptions();
		tipOption.tipType = HTML_CUSTOM_TIP;
		content='<div class="ico_info" style="left:73px; top:-15px;"><div class="i_mod"><a class="close_i" href="javascript:void(0);" onclick="closeTip();"></a><div class="hd"><div class="right top10 right40"><li>';
		if(item["TagCoupon"]>0){
			content+='<img src="/images/icon/juan_01.gif" alt="券">';
		}
		if(item["TagPoint"]>0){
			content+='<img src="/images/icon/juan_02.gif" alt="返">';
		}
		if(item["TagVipCard"]>0){
			content+='<img src="/images/icon/juan_03.gif" alt="卡">';
		}
		content+='</i></div><div class="yahe green2 size_16 bold left6">'+item["ShopName"]+'</div></div><div class="mod"><p><strong>地址：</strong>'+item["ShopAddress"]+'</p><p><strong>电话：</strong>'+item["ShopTel"]+'</p></div></div></div>';

		tipOption.content=content;
　		tipOption.tipAlign=BOTTOM_CENTER;
　　		tipOption.tipPosition=new MPoint(-3,-16);

		markerOption.tipOption = tipOption;
		markerOption.canShowTip=true;

		markerOption.isEditable=false;
		var marker = new MMarker(new MLngLat(item['lng'],item['lat']),markerOption);
		marker.id=i;
		if(lat==0 && item['lat']>0){
			lat=item['lat'];
			mapObj.addOverlay(marker,true);
		}else{
			mapObj.addOverlay(marker,false);
		}

		str+='<li lat="'+item["lat"]+'" lng="'+item["lng"]+'">';
		if(jsonshop.length>1){
			str+='<div class="l"><img src="/images/icon/num_'+(i+1)+'.gif">'+item["ShopName"]+'</div>';
		}
		if(jsonshop.length==1){
			str+='<div class="c_1"><p>'+item["ShopAddress"]+'</p>';
		}else{
			str+='<div class="c"><p>'+item["ShopAddress"]+'</p>';
		}
		if(jsonshop.length>1){
			str+='<p class="top8 show_tell"><span class="bg1">';
		}else{
			str+='<p class="top8 show_tell" style="display:block"><span>';
			$("div.add_roll").css("height","84px");
			
		}
		str+='<img src="/images/icon/s_ico_01.gif">'+item["ShopHours"]+'</span><span class="bg2"><img src="/images/icon/s_ico_02.gif">'+item["ShopTel"]+'</span><a class="bg3"  href="javascript:void(0);"><img src="/images/icon/s_ico_03.gif">'+item["ShopBus"]+'</a></p>';
		str+='</div>';
		if(jsonshop.length>1){
			str+='<div class="r">';
		}else{
			str+='<div class="r" id="r">';
		}
		
		
		if(item["TagCoupon"]>0){
			str+='<i><img src="/images/icon/juan_01.gif" alt="券"></i>';
		}
		if(item["TagPoint"]>0){
			str+='<i><img src="/images/icon/juan_02.gif" alt="返"></i>';
		}
		if(item["TagVipCard"]>0){
			str+='<i><img src="/images/icon/juan_03.gif" alt="卡"></i>';
		}
		str+='</div>';
		if(jsonshop.length>1){
			str+='<div class="open_bnt"><a class="up" href="javascript:void(0);">展开<img src="/images/icon/s_ico_06.gif"></a></div>';	
		}
		str+='</li>';	
		
		if(i==0){
			lng=item["lng"];
			lat=item["lat"];
		}
				
	});
	mapObj.addEventListener(mapObj,TIP_OPEN,openTip);	
	$("div.add_roll ul").html(str);
	$("div.add_roll li").hover(function(){
		$("div.add_roll li").removeClass("hover");
		$(this).addClass("hover");
		mapObj.panTo(new MLngLat($(this).attr("lng"),$(this).attr("lat")));
	});
	$("a.bg3").hover(function(){
		$(this).find("img").attr("src","/images/icon/s_ico_03_hover.gif");
	},function(){
		$(this).find("img").attr("src","/images/icon/s_ico_03.gif");
	});
	$("div.open_bnt a").toggle(function(){
		$(this).html("收起<img src='/images/icon/s_ico_05.gif'>").parent().siblings(".c").find(".show_tell").slideDown(100);
	},function(){
		$(this).html("展开<img src='/images/icon/s_ico_06.gif'>").parent().siblings(".c").find(".show_tell").slideUp(100);
	});
	setTimeout("mapObj.panTo(new MLngLat(lng,lat));",1000);
})

function openTip(param){
	var n = param.overlayId;
	$("div.add_roll li").removeClass("hover");
	$("div.add_roll li").eq(n).addClass("hover");
}
function closeTip(){
	$(".ico_info").hide();
}
</script>

					<div class="clear"></div>
				</div>
			</div>
		</div>
	</section>
	<section>
		<div class="main3" id="03">
			<div class="shop_about">
				<div class="app_l">
					<div class="hd">
						<b></b>
						<h3>
							商户<span class="size_24">评价</span>
						</h3>
					</div>
					<div class="clear"></div>
					<div class="a_mod">
						<div class="top10 ceat">
							<span>综合评分：</span> <span class="shop_pingfen"><i
								style="width:97.6%"></i> </span><span class="red3"><b
								class="size_16">4.88</b>分</span>
						</div>
						<div class="p_re2">
							<span>投诉记录：</span> <b class="red3">0</b><i class=" green2 left10"><a
								href="javascript:;" onclick="addcomplain(shopid)">[投诉]</a> </i>
							<!--投诉记录弹出-->
							<div class="shows show_cm">
								<b></b> <a href="javascript:void(0);" class="close_cm"></a>
								<div class="size_24 yahe lh_28 bottom20">
									伊静藤日本料理 投诉纪录<span class="size_16">（共被投诉 <i class="red3">0</i>
										次）</span>
								</div>
								<div class="cm_box" align="center">无投诉记录</div>
							</div>
						</div>
						<div class="gray3">说明：评分由口味、环境、服务、人气及投诉综合计算得出。</div>
					</div>
				</div>
				<div class="app_r">
					<div class="a_mod">
						<div class="ceat">
							<span class="t">口味：</span><span class="shop_pingfen2"><i
								style="width:100%"></i> </span><span class="left20">5</span>
						</div>
						<div class="ceat">
							<span class="t">环境：</span><span class="shop_pingfen2"><i
								style="width:100%"></i> </span><span class="left20">5</span>
						</div>
						<div class="ceat">
							<span class="t">服务：</span><span class="shop_pingfen2"><i
								style="width:95%"></i> </span><span class="left20">4.75</span>
						</div>
						<div class="ceat">
							<span class="t">人气：</span><span class="shop_pingfen2"><i
								style="width:95%"></i> </span><span class="left20">4.75</span>
						</div>
						<div class="ts">
							<span>很差</span><span>差</span><span>一般</span><span>好</span><span>很好</span>
						</div>
					</div>

				</div>
				<div class="clear"></div>
				<div class="s_a_mod">
					<div class="pingjia_hd">
						<a class="p_bnt bnt" id="p_bnt" href="javascript:void(0);">我要评价</a><span
							class="gray3 left20">经常评价的网民是个好网民，写个评价给"围观帝"们做个参考吧！</span>
						<!--评价弹出-->
						<div class="show_pj shows">
							<b></b> <a href="javascript:void(0);" class="close_pj cancel"></a>
							<div class="size_24 yahe lh_28 bottom20">关于伊静藤日本料理</div>
							<div class="a_mod">
								<div class="left">
									<div class="ceat2">
										<span class="t">口味：</span><span class="shop_pingfen2"><input
											type="button" title="1"><input type="button"
											title="2"><input type="button" title="3"><input
											type="button" title="4"><input type="button"
											title="5"> </span><span class="left20">5</span>
									</div>
									<div class="ceat2">
										<span class="t">环境：</span><span class="shop_pingfen2"><input
											type="button" title="1"><input type="button"
											title="2"><input type="button" title="3"><input
											type="button" title="4"><input type="button"
											title="5"> </span><span class="left20">5</span>
									</div>
									<div class="ceat2">
										<span class="t">服务：</span><span class="shop_pingfen2"><input
											type="button" title="1"><input type="button"
											title="2"><input type="button" title="3"><input
											type="button" title="4"><input type="button"
											title="5"> </span><span class="left20">5</span>
									</div>
									<div class="ceat2">
										<span class="t">人气：</span><span class="shop_pingfen2"><input
											type="button" title="1"><input type="button"
											title="2"><input type="button" title="3"><input
											type="button" title="4"><input type="button"
											title="5"> </span><span class="left20">5</span>
									</div>
									<div class="ts">
										<span>很差</span><span>差</span><span>一般</span><span>好</span><span>很好</span>
									</div>
								</div>
								<div class="right in_img" id="addpics"></div>
								<form action="/user/addcomment" method="post"
									onsubmit="return postcomment()">
									<textarea id="content" name="content" class="input_style"
										cols="" rows=""
										onFocus="if(this.value == '顺便说几句呗（发布垃圾、广告、色情等信息要关小黑屋的哦，你懂的）') {this.value='';this.style.color='#333'}">顺便说几句呗（发布垃圾、广告、色情等信息要关小黑屋的哦，你懂的）</textarea>
									<div class="ceat top10 tex_hd">
										<div class="left">
											<a class="ex_t" href="javascript:void(0);" title="插入表情"></a>
											<a class="img_t" href="javascript:;" onclick="addpic()"
												title="插入图片"></a><span class="gray3">还可以输入<strong
												id="textnum">1000</strong>个字</span>
										</div>
										<div class="show_exp">
											<b></b>
											<div id="face_tool"></div>
										</div>
										<div class="right">
											同步分享至： <a class="sina_t" href="javascript:;"
												onclick="weibo('sina')" title="新浪微博"></a> <a class="qq_t"
												href="javascript:;" onclick="weibo('tencent')" title="腾讯微博"></a>
											<button class="p_bnt bnt" type="submit">发布</button>
											<a class=" green2 left30 right40 cancel"
												href="javascript:void(0);">取消</a> <input type="hidden"
												name="points" id="points" value="5,5,5,5," /> <input
												type="hidden" name="picids" id="picids" value="" /> <input
												type="hidden" name="weibo_sina" id="weibo_sina" value="0" />
											<input type="hidden" name="weibo_tencent" id="weibo_tencent"
												value="0" /> <input type="hidden" name="shopid" id="shopid"
												value="103898" />
										</div>
									</div>
								</form>
							</div>
						</div>
					</div>
					<div class="pj_tab_menu">
						<span class="size_18 green2 yahe">大家在说…</span>
						<ul id="con_pj_t">
							<a href="javascript:void(0)" onclick="ajaxcomment(1,1)" id="pj1"
								class="hover"><b></b>全部(0)</a>
							<a href="javascript:void(0)" onclick="ajaxcomment(1,2)" id="pj2"><b></b>好评(0)</a>
							<a href="javascript:void(0)" onclick="ajaxcomment(1,3)" id="pj3"><b></b>中评(0)</a>
							<a href="javascript:void(0)" onclick="ajaxcomment(1,4)" id="pj4"><b></b>差评(0)</a>
							<a href="javascript:void(0)" onclick="ajaxcomment(1,5)" id="pj5"><b></b>有图(0)</a>
							<a href="javascript:void(0)" onclick="ajaxcomment(1,6)" id="pj6"><b></b>我的点评(0)</a>
						</ul>
					</div>
					<div class="clear"></div>
					<div class="pj_tab_cont">
						<div id="con_pj_1">
							<img src="/images/loading99.gif" />
						</div>
					</div>
				</div>
			</div>
		</div>
	</section>
	<section>
		<div class="main3" id="04">
			<div class="shop_about">
				<div class="hd">
					<b></b>
					<h3>
						其他<span class="size_24">推荐</span>
					</h3>
				</div>
				<div class="clear"></div>
				<h4 class="top20 left20">周边商户</h4>
				<div class="pp_box_list">
					<a href="javascript:void(0);" id="prev"></a>
					<div id="marquee">
						<ul>
							<li>
								<div class="mod">
									<a class="imgbg" href="/shop109807/"></a>
									<div class="ico">
										<img src="/images/icon/juan_01.gif"><img
											src="/images/icon/juan_02.gif"><img
											src="/images/icon/juan_03.gif">
									</div>
									<div class="img">
										<img
											src="http://upload.ulpos.com/upload/201312/20131210103937.jpg"/ >
									</div>
									<div class="txt">
										<div>
											<span class="km">321m</span><span class="left10 bold"><a
												class="t_link" href="/shop109807/">美之臣国际美容养生会所</a> </span>
										</div>
										<div class="red4">优惠：全单7折</div>
									</div>
								</div>
							</li>
							<li>
								<div class="mod">
									<a class="imgbg" href="/shop109489/"></a>
									<div class="ico">
										<img src="/images/icon/juan_01.gif"><img
											src="/images/icon/juan_02.gif">
									</div>
									<div class="img">
										<img
											src="http://upload.ulpos.com/upload/201312/20131205093321.jpg"/ >
									</div>
									<div class="txt">
										<div>
											<span class="km">381m</span><span class="left10 bold"><a
												class="t_link" href="/shop109489/">吧嗒映像</a> </span>
										</div>
										<div class="red4">优惠：全单7.5折</div>
									</div>
								</div>
							</li>
							<li>
								<div class="mod">
									<a class="imgbg" href="/shop103890/"></a>
									<div class="ico">
										<img src="/images/icon/juan_01.gif">
									</div>
									<div class="img">
										<img
											src="http://upload.ulpos.com/upload/201305/20130509114524.jpg"/ >
									</div>
									<div class="txt">
										<div>
											<span class="km">402m</span><span class="left10 bold"><a
												class="t_link" href="/shop103890/">美宝造型</a> </span>
										</div>
										<div class="red4">优惠：全单8折</div>
									</div>
								</div>
							</li>
							<li>
								<div class="mod">
									<a class="imgbg" href="/shop107512/"></a>
									<div class="ico">
										<img src="/images/icon/juan_01.gif"><img
											src="/images/icon/juan_02.gif">
									</div>
									<div class="img">
										<img
											src="http://upload.ulpos.com/upload/201310/20131014135206.jpg"/ >
									</div>
									<div class="txt">
										<div>
											<span class="km">470m</span><span class="left10 bold"><a
												class="t_link" href="/shop107512/">美人纪婚纱礼服定制</a> </span>
										</div>
										<div class="red4">优惠：全单7折</div>
									</div>
								</div>
							</li>
							<li>
								<div class="mod">
									<a class="imgbg" href="/shop109474/"></a>
									<div class="ico">
										<img src="/images/icon/juan_01.gif"><img
											src="/images/icon/juan_02.gif">
									</div>
									<div class="img">
										<img
											src="http://upload.ulpos.com/upload/201312/20131204160902.jpg"/ >
									</div>
									<div class="txt">
										<div>
											<span class="km">470m</span><span class="left10 bold"><a
												class="t_link" href="/shop109474/">唯度婚礼庆典中心</a> </span>
										</div>
										<div class="red4">优惠：全单8.8折</div>
									</div>
								</div>
							</li>
							<li>
								<div class="mod">
									<a class="imgbg" href="/shop103899/"></a>
									<div class="ico">
										<img src="/images/icon/juan_01.gif">
									</div>
									<div class="img">
										<img
											src="http://upload.ulpos.com/upload/201305/20130510131930.jpg"/ >
									</div>
									<div class="txt">
										<div>
											<span class="km">487m</span><span class="left10 bold"><a
												class="t_link" href="/shop103899/">美国星舞蹈瑜珈培训学校</a> </span>
										</div>
										<div class="red4">优惠：全单8.5折</div>
									</div>
								</div>
							</li>
						</ul>
					</div>
					<a href="javascript:void(0);" id="next"></a>
				</div>
				<h4 class="left20 top20">同类好评商户</h4>
				<div class="pp_box_list">
					<a href="javascript:void(0);" id="prev2"></a>
					<div id="marquee2">
						<ul>
							<li>
								<div class="mod">
									<a class="imgbg" href="/shop108435/"></a>
									<div class="ico">
										<img src="/images/icon/juan_01.gif">
									</div>
									<div class="img">
										<img
											src="http://upload.ulpos.com/upload/201311/20131112113137.jpg"/ >
									</div>
									<div class="txt">
										<div>
											<span class="right right10">东湖区</span><span
												class="left10 bold"><a class="t_link"
												href="/shop108435/">思必客麻辣香锅</a> </span>
										</div>
										<div class="red4">优惠：全单8.8折</div>
									</div>
								</div>
							</li>
							<li>
								<div class="mod">
									<a class="imgbg" href="/shop105415/"></a>
									<div class="ico">
										<img src="/images/icon/juan_01.gif">
									</div>
									<div class="img">
										<img
											src="http://upload.ulpos.com/upload/201307/20130703145437.jpg"/ >
									</div>
									<div class="txt">
										<div>
											<span class="right right10"></span><span class="left10 bold"><a
												class="t_link" href="/shop105415/">小猴子音乐主题餐厅</a> </span>
										</div>
										<div class="red4">优惠：全单9折</div>
									</div>
								</div>
							</li>
							<li>
								<div class="mod">
									<a class="imgbg" href="/shop105482/"></a>
									<div class="ico">
										<img src="/images/icon/juan_01.gif">
									</div>
									<div class="img">
										<img
											src="http://upload.ulpos.com/upload/201307/20130705154649.jpg"/ >
									</div>
									<div class="txt">
										<div>
											<span class="right right10"></span><span class="left10 bold"><a
												class="t_link" href="/shop105482/">德庄火锅动壹店</a> </span>
										</div>
										<div class="red4">优惠：全单9折</div>
									</div>
								</div>
							</li>
							<li>
								<div class="mod">
									<a class="imgbg" href="/shop103589/"></a>
									<div class="ico">
										<img src="/images/icon/juan_01.gif">
									</div>
									<div class="img">
										<img
											src="http://upload.ulpos.com/upload/201305/20130527151731.jpg"/ >
									</div>
									<div class="txt">
										<div>
											<span class="right right10"></span><span class="left10 bold"><a
												class="t_link" href="/shop103589/">重庆刘一手火锅</a> </span>
										</div>
										<div class="red4">优惠：全单9折</div>
									</div>
								</div>
							</li>
							<li>
								<div class="mod">
									<a class="imgbg" href="/shop104264/"></a>
									<div class="ico">
										<img src="/images/icon/juan_01.gif">
									</div>
									<div class="img">
										<img
											src="http://upload.ulpos.com/upload/201305/20130527173422.jpg"/ >
									</div>
									<div class="txt">
										<div>
											<span class="right right10">2店通用</span><span
												class="left10 bold"><a class="t_link"
												href="/shop104264/">御乐记焖锅</a> </span>
										</div>
										<div class="red4">优惠：全单9折</div>
									</div>
								</div>
							</li>
							<li>
								<div class="mod">
									<a class="imgbg" href="/shop104261/"></a>
									<div class="ico">
										<img src="/images/icon/juan_01.gif">
									</div>
									<div class="img">
										<img
											src="http://upload.ulpos.com/upload/201305/20130527172337.jpg"/ >
									</div>
									<div class="txt">
										<div>
											<span class="right right10"></span><span class="left10 bold"><a
												class="t_link" href="/shop104261/">Mr.cake西点屋</a> </span>
										</div>
										<div class="red4">优惠：全单8.8折</div>
									</div>
								</div>
							</li>

						</ul>
					</div>
					<a href="javascript:void(0);" id="next2"></a>
				</div>
			</div>
		</div>
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
	<!-- 0.14891791343689 -->
</body>
</html>