package servlet_crud.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import servlet_crud.dao.StudentDao;
@WebServlet("/fa")
public class FindAll extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//		String data=req.getParameter("email");
		StudentDao stdo=new StudentDao();
		Object obj=stdo.fetchAll();
//		resp.getWriter().print(obj);
		req.setAttribute("k", obj);
		RequestDispatcher rd=req.getRequestDispatcher("fetchAll.jsp");
		rd.forward(req, resp);
		
	}
	
}
