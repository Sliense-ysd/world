package 类和对象;//类中的对象和类型中的变量的区别

class different_class
{
	int duixiangdenum=10;
	int duixiangdeji=10;
}


public class different 
{

public static void main(String[] args) 
	{
	
		int a,b;//类型中的变量
		a=1;
		b=2;
		System.out.println(a+""+b);
	
		a=b;
		System.out.println(a+""+b);
	
	
	
	
		different_class duixiang1=new different_class();//类中的对象
		different_class duixiang2=new different_class();
		  duixiang2.duixiangdenum=20;
		  duixiang2.duixiangdenum=20;
	    System.out.println(duixiang1.duixiangdenum+""+duixiang2.duixiangdenum);
	    System.out.println(duixiang1.duixiangdeji+""+duixiang2.duixiangdeji);
	 
	    duixiang2=duixiang1;//对象是指针，对象2的指针指向对象1的指针所指的区域，也就是对象1自己的属性和变量
	    duixiang2.duixiangdenum=5;//修改指针2所指的num的值，此时对象1和2的num都是5
	
		System.out.println(duixiang1.duixiangdenum+""+duixiang2.duixiangdenum);
		 System.out.println(duixiang1.duixiangdeji+""+duixiang2.duixiangdeji);
		
	
	}

}



