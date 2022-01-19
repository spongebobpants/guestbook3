package com.javaex.vo;

public class GuestbookVo {
	
	//field
	private int no;
	private String name;
	private String password;
	private String content;
	private String regDate;
	//constructor
	public GuestbookVo() {
		//기본 생성자
	}
	public GuestbookVo(int no, String name, String password, String content, String regDate) {
		this.no = no;
		this.name = name;
		this.password = password;
		this.content = content;
		this.regDate = regDate;
	}//all
	
	public GuestbookVo(String name, String password, String content, String regDate) {
		this.name = name;
		this.password = password;
		this.content = content;
		this.regDate = regDate;
	}
	
	public GuestbookVo(String name, String password, String content) {
		this.name = name;
		this.password = password;
		this.content = content;
	}
	
	public GuestbookVo(int no, String password) {
		this.no = no;
		this.password = password;
	}
	
	
	//g.s
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getRegDate() {
		return regDate;
	}
	public void setRegDate(String regDate) {
		this.regDate = regDate;
	}
	
	//method
	@Override
	public String toString() {
		return "GuestbookVo [no=" + no + ", name=" + name + ", password=" + password + ", content=" + content
				+ ", regDate=" + regDate + "]";
	}
}
