<%@page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8" %>
<%@taglib uri="http://www.injury.org/security/tags" prefix="sec"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
<meta http-equiv="X-UA-Compatible" content="IE=EmulateIE7"/>
<title>湖南工伤职工康复管理系统--工伤 康复</title>
<link href="${pageContext.request.contextPath}/css/user.css" rel="stylesheet" type="text/css" />
<script src="${pageContext.request.contextPath}/js/sdmenu.js" type="text/javascript"></script>
<script src="${pageContext.request.contextPath}/js/jquery/jquery-1.4.2.min.js" type="text/javascript"></script>

<script type="text/javascript">
	
	function showtime(){
		var d = new Date();
		var text = d.toLocaleDateString()+" "+d.toLocaleTimeString();
		$("#time").text(text);
		setTimeout("showtime()",1000);
	}
	
	$(document).ready(function(){
		showtime();
	})
	
	
</script>
</head>
<body>
<div id="header">
     <div class="zstop">
          <div class="zuo">欢迎您，当前登录：<sec:currusr loginpage="/login.jsp"/>&nbsp;&nbsp;&nbsp;&nbsp; |  <a href="logout.do">安全退出</a></div>
     </div>
     <div class="logoys">

     </div>
     <div class="hent"><span>温馨提醒您： 当前时间 <span id="time"></span> </span></div>
</div>
<div id="main">
     <div class="zlcd">
          <div class="cdds"><img src="${pageContext.request.contextPath}/images/zsjk04.jpg" width="217" height="10" /></div>
          <div class="cddz">
            <div id="my_menu" class="sdmenu">
                <div class="collapsed"  >
					<span><label onClick="javascript:parent.mainFrame2.location.href='users.do'" >系统会员</label>
					</span>
                </div>
                <div class="collapsed"  >
					<span><label onClick="javascript:parent.mainFrame2.location.href='res/all.do'" >系统资源</label>
					</span>
                </div>
                <div class="collapsed"  >
					<span><label onClick="javascript:parent.mainFrame2.location.href='role/all.do'">系统角色</label>
					</span>
                </div>
                <div class="collapsed"  >
					<span><label onClick="javascript:parent.mainFrame2.location.href='org/all.do'">系统机构</label>
					</span>
                </div>
                <div class="collapsed"  >
					<span><label onClick="javascript:parent.mainFrame2.location.href='dic/all.do'">系统字典</label>
					</span>
                </div>
                <div class="collapsed"  >
					<span><label onClick="javascript:parent.mainFrame2.location.href='emp/all.do'">职工基本信息</label>
					</span>
                </div>
                <div class="collapsed"  >
					<span><label onClick="javascript:parent.mainFrame2.location.href='rec/all.do'">康复职工个案记录</label>
					</span>
                </div>
                <div class="collapsed"  >
					<span><label onClick="javascript:parent.mainFrame2.location.href='rec/fv/all.do'">首访登记</label>
					</span>
                </div>
                <div class="collapsed"  >
					<span><label onClick="javascript:parent.mainFrame2.location.href='rec/fv/all.do'">早期康复介入登记</label>
					</span>
                </div>
                <div class="collapsed"  >
					<span><label onClick="javascript:parent.mainFrame2.location.href='rec/fv/all.do'">入院康复评定记录</label>
					</span>
                </div>
                <div class="collapsed"  >
					<span><label onClick="javascript:parent.mainFrame2.location.href='rec/fv/all.do'">住院康复中期评定</label>
					</span>
                </div>
                <div class="collapsed"  >
					<span><label onClick="javascript:parent.mainFrame2.location.href='rec/fv/all.do'">社会康复预案</label>
					</span>
                </div>
                <div class="collapsed"  >
					<span><label onClick="javascript:parent.mainFrame2.location.href='rec/fv/all.do'">出院后病情回访登记</label>
					</span>
                </div>
                <div class="collapsed"  >
					<span><label onClick="javascript:parent.mainFrame2.location.href='rec/fv/all.do'">职工体检</label>
					</span>
                </div>
                <div class="collapsed"  >
					<span><label onClick="javascript:parent.mainFrame2.location.href='rec/fv/all.do'">旧伤复发审核</label>
					</span>
                </div>
                <div class="collapsed"  >
					<span><label onClick="javascript:parent.mainFrame2.location.href='rec/fv/all.do'">经费使用情况</label>
					</span>
                </div>
          	</div>
          </div>
          <div class="cddx"><img src="${pageContext.request.contextPath}/images/zsjk06.jpg" width="217" height="10" /></div>
     </div>
     
     <div class="ylcd">
          <div class="ybzm" id="iframe"><iframe id="mainFrame2" onload="aa()" style=" WIDTH:98%; border:0; margin:0 4px 0 5px;" scrolling="no" frameborder="0" marginheight="0px" marginwidth="0px" name="mainFrame2" src="users.do"></iframe></div>
          <div style="clear: both;"></div>
     </div>
</div>

<div style="clear:both;"></div>
<div id="footer">
Copyright © 2014 中XXX有限公司</br>
客户服务电话：0756-89968661
</div>
</body>
<script type="text/javascript">
// <![CDATA[
var myMenu;
	window.onload = function() {
	myMenu = new SDMenu("my_menu");
	myMenu.init();
};
function aa(){
	var h = $(window.frames["mainFrame2"].document).find("div").height();
	$("#mainFrame2").height(h+20); 
}


// ]]>
</script>
</html>
