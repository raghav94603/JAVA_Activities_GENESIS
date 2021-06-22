package com.ltts.movieclass;

import java.util.*;
public class movie {
   
	private int movieid;
	private String moviename;
	private String hero;
	private String heroine;
	private Date date;
	
	//private Date d=new java.util.Date(date.getTime());
	
	private String lang;
	private int length;
	private String type;
	private int pid;
	
	
	public movie() {
		super();
	}


	public movie(int movieid, String moviename, String hero, String heroine, Date date, String lang, int length,
			String type, int pid) {
		super();
		this.movieid = movieid;
		this.moviename = moviename;
		this.hero = hero;
		this.heroine = heroine;
		this.date = date;
		this.lang = lang;
		this.length = length;
		this.type = type;
		this.pid = pid;
	}


	public int getMovieid() {
		return movieid;
	}


	public void setMovieid(int movieid) {
		this.movieid = movieid;
	}


	public String getMoviename() {
		return moviename;
	}


	public void setMoviename(String moviename) {
		this.moviename = moviename;
	}


	public String getHero() {
		return hero;
	}


	public void setHero(String hero) {
		this.hero = hero;
	}


	public String getHeroine() {
		return heroine;
	}


	public void setHeroine(String heroine) {
		this.heroine = heroine;
	}


	public Date getDate() {
		return date;
	}


	public void setDate(Date date) {
		this.date = date;
	}


	public String getLang() {
		return lang;
	}


	public void setLang(String lang) {
		this.lang = lang;
	}


	public int getLength() {
		return length;
	}


	public void setLength(int length) {
		this.length = length;
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	public int getProdid() {
		return pid;
	}


	public void setProdid(int pid) {
		this.pid = pid;
	}


	@Override
	public String toString()
	{
		return "Movieid=" + movieid + ", MovieName=" + moviename + ", Hero=" + hero + ", Heroine=" + heroine
				+ ", Date=" + date + ", lang=" + lang + ", Movie Length=" + length + ", Type=" + type + ", ProductionID=" + pid
				;
	}
	
	
	


	
	
	
}
