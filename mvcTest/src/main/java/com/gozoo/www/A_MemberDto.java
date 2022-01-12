package com.gozoo.www;

public class A_MemberDto {

	private String id;
	private String pw;
	private String name;
	private int point;

	
	public A_MemberDto() {};
	
	public A_MemberDto(String id) {
		this.id = id;
	}

	public A_MemberDto(String id, String pw) {
		this.id = id;
		this.pw = pw;
	}

	public A_MemberDto(String id, int point) {
		this.id = id;
		this.point = point;
	}

	public A_MemberDto(String id, String pw,String name) {
		this.id = id;
		this.pw = pw;
		this.name = name;
	}
	
	public A_MemberDto(String id, String pw, String name, int point) {
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.point = point;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPoint() {
		return point;
	}

	public void setPoint(int point) {
		this.point = point;
	}
	
	
	
	
	
	
}