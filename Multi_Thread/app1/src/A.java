class A
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		System.out.println("Hello World!");
	}
}
/*
/*
New Concept: MultiThread 09/01/2023

MultiThread Program or Concurrent Progam/Concurrency is one of
important concept
Inorder to understand MultiThread we need to understand Multi-Tasking first.
MultiTasking-- excuting multiple tasks simultanously.
Dependancy will reduce if do multitasking.
Multi-tasking---
a)Processing based multitasking(this is called MUlti processing)
b)Thread based multi taksing(this is called Multi Threading)
Incase of Processed based multitasking(each process has address in the memory) in --
--other words each process allocating with the seprate memory area.
->Processed based multitasking is heavy weight. why?
Because, switching from one process to another process requires time.
->Each process will be allocating with spearate memory area.
Cost(Time) of the communciation between the process is high.
Thread Based MultiTasking(Multi Threading):
In case of Thread Based MultiTasking all the threads share the same memory area.
Thread is light weight.(same memory, cost(time) of thread is very low. Thread is light weight
Process is heavy weight.(different memory will be used
Note: Atleast one process is required for each thread.
Multithreading in java is a process of executing multiple threads---
--simultanously.
by difult corejava programm will be excuted by only one thread single thread that is called main
thread.

main thread will be started by JVM.
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
*/