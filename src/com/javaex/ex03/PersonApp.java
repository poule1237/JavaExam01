package com.javaex.ex03;

import java.util.ArrayList;

public class PersonApp {
	public static void main(String[] args) {
		ArrayList<Person> pList = new ArrayList<>();

		pList.add(new Person("유재석", "010-1111-1111", "02-1111-1111"));
		pList.add(new Person("이효리", "010-2222-2222", "02-2222-2222"));
		pList.add(new Person("박명수", "010-3333-3333", "02-3333-3333"));

		for (Person person : pList) {
			person.showInfo();
		}
	}
}
