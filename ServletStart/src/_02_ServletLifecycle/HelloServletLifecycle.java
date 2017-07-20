package _02_ServletLifecycle;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class HelloServletLifecycle extends HttpServlet {

	@Override
	public void init() throws ServletException {
		System.out.println("Hello init() method");
		System.out.println("init() bir kez çalışır.");
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
					throws ServletException, IOException{
		
		PrintWriter pw = resp.getWriter();
		Date today = new Date();
		String msg = "ServletLifeCycle";
		
		pw.print("<html><body><h1>" + msg + "</h1>");
		pw.print("<p>" + today + "<p>");
		pw.print("<p>" + msg + "<p>");
		pw.print("</html></body>");
		
	}
	@Override
	public void destroy(){
		System.out.println("##destroy##");
	}
	
}