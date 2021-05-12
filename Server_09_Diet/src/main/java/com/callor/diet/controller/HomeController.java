package com.callor.diet.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
// 특별히 설정하지 않는한 무조건 얘로 연결하겠다 = "/"
@WebServlet("/")
public class HomeController extends HttpServlet{

	private static final long serialVersionUID = -953531494441799347L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		// getRequestDispatcher에 전달하고 /WEB-INF/view/home.jsp를 보여달라. 최초로 열 페이지 요청
//		req.getRequestDispatcher("/WEB-INF/views/home.jsp").forward(req, resp);
		
		ReqController.forward(req, resp, "home");
		
		
	
	}
	
	

}
