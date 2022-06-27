package corejava;

class ThreadStringPrint implements Runnable {
public void run() {
	int i=0;
	while(i<=50)
	{
		System.out.println("Good Morning");
		try
		{
			Thread.sleep(200);
		}catch (InterruptedException e)
		{
			e.printStackTrace();
		}
		System.out.println("Welcome to my home");
		i++;
	
	}
}
public static void main (String[] args)
{
Runnable rn = new ThreadStringPrint();
Thread t1 = new Thread(rn);
//Thread object started
t1.start();
t1.run();
}
}

