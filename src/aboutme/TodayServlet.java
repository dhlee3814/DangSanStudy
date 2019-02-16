package aboutme;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.LocalTime;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/today")
public class TodayServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public TodayServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		LocalDate nowDate = LocalDate.now();
		
		LocalTime nowTime = LocalTime.now();
		int hour = nowTime.getHour();
		int minute = nowTime.getMinute();
		
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		out.print("<HTML><HEAD><TITLE>today</TITLE>");
		out.print("<link rel='stylesheet' href='/aboutme/css/today.css'>");
		out.print("</HEAD><BODY>");
		out.print("<a href='index.html'>메인화면</a>");
		out.print("<h1>현재시간 : " + nowDate + " "+ hour + ":" + minute +"</h1>");
		out.print("</BODY></HTML>");
	}
}
