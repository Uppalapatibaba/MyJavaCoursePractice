class C extends Thread
{
	@Override 
	public void run()
	{
		for (int i = 1; i <= 100; i++)
		{
			System.out.println("first thread: " + i);
		}
	}
}
class D extends Thread
{
	@Override 
	public void run()
	{
		for (int i = 101; i <= 200; i++)
		{
			System.out.println("second thread: " + i);
		}
	}
}
class E
{
	public static void main(String[] args) 
	{
		C c1 = new C();
		c1.start(); // internaly start method only calling we not calling.
		           // it going to located some time to cpu.
				   
		D d1 = new D();
		d1.start();

        for (int i = 201; i <= 300; i++)
		{
			System.out.println("main thread: " + i);
		}
	}
}
/*
How we can create a thread in java excplictly.
By fault JVM will create the Main Thread.
There are two ways of creating thread in java.
1)First approach is by extending thread class
2)Second approach is by implenting runable interphase.
New Concept: 
Thread sheeding: , Thread sheeting is what ever new threads are created
--users should be registred with thread shceduler.
Thread scheduler: It is taking time to scheduling processor time--
to all the registered threads.
multiple thread are invoing threads.
main thread called by JVM.
main thread is creating to child thread.

*/