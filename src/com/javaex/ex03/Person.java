package com.javaex.ex03;

public class Person {
	private String name;
	private String hp;
	private String company;

	public Person() {
	}

	public Person(String name, String hp, String company) {
		this.name = name;
		this.hp = hp;
		this.company = company;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setMobile(String mobile) {
		this.hp = mobile;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getName() {
		return name;
	}

	public String getMobile() {
		return hp;
	}

	public String getCompany() {
		return company;
	}

	@Override
	public String toString() {
		return "이름: " + name + ", 핸드폰: " + hp + ", 회사: " + company;
	}

	public void showInfo() {
		System.out.println("이름\t: " + name);
		System.out.println("핸드폰\t: " + hp);
		System.out.println("회사\t: " + company);
		System.out.println("------------------------------");
	}
}