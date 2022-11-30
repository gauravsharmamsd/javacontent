
import java.util.Scanner;

class  Teststack                               //class for testing stack operation
{
	public static void main(String[] args) 
	{
		int type_of_op;						  //variable used to store tupe of operation	
		Mystack ob1=new Mystack();            //created stack
		
		Scanner s = new Scanner(System.in);    

		while(true)
		{
			System.out.println("ente your choice");
			System.out.println("enter 1 for push a numer");
			System.out.println("enter 2 for pop a number");
			System.out.println("enter 3 for printing a stack elements");
			System.out.println("enter 4 for exit");
			type_of_op = s.nextInt();							//reading type value
			switch(type_of_op)
			{
			case 1: System.out.println("Enter your element which you want to push");
					//s.nextInt();
					ob1.push(s.nextInt());                   //reading integer and pushed it into the stack
					break;

			case 2: System.out.println("Element  you want to pop is "+ ob1.pop());
					break;

			case 3: System.out.println("stack element is ");
					ob1.print();
					break;
			default: System.out.println("You have entered the wrong choice"); 
					return ;

			}
		
		}
		
	}
}

class Mystack
{
	int st_elements[]=new int[10];
	int tos;
	Mystack()
	{
		tos = -1;        //indicate it's empty
	}

public void push(int item)  //for inserting element into stack in stack order
	{
	if(tos==10)                      
		{
		System.out.println("stack is full");
		return;
		}
		else
		{
		 st_elements[++tos] = item;
		}
	}
public int pop()	//for retriving element from stack
{
	if(tos<0)
	{
		System.out.println("stack underflow");
		return 0;
	}
	else
		return st_elements[tos--];
}
public boolean empty_stack() //check that stack is empty or not
{
	if (tos == -1)
		return true;
	else return false;
}
public void print()		//for printing the stack contains
{
	int temp=0;
	
	if(!empty_stack())
	{
		temp = pop();
		System.out.println(temp);
		print();
	}
	push(temp);
}


};