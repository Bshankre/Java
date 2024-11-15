package servlet_crud.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import servlet_crud.dao.StudentDao;
@WebServlet("/da")
public class DeleteAll extends HttpServlet{
         @Override
        protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        	String data=req.getParameter("email"); //doubt
        	StudentDao sd=new StudentDao();
        	String msg=sd.deleteAll();
        	resp.getWriter().print(msg);
        }
}
