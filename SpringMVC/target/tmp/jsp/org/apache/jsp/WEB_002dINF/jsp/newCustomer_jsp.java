package org.apache.jsp.WEB_002dINF.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class newCustomer_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
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
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write('\r');
      out.write('\n');

	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<base href=\"");
      out.print(basePath);
      out.write("\">\r\n");
      out.write("\r\n");
      out.write("<title>My JSP 'newCustomer.jsp' starting page</title>\r\n");
      out.write("\r\n");
      out.write("<meta http-equiv=\"pragma\" content=\"no-cache\">\r\n");
      out.write("<meta http-equiv=\"cache-control\" content=\"no-cache\">\r\n");
      out.write("<meta http-equiv=\"expires\" content=\"0\">\r\n");
      out.write("<meta http-equiv=\"keywords\" content=\"keyword1,keyword2,keyword3\">\r\n");
      out.write("<meta http-equiv=\"description\" content=\"This is my page\">\r\n");
      out.write("<!--\r\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"styles.css\">\r\n");
      out.write("\t-->\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("\thref=\"//cdn.bootcss.com/bootstrap/3.3.5/css/bootstrap.min.css\">\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("\thref=\"//cdn.bootcss.com/bootstrap/3.3.5/css/bootstrap-theme.min.css\">\r\n");
      out.write("<script src=\"//cdn.bootcss.com/jquery/1.11.3/jquery.min.js\"></script>\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("\thref=\"//cdnjs.cloudflare.com/ajax/libs/bootstrap-table/1.11.0/bootstrap-table.min.css\">\r\n");
      out.write("<script\r\n");
      out.write("\tsrc=\"//cdnjs.cloudflare.com/ajax/libs/bootstrap-table/1.11.0/bootstrap-table.min.js\"></script>\r\n");
      out.write("<script\r\n");
      out.write("\tsrc=\"//cdnjs.cloudflare.com/ajax/libs/bootstrap-table/1.11.0/locale/bootstrap-table-zh-CN.min.js\"></script>\r\n");
      out.write("<script src=\"//cdn.bootcss.com/bootstrap/3.3.5/js/bootstrap.min.js\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("\t<div style=\"height:50px;background:#3366FF;margin-top:-20px\">\r\n");
      out.write("\t\t<h2 style=\"padding-top:10px;\">电影租赁管理系统</h2>\r\n");
      out.write("\t\t<span style=\"float:right;margin-top:-30px;\">您好!");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${customer.firstName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</span>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div style=\"width:20%;float:left\">\r\n");
      out.write("\t\t<ul class=\"nav nav-pills nav-stacked\">\r\n");
      out.write("\t\t\t<li role=\"presentation\" class=\"active\"><a href=\"#\">Customer管理</a></li>\r\n");
      out.write("\t\t\t<li role=\"presentation\"><a href=\"#\">Film设置</a></li>\r\n");
      out.write("\r\n");
      out.write("\t\t</ul>\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("\t<div style=\"width:80%;float:left\">\r\n");
      out.write("\t\t<h3>创建Customer</h3>\r\n");
      out.write("\t\t<hr style=\"height:1px;border:none;border-top:1px solid #555555;\" />\r\n");
      out.write("\r\n");
      out.write("\t\t<h4>基本信息</h4>\r\n");
      out.write("\r\n");
      out.write("        <div>\r\n");
      out.write("        <form class=\"form-horizontal\" action=\"");
      out.print( request.getContextPath());
      out.write("/customer/save\" method=\"post\">\r\n");
      out.write("  <div class=\"form-group\">\r\n");
      out.write("    <label for=\"inputEmail3\" class=\"col-sm-2 control-label\">First Name</label>\r\n");
      out.write("    <div class=\"col-sm-4\">\r\n");
      out.write("      <input type=\"text\" name=\"firstName\" class=\"form-control\" id=\"inputEmail3\" placeholder=\"First Name\">\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("  <div class=\"form-group\">\r\n");
      out.write("    <label for=\"inputPassword3\" class=\"col-sm-2 control-label\">Last Name</label>\r\n");
      out.write("    <div class=\"col-sm-4\">\r\n");
      out.write("      <input type=\"text\" name=\"lastName\" class=\"form-control\" id=\"inputPassword3\" placeholder=\"Last Name\">\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("   <div class=\"form-group\">\r\n");
      out.write("    <label for=\"inputPassword3\" class=\"col-sm-2 control-label\">Email</label>\r\n");
      out.write("    <div class=\"col-sm-4\">\r\n");
      out.write("      <input type=\"text\" name=\"email\" class=\"form-control\" id=\"inputPassword3\" placeholder=\"Email\">\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("  \r\n");
      out.write("  <div class=\"form-group\">\r\n");
      out.write("    <div class=\"col-sm-offset-2\">\r\n");
      out.write("      <button type=\"submit\" class=\"btn btn-primary\">新建</button>\r\n");
      out.write("      <button onclick=\"location='");
      out.print( request.getContextPath());
      out.write("/hello/checkLogin' \" class=\"btn btn-default\">取消</button>\r\n");
      out.write("    </div>\r\n");
      out.write("   \r\n");
      out.write("  </div>\r\n");
      out.write("</form>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
