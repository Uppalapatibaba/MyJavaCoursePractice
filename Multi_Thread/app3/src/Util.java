class Util
{
	public static void sleep(long millis)
	{
	   try
		{
			Thread.sleep(millis);//sleep method is static method
		}
		catch (InterruptedException ex)
		{
			System.out.println("Interruption Handled");
			ex.printStackTrace();
		}
	}

	public static void sleep(long millis, int nano)
	{
	   try
		{       
			Thread.sleep(millis, nano);//sleep method is static method
		}
		catch (InterruptedException ex)
		{
			System.out.println("Interruption Handled");
			ex.printStackTrace();
		}
	}
}