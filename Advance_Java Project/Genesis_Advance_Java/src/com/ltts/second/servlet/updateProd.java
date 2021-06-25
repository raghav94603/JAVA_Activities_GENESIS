package com.ltts.second.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ltts.com.pdao.productionDao;
import com.ltts.com.production.prod;

/**
 * Servlet implementation class updateProd
 */
@WebServlet("/updateProd")
public class updateProd extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public updateProd() {
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
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException,NumberFormatException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		
		int id=Integer.parseInt(request.getParameter("id"));
		String proname=request.getParameter("pname");
		String city=request.getParameter("address");
		String sdate=request.getParameter("sdate");
		String owname=request.getParameter("oname");
		
		prod p=new prod(id,proname,city,sdate,owname);
		productionDao pd=new productionDao();
		boolean b=true;
		try
		{
		b=pd.updatedata(p);	
		}
		catch (Exception e) {
			e.printStackTrace();
			
			
		
		}
		if(b==false)
		{
			System.out.println("Updated !!!");
		}
		else
		{
			System.out.println("Error !!!");
		}
	}
		
	

}

