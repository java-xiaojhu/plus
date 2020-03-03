package com.accp.springboot.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

@TableName("tbl_student")
public class Student {
	@TableId(value = "stuno",type = IdType.AUTO)
	private Integer stuno;
	
	private String stuname;
	
	private String stupwd;
	
	private String stusex;
	
	private String studate;

	public Student(Integer stuno, String stuname, String stupwd, String stusex, String studate) {
		super();
		this.stuno = stuno;
		this.stuname = stuname;
		this.stupwd = stupwd;
		this.stusex = stusex;
		this.studate = studate;
	}

	public Student() {
		super();
	}

	public Integer getStuno() {
		return stuno;
	}

	public void setStuno(Integer stuno) {
		this.stuno = stuno;
	}

	public String getStuname() {
		return stuname;
	}

	public void setStuname(String stuname) {
		this.stuname = stuname;
	}

	public String getStupwd() {
		return stupwd;
	}

	public void setStupwd(String stupwd) {
		this.stupwd = stupwd;
	}

	public String getStusex() {
		return stusex;
	}

	public void setStusex(String stusex) {
		this.stusex = stusex;
	}

	public String getStudate() {
		return studate;
	}

	public void setStudate(String studate) {
		this.studate = studate;
	}

	@Override
	public String toString() {
		return "Student [stuno=" + stuno + ", stuname=" + stuname + ", stupwd=" + stupwd + ", stusex=" + stusex
				+ ", studate=" + studate + "]";
	}
}
