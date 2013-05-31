package org.apache.jsp.WEB_002dINF.jsp.record;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class empdetail_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
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
      out.write("<title>工伤职工基本信息</title>\n");
      out.write("<link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/css/dic.css\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("<link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/css/style.css\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/js/My97DatePicker/WdatePicker.js\"></script>\n");
      out.write("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=EmulateIE7\" />\n");
      out.write("<style type=\"text/css\">\n");
      out.write("\t.szjkzx99{\n");
      out.write("\t\tcolor:#333333; line-height:45px;font-size:13px;\n");
      out.write("\t}\n");
      out.write("</style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\t<div id=\"xsnrq\">\n");
      out.write("\t<form action=\"users.do\" method=\"post\" id=\"frm\">\n");
      out.write("\t\t<div class=\"chaxunzd\">\n");
      out.write("\t\t\t<ul>\n");
      out.write("\t\t\t\t<li class=\"li1\">\n");
      out.write("\t\t\t\t\txxx的基本信息\n");
      out.write("\t\t\t\t</li>\n");
      out.write("\t\t\t</ul>\n");
      out.write("\t\t</div>\n");
      out.write("\t</form>\n");
      out.write("\t<table border=\"0\" class=\"border-table\"  align=\"center\" cellpadding=\"0\" cellspacing=\"0\">\n");
      out.write("\t\t<tr >\n");
      out.write("\t\t\t<td bgcolor=\"#bdc0ab\">\n");
      out.write("\t\t\t\t<table border=\"0\" align=\"center\" cellpadding=\"0\" cellspacing=\"1\" >\n");
      out.write("\t\t\t\t\t<tr class=\"szjkzx99\">\n");
      out.write("\t\t\t\t\t\t<td align=\"center\" bgcolor=\"#FFFFFF\">姓名</td>\n");
      out.write("\t\t\t\t\t\t<td align=\"center\" bgcolor=\"#FFFFFF\">性别</td>\n");
      out.write("\t\t\t\t\t\t<td align=\"center\" bgcolor=\"#FFFFFF\" rowspan=\"3\">照片</td>\n");
      out.write("\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t\t<tr class=\"szjkzx99\">\n");
      out.write("\t\t\t\t\t\t<td align=\"center\" bgcolor=\"#FFFFFF\">民族</td>\n");
      out.write("\t\t\t\t\t\t<td align=\"center\" bgcolor=\"#FFFFFF\">出生年月\t</td>\n");
      out.write("\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t\t<tr class=\"szjkzx99\">\n");
      out.write("\t\t\t\t\t\t<td align=\"center\" bgcolor=\"#FFFFFF\" colspan=\"2\">身份证号</td>\n");
      out.write("\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t</table>\n");
      out.write("\t\t\t</td>\n");
      out.write("\t\t</tr>\n");
      out.write("\t\t<tr>\n");
      out.write("\t\t\t<td bgcolor=\"#bdc0ab\">\n");
      out.write("\t\t\t\t<table border=\"0\" align=\"center\" cellpadding=\"0\" cellspacing=\"1\" >\n");
      out.write("\t\t\t\t\t<tr class=\"szjkzx99\">\n");
      out.write("\t\t\t\t\t\t<td align=\"center\" bgcolor=\"#FFFFFF\">工伤保险号</td>\n");
      out.write("\t\t\t\t\t\t<td align=\"center\" bgcolor=\"#FFFFFF\">工伤保险号</td>\n");
      out.write("\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t\t<tr class=\"szjkzx99\">\n");
      out.write("\t\t\t\t\t\t<td align=\"center\" bgcolor=\"#FFFFFF\">工伤保险号</td>\n");
      out.write("\t\t\t\t\t\t<td align=\"center\" bgcolor=\"#FFFFFF\">工伤保险号</td>\n");
      out.write("\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t\t<tr class=\"szjkzx99\">\n");
      out.write("\t\t\t\t\t\t<td align=\"center\" bgcolor=\"#FFFFFF\">工伤保险号</td>\n");
      out.write("\t\t\t\t\t\t<td align=\"center\" bgcolor=\"#FFFFFF\">工伤保险号</td>\n");
      out.write("\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t\t<tr class=\"szjkzx99\">\n");
      out.write("\t\t\t\t\t\t<td align=\"center\" bgcolor=\"#FFFFFF\">工伤保险号</td>\n");
      out.write("\t\t\t\t\t\t<td align=\"center\" bgcolor=\"#FFFFFF\">工伤保险号</td>\n");
      out.write("\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t\t<tr class=\"szjkzx99\">\n");
      out.write("\t\t\t\t\t\t<td align=\"center\" bgcolor=\"#FFFFFF\">工伤保险号</td>\n");
      out.write("\t\t\t\t\t\t<td align=\"center\" bgcolor=\"#FFFFFF\">工伤保险号</td>\n");
      out.write("\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t\t<tr class=\"szjkzx99\">\n");
      out.write("\t\t\t\t\t\t<td align=\"center\" bgcolor=\"#FFFFFF\">工伤保险号</td>\n");
      out.write("\t\t\t\t\t\t<td align=\"center\" bgcolor=\"#FFFFFF\">工伤保险号</td>\n");
      out.write("\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t\t<tr class=\"szjkzx99\">\n");
      out.write("\t\t\t\t\t\t<td align=\"center\" bgcolor=\"#FFFFFF\">工伤保险号</td>\n");
      out.write("\t\t\t\t\t\t<td align=\"center\" bgcolor=\"#FFFFFF\">工伤保险号</td>\n");
      out.write("\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t\t<tr class=\"szjkzx99\">\n");
      out.write("\t\t\t\t\t\t<td align=\"center\" bgcolor=\"#FFFFFF\">工伤保险号</td>\n");
      out.write("\t\t\t\t\t\t<td align=\"center\" bgcolor=\"#FFFFFF\">工伤保险号</td>\n");
      out.write("\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t</table>\n");
      out.write("\t\t\t</td>\n");
      out.write("\t\t</tr>\n");
      out.write("\t\t<tr>\n");
      out.write("\t\t\t<td bgcolor=\"#bdc0ab\">\n");
      out.write("\t\t\t\t<table border=\"0\" align=\"center\" cellpadding=\"0\" cellspacing=\"1\" >\n");
      out.write("\t\t\t\t\t<tr class=\"szjkzx99\">\n");
      out.write("\t\t\t\t\t\t<td align=\"center\" bgcolor=\"#FFFFFF\">父亲</td>\n");
      out.write("\t\t\t\t\t\t<td align=\"center\" bgcolor=\"#FFFFFF\">工伤保险号</td>\n");
      out.write("\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t\t<tr class=\"szjkzx99\">\n");
      out.write("\t\t\t\t\t\t<td align=\"center\" bgcolor=\"#FFFFFF\">母亲</td>\n");
      out.write("\t\t\t\t\t\t<td align=\"center\" bgcolor=\"#FFFFFF\">工伤保险号</td>\n");
      out.write("\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t</table>\n");
      out.write("\t\t\t</td>\n");
      out.write("\t\t</tr>\n");
      out.write("\t</table>\n");
      out.write("\t</div>\n");
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
}
