package com.assignment;

import java.util.Scanner;

class Student{
	String name;
	int score;
	public Student(String name, int score) {
		this.name=name;
		this.score=score;
	}
}
 class ClassRoom {
 

public String registerStudent(Student student) {
	 if(!isNameValid(student.name)) {
		 return "Block letters needed";
		}
	 if(!isScoreValid(student.score)) {
		 return "Invalid score";
	 }
	 return "Registered";
 }

private boolean isScoreValid(int score) {
	return score >=0 && score <=100;
}

private boolean isNameValid(String name) {
	return name.equals(name.toUpperCase());
}
 public String studentCard(String card) {
	 if(!isCardValid(card)) {
		 return "Invalid card";
	 }
	 return "valid card";
 }

private boolean isCardValid(String card) {
	return card.matches("[0=9]+");
}
 }
 public class Main{
	 public static void main(String[] args) {
		Student s1= new Student("A", 6);
		ClassRoom cm=new ClassRoom();
		String registrationStatus = cm.registerStudent(s1);
		System.out.println(registrationStatus);
		String cardStatus= cm.studentCard("125");
		System.out.println(cardStatus);
	}
 }
 


