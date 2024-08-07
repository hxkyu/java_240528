package servlet1.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/") // /Main에서 /로 변경
public class Main extends HttpServlet {
   private static final long serialVersionUID = 1L;
    
   protected void doGet(HttpServletRequest request,
      HttpServletResponse response)
      throws ServletException, IOException {
	  //WEB-INF/views/main.jsp를 가져와서 화면에 전달
      request.getRequestDispatcher("/WEB-INF/views/main.jsp").forward(request, response);
	
   }	
   
   protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      doGet(request, response);
   }

}
