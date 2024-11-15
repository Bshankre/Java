package servlet_crud.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import servlet_crud.dao.StudentDao;
import servlet_crud.dto.StudentDto;
@WebServlet("/did")
public class DeleteById extends HttpServlet {
   @Override

//protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//	   String data=req.getParameter("pk");
//	     StudentDao sd=new StudentDao();
//	     String msg=sd.deleteById(data);
////	     resp.getWriter().print(msg);
//	     List<StudentDto> obj=sd.fetchAll();
//	     req.setAttribute("k", obj);
//	     RequestDispatcher rd=req.getRequestDispatcher("fetchAll.jsp");
//	     rd.forward(req, resp);
//}

protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	   String data=req.getParameter("pk");
	     StudentDao sd=new StudentDao();
	     String msg=sd.deleteById(data);
//	     resp.getWriter().print(msg);
	     List<StudentDto> obj=sd.fetchAll();
	     req.setAttribute("k", obj);
	     RequestDispatcher rd=req.getRequestDispatcher("fetchAll.jsp");
	     rd.forward(req, resp);
}
}
