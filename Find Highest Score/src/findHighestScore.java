//Sagai Taylor 
//Exercise no 2
//Exercise due date -  October 8

import java.util.Scanner;

public class findHighestScore {
	
	public static void main(String[] args)
	{
		// Calling method that prompts user to enter number of students, name of students, and student scores
		findHighestScore(); 
		
		
	}

	
	// method that uses the highest score that a user enters 
	public static void findHighestScore()
	{
		// 3 scanners are declared 
		Scanner scan1 = new Scanner(System.in); 
		Scanner scan2 = new Scanner(System.in); 
		Scanner scan3 = new Scanner(System.in); 
		
		// Text prompts the user to enter the number of students 
		System.out.println("Enter number of students: " );
		
		// this integer defined as 'numOfScores' takes the value from 'scan1' scanner, and is stored within it
		int numOfStudents = scan1.nextInt();
		
		// Comparable variables 'compare' , and 'studentName' are defined as 0 and "" to ultimately sequentially compare two values which are namely count and the score the user entered 
		int compare = 0; 
		String studentName = ""; 
		
		// counter variable 
		int count = 0; 

		
		// while the counter variable is less than the number of students
		while(count < numOfStudents)
		{
			// Prompts the user to enter students' name 
			System.out.println("Enter student name: " );
			
			// 'scan2' stores the user's input in the string variable 'name'
			String name = scan2.next(); 
			
			// Prompts the user to enter students' score 
			System.out.println("Enter student score: ");
			
			// 'scan3' stores the user's input in the Int 'score' 
			int score = scan3.nextInt(); 
			
			
			
			
			// If the 'compare' variable is not larger than the student score entered by the the user
			if(!(compare > score))
			{
				// let the 'compare' variable equal to the score number of the student entered by the user
				compare = score; 
				
				// let the 'StudentName' variable to be equal to the student name that the user enters
				studentName = name; 
			}
			
			// Increment count by 1 
			count+=1; 
			
			
		}
		
		// Print out the name of the student with the highest score 
		System.out.println("Student with the highest score: " + studentName);

	}
	
}
