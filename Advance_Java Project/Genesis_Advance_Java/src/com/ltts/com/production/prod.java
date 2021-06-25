package com.ltts.com.production;

import java.lang.*;
import java.util.*;

public class prod {

	private int pid;
	private String pname;
	private String adress;
	private String pdate;
	private String owner;
	
	public prod() {
		super();
		// TODO Auto-generated constructor stub
	}

	public prod(int pid, String pname, String adress, String pdate, String owner) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.adress = adress;
		this.pdate = pdate;
		this.owner = owner;
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public String getPdate() {
		return pdate;
	}

	public void setPdate(String pdate) {
		this.pdate = pdate;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	@Override
	public String toString() {
		return "prod [pid=" + pid + ", pname=" + pname + ", adress=" + adress + ", pdate=" + pdate + ", owner=" + owner
				+ "]";
	}
	
	
	
	
	
	
}
