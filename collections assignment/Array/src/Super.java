public class Super extends Thread
{
public void run()
{
for(;;);
}
public static void main(String args[])
{
System.out.println("Star􀆟ng main");
new Super().start();
System.out.println("Main returns");
}
}
