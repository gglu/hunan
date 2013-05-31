<%@page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8" %>
<%@taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
<title>系统资源</title>
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
	 
	 
	 //根据会员id，为该会员配置角色
	function roles4res(resourceid){
		
		$("#editpage").css({
	 	  display : 'block',
		  position:'absolute',
		  left: ($(window).width() - $("#editpage").outerWidth())/2,
		  top: ($(window).height() - $("#editpage").outerHeight())/2 + $(document).scrollTop()
		});
	
		//获取角色
		$.ajax({
			dataType:"json",
			url:"../role/roles4res.do?resourceid="+resourceid,
			success:function(data){
				//清空上次请求产生的内容
				$("#itform ul").empty();
				var originalroles = new Array(0);
				$("#itform").data("originalroles",originalroles);
				
				$("#itform").data("resourceid",resourceid);
				
				var str = "";
				$.each(data,function(){
					str += "<li class=li1 ><input type=checkbox name=roles ";
						if(this.checked){
							str += "checked=checked";
							$("#itform").data("originalroles").push(this.id);
						}
					str+=" value="+this.id+">"+this.name+"</li>";
				});
				
				$(str).appendTo($("#itform ul"));
			},
			error:function(req,e){
				alert(e.message+"系统维护中，请稍后重试！！！");
			}
		});
	}
	
	function assignroles(){
		var resourceid = $("#itform").data("resourceid");
		var originalroles = $("#itform").data("originalroles");
		var unassigned = new Array();//被撤销的角色
		var newassigned = new Array();//新赋予的角色
		$.each($("#itform :checkbox"),function(){
			var roleid = this.value;
			if(this.checked){
				if(indexOf(roleid,originalroles)<0)
					newassigned.push(roleid);
			}else{
				if(indexOf(roleid,originalroles) > -1){
					unassigned.push(roleid);
				}
			}
		});
		
		
		$.ajax({
			url:"assign.do",
			data:{resourceid:resourceid,unassigned:unassigned.join(','),newassigned:newassigned.join(',')},
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
	
	function switchRoles4Check(e){
		var checked = e.checked;
		$.each($("#itform :checkbox"),function(i,e){
			e.checked = checked;
		});
	}
	
	
	function res4edit(el,flag){
		$("#res4edit").css({
	 	  display : 'block',
		  position:'absolute',
		  left: ($(window).width() - $("#res4edit").outerWidth())/2,
		  top: ($(window).height() - $("#res4edit").outerHeight())/2 + $(document).scrollTop()
		});
		$("#id").val("");
		$("#name").val("");
		$("#type").val("");
		$("#url").val("");
		$("#className").val("");
		$("#methodName").val("");
		if(flag){
			$.each($(el).siblings(),function(i,n){
	 			if(i == 0)
	 				$("#id").val($(n).text());
	 			else if(i == 1)
	 				$("#name").val($(n).text());
	 			else if(i == 2)
	 				$("#type").val($(n).text()=='网站URI'?0:1);
	 			else if(i == 3)
	 				$("#url").val($(n).text());
	 			else if(i == 4)
	 				$("#className").val($(n).text());
	 			else if(i == 5)
	 				$("#methodName").val($(n).text());
	 		});
			
			$("#editform").attr("action","edit.do");	
		}else{
			$("#editform").attr("action","add.do");	
		}
	}
	
	
	//锁定或激活资源
	 function switchRoleLock(btn,resourceid,_enable){
	 	var enable = _enable;
	 	if($(btn).data("enable") != null){
	 		enable = $(btn).data("enable");
	 	}
	 	$.ajax({
	 		url:"switch.do",
	 		data:{"resourceid":resourceid,"enable":!enable},
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
	 
	 
	 function saveres(){
	 	//做一些简单的js校验

	 	$("#editform").submit();
	 }

</script>
</head>
<body>
	<div id="xsnrq">
	<form action="all.do" method="post" id="frm">
		<div class="chaxunzd">
			<ul>
				<li class="li1">
					资源名称：<input id="paraname" name="name" type="text" class="inputtext" value="${accoutn}" />
					资源类别：<input id="paratype" name="type" type="text" class="inputtext" value="${status}" />
				</li>
				<li >
					<div class="buttons">
						<button class="positive" onclick="$('#frm').submit();">查询</button>
						<button class="positive" onclick="return clearForm();">重写</button>
						<a class="positive" onclick="return res4edit();">新增</a>
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
						<td align="center" bgcolor="#FFFFFF">资源编号</td>
						<td align="center" bgcolor="#FFFFFF">资源名称</td>
						<td align="center" bgcolor="#FFFFFF">资源类型</td>
						<td align="center" bgcolor="#FFFFFF">资源路径</td>
						<td align="center" bgcolor="#FFFFFF">类名称</td>
						<td align="center" bgcolor="#FFFFFF">方法名称</td>
						<td align="center" bgcolor="#FFFFFF">是否可用</td>
						<td align="center" bgcolor="#FFFFFF">编辑</td>
						<td align="center" bgcolor="#FFFFFF">角色配置</td>
					</tr>
					<c:forEach items="${reses}" var="r">
						<tr class="szjkzx1" bgcolor="#FFFFFF"
							onmouseover="javascript:this.style.backgroundColor='#fffbe6'"
							onmouseout="javascript:this.style.backgroundColor='#FFFFFF'">
							<td align="center">${r.id}</td>
							<td align="center">${r.name}</td>
							<td align="center">${r.type eq 0 ?'网站URI':'业务方法'}</td>
							<td align="center">${r.url}</td>
							<td align="center">${r.className}</td>
							<td align="center">${r.methodName}</td>
							<td align="center" class="buttons">
								<button class="positive" onclick="return switchRoleLock(this,${r.id},${r.enable});" value="${r.enable}">${r.enable ? '可用':'锁定'}</button>
							</td>
							<td align="center" class="buttons" onclick="return res4edit(this,true);"} >
								<button class="positive" >编辑</button>
							</td>
							<td align="center" onclick="roles4res(${r.id});"><a href="javascript:void(0);">${r.name} --> 资源</a></td>
						</tr>
					</c:forEach>
				</table>
			</td>
		</tr>
	</table>
	</div>
	
	<!-- ====================资源编辑======================= -->
	<div id="res4edit" style="display: none;">
	<div id="mask" style="z-index: 999; filter: alpha(opacity = 50); background: #fff; opacity: 0.5; -moz-opacity: 0.5;"></div>
	<div id="beian_popup" style="WIDTH: 600px; border: 10px solid #d9d9d9; z-index: 1000;">
		<!--弹出框-->
		<div style="z-index: 1002; width: 100%; height: 100%; background: #fff;">
			<div style="width: 97%; height: 30px; border-bottom: 3px solid #b0dc60; margin: 0 auto; line-height: 30px;">
				<span style="float: left; font-size: 14px; font-weight: bold;">资源编辑</span>
				<span style="float: right; font-size: 12px;margin-top:3px" class="buttons">
					<button class="positive" onClick="saveres();">保存</button>
					<button class="positive" onClick="$('#res4edit').hide();">关闭</button>	
				</span>
			</div>
			<div style="margin: 3 auto;">
				<div id="dcedit">
					<form id="editform" action="" method="post">
						<input type="hidden" id="id" name="id" >
						<table width="100%" border="0" align="center" cellpadding="0" cellspacing="5" style="margin-top:10px;" class="zxtable">
							<tr>
								<td >资源名称：</td>
								<td >
									<input type="text" id="name" name="name" class="inputtext" value="${detail.itemtype }" />
								</td>
							</tr>
							<tr>
								<td >资源类型：</td>
								<td >
									<input type="text" id="type" name="type" class="inputtext" value="${detail.itemtype }" />
								</td>
							</tr>
							<tr>
								<td >资源路径：</td>
								<td >
									<input type="text" id="url" name="url" class="inputtext" value="${detail.itemtype }" />
								</td>
							</tr>
							<tr>
								<td >类名称：</td>
								<td >
									<input type="text" id="className" name="className" class="inputtext" value="${detail.itemtype }" />
								</td>
							</tr>
							<tr>
								<td >方法名称：</td>
								<td >
									<input type="text" id="methodName" name="methodName" class="inputtext" value="${detail.itemtype }" />
								</td>
							</tr>
						</table>
					</form>
				</div>
			</div>
			<div style="width: 97%; height: 40px; border-top: 3px solid #b0dc60; margin: 0 auto; line-height: 40px;">
				<span style="float: right; font-size: 12px;margin-top:10px" class="buttons">
					<button class="positive" onClick="saveres();">保存</button>
				</span>
			</div>
		</div>
	</div>
</div>

<!-- ====================角色配置======================= -->
	<div id="editpage" style="display: none;">
	<div id="mask" style="z-index: 999; filter: alpha(opacity = 50); background: #fff; opacity: 0.5; -moz-opacity: 0.5;"></div>
	<div id="beian_popup" style="WIDTH: 600px; border: 10px solid #d9d9d9; z-index: 1000;">
		<!--弹出框-->
		<div style="z-index: 1002; width: 100%; height: 100%; background: #fff;">
			<div style="width: 97%; height: 30px; border-bottom: 3px solid #b0dc60; margin: 0 auto; line-height: 30px;">
				<span style="float: left; font-size: 14px; font-weight: bold;">角色配置</span>
				<span style="float: right; font-size: 12px;margin-top:3px" class="buttons">
					<button class="positive" onClick="assignroles();">保存</button>
					<button class="positive" onClick="$('#editpage').hide();">关闭</button>	
				</span>
			</div>
			<div style="margin: 3 auto;">
				<div id="dcedit">
					<form id="itform" action="assign.do" method="post">
						<input type="hidden" id="resource" name="resourcesid" >
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
