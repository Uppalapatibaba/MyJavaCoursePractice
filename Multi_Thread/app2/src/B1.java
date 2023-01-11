class A1 extends Thread
{
	A(String name)
	{
		super(name);
	}
	@Override 
	public void run()
	{
		System.out.println("from run");
		System.out.println(10/0);
	}
}
class B1
{
	public static void main(String[] args) 
	{
		A a1 = new A("thread 101");
		a1.start();
		System.out.println(a1.getName());
	}
}
/*
thread 101
from run
Exception in thread "thread 101" java.lang.ArithmeticException: / by zero
        at A.run(B.java:11)
		*/