package com.ss;

public class Emp {
	 int eid;
	 String ename;
	 Emp(int eid,String ename){
		 this.eid=eid;
		 this.ename=ename;
	 }
	 Emp(Emp e){
		 eid=e.eid;
		 ename=e.ename;
	 }
	 void m() {
		 System.out.println(eid);
		 System.out.println(ename);
	 }
	 public static void main(String args[]) {
		 Emp e1= new Emp(5,"abd");
		 Emp e2= new Emp(e1);
		 e1.m();
		 e2.m();
	 }
}