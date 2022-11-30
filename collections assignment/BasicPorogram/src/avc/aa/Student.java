package avc.aa;

import java.util.*;
public class Student {
	public static void main(String args[]) {
	Scanner sc= new Scanner(System.in) ;
	
	
	
	System.out.println("enetr the no studemt");
int studentNum=sc.nextInt();
//	System.out.println("Enter name");
	//String name=sc.next();

	System.out.println("enetr the no of exam");
	int studentExamNo=sc.nextInt();
	
	
Student.AssignValueToArray(studentNum,studentExamNo);
}
public static void AssignValueToArray(int studentNumber,int NumberofExam )
{
	int[][] studentScore=new int[studentNumber][ NumberofExam];
	Scanner sc1=new Scanner(System.in);
	
	int studCount=1;
		for(int i=0;i< studentNumber;i++) {
			System.out.println(" student"+studCount+" 'no:");
			
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
				//	System.out.println(" grade student"+studentCount+": ");
					
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
	

	
	

	



