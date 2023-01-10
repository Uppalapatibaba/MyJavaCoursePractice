class F implements Runnable
{
	@Override 
	public void run()
	{
		for (int i = 1; i <= 100; i++)
		{
			System.out.println("first child: " + i);
		}
	}
}
class G implements Runnable
{
	@Override 
	public void run()
	{
		for (int i = 101; i <= 200; i++)
		{
			System.out.println("second child: " + i);
		}
	}
}
class H
{
	public static void main(String[] args) 
	{
		F f1 = new F();
        Thread t1 = new Thread(f1);
		t1.start();

		G g1 = new G();
        Thread t2 = new Thread(g1);
		t2.start();
		

		for (int i = 201; i <= 300; i++)
		{
			System.out.println("main thread: " + i);
		}
	}
}
/*
A marker interface is an interface that doesn't have any methods or constants inside it. 
It provides run-time type information about objects, 
so the compiler and JVM have additional information about
the object. A marker interface is also called a tagging interface.


An Interface that contains exactly one abstract 
method is known as functional interface. 
It can have any number of default, static methods 
but can contain only one abstract method. 
It can also declare methods of object class. 
Functional Interface is also known as Single 
Abstract Method Interfaces or SAM Interfaces.

Cloneable Interface
Cleanable interface in Java is also a marker interface that belong 
to java.lang package. It generates replica (copy) 
of an object with different name. We can implement 
the interface in the class of which class object to be cloned.
It indicates the clone() method of the Object class.
If we do not implement the Cloneable interface in the class 
and invokes the clone() method, it throws the ClassNotSupportedException.

Note:
that a class that implements the Cloneable interface must override the clone() 
method with a public method. Let's see an example.

Method Summary
Methods 
Modifier and Type	Method and Description
void	run()
When an object implementing interface Runnable is used to create a thread, 
starting the thread causes the object's run method to be called in that separately executing thread.
*/