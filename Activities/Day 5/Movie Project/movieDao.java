package com.ltts.mdao;

import com.ltts.configure.Myconfigure;
import com.ltts.movieclass.*;
import java.sql.*;
import java.util.*;
import java.util.Date;
import java.time.*;
import java.lang.*;
import java.sql.*;
public class movieDao {

	
	public boolean insertdata(movie m)throws Exception ,SQLException{
		
		Connection con= Myconfigure.getConnection();
		PreparedStatement p=con.prepareStatement("insert into movie values(?,?,?,?,?,?,?,?,?)");
		
		p.setInt(1, m.getMovieid());
		p.setString(2, m.getMoviename());
		p.setString(3, m.getHero());
		p.setString(4, m.getHeroine());
		p.setDate(5,(java.sql.Date)m.getDate());
		p.setString(6, m.getLang());
		p.setInt(7, m.getLength());
		p.setString(8, m.getType());
		p.setInt(9, m.getProdid());
		
		boolean b=p.execute();
		
		return b;

	}
	public List<movie> getAllMovie() throws Exception{
		List<movie> movies=new ArrayList<movie>();
		Connection con=Myconfigure.getConnection();
		
		PreparedStatement p=con.prepareStatement("select * from movie");
		ResultSet rs=p.executeQuery();
		while(rs.next()) {
			movies.add(new movie(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getDate(5),rs.getString(6),rs.getInt(7),rs.getString(8),rs.getInt(9)));;
		}
		return movies;
      }
	
	
	public boolean updatedata(movie m) throws Exception {
		Connection con= Myconfigure.getConnection();
		PreparedStatement p=con.prepareStatement("update movie set movieid="+m.getMovieid()+",moviename="+m.getMoviename()+",heroname="+m.getHero()+
				 ",heroine="+m.getHeroine()+",releaseddate="+(java.sql.Date)m.getDate()+",language="+m.getLang()+",length="+m.getLength()+
				 ",movietype="+m.getType()+",productionid="+m.getProdid()+"where movieid="+m.getMovieid());
		boolean r=p.execute();
		System.out.println("Data Updated !"+r);
		return r;
	}
	
	public boolean deletedata(int movieid) throws Exception {
		Connection con= Myconfigure.getConnection();
		PreparedStatement ps=con.prepareStatement("delete from movie where movieid="+movieid);
		boolean r=ps.execute();
		System.out.println("Data Deleted "+r);
		return r;
	}
	
	public void getMovieById(int id) throws Exception,SQLException {
		Connection c= Myconfigure.getConnection();
		Statement s=c.createStatement();
		ResultSet rs2=s.executeQuery("select m.movieid,m.moviename,m.heroname,m.heroine,m.releaseddate,m.language,m.length,m.movietype,p.productionname from movie m inner join productions p on p.productionid=m.productionid where movieid="+id);
		 
		System.out.println("MovieId           MovieName              Hero                 Heroine                 ReleaseDate              Language                Length                   Type                 ProductioName");
		 System.out.println("-------------------------------------------------------------------------------------"
		 		+ "---------------------------------------------");
		 while(rs2.next()) {
		 System.out.println(rs2.getInt(1)+"          "+rs2.getString(2)+"          "+rs2.getString(3)+"          "
		 +rs2.getString(4)+"       "+rs2.getString(5)+"          "+rs2.getString(6)+"          "+rs2.getInt(7)+"          "
		 +rs2.getString(8)+"          "+rs2.getString(9));
		 }
	}
}
