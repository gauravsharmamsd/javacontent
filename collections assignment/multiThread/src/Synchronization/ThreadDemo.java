package Synchronization;

class Ab
{ public static synchronized void status(String msg)
{ for (int i=0;i<3;i++)
{ System.out.println("hi="+msg);
try{Thread.sleep(1000);}catch(InterruptedException ie){ie.printStackTrace();}
}
}
}
class MyThread1 extends Thread
{ public void run(){
Ab.status("ratan"); }
}
class MyThread2 extends Thread

{ public void run()
{Ab.status("durga");
}
}
class MyThread3 extends Thread
{ public void run()
{ Ab.status("any");
}
}
class ThreadDemo
{ public static void main(String[] args)
{ new MyThread1().start();
new MyThread2().start();
new MyThread3().start();
}
}