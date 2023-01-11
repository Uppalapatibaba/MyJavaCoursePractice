class Shared
{
	void test1()
	{
		Thread t1 = Thread.currentThread();
		for (int i = 1; i <= 20; i++)
		{
			System.out.println("from test1: " + i + " by " + t1.getName());
		}
	}
	void test2()
	{
		Thread t1 = Thread.currentThread();
		for (int i = 1; i <= 20; i++)
		{
			System.out.println("from test2: " + i + " by " + t1.getName());
		}
	}
}
class Thread1 extends Thread 
{
	Shared s1;// refrence
	Thread1(Shared s1)
	{
		this.s1 = s1;
	}

	@Override
	public void run()
	{
		s1.test1();
	}
}
class Thread2 extends Thread 
{
	Shared s1;
	Thread2(Shared s1)
	{
		this.s1 = s1;
	}

	@Override
	public void run()
	{
		s1.test1();
	}
}
class M1
{
	public static void main(String[] args)
	{
		Shared s1 = new Shared();
	

		Thread1 t1 = new Thread1(s1);
		Thread2 t2 = new Thread2(s1);

		t1.start();
		t2.start();

		s1.test1();
	}
}
/*
One thread is trying to read, and other thread is trying to write--
--So data corruption will happen. We cannot get the accurate data.
To avoid that concept, synchronisation comes in to picture.
//if both reading and writing
//synchronize.
//we use synchronisation concept, to avoid, the access on the same resource-
--by multiple threads.
//we can achieve synchronized keyword.
*/
