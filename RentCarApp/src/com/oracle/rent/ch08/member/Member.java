package com.oracle.rent.ch08.member;

public class Member {
	String id;
	String password;
	String name;
	String address;
	String phoneNum;
	
	public Member() {}

	public Member(String id, String password, String name, String address, String phoneNum) {
		super();
		this.id = id;
		this.password = password;
		this.name = name;
		this.address = address;
		this.phoneNum = phoneNum;
	}
	public String viewMember() {
		System.out.println("\n회원 정보를 조회합니다.");
		System.out.println("----------------------------");
		String memberInfo = "아이디: " + id
							+"\n비밀번호: " + password
							+"\n이름: " + name
							+"\n주소: " + address
							+"\n전화번호: " + phoneNum;
		return memberInfo;
	}
	
	public void regMember(String id, String password, String name, String address, String phoneNum) {
		System.out.println("회원 가입합니다.");
		this.id = id;
		this.password = password;
		this.name = name;
		this.address = address;
		this.phoneNum = phoneNum;
	}
	
	public void modMember() {
		System.out.println("\n회원 정보를 수정합니다.");
	}
	
	public void delMember() {
		System.out.println("\n회원 정보를 삭제합니다.");
	}
}
