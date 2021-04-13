package 继承;

class grandfather
{
	int a;
	//两个父类的父类构造函数
	public grandfather ()
	{
		System.out.println("zuzong wucan");
	}
	public grandfather (int a)
	{
		//this();  表示引用此类的无参构造函数
		System.out.println("zuzong youcan");
	}
}



class father extends grandfather
{
	public int a;
	private int b;
	public int sb(int l)
	{
		System.out.println(l);
		return 0;
	}
	 int sq(int k)
	{
		System.out.println(k);
		return 0;
	}
	
	
	//两个父类的构造函数
	public father()
	{
		System.out.println("wuwuwuwucan");
	}
	public father(int a)
	{
		super();
		System.out.println("fuleiyoucan");
	
	}	
}




public class 继承 extends father
{

//两个子类的构造函数
	public 继承 ()//子类含参或无参构造函数中的第一条语句默认是super();即调用父类的无参构造函数,若第一句加上super(1);等数字则调用父类有参对应构造函数
	{
		int 继承的整型变量=14;
		System.out.println(继承的整型变量);
		System.out.println("zileiwuwuwuwucan");
	}
	public  继承 (int a)
	{
		super(1);
		System.out.println("zileiyoucan");
	}
	
	
	public static void main(String[] args) 
	{
	
		继承 s=new 继承();
		s.sb(5);
		s.sq(19);//函数类型前面加上public private 不加，的区别是 public==不加,private 是私有，私有属性和私有方法都不能直接访问：子类名.属性(方法）=赋值  不行
		继承  a=new 继承();
		继承 b=new 继承(1);
		
	}
}


