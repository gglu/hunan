package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html; charset=utf-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\n");
      out.write("<head id=\"Head1\"><title>\n");
      out.write("\t湖南工伤康复管理系统--登陆页\n");
      out.write("</title>\n");
      out.write("\n");
      out.write("<link href=\"css/log.css\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("\t\n");
      out.write("</script>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <form name=\"form1\" method=\"post\" action=\"log.do\" id=\"logform\">\n");
      out.write("\t    <div class=\"leftform\">\n");
      out.write("\t        <div class=\"conLeftForm\"></div>\n");
      out.write("\t    </div>\n");
      out.write("\t    <div class=\"rightform\">\n");
      out.write("\t        <div class=\"conRightForm\">\n");
      out.write("\t            <div class=\"dataForm\">\n");
      out.write("\t                <ul>\n");
      out.write("\t                    <li class=\"dataTitle\">湖南工伤康复管理系统 -- >登陆</li>                    \n");
      out.write("\t                    <li class=\"inputstyle\">\n");
      out.write("\t                    \t<span>帐 号：</span>\n");
      out.write("\t                        <input name=\"username\" type=\"text\" id=\"username\" class=\"FormBase\" onfocus=\"this.className='FormFocus';\" onblur=\"this.className='FormBase';\" style=\"width:135px;\" />\n");
      out.write("\t                    </li>\n");
      out.write("\t                    <li class=\"inputstyle\">\n");
      out.write("\t                    \t<span>密 码：</span>\n");
      out.write("\t                        <input name=\"password\" type=\"password\" id=\"password\" class=\"FormBase\" onfocus=\"this.className='FormFocus';\" onblur=\"this.className='FormBase';\" style=\"width:135px;\" />\n");
      out.write("\t\t\t\t\t\t</li>\n");
      out.write("\t                    <li class=\"step_1\">\n");
      out.write("\t                        <input type=\"submit\" value=\"登陆\" />\n");
      out.write("\t                    </li>\n");
      out.write("\t                </ul>\n");
      out.write("\t            </div>\n");
      out.write("\t        </div>\n");
      out.write("\t    </div>\n");
      out.write("\t    <div class=\"bottomclass\" style=\"text-align: center\">\n");
      out.write("\t        <span id=\"Label4\">CopyRight © 2013 xxxxx有限公司</span>\n");
      out.write("\t    </div>\n");
      out.write("\t</form>\n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write("\n");
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
