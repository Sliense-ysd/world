package lei;

public class constant extends lei0
{
		public final static int b=3;
		public final static int a=999;
		public static final  String name="shencongwen";

		
		
		public static int fangfa1()
{
	int nb=8;
	
	System.out.println("b1="+b);//输出static的b，全域
	return nb;
}
	
		
		
	public static void main(String[] args) 
	{
		fangfa1();
		//public final static int a=3;//常量的定义只能有一个,static同名变量在类中只能有一个，在各个函数内可以各自有最多一个
		int b=0;//用final字符可以将常量b再次修改  final int b=0;   
	
		System.out.println("a="+a);//子类的变量优先级最高
		System.out.println("b2="+b);//这是主方法里面的变量b
		System.out.println("b3="+constant.b);//这是类里面的变量b
		System.out.println("name="+name);	
		lei0 dx=new lei0();
	
		dx.output();	//调用父类方法得到父类的a
		
		
		int s1=10;//基本型
		Integer s2=10;//基本型包装成对象
		Integer s3=new Integer(10);//对象，s3==10
		Integer s4=new Integer(5);//对象，s4==5
		Integer s5=new Integer(5);//对象，s5==5
		Integer s6=s4+s5;//基本型包装成对象 先对象和对象计算,得到基本10 s6==10
		System.out.println(s1==s2);//true  基本和对象比较，对象拆箱成基本 比较值
		System.out.println(s1==s3);//true  基本和对象比较，对象拆箱成基本 比较值
		System.out.println(s2==s3);//false  对象和对象 比较，比较地址
		System.out.println(s1==(s4+s5));//true 先对象和对象计算，两个对象同时拆箱成基本算出基本，基本再和基本比较，比较值
		System.out.println(s2==(s4+s5));//true 先对象和对象计算，两个对象同时拆箱成基本算出基本，基本再和对象比较，对象拆箱比较值
		System.out.println(s3==(s4+s5));//true 先对象和对象计算，两个对象同时拆箱成基本算出基本，基本再和对象比较，对象拆箱比较值
		System.out.println(s1==s6);//true  基本和对象
		System.out.println(s2==s6);//true  对象和对象，因为都存在栈内存，且值位于常量池内值也相等所以指向的地址相同
		System.out.println(s3==s6);//false 对象和对象，一个栈内存，一个堆内存地址不同
		
		String c1="abc";  //string是类，abc是常量 c1是变量,位于栈内存常量池
		String c2="abc";  
		String c3=new String("abc");//string是类，abc是常量 c3是对象,位于堆内存
		String c4=new String("abc");
		String c5="abcdef";
		String c6="abc"+"def";//都是常量，编译器优化成abcdef
		String c7=c1+"def";//c1是变量 唯有确定的常量才优化，所以此处编译器不优化
		String c8="abc"+new String("def");//涉及到new对象，编译器不优化
		
		
		
		
		System.out.println(c1==c2);//true  常量池
		System.out.println(c1==c3);//false 变量和对象比较，一个栈内存一个堆内存
		System.out.println(c3==c4);//false 对象和对象比较，比较地址两个堆内存各自存储
		
		System.out.println(c5==c6);//true 常量池 共享一块区域
		System.out.println(c5==c7);//false 不在同一内存
		System.out.println(c5==c8);//false 不在同一内存
		System.out.println(c7==c8);//false 不在同一内存
	
		
		
		
		
		
		
	
	

	}

}

class lei0
{
	public final static int a=666;
	
	public void output()
	{
	System.out.println(a);
	}
	public static int fangfa1()
	{
		int nb=8;
		System.out.println("nb="+nb);
		return nb;
	}
	
}

interface  jiekou//接口内定义的变量默认为常量,无法修改
{
	String name="yangshengdong";//默认为public static final String name
//	private String java="java";
	
}













