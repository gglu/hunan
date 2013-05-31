<%@page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8" %>
<%@taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
<title>系统角色</title>
<link href="${pageContext.request.contextPath}/css/dic.css"
	rel="stylesheet" type="text/css" />
<link href="${pageContext.request.contextPath}/css/style.css"
	rel="stylesheet" type="text/css" />
<script type="text/javascript"
	src="${pageContext.request.contextPath}/js/My97DatePicker/WdatePicker.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery/jquery-1.4.2.min.js"></script>	
<meta http-equiv="X-UA-Compatible" content="IE=EmulateIE7" />
<script type="text/javascript">

	$(document).ready(function(){
	 	$("#frm input").bind("keypress",function(event){
	 		if(13 == event.keyCode){
	 			$("#frm").submit();
	 		}
	 	});
	 	$("#dcedit td:even").css({"text-align":"right","font-size":"13px"});
	 });
	 
	 //锁定或激活角色
	 function switchRoleLock(btn,roleid,_enable){
	 	var enable = _enable;
	 	if($(btn).data("enable") != null){
	 		enable = $(btn).data("enable");
	 	}
	 	$.ajax({
	 		url:"switch.do",
	 		data:{"roleid":roleid,"enable":!enable},
	 		success:function(data){
	 			$(btn).data("enable",!enable);
		 		if(enable){
		 			$(btn).text('锁定');
		 		}else{
		 			$(btn).text('可用');
		 		}
	 			alert(data);
	 		},
	 		error:function(){
				alert("系统正在维护中，请稍后重试！！！");	 		
	 		}
	 	});
	 	return false;
	 }
	 
	 
	 function role4edit(el){
	 	$("#res4edit").hide();
	 	$("#editpage").css({
	 	  display : 'block',
		  position:'absolute',
		  left: ($(window).width() - $("#editpage").outerWidth())/2,
		  top: ($(window).height() - $("#editpage").outerHeight())/2 + $(document).scrollTop()
		});
		
		$("#id").val("");
		$("#rolename").val("");
		$("#rolecode").val("");
		
		$.each($(el).siblings(),function(i,n){
 			if(i == 0)
 				$("#id").val($(n).text());
 			else if(i == 1)
 				$("#rolecode").val($(n).text());
 			else if(i == 2)
 				$("#rolename").val($(n).text());
 		});
		
		$("#itform").attr("action","edit.do");
	 }
	 
	 function role4add(){
	 	$("#res4edit").hide();
	 	$("#editpage").css({
	 	  display : 'block',
		  position:'absolute',
		  left: ($(window).width() - $("#editpage").outerWidth())/2,
		  top: ($(window).height() - $("#editpage").outerHeight())/2 + $(document).scrollTop()
		});
		
		$("#id").val("");
		$("#rolename").val("");
		$("#rolecode").val("");
		
		$("#itform").attr("action","add.do");
	 }
	 
	 function saverole(){
	 	
	 	//做一些简单的js校验
	 	
	 	$("#itform").submit();
	 }
	 
	 function res4rolepage(roleid){
	 	$("#editpage").hide();
	 	$("#res4edit").css({
	 	  display : 'block',
		  position:'absolute',
		  left: ($(window).width() - $("#res4edit").outerWidth())/2,
		  top: ($(window).height() - $("#res4edit").outerHeight())/10 + $(document).scrollTop()
		});
		
		$.ajax({
			url:"../res/reses4role.do?roleid="+roleid,
			dataType:"json",
			success:function(data){
				$("#resedit ul").empty();
				
				var originalreses = new Array(0);
				$("#resedit").data("originalreses",originalreses);
				
				$("#resedit").data("roleid",roleid);
				
				$.each(data,function(i,r){
					var str = "<li><input type=checkbox value="+r.id;
					if(r.checked){
						str += " checked=checked";
						$("#resedit").data("originalreses").push(r.id);
					}
					str += ">"+r.name+"("+r.url+")"+"</li>";
					$(str).appendTo($("#resedit ul"));
				});
			},
			error:function(){
				alert("系统维护中，请稍后重试！！！");
			}
		});
	 }
	 
	 //保存角色资源关联关系
	 function assignreses(){
	 	var roleid = $("#resedit").data("roleid");
		var originalreses = $("#resedit").data("originalreses");
		var unassigned = new Array();//被撤销的角色
		var newassigned = new Array();//新赋予的角色
		$.each($("#resedit :checkbox"),function(){
			var resid = this.value;
			if(this.checked){
				if(indexOf(resid,originalreses)<0)
					newassigned.push(resid);
			}else{
				if(indexOf(resid,originalreses) > -1){
					unassigned.push(resid);
				}
			}
		});
		
		
		$.ajax({
			url:"assign.do",
			data:{roleid:roleid,unassigned:unassigned.join(','),newassigned:newassigned.join(',')},
			success:function(data){
				alert(data);
			},
			error:function(){
				alert("系统维护中，请稍后重试！！！");
			}		
		});
		
		//$("#itform").submit();
	 }
	 
	 function indexOf(value,array){
		var index = -1;
		$.each(array,function(i,n){
			if(value == n){
				index = i;
			}
		});
		return index;
	}
	
	function switchReses4Check(e){
		var checked = e.checked;
		$.each($("#resedit :checkbox"),function(i,e){
			e.checked = checked;
		});
	}
	 
