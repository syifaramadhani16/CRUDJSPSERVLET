package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class product_005findex_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Product Management</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1>List All Product</h1>\n");
      out.write("        <a href=\"http://");
 out.println(request.getServerName()); 
      out.write(":8080/4SCPJSPServlet\n");
      out.write("        /Product_Create\">+ Add Product</a><br><br>\n");
      out.write("        \n");
      out.write("        <table border=\"1\" cellpadding=\"10\" cellspacing=\"0\">\n");
      out.write("            <thead>\n");
      out.write("                <tr>\n");
      out.write("                    <th>ID Product</th>\n");
      out.write("                    <th>Nama</th>\n");
      out.write("                    <th>Stok</th>\n");
      out.write("                    <th>Price</th>\n");
      out.write("                    <th>Action</th>\n");
      out.write("                </tr>\n");
      out.write("            </thead>\n");
      out.write("            <tbody>\n");
      out.write("                ");

                    ResultSet rs = (ResultSet) request.getAttribute("data");
                    if (rs!=null) {
                        while(rs.next()){
                        
      out.write("\n");
      out.write("                        <tr>\n");
      out.write("                            <td>");
 out.println(rs.getString(1)); 
      out.write("</td>\n");
      out.write("                            <td>");
 out.println(rs.getString(2)); 
      out.write("</td>\n");
      out.write("                            <td>");
 out.println(rs.getInt(3)); 
      out.write("</td>\n");
      out.write("                            <td>");
 out.println(rs.getInt(4)); 
      out.write("</td>\n");
      out.write("                            <td>\n");
      out.write("                                <a href=\"http://");
 out.println(request.getServerName());
                                
      out.write(":8080/CRUDJSPServlet/Product_Edit?idprod=");
 out.println(rs.getString(1)); 
      out.write("\">Edit</a>\n");
      out.write("                                | <a href=\"http://");
 out.println(request.getServerName());
                                
      out.write(":8080/CRUDJSPServlet /Product_Destroy?idprod=");
 out.println(rs.getString(1)); 
      out.write("\">Delete</a>\n");
      out.write("                            </td>\n");
      out.write("                        </tr>\n");
      out.write("                        ");

                    }
                }
            
      out.write("\n");
      out.write("        </tbody>\n");
      out.write("    </table>\n");
      out.write("    <br>\n");
      out.write("        ");

            String message = request.getParameter("message");
            if (message!=null) {
                if (message.equals("inputsuccess")) {
                    out.println("Status: Berhasil input data baru.");
                } else if(message.equals("inputfailed")){
                    out.println("Status: Gagal input data baru.");
                } else if(message.equals("updatesuccess")){
                    out.println("Status: Berhasil mengubah data.");
                } else if(message.equals("updatefailed")){
                    out.println("Status: Gagal mengubah data.");
                } else if(message.equals("destroysuccess")){
                    out.println("Status: Berhasil menghapus data.");
                } else if(message.equals("destroyfailed")){
                    out.println("Status: Gagal menghapus data.");
                }
            }
        
      out.write("   \n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
