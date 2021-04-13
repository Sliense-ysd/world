package 类和对象;





public class static学习
{

	int a=10;
	static int b=20;
	
	public void putongfangfa()
	{
		System.out.println("fangfa1");
		System.out.println(a);
		System.out.println(b);
		jingtaifangfa();
	}
	public static void jingtaifangfa()
	{
		//int a=0;   可以在静态方法内定义普通变量或静态变量
		
		System.out.println("fangfa2");
		System.out.println(a);//静态方法只能调用静态变量不能调用普通变量
		System.out.println(b);
		putongfangfa();//静态方法不能调用普通方法	
	}
	
	
	
	public static void main(String[] args) 
	{
		static学习.putongfangfa();  //不可以用类名直接引用非静态方法
		static学习.jingtaifangfa();//可以类名直接引用静态方法
		
		static学习 a=new static学习();
		a.putongfangfa();//可以用对象引用静态或者非静态方法
		a.jingtaifangfa();
		
		
	}

}


class 匿名块
{
	static
	{
		System.out.println("只输出一次 第一个输出");
	}
	{
		System.out.println("匿名块，第二个输出");
	}
	public 匿名块()
	{
		System.out.println("构造函数，最后输出");
	}
	{
		System.out.println("匿名块，第三个输出");
	}
}





















