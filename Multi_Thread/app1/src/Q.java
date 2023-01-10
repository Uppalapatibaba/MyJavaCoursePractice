class Q 
{
	public static void main(String[] args) 
	{
		Thread t1 = Thread.currentThread();
		System.out.println(t1.getName());
		System.out.println(t1.isDaemon());
		System.out.println(t1.getId());
		System.out.println(t1.getPriority());
	}
}
/*
Deamon thread depnds on Parent thread.
When parent thread is leaving from the execution, Deamon thread--
-also leaves from the execution.Even though Deamon thread ---
-has some more execution.
//Opposite of Deamon thread is user thread. Even though parent thread--
--is leaving from the execution, child is finishing it's execution.
User Thread: In this though Deamo 
//By default in java, we get user threads.
// Any thread can be converted to Deamon thread before ---
--calling the start method.
//Main thread is not Deamon thread.
//Every thread gets a unique ID. Not same ID. they get diff IDs. and type is long type.
Priority: Each and every thread have priority from 1-10
Min is 1, Normal is 5, Max is 10
Main Thread is Normal Priority, so we get 05.
We can also change the priority.
If we change the priority there is a possibilty of get high Priors first.
But it is not possible alawys.
unqiue id we can't able to modifie.

*/