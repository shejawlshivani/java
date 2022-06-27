//Create Thread by extending thread class
package corejava;

class ThreadExample  extends Thread {
	
	//Initiated run method for thread
	public void run() {
		System.out.println("Thread started running");
		
	}
	
	public static void main(String[]args) 
	{
		ThreadExample th = new ThreadExample();
		//Invoking Thread
		th.start();
		
	}

}
