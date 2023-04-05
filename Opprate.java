package com.Details;

import java.io.IOException;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Collection;

public class Opprate {
	static Scanner sc= new Scanner(System.in);
	public static Student addNewStudent() {
		
	
		int rollno;
		String name;
		String contact;
		String course;
		
		System.out.print("\nEnter Roll Number : ");
		rollno = sc.nextInt();
		
		sc.nextLine();
		
		System.out.print("Enter Student Name : ");
		name = sc.nextLine();
		
		System.out.print("Enter Contact Number : ");
		contact = sc.nextLine();
		
		System.out.print("Enter Course Name : ");
		course = sc.next();
		
		Student _st = new Student(rollno, name, contact, course);
		
		System.out.println("Student Record Added");
		
		System.out.println("Press Enter to Continue.....\n");
		try {System.in.read();}
		catch (IOException e) {}
		
		return _st;
		
	}
	public static void displayAllStu(Collection<Student> studentRecords) {
	
		System.out.println();
		studentRecords.forEach(val->System.out.println(val));
		
		System.out.println("Press Enter to Continue.....\n");
		try {System.in.read();}
		catch (IOException e) {}
	}
	public static void searchStudent (Collection<Student>st,int rollNumber) {
	
		System.out.println();
		boolean f = false;
		Iterator<Student> itr = st.iterator();
		while(itr.hasNext())
		{
			Student _st = itr.next();
			int rollNum = 0;
			if(_st.getRollNumber() == rollNum)
			{
				System.out.println(_st);
				f = true;
			}
		}
		
		if(!f)
			System.out.println("student not found\n");
		
		System.out.println("Press Enter Too Continue.....");
		try {System.in.read();}
		catch (IOException e) {	}
	}
	public void deleteStudent (Collection<Student>st,int rollNumber) {
	
	
		boolean flag = false;
		Iterator<Student> it = st.iterator();
		while(it.hasNext())
		{
			Student _s = it.next();
			int rollNum = 0;
			if(_s.getRollNumber()==rollNum)
			{
				it.remove();
				flag = true;
			}
		
		
		if(flag)
			System.out.print("student record deleted");
		else
			System.out.print("Student not found");
	  }
	}
	public static void updateStudent (Collection<Student> st,int rollNumber) {
	
		boolean flag= false;
		Collection<Student> st1 = null;
		Iterator<Student> itr=st1.iterator();
		while(itr.hasNext())
		{
			Student student=itr.next();
			Student _student = null;
			int rollNumber1 = 0;
			if(_student.getRollNumber()==rollNumber1)
			{
				System.out.print("Enter New Student Name:");
				
				String name=sc.nextLine();
				_student.setStuName(name);
				
                   System.out.print("Enter New Student ContectNumber:");
				
				String contact=sc.nextLine();
				_student.setContactNumber(contact);
				
				System.out.print("Enter New Course Name : ");
				String course = sc.next();
				_student.setCourse(course);
				flag=true;
			}
		}
		if(flag)
			System.out.println("\nStudent Record Update\n");
		else
			System.out.println("\nStudent not found\n");
	}

}
