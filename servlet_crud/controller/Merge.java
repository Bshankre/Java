package servlet_crud.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import servlet_crud.dao.StudentDao;
import servlet_crud.dto.StudentDto;
@WebServlet("/up")
public class Merge extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name=req.getParameter("sname");
		String cmob=req.getParameter("smob");
		long mob=Long.parseLong(cmob);
		String email=req.getParameter("semail");
		String pwd=req.getParameter("spwd");
		String gender=req.getParameter("gender");
		String country=req.getParameter("country");
		System.out.println(name+" "+cmob+" "+mob+" "+email+" "+pwd+" "+gender+" "+country);
		StudentDto sd=new StudentDto();
		sd.setEmail(email);
		sd.setName(name);
		sd.setMobile(mob);
		sd.setPassword(pwd);
		sd.setCountry(country);
		StudentDao dao=new StudentDao();
		dao.update(sd);
		Object obj=dao.fetchAll();
		req.setAttribute("k", obj);
		RequestDispatcher rd=req.getRequestDispatcher("fetchAll.jsp");
		rd.forward(req, resp);
	}
	

}
