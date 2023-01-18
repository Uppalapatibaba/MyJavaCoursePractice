import java.util.ArrayList;
class M5
{
	@SuppressWarnings("unchecked")
	public static void main(String[] args) 
	{
		ArrayList list = new ArrayList();
		list.add(90);//0
		list.add("abc");//1
		list.add('a');//2
		list.add(true);//3
		list.add(20.0);//4
		list.add(20.0);//5
		list.add(2, "check");//it will shift to 2nd index(2)
		System.out.println(list);
	}
}
