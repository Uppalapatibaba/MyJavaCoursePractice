class Q extends Thread
{
	@Override 
	public void run()
	{
	   System.out.println("run Begin");
	   Util.sleep(10000);
	   System.out.println("run end");
	}
}
class R
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		Q q1 = new Q();
		q1.start();
		Util.sleep(1000);//for sleep method required try and catch
		q1.interrupt();//we no need keep the try catch
		System.out.println("main end");
	}
}