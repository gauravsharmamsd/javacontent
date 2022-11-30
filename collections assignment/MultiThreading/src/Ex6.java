
	

public class Ex6 
	 extends Thread{  
		  public void run(){  
		   System.out.println("running...");  
		  }  
		 public static void main(String args[]){  
		  Ex6 t1=new Ex6();  
		Ex6 t2=new Ex6();  
		  System.out.println("Name of t1:"+t1.getName());  
		  System.out.println("Name of t2:"+t2.getName());  
		  System.out.println(Thread.currentThread().getName());
		   
		  t1.start();  
		  t2.start();  
		  Thread.currentThread().setName("Kaushik");
		  t1.setName("Sonoo Jaiswal");  
		  t2.setName("gaurav kaushik");
		  System.out.println("After changing name of t1:"+t1.getName() + "&&& "+ t2.getName());  
		  System.out.println(Thread.currentThread().getName());
		  System.out.println(Thread.currentThread().getId());
		//  t1.setId("7");
		  System.out.println(t1.getId());
		  System.out.println(t2.getId());  
		  System.out.println(t1.isAlive());
		  t1.setPriority(10);
		  t2.setPriority(5);
		  System.out.println(t1.getPriority());
		  
		  System.out.println(t2.getPriority());
		  
		  
		 }  
		}  


