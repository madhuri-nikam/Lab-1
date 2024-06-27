package CalculateOfMarks;

import java.util.Scanner;

public class CalculateOfMarks {

	public static void main(String[] args) {
		// TODO Auto-generated method stood
		Scanner sc=new Scanner(System.in);
	
		    
		        

		        
		        int[] marks = new int[5];

		        
		        System.out.println("Enter marks obtained in 5 subjects:");

		        for (int i = 0; i < 5; i++) {
		            System.out.print("Subject " + (i + 1) + ": ");
		            marks[i]=sc.nextInt();
		        }

		        
		        double totalMarks = 0;
		        for (int mark : marks) {
		            totalMarks += mark;
		        }
		        double averageMarks = totalMarks / 5;

		        
		        char grade;
		        if (averageMarks >= 90) {
		            grade = 'A';
		        } else if (averageMarks >= 80) {
		            grade = 'B';
		        } else if (averageMarks >= 70) {
		            grade = 'C';
		        } else if (averageMarks >= 60) {
		            grade = 'D';
		        } else {
		            grade = 'F';
		        }

		        System.out.println("Average Marks: " + averageMarks);
		        System.out.println("Grade: " + grade);

		        sc.close();
		    }


		
			
	}



