package 类和对象;//对象和变量的值交换区别
//对象是指针或者说是地址，对象2赋值给对象1就是地址2赋给地址1，现在地址1==地址2，或者指针1指向了指针2指向的地址
//duixiang1=duixiang2
public class lei  //公共的类
{
	public static void main(String[] args) //公共的主方法（函数）,方法（函数）必须放在类里面，定义各个方法时不能嵌套，但在定义方法内调用方法可以
	                                                                     
	{
		int a,b,c;
		int[] i=new int[5];
		lei1 duixiang1=new lei1();//定义对象空间：  对象1和对象2    对象是指针或者说是地址，对象1赋值给对象2就是地址1的指向 。 对象是很庞大的，所以对象的赋值是指针赋值，两个指针指向同一个内存
		lei1 duixiang2=new lei1();//基本类型内存很小所以赋值是直接拷贝，对象包含多个值，内存大，所以赋值采用指向同一块内存区域更容易计算量超小
		a=1;b=2;
		duixiang1.jiaohuan=10;//对象1.属性
		duixiang2.jiaohuan=20;
		
		swap(a,b);
		System.out.println(a+" "+b);
		swap(duixiang1,duixiang2);
		System.out.println(duixiang1.jiaohuan+" "+duixiang2.jiaohuan);
		
		sb(i);
		for(c=1;c<5;c++)
		{
		System.out.println(i[c]+" ");
		}
		lei2 obj=new lei2();
		System.out.println(obj.a+" "+obj.b);
		
		q a1=new q(1);
		q a2=new q(2);
		
	
	}
	
	static int sb (int a[])//方法
	{
		int b=1;
		for(b=1;b<5;b++)
		{
			a[b]=b;
		}
		
		return 0;
		
	}
	static void swap(int a,int b)//类型 变量
	{
		int s;
		s=a;
		a=b;
		b=s;

	}
	static void swap(lei1 a,lei1 b)//类 对象
	{
		int s;
		s=a.jiaohuan;
		a.jiaohuan=b.jiaohuan;
		b.jiaohuan=s;

	}


}

class q
{
	public q(int i) 
	{
	
	}
 
}
class lei1
{
	int jiaohuan;
}
class lei2
{
	int a;
	double b;
}




