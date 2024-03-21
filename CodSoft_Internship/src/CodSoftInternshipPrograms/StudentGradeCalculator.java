package CodSoftInternshipPrograms;

import java.util.Scanner;

public class StudentGradeCalculator {

	public static void main(String[] args) {
	   
		Scanner s = new Scanner (System.in);
		System.out.println("--------------- Student Grade Calculator ---------------");
		
		System.out.println("Student Name : ");
	       String sname =s.nextLine(); 
		
	    System.out.println("Enter total number of Subjects :");
     		int totalSubjects =s.nextInt() ;
     		
		 int total = 0 ;
		
		for (int i = 0; i < totalSubjects ; i++)
		 {
		   System.out.println("Enter Marks Obtained in Subject out of 100 : "+i );	
		   int marks = s.nextInt();
		   total = total + marks ;
		 }
		
		double percentage = (double) total/totalSubjects ;
		String Grade ;
		if (percentage > 90) {
			 Grade = "O" ;
		}
		else if (percentage > 85) {
			Grade = "A+";
		}
		else if (percentage > 80) {
			Grade = "A";
		}
		else if (percentage > 75) {
			Grade = "B+"; 
		}
		else if (percentage > 70) {
			Grade = "B";
		}
		else if (percentage > 65) {
			Grade = "C+";
		}
		else if (percentage > 60) {
			Grade = "C";
		}
		else if (percentage > 55) {
			Grade = "D+";
		}
		else if (percentage > 50) {
			Grade = "D";
		}
		else if (percentage > 45) {
			Grade = "E+";
		}
		else if (percentage > 40) {
			Grade = "E";
		}
		else {
			Grade = "F" ;
		}
		System.out.println("Total Marks Obtained in  all Subjects : "+ total);
		System.out.println("Percentage Obtained : "+percentage+ " %");
		System.out.println("Grade Obtained : "+Grade);
	}	
 }		