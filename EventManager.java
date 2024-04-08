package program;

import java.util.Scanner;

public class EventManager {
	
	static long eid;
	
	static {
		eid = System.currentTimeMillis()%10000000;
	}
    
	public static Person getStudent()
	{
		long id = ++eid+10000;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name :");
		String name = sc.next();
		System.out.println("Enter Course :");
		String course = sc.next();
		System.out.println("Enter Marks :");
		int marks = sc.nextInt();
		Person student = new Student((int)id, name, course, marks);
		return student;
	}
	
	public static Person getFaculty()
	{
		long id = ++eid+20000;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name of Faculty :");
		String name = sc.next();
		System.out.println("Enter Faculty Teaching Subject :");
		String sub = sc.next();
		System.out.println("Enter Faculty Salary :");
		double sal = sc.nextDouble();
		Person faculty = new Faculty((int)id, name, sub,sal);
		return faculty;
	}
	
}
