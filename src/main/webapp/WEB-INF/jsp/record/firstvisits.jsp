<%@page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8" %>
<%@taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
<title>系统会员</title>
<link href="${pageContext.request.contextPath}/css/dic.css"
	rel="stylesheet" type="text/css" />
<link href="${pageContext.request.contextPath}/css/style.css"
	rel="stylesheet" type="text/css" />
<script type="text/javascript"
	src="${pageContext.request.contextPath}/js/My97DatePicker/WdatePicker.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery/jquery-1.4.2.min.js"></script>	
<meta http-equiv="X-UA-Compatible" content="IE=EmulateIE7" />
	
</head>
<body>
	<div id="xsnrq">
	<form action="users.do" method="post" id="frm">
		<div class="chaxunzd">
			<ul>
				<li class="li1">
					账号：<input id="account" name="account" type="text" class="inputtext" value="${accoutn}" />
					锁定状态：<input id="locked" name="locked" type="text" class="inputtext" value="${status}" />
				</li>
				<li >
					<div class="buttons">
						<button class="positive" onclick="$('#frm').submit();">查询</button>
						<button class="positive" onclick="return clearForm();">重写</button>
					</div>
				</li>
			</ul>
		</div>
	</form>
	<table border="0" class="border-table" align="center" cellpadding="0" cellspacing="0">
		<tr >
			<td bgcolor="#bdc0ab">
				<table width="800" border="0" align="center" cellpadding="0" cellspacing="1" >
					<tr class="szjkzx2">
						<td align="center" bgcolor="#FFFFFF">编号</td>
						<td align="center" bgcolor="#FFFFFF">账号</td>
						<td align="center" bgcolor="#FFFFFF">锁定状态</td>
						<td align="center" bgcolor="#FFFFFF">电话</td>
						<td align="center" bgcolor="#FFFFFF">部门配置</td>
						<td align="center" bgcolor="#FFFFFF">资源配置</td>
						<td align="center" bgcolor="#FFFFFF">角色配置</td>
					</tr>
					<c:forEach items="${page.data}" var="m">
						<tr class="szjkzx1" bgcolor="#FFFFFF"
							onmouseover="javascript:this.style.backgroundColor='#fffbe6'"
							onmouseout="javascript:this.style.backgroundColor='#FFFFFF'">
							<td align="center">${m.id}</td>
							<td align="center">${m.account}</td>
							<td align="center">${m.email}</td>
							<td align="center">${m.tel}</td>
							<td align="center">${m.locked}</td>
							<td align="center" onclick="reses4usr(${m.id});"><a href="javascript:void(0);">${m.account} --> 资源</a></td>
							<td align="center" onclick="roles4usr(${m.id});"><a href="javascript:void(0);">${m.account} --> 角色</a></td>
						</tr>
					</c:forEach>
				</table>
			</td>
		</tr>
	</table>
	</div>
	
	<!-- ====================角色配置======================= -->
	<div id="editpage" style="display: none;">
	<div id="mask" style="z-index: 999; filter: alpha(opacity = 50); background: #fff; opacity: 0.5; -moz-opacity: 0.5;"></div>
	<div id="beian_popup" style="WIDTH: 600px; border: 10px solid #d9d9d9; z-index: 1000;">
		<!--弹出框-->
		<div style="z-index: 1002; width: 100%; height: 100%; background: #fff;">
			<div style="width: 97%; height: 30px; border-bottom: 3px solid #b0dc60; margin: 0 auto; line-height: 30px;">
				<span style="float: left; font-size: 14px; font-weight: bold;">用户的角色配置</span>
				<span style="float: right; font-size: 12px;margin-top:3px" class="buttons">
					<button class="positive" onClick="assignroles();">保存</button>
					<button class="positive" onClick="$('#editpage').hide();">关闭</button>	
				</span>
			</div>
			<div style="margin: 3 auto;">
				<div id="dcedit">
					<form id="itform" action="assign.do" method="post">
						<input type="hidden" id="userid" name="userid" >
						<table width="100%" border="0" align="center" cellpadding="0" cellspacing="5" style="margin-top:10px;" class="zxtable">
							<tr>
								<div class="chaxunzd">
									<ul>
										<li class="li1">
											<input type="checkbox" name="role" value="1">管理员
										</li>
										<li class="li1">
											<input type="checkbox" value="1">医生
										</li>
									</ul>
								</div>
							</tr>
						</table>
					</form>
				</div>
			</div>
			<div style="width: 97%; height: 40px; border-top: 3px solid #b0dc60; margin: 0 auto; line-height: 40px;">
				<span style="float: left; font-size: 14px; font-weight: bold;"><input type="checkbox" onchange="switchRoles4Check(this);">全部</span>
				<span style="float: right; font-size: 12px;margin-top:10px" class="buttons">
					<button class="positive" onClick="assignroles();">保存</button>
				</span>
			</div>
		</div>
	</div>
</div>
	

</body>
</html>
