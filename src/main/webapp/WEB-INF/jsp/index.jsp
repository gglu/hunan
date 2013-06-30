<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://www.injury.org/security/tags" prefix="sec"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>jQuery EasyUI</title>
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath }/js/jquery/themes/default/easyui.css">
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath }/js/jquery/themes/icon.css">
<script type="text/javascript"
	src="${pageContext.request.contextPath }/js/jquery/jquery-1.4.4.min.js"></script>
<script type="text/javascript"
	src="${pageContext.request.contextPath }/js/jquery/jquery.easyui.min.js"></script>
<script>
	
	function showtime(){
		var d = new Date();
		var text = d.toLocaleDateString()+" "+d.toLocaleTimeString();
		$("#time").text(text);
		setTimeout("showtime()",1000);
	}

	$(function() {
		
		showtime();
		$('#tt2').datagrid({
			title : 'My Title',
			iconCls : 'icon-save',
			width : 600,
			height : 350,
			nowrap : false,
			striped : true,
			fit : true,
			url : 'datagrid_data.json',
			sortName : 'code',
			sortOrder : 'desc',
			idField : 'code',
			frozenColumns : [ [ {
				field : 'ck',
				checkbox : true
			}, {
				title : 'code',
				field : 'code',
				width : 80,
				sortable : true
			} ] ],
			columns : [ [ {
				title : 'Base Information',
				colspan : 3
			}, {
				field : 'opt',
				title : 'Operation',
				width : 100,
				align : 'center',
				rowspan : 2,
				formatter : function(value, rec) {
					return '<span style="color:red">Edit Delete</span>';
				}
			} ], [ {
				field : 'name',
				title : 'Name',
				width : 120
			}, {
				field : 'addr',
				title : 'Address',
				width : 120,
				rowspan : 2,
				sortable : true
			}, {
				field : 'col4',
				title : 'Col41',
				width : 150,
				rowspan : 2
			} ] ],
			pagination : true,
			rownumbers : true
		});

		$("#tabs").tabs({
			tools : [ {
				iconCls : 'icon-add',
				handler : function() {
					alert('add');
				}
			}, {
				iconCls : 'icon-save',
				handler : function() {
					alert('save');
				}
			} ]
		});

	});

	function addtab(index) {
		$("#tabs").tabs('add', {
			title : 'New Tab ',
			content : 'Tab Body ',
			iconCls : 'icon-save',
			closable : true
		});
	}
</script>
</head>
<body class="easyui-layout">
	<div id="mymenu" style="width: 150px;">
		<div>item1</div>
		<div>item2</div>
	</div>
	<div region="north" title="湖南职工康复管理系统" style="height: 100px; padding: 10px; background: #efefef;" split="true" >
		<div class="zuo">欢迎您，当前登录：<sec:currusr loginpage="/login.jsp"/>&nbsp;&nbsp;&nbsp;&nbsp; |  <a href="logout.do">安全退出</a></div>
		<div class="hent"><span>温馨提醒您： 当前时间 <span id="time"></span> </span></div>
	</div>
	<div region="south" title="South Title" split="true"
		style="height: 100px; padding: 10px; background: #efefef;">
		<div class="easyui-layout" fit="true" style="background: #ccc;">
			<div region="center">sub center</div>
			<div region="east" split="true" style="width: 200px;">sub
				center</div>
		</div>
	</div>
	<div region="east" iconCls="icon-reload" title="待办事宜" split="true"
		style="width: 180px;">
		<ul class="easyui-tree" url="tree_data.json"></ul>
	</div>
	<div region="west" split="true" title="系统操作"
		style="width: 180px; padding1: 1px; overflow: hidden;">
		<div class="easyui-accordion" fit="true" border="false">
			<div title="康复个案记录" style="padding: 10px">
				<a href="#" class="easyui-linkbutton" iconCls="icon-save">康复职工基本信息</a><br>
				<a href="#" class="easyui-linkbutton" iconCls="icon-save">康复职工个案记录</a><br>
				<a href="#" class="easyui-linkbutton" iconCls="icon-save">首访登记</a><br>
				<a href="#" class="easyui-linkbutton" iconCls="icon-save">早期康复介入登记</a><br>
				<a href="#" class="easyui-linkbutton" iconCls="icon-save">入院康复评定</a><br>
				<a href="#" class="easyui-linkbutton" iconCls="icon-save">住院康复中期评定</a><br>
				<a href="#" class="easyui-linkbutton" iconCls="icon-save">社会康复预案</a><br>
				<a href="#" class="easyui-linkbutton" iconCls="icon-save">出院后病情回访登记</a><br>
				<a href="#" class="easyui-linkbutton" iconCls="icon-save">职工体检</a><br>
				<a href="#" class="easyui-linkbutton" iconCls="icon-save">旧伤复发审核</a><br>
				<a href="#" class="easyui-linkbutton" iconCls="icon-save">经费使用情况</a><br>
			</div>
			<div title="报表统计分析" style="padding: 10px;">
				<a href="#" class="easyui-linkbutton" iconCls="icon-save">伤病类型</a><br>
				<a href="#" class="easyui-linkbutton" iconCls="icon-save">工伤时间分布</a><br>
				<a href="#" class="easyui-linkbutton" iconCls="icon-save">职业类型</a><br>
				<a href="#" class="easyui-linkbutton" iconCls="icon-save">区域分布</a><br>
				<a href="#" class="easyui-linkbutton" iconCls="icon-save">年龄分布</a><br>
			</div>
			<div title="系统维护" style="padding: 10px;">
				<a href="#" class="easyui-linkbutton" iconCls="icon-save">帐号维护</a><br>
				<a href="#" class="easyui-linkbutton" iconCls="icon-save">密码修改</a><br>
				<a href="#" class="easyui-linkbutton" iconCls="icon-save">系统机构</a><br>
				<a href="#" class="easyui-linkbutton" iconCls="icon-save">系统人员</a><br>
				<a href="#" class="easyui-linkbutton" iconCls="icon-save">系统角色</a><br>
				<a href="#" class="easyui-linkbutton" iconCls="icon-save">系统资源</a><br>
				<a href="#" class="easyui-linkbutton" iconCls="icon-save">系统权限</a><br>
				<a href="#" class="easyui-linkbutton" iconCls="icon-save">数据字典</a><br>
				<a href="#" class="easyui-linkbutton" iconCls="icon-save">数据库维护</a><br>
			</div>
		</div>
	</div>
	<div region="center" title="操作仪版表" style="overflow: hidden;">
		<div id="tabs" class="easyui-tabs" fit="true" border="false">
			<div title="Tab1" style="padding: 20px; overflow: hidden;">
				<div style="margin-top: 20px;">
					<h3>jQuery EasyUI framework help you build your web page
						easily.</h3>
					<li>easyui is a collection of user-interface plugin based on
						jQuery.</li>
					<li>using easyui you don't write many javascript code, instead
						you defines user-interface by writing some HTML markup.</li>
					<li>easyui is very easy but powerful.</li>
				</div>
			</div>
			<div title="Tab2" closable="true" style="padding: 20px;">This
				is Tab2 width close button.</div>
			<div title="Tab3" icon="icon-reload" closable="true"
				style="overflow: hidden; padding: 5px;">
				<table id="tt2"></table>
			</div>
		</div>
	</div>
</body>
</html>