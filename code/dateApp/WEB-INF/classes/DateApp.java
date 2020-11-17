import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;
import java.time.LocalDateTime;

public class DateApp implements Servlet{

	ServletConfig config = null;

	public void init (ServletConfig config){
		this.config = config;
		System.out.println("init");
	}

	public void service (ServletRequest req, ServletResponse res) throws IOException,ServletException{
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();

		out.print("<html><body>");
		out.print("Date1 =>" + LocalDateTime.now());
		out.print("<html/><body/>");
	}

	public void destroy(){
		System.out.println("Destroyed");
	}

	public ServletConfig getServletConfig(){
		return this.config;
	}

	public String getServletInfo(){

		return "";
	}
}
