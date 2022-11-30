package Day1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Team {
	
static Scanner sc = new Scanner(System.in);
static int select=sc.nextInt();
	public static void main(String[] args) {	
		registration();		
		ListOfSports();
		Scheduling();
	}
		private static void Scheduling() {
			if(select ==3) {
				Map<String,String>m=new HashMap<String,String>();
				m.put("monday", "cricket");
				m.put("wednedday", "VolleyBall");
				m.put("Thursday", "Soccer");
				m.put("Saturday", "Hockey");
				System.out.println(m.entrySet());
				
			}
		// TODO Auto-generated method stub
		
	}
		private static void ListOfSports() {
			if(select==2) {
			ArrayList al=new ArrayList();
			al.add("Cricket");
			al.add("Hockey");
			al.add("Soccer");
			al.add("VolleyBall");
			
			System.out.println("List of sports as" +al);
		// TODO Auto-generated method stub
		
	}}
		private static void registration() {
		if(select==1) {
			System.out.println("Welcome Registerstion page");
		System.out.println("Enter the no of player");
		int noOfPlayer=sc.nextInt();
		Players player[]=new Players[noOfPlayer];
		for(int i=0;i<noOfPlayer;i++) {
			Players p1=new Players();
			System.out.println("Enter fName");
			String name = sc.next();
			p1.setfname(name);
			System.out.println("Enter Last Name");
			String lname = sc.next();
			p1.setLname(lname);
			System.out.println("Enter age");
			int age= sc.nextInt();		
			p1.setAge(age);
			System.out.println("Enter Registration Amount");
			int regAmount= sc.nextInt();
			p1.setRegamount(regAmount);
			player[i]=p1;
			printPlayers(player);
		}
			
		}
	}
			
			
		
	private static void printPlayers(Players[] player) {
		for(Players  s: player) {
			System.out.println(s);
		}

		// TODO Auto-generated method stub
		
	}
	}
		
		// TODO Auto-generated method stub
		
	


