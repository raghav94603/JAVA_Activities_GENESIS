package com.ltts.first.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ltts.com.pdao.productionDao;
import com.ltts.com.production.*;;
/**
 * Servlet implementation class fs
 */
@WebServlet("/fs")
public class fs extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public fs() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		int no=Integer.parseInt(request.getParameter("id"));
		String proname=request.getParameter("name");
		String city=request.getParameter("add");
		String sdate=request.getParameter("date");
		String oname=request.getParameter("ownerr");
		
		prod p=new prod(no,proname,city,sdate,oname);
		productionDao pd=new productionDao();
		boolean b=true;
		try
		{
		b=pd.InsertData(p);	
		}
		catch (Exception e) {
			e.printStackTrace();
			
			
		
		}
		if(b==false)
		{
			System.out.println("Inserted !!!");
		}
		else
		{
			System.out.println("Error !!!");
		}
	}

}
