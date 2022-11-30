class Test

{ 
	public static void main(String[] args)
{
		Emp[] e = new Emp[5];
e[0]=new Emp(111,"ratan");

e[1]=new Emp(222,"anu");

e[2]=new Emp(333,"sravya");

for (Object e1:e)
{ 
	if (e1 instanceof Emp)
{ 
		Emp e2 = (Emp)e1;
System.out.println(e2.eid+"----"+e2.ename);
}
if (e1==null)
{ System.out.println(e1);
}
}
}
}