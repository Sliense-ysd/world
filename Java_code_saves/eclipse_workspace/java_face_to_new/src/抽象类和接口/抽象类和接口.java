package 抽象类和接口;



abstract class seed
{
	int a;
	public abstract void grow();
	public void wu()
	{
		System.out.println("我无色透明");
	}
}


 interface water
{
	public void wu();
	public void clear();
}




public class 抽象类和接口 extends seed implements water
{

	public void clear()
	{
		System.out.println("我很清澈");
	}
	public void grow()
	{
		System.out.println("我在长大");
	}
	
	
	
	public static void main(String[] args) 
	{
	System.out.println("我是主函数");
	抽象类和接口 obj=new 抽象类和接口 ();
	obj.grow();
	obj.wu();
	obj.clear();
	double a=(int)4.1;
	System.out.println(a);
	
	}
	
	
}
