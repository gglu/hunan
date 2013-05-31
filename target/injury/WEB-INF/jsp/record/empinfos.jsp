<%@page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8" %>
<%@taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
<title>工伤职工基本信息</title>
<link href="${pageContext.request.contextPath}/css/dic.css" rel="stylesheet" type="text/css" />
<link href="${pageContext.request.contextPath}/css/style.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="${pageContext.request.contextPath}/js/My97DatePicker/WdatePicker.js"></script>
<meta http-equiv="X-UA-Compatible" content="IE=EmulateIE7" />
</head>
<body>
	<div id="xsnrq">
	<form action="users.do" method="post" id="frm">
		<div class="chaxunzd">
			<ul>
				<li class="li1">
					姓名：<input id="account" name="account" type="text" class="inputtext" value="${accoutn}" />
					身份证号：<input id="locked" name="locked" type="text" class="inputtext" value="${status}" />
					工伤保险号：<input id="locked" name="locked" type="text" class="inputtext" value="${status}" />
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
	<table border="0" class="border-table"  align="center" cellpadding="0" cellspacing="0">
		<tr >
			<td bgcolor="#bdc0ab">
				<table border="0" align="center" cellpadding="0" cellspacing="1" >
					<tr class="szjkzx2">
						<td align="center" bgcolor="#FFFFFF">工伤保险号</td>
						<td align="center" bgcolor="#FFFFFF">姓名</td>
						<td align="center" bgcolor="#FFFFFF">性别</td>
						<td align="center" bgcolor="#FFFFFF">出生年月</td>
						<td align="center" bgcolor="#FFFFFF">民族</td>
						<td align="center" bgcolor="#FFFFFF">电话</td>
						<td align="center" bgcolor="#FFFFFF">查看</td>
					</tr>
					<tr class="szjkzx1">
						<td align="center" bgcolor="#FFFFFF">工伤保险号</td>
						<td align="center" bgcolor="#FFFFFF">姓名</td>
						<td align="center" bgcolor="#FFFFFF">性别</td>
						<td align="center" bgcolor="#FFFFFF">出生年月</td>
						<td align="center" bgcolor="#FFFFFF">民族</td>
						<td align="center" bgcolor="#FFFFFF">电话</td>
						<td align="center" bgcolor="#FFFFFF"><a href="detail.do">查看</a></td>
					</tr>
					<tr class="szjkzx1">
						<td align="center" bgcolor="#FFFFFF">工伤保险号</td>
						<td align="center" bgcolor="#FFFFFF">姓名</td>
						<td align="center" bgcolor="#FFFFFF">性别</td>
						<td align="center" bgcolor="#FFFFFF">出生年月</td>
						<td align="center" bgcolor="#FFFFFF">民族</td>
						<td align="center" bgcolor="#FFFFFF">电话</td>
						<td align="center" bgcolor="#FFFFFF"><a href="detail.do">查看</a></td>
					</tr>
					<tr class="szjkzx1">
						<td align="center" bgcolor="#FFFFFF">工伤保险号</td>
						<td align="center" bgcolor="#FFFFFF">姓名</td>
						<td align="center" bgcolor="#FFFFFF">性别</td>
						<td align="center" bgcolor="#FFFFFF">出生年月</td>
						<td align="center" bgcolor="#FFFFFF">民族</td>
						<td align="center" bgcolor="#FFFFFF">电话</td>
						<td align="center" bgcolor="#FFFFFF"><a href="detail.do">查看</a></td>
					</tr>
					<tr class="szjkzx1">
						<td align="center" bgcolor="#FFFFFF">工伤保险号</td>
						<td align="center" bgcolor="#FFFFFF">姓名</td>
						<td align="center" bgcolor="#FFFFFF">性别</td>
						<td align="center" bgcolor="#FFFFFF">出生年月</td>
						<td align="center" bgcolor="#FFFFFF">民族</td>
						<td align="center" bgcolor="#FFFFFF">电话</td>
						<td align="center" bgcolor="#FFFFFF"><a href="detail.do">查看</a></td>
					</tr>
					<tr class="szjkzx1">
						<td align="center" bgcolor="#FFFFFF">工伤保险号</td>
						<td align="center" bgcolor="#FFFFFF">姓名</td>
						<td align="center" bgcolor="#FFFFFF">性别</td>
						<td align="center" bgcolor="#FFFFFF">出生年月</td>
						<td align="center" bgcolor="#FFFFFF">民族</td>
						<td align="center" bgcolor="#FFFFFF">电话</td>
						<td align="center" bgcolor="#FFFFFF"><a href="detail.do">查看</a></td>
					</tr>
					<tr class="szjkzx1">
						<td align="center" bgcolor="#FFFFFF">工伤保险号</td>
						<td align="center" bgcolor="#FFFFFF">姓名</td>
						<td align="center" bgcolor="#FFFFFF">性别</td>
						<td align="center" bgcolor="#FFFFFF">出生年月</td>
						<td align="center" bgcolor="#FFFFFF">民族</td>
						<td align="center" bgcolor="#FFFFFF">电话</td>
						<td align="center" bgcolor="#FFFFFF"><a href="detail.do">查看</a></td>
					</tr>
					<tr class="szjkzx1">
						<td align="center" bgcolor="#FFFFFF">工伤保险号</td>
						<td align="center" bgcolor="#FFFFFF">姓名</td>
						<td align="center" bgcolor="#FFFFFF">性别</td>
						<td align="center" bgcolor="#FFFFFF">出生年月</td>
						<td align="center" bgcolor="#FFFFFF">民族</td>
						<td align="center" bgcolor="#FFFFFF">电话</td>
						<td align="center" bgcolor="#FFFFFF"><a href="detail.do">查看</a></td>
					</tr>
					<tr class="szjkzx1">
						<td align="center" bgcolor="#FFFFFF">工伤保险号</td>
						<td align="center" bgcolor="#FFFFFF">姓名</td>
						<td align="center" bgcolor="#FFFFFF">性别</td>
						<td align="center" bgcolor="#FFFFFF">出生年月</td>
						<td align="center" bgcolor="#FFFFFF">民族</td>
						<td align="center" bgcolor="#FFFFFF">电话</td>
						<td align="center" bgcolor="#FFFFFF"><a href="detail.do">查看</a></td>
					</tr>
					<tr class="szjkzx1">
						<td align="center" bgcolor="#FFFFFF">工伤保险号</td>
						<td align="center" bgcolor="#FFFFFF">姓名</td>
						<td align="center" bgcolor="#FFFFFF">性别</td>
						<td align="center" bgcolor="#FFFFFF">出生年月</td>
						<td align="center" bgcolor="#FFFFFF">民族</td>
						<td align="center" bgcolor="#FFFFFF">电话</td>
						<td align="center" bgcolor="#FFFFFF"><a href="detail.do">查看</a></td>
					</tr>
					<tr class="szjkzx1">
						<td align="center" bgcolor="#FFFFFF">工伤保险号</td>
						<td align="center" bgcolor="#FFFFFF">姓名</td>
						<td align="center" bgcolor="#FFFFFF">性别</td>
						<td align="center" bgcolor="#FFFFFF">出生年月</td>
						<td align="center" bgcolor="#FFFFFF">民族</td>
						<td align="center" bgcolor="#FFFFFF">电话</td>
						<td align="center" bgcolor="#FFFFFF"><a href="detail.do">查看</a></td>
					</tr>
				</table>
			</td>
		</tr>
	</table>
	</div>
</body>
</html>
