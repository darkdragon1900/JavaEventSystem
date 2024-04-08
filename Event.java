package program;

import java.util.Scanner;

public class Event {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter size of array ");
		int size = sc.nextInt();
		Person persons[]= new Person[size];
		
		int i=0,total=0;
		boolean exit = true;
		while(exit)
		{
		System.out.println("\n=======================================");
		System.out.println("\nWelcome to MET UTSAV 2K23!!! "
				+ "\n1.Student Registration"
				+ "\n2.Faculty Registration"
				+ "\n3.Get List all Participents"
				+ "\n4.Get Number of total participents"
				+ "\n5.EXIT");
		
		int choice = sc.nextInt();
		
		switch(choice)
		{
		case 1: {
			if(i<size)
			{
			Person p =EventManager.getStudent();
			persons[i++]=p;
			System.out.println("\nStduent Registered!!!");
			System.out.println("_______________________________________");
			}
			else {
				System.out.println("\nEvent is full now!!!");
			}
			break;
		}
		
		case 2: {
			if(i<size)
			{
			Person p =EventManager.getFaculty();
			persons[i++]=p;
			System.out.println("\nFaculty Registered!!!");
			System.out.println("\n_______________________________________\n");
			
			}
			else {
				System.out.println("\nEvent is full now!!!\n");
			}
			break;
		}
		
		case 3: {
			System.out.println("\n===Stduents List====\n");
			for (Person person : persons) 
			{
				if( person instanceof Student )
				System.out.println(person);
			}
			System.out.println("\n===Faculty List====\n");
			for (Person person : persons) 
			{
				if( person instanceof Faculty )
				System.out.println(person);
			}
			
			break;
		}
		
		case 4: {
		    int id;
		    System.out.println("Enter ID of participant");
		    id = sc.nextInt();
		    boolean found = false;
		    for (Person person : persons) {
		        if (person != null && person.getId() == id) {
		            found = true;
		            if (person instanceof Student) {
		                ((Student) person).tolearn();
		            } else if (person instanceof Faculty) {
		                ((Faculty) person).toTeach();
		            }
		        }
		    }
		    if (!found) {
		        System.out.println("Participant not found!");
		    }
		    break;
		}

		
		case 5: {
			System.out.println("THANKS FOR USING OUR SYSTEM");
			exit = false;
			break;
		}
		
		default : {
			System.out.println("Sorry!!! You have Entered WRONG CHOICE!!!  Try again!!!");
		}
		}
		
		}		

	}

}
