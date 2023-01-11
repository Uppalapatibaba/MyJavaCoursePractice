class E extends Thread
{
	@Override 
	public void run()
	{
		System.out.println("from E thread: " + getPriority());
	}
}
class F extends Thread
{
		@Override 
	public void run()
	{
		System.out.println("from F thread: " + getPriority());
		setPriority(7);
		E e1 = new E();// we are creating Thread
		e1.start();
	}
}
class G
{
	public static void main(String[] args) 
	{
		Thread.currentThread().setPriority(10);
		F f1 = new F();// we are creating Thread
		f1.start();
	}
}