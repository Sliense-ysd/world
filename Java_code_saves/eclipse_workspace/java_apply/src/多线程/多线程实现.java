package 多线程;//两种命名法：1.构造函数2.Thread自带函数


class son extends Thread //线程类 实例化可得到线程对象
{
	private int siyou;
	public son()
	{
	}
	public son(int siyou)//构造函数命名法
	{
		this.siyou=siyou;//用整型数字作为标记各个son对象的名字
	}
	public void run()
{
	for(int a=0;a<3;a++)
	{
		System.out.println(this.siyou+"运行"+" "+a);//以siyou这个整型变量对对象进行命名
	}
}
}

class son1 extends Thread
{
	public void run()
	{
		for(int a=0;a<3;a++)
		{
		System.out.println(Thread.currentThread().getName()+"   "+a);
		}//Thread自带函数，取得线程名
	}
}



public class 多线程实现 
{

	public static void main(String[] args)
	{
		new son().start();//在对象定义中，形参int siyou默认等于零
		new son(1).start();
		new son(2).start();
		
		son1 duixiang=new son1();//一个线程对象可以设置多个线程，用多个线程名标记他们的运行状态
		new Thread(duixiang,"xiancheng1").start();//用Thread命名函数命名  （线程对象名，线程名）
		new Thread(duixiang,"xiancheng2").start();
		new Thread(duixiang).start();//自动命名 线程名
		

	}

}
