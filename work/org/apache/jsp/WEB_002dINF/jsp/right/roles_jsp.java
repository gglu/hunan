package org.apache.jsp.WEB_002dINF.jsp.right;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class roles_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.release();
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\"/>\n");
      out.write("<title>系统角色</title>\n");
      out.write("<link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/css/dic.css\"\n");
      out.write("\trel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("<link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/css/style.css\"\n");
      out.write("\trel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("<script type=\"text/javascript\"\n");
      out.write("\tsrc=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/js/My97DatePicker/WdatePicker.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/js/jquery/jquery-1.4.2.min.js\"></script>\t\n");
      out.write("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=EmulateIE7\" />\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("\n");
      out.write("\t$(document).ready(function(){\n");
      out.write("\t \t$(\"#frm input\").bind(\"keypress\",function(event){\n");
      out.write("\t \t\tif(13 == event.keyCode){\n");
      out.write("\t \t\t\t$(\"#frm\").submit();\n");
      out.write("\t \t\t}\n");
      out.write("\t \t});\n");
      out.write("\t \t$(\"#dcedit td:even\").css({\"text-align\":\"right\",\"font-size\":\"13px\"});\n");
      out.write("\t });\n");
      out.write("\t \n");
      out.write("\t //锁定或激活角色\n");
      out.write("\t function switchRoleLock(btn,roleid,_enable){\n");
      out.write("\t \tvar enable = _enable;\n");
      out.write("\t \tif($(btn).data(\"enable\") != null){\n");
      out.write("\t \t\tenable = $(btn).data(\"enable\");\n");
      out.write("\t \t}\n");
      out.write("\t \t$.ajax({\n");
      out.write("\t \t\turl:\"switch.do\",\n");
      out.write("\t \t\tdata:{\"roleid\":roleid,\"enable\":!enable},\n");
      out.write("\t \t\tsuccess:function(data){\n");
      out.write("\t \t\t\t$(btn).data(\"enable\",!enable);\n");
      out.write("\t\t \t\tif(enable){\n");
      out.write("\t\t \t\t\t$(btn).text('锁定');\n");
      out.write("\t\t \t\t}else{\n");
      out.write("\t\t \t\t\t$(btn).text('可用');\n");
      out.write("\t\t \t\t}\n");
      out.write("\t \t\t\talert(data);\n");
      out.write("\t \t\t},\n");
      out.write("\t \t\terror:function(){\n");
      out.write("\t\t\t\talert(\"系统正在维护中，请稍后重试！！！\");\t \t\t\n");
      out.write("\t \t\t}\n");
      out.write("\t \t});\n");
      out.write("\t \treturn false;\n");
      out.write("\t }\n");
      out.write("\t \n");
      out.write("\t \n");
      out.write("\t function role4edit(el){\n");
      out.write("\t \t$(\"#res4edit\").hide();\n");
      out.write("\t \t$(\"#editpage\").css({\n");
      out.write("\t \t  display : 'block',\n");
      out.write("\t\t  position:'absolute',\n");
      out.write("\t\t  left: ($(window).width() - $(\"#editpage\").outerWidth())/2,\n");
      out.write("\t\t  top: ($(window).height() - $(\"#editpage\").outerHeight())/2 + $(document).scrollTop()\n");
      out.write("\t\t});\n");
      out.write("\t\t\n");
      out.write("\t\t$(\"#id\").val(\"\");\n");
      out.write("\t\t$(\"#rolename\").val(\"\");\n");
      out.write("\t\t$(\"#rolecode\").val(\"\");\n");
      out.write("\t\t\n");
      out.write("\t\t$.each($(el).siblings(),function(i,n){\n");
      out.write(" \t\t\tif(i == 0)\n");
      out.write(" \t\t\t\t$(\"#id\").val($(n).text());\n");
      out.write(" \t\t\telse if(i == 1)\n");
      out.write(" \t\t\t\t$(\"#rolecode\").val($(n).text());\n");
      out.write(" \t\t\telse if(i == 2)\n");
      out.write(" \t\t\t\t$(\"#rolename\").val($(n).text());\n");
      out.write(" \t\t});\n");
      out.write("\t\t\n");
      out.write("\t\t$(\"#itform\").attr(\"action\",\"edit.do\");\n");
      out.write("\t }\n");
      out.write("\t \n");
      out.write("\t function role4add(){\n");
      out.write("\t \t$(\"#res4edit\").hide();\n");
      out.write("\t \t$(\"#editpage\").css({\n");
      out.write("\t \t  display : 'block',\n");
      out.write("\t\t  position:'absolute',\n");
      out.write("\t\t  left: ($(window).width() - $(\"#editpage\").outerWidth())/2,\n");
      out.write("\t\t  top: ($(window).height() - $(\"#editpage\").outerHeight())/2 + $(document).scrollTop()\n");
      out.write("\t\t});\n");
      out.write("\t\t\n");
      out.write("\t\t$(\"#id\").val(\"\");\n");
      out.write("\t\t$(\"#rolename\").val(\"\");\n");
      out.write("\t\t$(\"#rolecode\").val(\"\");\n");
      out.write("\t\t\n");
      out.write("\t\t$(\"#itform\").attr(\"action\",\"add.do\");\n");
      out.write("\t }\n");
      out.write("\t \n");
      out.write("\t function saverole(){\n");
      out.write("\t \t\n");
      out.write("\t \t//做一些简单的js校验\n");
      out.write("\t \t\n");
      out.write("\t \t$(\"#itform\").submit();\n");
      out.write("\t }\n");
      out.write("\t \n");
      out.write("\t function res4rolepage(roleid){\n");
      out.write("\t \t$(\"#editpage\").hide();\n");
      out.write("\t \t$(\"#res4edit\").css({\n");
      out.write("\t \t  display : 'block',\n");
      out.write("\t\t  position:'absolute',\n");
      out.write("\t\t  left: ($(window).width() - $(\"#res4edit\").outerWidth())/2,\n");
      out.write("\t\t  top: ($(window).height() - $(\"#res4edit\").outerHeight())/10 + $(document).scrollTop()\n");
      out.write("\t\t});\n");
      out.write("\t\t\n");
      out.write("\t\t$.ajax({\n");
      out.write("\t\t\turl:\"../res/reses4role.do?roleid=\"+roleid,\n");
      out.write("\t\t\tdataType:\"json\",\n");
      out.write("\t\t\tsuccess:function(data){\n");
      out.write("\t\t\t\t$(\"#resedit ul\").empty();\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\tvar originalreses = new Array(0);\n");
      out.write("\t\t\t\t$(\"#resedit\").data(\"originalreses\",originalreses);\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t$(\"#resedit\").data(\"roleid\",roleid);\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t$.each(data,function(i,r){\n");
      out.write("\t\t\t\t\tvar str = \"<li><input type=checkbox value=\"+r.id;\n");
      out.write("\t\t\t\t\tif(r.checked){\n");
      out.write("\t\t\t\t\t\tstr += \" checked=checked\";\n");
      out.write("\t\t\t\t\t\t$(\"#resedit\").data(\"originalreses\").push(r.id);\n");
      out.write("\t\t\t\t\t}\n");
      out.write("\t\t\t\t\tstr += \">\"+r.name+\"(\"+r.url+\")\"+\"</li>\";\n");
      out.write("\t\t\t\t\t$(str).appendTo($(\"#resedit ul\"));\n");
      out.write("\t\t\t\t});\n");
      out.write("\t\t\t},\n");
      out.write("\t\t\terror:function(){\n");
      out.write("\t\t\t\talert(\"系统维护中，请稍后重试！！！\");\n");
      out.write("\t\t\t}\n");
      out.write("\t\t});\n");
      out.write("\t }\n");
      out.write("\t \n");
      out.write("\t //保存角色资源关联关系\n");
      out.write("\t function assignreses(){\n");
      out.write("\t \tvar roleid = $(\"#resedit\").data(\"roleid\");\n");
      out.write("\t\tvar originalreses = $(\"#resedit\").data(\"originalreses\");\n");
      out.write("\t\tvar unassigned = new Array();//被撤销的角色\n");
      out.write("\t\tvar newassigned = new Array();//新赋予的角色\n");
      out.write("\t\t$.each($(\"#resedit :checkbox\"),function(){\n");
      out.write("\t\t\tvar resid = this.value;\n");
      out.write("\t\t\tif(this.checked){\n");
      out.write("\t\t\t\tif(indexOf(resid,originalreses)<0)\n");
      out.write("\t\t\t\t\tnewassigned.push(resid);\n");
      out.write("\t\t\t}else{\n");
      out.write("\t\t\t\tif(indexOf(resid,originalreses) > -1){\n");
      out.write("\t\t\t\t\tunassigned.push(resid);\n");
      out.write("\t\t\t\t}\n");
      out.write("\t\t\t}\n");
      out.write("\t\t});\n");
      out.write("\t\t\n");
      out.write("\t\t\n");
      out.write("\t\t$.ajax({\n");
      out.write("\t\t\turl:\"assign.do\",\n");
      out.write("\t\t\tdata:{roleid:roleid,unassigned:unassigned.join(','),newassigned:newassigned.join(',')},\n");
      out.write("\t\t\tsuccess:function(data){\n");
      out.write("\t\t\t\talert(data);\n");
      out.write("\t\t\t},\n");
      out.write("\t\t\terror:function(){\n");
      out.write("\t\t\t\talert(\"系统维护中，请稍后重试！！！\");\n");
      out.write("\t\t\t}\t\t\n");
      out.write("\t\t});\n");
      out.write("\t\t\n");
      out.write("\t\t//$(\"#itform\").submit();\n");
      out.write("\t }\n");
      out.write("\t \n");
      out.write("\t function indexOf(value,array){\n");
      out.write("\t\tvar index = -1;\n");
      out.write("\t\t$.each(array,function(i,n){\n");
      out.write("\t\t\tif(value == n){\n");
      out.write("\t\t\t\tindex = i;\n");
      out.write("\t\t\t}\n");
      out.write("\t\t});\n");
      out.write("\t\treturn index;\n");
      out.write("\t}\n");
      out.write("\t\n");
      out.write("\tfunction switchReses4Check(e){\n");
      out.write("\t\tvar checked = e.checked;\n");
      out.write("\t\t$.each($(\"#resedit :checkbox\"),function(i,e){\n");
      out.write("\t\t\te.checked = checked;\n");
      out.write("\t\t});\n");
      out.write("\t}\n");
      out.write("\t \n");
      out.write("</script>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\t<div id=\"xsnrq\">\n");
      out.write("\t<form action=\"all.do\" method=\"post\" id=\"frm\">\n");
      out.write("\t\t<div class=\"chaxunzd\">\n");
      out.write("\t\t\t<ul>\n");
      out.write("\t\t\t\t<li class=\"li1\">\n");
      out.write("\t\t\t\t\t角色名称：<input id=\"account\" name=\"name\" type=\"text\" class=\"inputtext\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${name}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" />\n");
      out.write("\t\t\t\t\t角色代码：<input id=\"status\" name=\"code\" type=\"text\" class=\"inputtext\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${code}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" />\n");
      out.write("\t\t\t\t</li>\n");
      out.write("\t\t\t\t<li >\n");
      out.write("\t\t\t\t\t<div class=\"buttons\">\n");
      out.write("\t\t\t\t\t\t<button class=\"positive\" onclick=\"$('#frm').submit();\">查询</button>\n");
      out.write("\t\t\t\t\t\t<button class=\"positive\" onclick=\"return clearForm();\">重写</button>\n");
      out.write("\t\t\t\t\t\t<a class=\"positive\" onclick=\"return role4add();\">新建</a>\n");
      out.write("\t\t\t\t\t\t<button class=\"positive\" onclick=\"window.open('");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/logout.do');\">注销</button>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</li>\n");
      out.write("\t\t\t</ul>\n");
      out.write("\t\t</div>\n");
      out.write("\t</form>\n");
      out.write("\t<table border=\"0\" class=\"border-table\" align=\"center\" cellpadding=\"0\" cellspacing=\"0\">\n");
      out.write("\t\t<tr >\n");
      out.write("\t\t\t<td bgcolor=\"#bdc0ab\">\n");
      out.write("\t\t\t\t<table width=\"800\" border=\"0\" align=\"center\" cellpadding=\"0\" cellspacing=\"1\" >\n");
      out.write("\t\t\t\t\t<tr class=\"szjkzx2\">\n");
      out.write("\t\t\t\t\t\t<td align=\"center\" bgcolor=\"#FFFFFF\">编号</td>\n");
      out.write("\t\t\t\t\t\t<td align=\"center\" bgcolor=\"#FFFFFF\">代码</td>\n");
      out.write("\t\t\t\t\t\t<td align=\"center\" bgcolor=\"#FFFFFF\">名称</td>\n");
      out.write("\t\t\t\t\t\t<td align=\"center\" bgcolor=\"#FFFFFF\">是否可用</td>\n");
      out.write("\t\t\t\t\t\t<td align=\"center\" bgcolor=\"#FFFFFF\">编辑角色</td>\n");
      out.write("\t\t\t\t\t\t<td align=\"center\" bgcolor=\"#FFFFFF\">权限配置</td>\n");
      out.write("\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t\t");
      if (_jspx_meth_c_005fforEach_005f0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\t\t\t\t</table>\n");
      out.write("\t\t\t</td>\n");
      out.write("\t\t</tr>\n");
      out.write("\t</table>\n");
      out.write("\t</div>\n");
      out.write("\t\n");
      out.write("\t<!-- ====================角色关联资源======================= -->\n");
      out.write("\t<div id=\"res4edit\" style=\"display: none;\">\n");
      out.write("\t<div id=\"mask\" style=\"z-index: 999; filter: alpha(opacity = 50); background: #fff; opacity: 0.5; -moz-opacity: 0.5;\"></div>\n");
      out.write("\t<div id=\"beian_popup\" style=\"WIDTH: 600px; border: 10px solid #d9d9d9; z-index: 1000;\">\n");
      out.write("\t\t<!--弹出框-->\n");
      out.write("\t\t<div style=\"z-index: 1002; width: 100%; height: 100%; background: #fff;\">\n");
      out.write("\t\t\t<div style=\"width: 97%; height: 30px; border-bottom: 3px solid #b0dc60; margin: 0 auto; line-height: 30px;\">\n");
      out.write("\t\t\t\t<span style=\"float: left; font-size: 14px; font-weight: bold;\">资源编辑</span>\n");
      out.write("\t\t\t\t<span style=\"float: right; font-size: 12px;margin-top:3px\" class=\"buttons\">\n");
      out.write("\t\t\t\t\t<button class=\"positive\" onClick=\"assignreses();\">保存</button>\n");
      out.write("\t\t\t\t\t<button class=\"positive\" onClick=\"$('#res4edit').hide();\">关闭</button>\t\n");
      out.write("\t\t\t\t</span>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div style=\"margin: 3 auto;\">\n");
      out.write("\t\t\t\t<div id=\"resedit\" >\n");
      out.write("\t\t\t\t\t<div class=\"chaxunzd\">\n");
      out.write("\t\t\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div style=\"width: 97%; height: 40px; border-top: 3px solid #b0dc60; margin: 0 auto; line-height: 40px;\">\n");
      out.write("\t\t\t\t<span style=\"float: left; font-size: 14px; font-weight: bold;\"><input type=\"checkbox\" onchange=\"switchReses4Check(this);\">全部</span>\n");
      out.write("\t\t\t\t<span style=\"float: right; font-size: 12px;margin-top:10px\" class=\"buttons\">\n");
      out.write("\t\t\t\t\t<button class=\"positive\" onClick=\"assignreses();\">保存</button>\n");
      out.write("\t\t\t\t</span>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("</div>\n");
      out.write("\t\n");
      out.write("\t\n");
      out.write("\t<!-- ====================角色配置======================= -->\n");
      out.write("\t<div id=\"editpage\" style=\"display: none;\">\n");
      out.write("\t\t<div style=\"filter: alpha(opacity = 50); background: #fff; opacity: 0.5; -moz-opacity: 0.5;\"></div>\n");
      out.write("\t\t<div style=\"WIDTH: 600px; border: 10px solid #d9d9d9;\">\n");
      out.write("\t\t<!--弹出框-->\n");
      out.write("\t\t<div style=\"width: 100%; height: 100%; background: #fff;\">\n");
      out.write("\t\t\t<div style=\"width: 97%; height: 30px; border-bottom: 3px solid #b0dc60; margin: 0 auto; line-height: 30px;\">\n");
      out.write("\t\t\t\t<span style=\"float: left; font-size: 14px; font-weight: bold;\">用户的角色配置</span>\n");
      out.write("\t\t\t\t<span style=\"float: right; font-size: 12px;margin-top:3px\" class=\"buttons\">\n");
      out.write("\t\t\t\t\t<button class=\"positive\" onClick=\"saverole();\">保存</button>\n");
      out.write("\t\t\t\t\t<button class=\"positive\" onClick=\"$('#editpage').hide();\">关闭</button>\t\n");
      out.write("\t\t\t\t</span>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div style=\"margin: 3 auto;\">\n");
      out.write("\t\t\t\t<div id=\"dcedit\">\n");
      out.write("\t\t\t\t\t<form id=\"itform\" action=\"\" method=\"post\">\n");
      out.write("\t\t\t\t\t\t<table width=\"100%\" border=\"0\" align=\"center\" cellpadding=\"0\" cellspacing=\"5\" style=\"margin-top:10px;\" class=\"zxtable\">\n");
      out.write("\t\t\t\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"chaxunzd\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<input type=\"hidden\" id=\"id\" name=\"id\" class=\"inputtext\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${detail.id }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" /> \n");
      out.write("\t\t\t\t\t\t\t\t\t\t角色名字 <input type=\"text\" id=\"rolename\" name=\"name\" class=\"inputtext\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${detail.itemtype }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" />\n");
      out.write("\t\t\t\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t角色代码 <input type=\"text\" id=\"rolecode\" name=\"code\" class=\"inputtext\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${detail.itemtype }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" />\n");
      out.write("\t\t\t\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t\t\t</table>\n");
      out.write("\t\t\t\t\t</form>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div style=\"width: 97%; height: 40px; border-top: 3px solid #b0dc60; margin: 0 auto; line-height: 40px;\">\n");
      out.write("\t\t\t\t<span style=\"float: right; font-size: 12px;margin-top:10px\" class=\"buttons\">\n");
      out.write("\t\t\t\t\t<button class=\"positive\" onClick=\"saverole();\">保存</button>\n");
      out.write("\t\t\t\t</span>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("\t</div>\n");
      out.write("\t\n");
      out.write("\t\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else log(t.getMessage(), t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_005fforEach_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f0.setParent(null);
    // /WEB-INF/jsp/right/roles.jsp(220,5) name = items type = java.lang.Object reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${page.data}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    // /WEB-INF/jsp/right/roles.jsp(220,5) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setVar("r");
    int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
      if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("\t\t\t\t\t\t<tr class=\"szjkzx1\" bgcolor=\"#FFFFFF\"\n");
          out.write("\t\t\t\t\t\t\tonmouseover=\"javascript:this.style.backgroundColor='#fffbe6'\"\n");
          out.write("\t\t\t\t\t\t\tonmouseout=\"javascript:this.style.backgroundColor='#FFFFFF'\">\n");
          out.write("\t\t\t\t\t\t\t<td align=\"center\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${r.id}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</td>\n");
          out.write("\t\t\t\t\t\t\t<td align=\"center\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${r.roleCode}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</td>\n");
          out.write("\t\t\t\t\t\t\t<td align=\"center\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${r.roleName}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</td>\n");
          out.write("\t\t\t\t\t\t\t<td class=\"buttons\" align=\"center\" >\n");
          out.write("\t\t\t\t\t\t\t\t<button class=\"positive\" onclick=\"return switchRoleLock(this,");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${r.id}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write(',');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${r.locked}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write(");\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${r.locked}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write('"');
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${r.locked ? '锁定':'可用'}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</button>\n");
          out.write("\t\t\t\t\t\t\t</td>\n");
          out.write("\t\t\t\t\t\t\t<td align=\"center\" onclick=\"role4edit(this)\"><a href=\"javascript:void(0);\">编辑-->");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${r.roleName}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</a></td>\n");
          out.write("\t\t\t\t\t\t\t<td align=\"center\" onclick=\"res4rolepage(");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${r.id}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write(")\"><a href=\"javascript:void(0);\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${r.roleName}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write(" --> 资源</a></td>\n");
          out.write("\t\t\t\t\t\t</tr>\n");
          out.write("\t\t\t\t\t");
          int evalDoAfterBody = _jspx_th_c_005fforEach_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fforEach_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_005fforEach_005f0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_005fforEach_005f0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_005fforEach_005f0.doFinally();
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f0);
    }
    return false;
  }
}
