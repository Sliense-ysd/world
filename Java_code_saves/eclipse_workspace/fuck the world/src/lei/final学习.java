package lei;

public class final学习
{

	int sb=999;
	
	
	
	
	
	public static void main(String[] args) 
	{
	final int a=10;
	a=3;//final型变量不可以再次赋值
	
	final final学习 obj1=new final学习();
	obj1.sb=10;//final型对象可以修改其对象内部的值
	obj1=new final学习();//不可以修改指针指向
	
	
	}

}
