package avc.aa;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Exam {

	public static void main(String args[]) throws IOException { 
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String FirstName,LastName,Course;
	
		int age;
	int arr[] [];
	int size;
	System.out.println("Enter the no of Student");
	size=Integer.parseInt(br.readLine());
	arr=new int[size][];
	for(int a=0;a<arr.length;a++) {
		System.out.println("Enter the first name");
		FirstName=br.readLine();
		System.out.println("Enter the last name");
			LastName=br.readLine();
			System.out.println("Enter the Course Details");
			Course=br.readLine();
			
						System.out.println("Enter age");
age=Integer.parseInt(br.readLine());
		
	}
	
Student.AssignValueToArray(int First Name,intstudentExamNo);
}
public static void AssignValueToArray(int studentNumber,int NumberofExam )
{
	int[][] studentScore=new int[studentNumber][ NumberofExam];
	Scanner sc1=new Scanner(System.in);
	
	int studCount=1;
		for(int i=0;i< studentNumber;i++) {
			System.out.println(" student"+studCount+" 's grades:");
			
			for(int j=0;j< NumberofExam;j++) {
				studentScore[i][j]=sc1.nextInt();
								
			}
			studCount++;
		}
			Student.DisplayvalueInArray(studentScore);
			
		}

public static void DisplayvalueInArray(int [][] studentScoreArray)
{
				
				System.out.println("student score is" + "\n");
				int studentCount=1;
				for(int i=0;i< studentScoreArray.length;i++) {
					System.out.println(" grade student"+studentCount+": ");
					
					for(int j=0;j<studentScoreArray[i].length;j++) {
					char Grade;
					if(studentScoreArray[i][j] <=59)
					{
						Grade='f';
						
					}
					
					else if(studentScoreArray[i][j] >=60 && studentScoreArray[i][j]<=69  )
					{
						Grade='D';
						
					}
					else if(studentScoreArray[i][j] >=70 && studentScoreArray[i][j]<=79  )
					{
						Grade='C';
						
					}
					else if(studentScoreArray[i][j] >=80 && studentScoreArray[i][j]<=89  )
					{
						Grade='B';
						
					}
					else 
						Grade='A';
						
					
					System.out.println(studentScoreArray[i][j]+ "\t");
					System.out.print(Grade);
				}
				System.out.println();

				studentCount++;
				
			}
			
		}
}
	

	
	

	




	}
}
	
			

		

	
	

