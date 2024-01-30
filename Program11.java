import java.io.*;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class VoterSrv extends HttpServlet

{
private static final long serialVersionUID = 1L;

public void service(HttpServletRequest req, HttpServletResponse res) throws IOException,ServletException
{
//set response content type
 res.setContentType("text/html");
//get printWrite obj
PrintWriter pw = res.getWriter();
//read form data from page as request parameter 
String name = req.getParameter("name");
int age = Integer.parseInt(req.getParameter("age")); if (age>=18)
{
pw.println("<font color='green' size='4'>Welcome "+name+" to this site</font>");
}
else
pw.println("<font color='red' size='4'>Hello "+name+", you are not authorized to visit the site</font>");

//add hyperlink to dynamic page
 pw.println("<br><br><a href= 'index.html'>back</a>");
//close the stream 
pw.close();
}
}
