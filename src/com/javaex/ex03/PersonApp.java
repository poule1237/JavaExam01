package com.javaex.ex03;

import java.util.ArrayList;

public class PersonApp {
	public static void main(String[] args) {
		ArrayList<Person> pList = new ArrayList<Person>();

		Person you = new Person();
		you.setName("유재석");
		you.sethp("010-1111-1111");
		you.setCompany("02-2222-2222");
		
		pList.add(new Person("이효리", "010-2222-2222", "02-2222-2222"));
		pList.add(new Person("박명수", "010-3333-3333", "02-3333-3333"));

		for (Person p : pList) {
			p.showInfo();
		}
	}
}
