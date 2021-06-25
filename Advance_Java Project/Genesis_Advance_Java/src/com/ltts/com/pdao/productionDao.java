package com.ltts.com.pdao;

import java.lang.*;
import java.util.*;
import java.sql.*;
//import com.ltts.com.production.*;
import com.ltts.db.config.DbConfig;

//import com.ltts.movieclass.movie;
import com.ltts.com.production.prod;
//import com.ltts.configure.Myconfigure;


public class productionDao {

public boolean InsertData(prod p)throws Exception
{
	//Connection con=DbConfig.getConnection();
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3305/genesis","root","asawa123");
	//Class.forName("com.mysql.cj.jdbc.Driver");
	PreparedStatement ps=con.prepareStatement("insert into productions values(?,?,?,?,?)");
	ps.setInt(1,p.getPid());
	ps.setString(2,p.getPname());
	ps.setString(3,p.getAdress());
	ps.setString(4,p.getPdate());
	ps.setString(5,p.getOwner());
	
	boolean b=ps.execute();
	System.out.println("Value Inserted"+b);
	return false;
}

public List<prod> getAllproductions() throws Exception{
	List<prod> pr=new ArrayList<prod>();
	//Connection con=.getConnection();
	
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3305/genesis","root","asawa123");
	
	PreparedStatement p=con.prepareStatement("select * from productions");
	ResultSet rs=p.executeQuery();
	while(rs.next()) {
		pr.add(new prod(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5)));
	}
	return pr;
  }

public prod getProductionsrById(int id) throws Exception {
	prod p=null;
	//Connection con=MyConfig.getConnection();
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3305/genesis","root","asawa123");
	Statement s=con.createStatement();
	ResultSet rs=s.executeQuery("select * from productions where productionid="+id);
	while(rs.next()) {
		p=new prod(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5));
	}
	return p;
}


public boolean updatedata(prod p) throws Exception {
	
	//Connection con= Myconfigure.getConnection();
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3305/genesis","root","asawa123");
	
	PreparedStatement ps=con.prepareStatement("update productions set productionname="+p.getPname()+",address="+p.getAdress()+
			 ",dateofstarted="+p.getPdate()+",ownername="+p.getOwner()+" where productionid="+p.getPid()+"");
	boolean r=ps.execute();
	System.out.println("Data Updated !"+r);
	return r;
}








	
}
