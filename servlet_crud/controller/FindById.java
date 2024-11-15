package servlet_crud.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import servlet_crud.dao.StudentDao;
@WebServlet("/fetch")
public class FindById extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	String name=req.getParameter("pk");
    	StudentDao studentdao=new StudentDao();
    	Object obj=studentdao.fetchById(name);
    	resp.getWriter().print(obj);
    	
    }
}