</script>
</head>
<body>
	<div id="xsnrq">
	<form action="all.do" method="post" id="frm">
		<div class="chaxunzd">
			<ul>
				<li class="li1">
					角色名称：<input id="account" name="name" type="text" class="inputtext" value="${name}" />
					角色代码：<input id="status" name="code" type="text" class="inputtext" value="${code}" />
				</li>
				<li >
					<div class="buttons">
						<button class="positive" onclick="$('#frm').submit();">查询</button>
						<button class="positive" onclick="return clearForm();">重写</button>
						<a class="positive" onclick="return role4add();">新建</a>
						<button class="positive" onclick="window.open('${pageContext.request.contextPath}/logout.do');">注销</button>
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
						<td align="center" bgcolor="#FFFFFF">代码</td>
						<td align="center" bgcolor="#FFFFFF">名称</td>
						<td align="center" bgcolor="#FFFFFF">是否可用</td>
						<td align="center" bgcolor="#FFFFFF">编辑角色</td>
						<td align="center" bgcolor="#FFFFFF">权限配置</td>
					</tr>
					<c:forEach items="${page.data}" var="r">
						<tr class="szjkzx1" bgcolor="#FFFFFF"
							onmouseover="javascript:this.style.backgroundColor='#fffbe6'"
							onmouseout="javascript:this.style.backgroundColor='#FFFFFF'">
							<td align="center">${r.id}</td>
							<td align="center">${r.roleCode}</td>
							<td align="center">${r.roleName}</td>
							<td class="buttons" align="center" >
								<button class="positive" onclick="return switchRoleLock(this,${r.id},${r.locked});" value="${r.locked}">${r.locked ? '锁定':'可用'}</button>
							</td>
							<td align="center" onclick="role4edit(this)"><a href="javascript:void(0);">编辑-->${r.roleName}</a></td>
							<td align="center" onclick="res4rolepage(${r.id})"><a href="javascript:void(0);">${r.roleName} --> 资源</a></td>
						</tr>
					</c:forEach>
				</table>
			</td>
		</tr>
	</table>
	</div>
	
	<!-- ====================角色关联资源======================= -->
	<div id="res4edit" style="display: none;">
	<div id="mask" style="z-index: 999; filter: alpha(opacity = 50); background: #fff; opacity: 0.5; -moz-opacity: 0.5;"></div>
	<div id="beian_popup" style="WIDTH: 600px; border: 10px solid #d9d9d9; z-index: 1000;">
		<!--弹出框-->
		<div style="z-index: 1002; width: 100%; height: 100%; background: #fff;">
			<div style="width: 97%; height: 30px; border-bottom: 3px solid #b0dc60; margin: 0 auto; line-height: 30px;">
				<span style="float: left; font-size: 14px; font-weight: bold;">资源编辑</span>
				<span style="float: right; font-size: 12px;margin-top:3px" class="buttons">
					<button class="positive" onClick="assignreses();">保存</button>
					<button class="positive" onClick="$('#res4edit').hide();">关闭</button>	
				</span>
			</div>
			<div style="margin: 3 auto;">
				<div id="resedit" >
					<div class="chaxunzd">
						<ul>
							
						</ul>
					</div>
				</div>
			</div>
			<div style="width: 97%; height: 40px; border-top: 3px solid #b0dc60; margin: 0 auto; line-height: 40px;">
				<span style="float: left; font-size: 14px; font-weight: bold;"><input type="checkbox" onchange="switchReses4Check(this);">全部</span>
				<span style="float: right; font-size: 12px;margin-top:10px" class="buttons">
					<button class="positive" onClick="assignreses();">保存</button>
				</span>
			</div>
		</div>
	</div>
</div>
	
	
	<!-- ====================角色配置======================= -->
	<div id="editpage" style="display: none;">
		<div style="filter: alpha(opacity = 50); background: #fff; opacity: 0.5; -moz-opacity: 0.5;"></div>
		<div style="WIDTH: 600px; border: 10px solid #d9d9d9;">
		<!--弹出框-->
		<div style="width: 100%; height: 100%; background: #fff;">
			<div style="width: 97%; height: 30px; border-bottom: 3px solid #b0dc60; margin: 0 auto; line-height: 30px;">
				<span style="float: left; font-size: 14px; font-weight: bold;">用户的角色配置</span>
				<span style="float: right; font-size: 12px;margin-top:3px" class="buttons">
					<button class="positive" onClick="saverole();">保存</button>
					<button class="positive" onClick="$('#editpage').hide();">关闭</button>	
				</span>
			</div>
			<div style="margin: 3 auto;">
				<div id="dcedit">
					<form id="itform" action="" method="post">
						<table width="100%" border="0" align="center" cellpadding="0" cellspacing="5" style="margin-top:10px;" class="zxtable">
							<tr>
								<div class="chaxunzd">
									<ul>
										<input type="hidden" id="id" name="id" class="inputtext" value="${detail.id }" /> 
										角色名字 <input type="text" id="rolename" name="name" class="inputtext" value="${detail.itemtype }" />
									</ul>
									<ul>
										角色代码 <input type="text" id="rolecode" name="code" class="inputtext" value="${detail.itemtype }" />
									</ul>
								</div>
							</tr>
						</table>
					</form>
				</div>
			</div>
			<div style="width: 97%; height: 40px; border-top: 3px solid #b0dc60; margin: 0 auto; line-height: 40px;">
				<span style="float: right; font-size: 12px;margin-top:10px" class="buttons">
					<button class="positive" onClick="saverole();">保存</button>
				</span>
			</div>
		</div>
	</div>
	</div>
	
	

</body>
</html>
