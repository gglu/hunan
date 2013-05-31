package org.apache.jsp.WEB_002dINF.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(1);
    _jspx_dependants.add("/WEB-INF/right.tld");
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fsec_005fcurrusr_0026_005floginpage_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fsec_005fcurrusr_0026_005floginpage_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fsec_005fcurrusr_0026_005floginpage_005fnobody.release();
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
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\n");
      out.write("<head>\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\"/>\n");
      out.write("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=EmulateIE7\"/>\n");
      out.write("<title>湖南工伤职工康复管理系统--工伤 康复</title>\n");
      out.write("<link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/css/user.css\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/js/sdmenu.js\" type=\"text/javascript\"></script>\n");
      out.write("<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/js/jquery/jquery-1.4.2.min.js\" type=\"text/javascript\"></script>\n");
      out.write("\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("\t\n");
      out.write("\tfunction showtime(){\n");
      out.write("\t\tvar d = new Date();\n");
      out.write("\t\tvar text = d.toLocaleDateString()+\" \"+d.toLocaleTimeString();\n");
      out.write("\t\t$(\"#time\").text(text);\n");
      out.write("\t\tsetTimeout(\"showtime()\",1000);\n");
      out.write("\t}\n");
      out.write("\t\n");
      out.write("\t$(document).ready(function(){\n");
      out.write("\t\tshowtime();\n");
      out.write("\t})\n");
      out.write("\t\n");
      out.write("\t\n");
      out.write("</script>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<div id=\"header\">\n");
      out.write("     <div class=\"zstop\">\n");
      out.write("          <div class=\"zuo\">欢迎您，当前登录：");
      if (_jspx_meth_sec_005fcurrusr_005f0(_jspx_page_context))
        return;
      out.write("&nbsp;&nbsp;&nbsp;&nbsp; |  <a href=\"logout.do\">安全退出</a></div>\n");
      out.write("     </div>\n");
      out.write("     <div class=\"logoys\">\n");
      out.write("\n");
      out.write("     </div>\n");
      out.write("     <div class=\"hent\"><span>温馨提醒您： 当前时间 <span id=\"time\"></span> </span></div>\n");
      out.write("</div>\n");
      out.write("<div id=\"main\">\n");
      out.write("     <div class=\"zlcd\">\n");
      out.write("          <div class=\"cdds\"><img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/images/zsjk04.jpg\" width=\"217\" height=\"10\" /></div>\n");
      out.write("          <div class=\"cddz\">\n");
      out.write("            <div id=\"my_menu\" class=\"sdmenu\">\n");
      out.write("                <div class=\"collapsed\"  >\n");
      out.write("\t\t\t\t\t<span><label onClick=\"javascript:parent.mainFrame2.location.href='users.do'\" >系统会员</label>\n");
      out.write("\t\t\t\t\t</span>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"collapsed\"  >\n");
      out.write("\t\t\t\t\t<span><label onClick=\"javascript:parent.mainFrame2.location.href='res/all.do'\" >系统资源</label>\n");
      out.write("\t\t\t\t\t</span>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"collapsed\"  >\n");
      out.write("\t\t\t\t\t<span><label onClick=\"javascript:parent.mainFrame2.location.href='role/all.do'\">系统角色</label>\n");
      out.write("\t\t\t\t\t</span>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"collapsed\"  >\n");
      out.write("\t\t\t\t\t<span><label onClick=\"javascript:parent.mainFrame2.location.href='org/all.do'\">系统机构</label>\n");
      out.write("\t\t\t\t\t</span>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"collapsed\"  >\n");
      out.write("\t\t\t\t\t<span><label onClick=\"javascript:parent.mainFrame2.location.href='dic/all.do'\">系统字典</label>\n");
      out.write("\t\t\t\t\t</span>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"collapsed\"  >\n");
      out.write("\t\t\t\t\t<span><label onClick=\"javascript:parent.mainFrame2.location.href='emp/all.do'\">职工基本信息</label>\n");
      out.write("\t\t\t\t\t</span>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"collapsed\"  >\n");
      out.write("\t\t\t\t\t<span><label onClick=\"javascript:parent.mainFrame2.location.href='rec/all.do'\">康复职工个案记录</label>\n");
      out.write("\t\t\t\t\t</span>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"collapsed\"  >\n");
      out.write("\t\t\t\t\t<span><label onClick=\"javascript:parent.mainFrame2.location.href='rec/fv/all.do'\">首访登记</label>\n");
      out.write("\t\t\t\t\t</span>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"collapsed\"  >\n");
      out.write("\t\t\t\t\t<span><label onClick=\"javascript:parent.mainFrame2.location.href='rec/fv/all.do'\">早期康复介入登记</label>\n");
      out.write("\t\t\t\t\t</span>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"collapsed\"  >\n");
      out.write("\t\t\t\t\t<span><label onClick=\"javascript:parent.mainFrame2.location.href='rec/fv/all.do'\">入院康复评定记录</label>\n");
      out.write("\t\t\t\t\t</span>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"collapsed\"  >\n");
      out.write("\t\t\t\t\t<span><label onClick=\"javascript:parent.mainFrame2.location.href='rec/fv/all.do'\">住院康复中期评定</label>\n");
      out.write("\t\t\t\t\t</span>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"collapsed\"  >\n");
      out.write("\t\t\t\t\t<span><label onClick=\"javascript:parent.mainFrame2.location.href='rec/fv/all.do'\">社会康复预案</label>\n");
      out.write("\t\t\t\t\t</span>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"collapsed\"  >\n");
      out.write("\t\t\t\t\t<span><label onClick=\"javascript:parent.mainFrame2.location.href='rec/fv/all.do'\">出院后病情回访登记</label>\n");
      out.write("\t\t\t\t\t</span>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"collapsed\"  >\n");
      out.write("\t\t\t\t\t<span><label onClick=\"javascript:parent.mainFrame2.location.href='rec/fv/all.do'\">职工体检</label>\n");
      out.write("\t\t\t\t\t</span>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"collapsed\"  >\n");
      out.write("\t\t\t\t\t<span><label onClick=\"javascript:parent.mainFrame2.location.href='rec/fv/all.do'\">旧伤复发审核</label>\n");
      out.write("\t\t\t\t\t</span>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"collapsed\"  >\n");
      out.write("\t\t\t\t\t<span><label onClick=\"javascript:parent.mainFrame2.location.href='rec/fv/all.do'\">经费使用情况</label>\n");
      out.write("\t\t\t\t\t</span>\n");
      out.write("                </div>\n");
      out.write("          \t</div>\n");
      out.write("          </div>\n");
      out.write("          <div class=\"cddx\"><img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/images/zsjk06.jpg\" width=\"217\" height=\"10\" /></div>\n");
      out.write("     </div>\n");
      out.write("     \n");
      out.write("     <div class=\"ylcd\">\n");
      out.write("          <div class=\"ybzm\" id=\"iframe\"><iframe id=\"mainFrame2\" onload=\"aa()\" style=\" WIDTH:98%; border:0; margin:0 4px 0 5px;\" scrolling=\"no\" frameborder=\"0\" marginheight=\"0px\" marginwidth=\"0px\" name=\"mainFrame2\" src=\"users.do\"></iframe></div>\n");
      out.write("          <div style=\"clear: both;\"></div>\n");
      out.write("     </div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<div style=\"clear:both;\"></div>\n");
      out.write("<div id=\"footer\">\n");
      out.write("Copyright © 2014 中XXX有限公司</br>\n");
      out.write("客户服务电话：0756-89968661\n");
      out.write("</div>\n");
      out.write("</body>\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("// <![CDATA[\n");
      out.write("var myMenu;\n");
      out.write("\twindow.onload = function() {\n");
      out.write("\tmyMenu = new SDMenu(\"my_menu\");\n");
      out.write("\tmyMenu.init();\n");
      out.write("};\n");
      out.write("function aa(){\n");
      out.write("\tvar h = $(window.frames[\"mainFrame2\"].document).find(\"div\").height();\n");
      out.write("\t$(\"#mainFrame2\").height(h+20); \n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write("// ]]>\n");
      out.write("</script>\n");
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

  private boolean _jspx_meth_sec_005fcurrusr_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sec:currusr
    com.soft.hunan.injury.ss3.tag.InjuryCurrentUserTag _jspx_th_sec_005fcurrusr_005f0 = (com.soft.hunan.injury.ss3.tag.InjuryCurrentUserTag) _005fjspx_005ftagPool_005fsec_005fcurrusr_0026_005floginpage_005fnobody.get(com.soft.hunan.injury.ss3.tag.InjuryCurrentUserTag.class);
    _jspx_th_sec_005fcurrusr_005f0.setPageContext(_jspx_page_context);
    _jspx_th_sec_005fcurrusr_005f0.setParent(null);
    // /WEB-INF/jsp/index.jsp(32,36) name = loginpage type = String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_sec_005fcurrusr_005f0.setLoginpage("/login.jsp");
    int _jspx_eval_sec_005fcurrusr_005f0 = _jspx_th_sec_005fcurrusr_005f0.doStartTag();
    if (_jspx_th_sec_005fcurrusr_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fsec_005fcurrusr_0026_005floginpage_005fnobody.reuse(_jspx_th_sec_005fcurrusr_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fsec_005fcurrusr_0026_005floginpage_005fnobody.reuse(_jspx_th_sec_005fcurrusr_005f0);
    return false;
  }
}
