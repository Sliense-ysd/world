package 类和对象;//接口的契约设计：gongji方法只和接口这个父类有关所以很好编写不需要写每一个子类的方法这个方案来调用所有子类的mofa，通过这个方法实现调用所有子类mofa
//接口也就是所有派生类的父类作为被调用类的形参 ，函数体里面写想要调用子类的哪些方法

public class 多态 extends duotaibaba
{

	
	public void violence()
	{
	System.out.println("我是儿子，我可以暴力");
	}
	
	
	public static void gongji(nezha a)//被调用类，形参与实参关系:nezha a=new nezha1();  new出一个nezha1类的对象   前面是父类后面是子类
	{
		a.mofa();
	}
	public static void gongji2(jiekou a)//被调用类，形参是接口，接口是父类（祖宗类）
	{
		//a.mofa();报错
	}
	
	
	public static void main(String[] args) //定义子类对象dt1，刚开始有两个方法，进行第一次强制类转型后得到dt2，dt2指向dt1的内存，遮盖住方法“暴力”，即dt1 和dt2
											//都指向同一块内存同时只能调用方法约炮，方法暴力被遮住，进行第二次转型后父类重新变成子类，原来被遮住的方法可以调用
	{
		多态 dt1=new 多态();
		dt1.yp();
		dt1.violence();
		duotaibaba dt2=(duotaibaba) dt1;//对象赋值，共用一块区域,dt2比dt1的范围小了但只是被遮挡子类方法优先级依然最高
		dt2.yp();
		
		多态 dt3=(多态) dt2;
		dt3.yp();
		dt3.violence();
		
		nezha[] a=new nezha[5];//定义一个nezha为类的数组 数组名是a  长度为5
		a[0]=new nezha();//定义数组a的0号元素是nezha1的对象,此处相当于进行一个强制类转型，把属于nezha类的对象a[0]转化成nezha1类的对象,即a[0]是nezha1的对象
		a[1]=new nezha1();
		a[2]=new nezha2();
		a[0].wuli();
		a[1].wuli();
		a[2].wuli();//调用对象a【0】的魔法函数
		
		gongji(new nezha());//nezha a=new nezha();//主类里面的主函数里面的调用类，实参是new一个对象的语句等号右边的语句如 lei duixiang1=new lei()
		gongji(new nezha1());//nezha a=new nezha1();//强制类转型 lei duixiang1 =new leizilei1();先是一个子类对象再变成父类对象 原来有3.5 变成3
		gongji(new nezha2());//nezha a=new nezha2();
		
		
		
		gongji2(new jiekou()//同样是调用类，实参是等号右边的语句，因为是接口，所以要想new一个接口就要补全接口里面声明的所有方法
				{
			public void mofa()
			{
				System.out.println("i am the king of the world");
			}
				}
				);
		
			
		
		
	}

}

class duotaibaba
{
	public void yp()
	{
		System.out.println("我是爸爸我要约炮");
	}

}


 class  nezha
{
	public void wuli()
	{
		System.out.println("我是哪吒，物理攻击+0");
	}
	public void mofa()
	{
		System.out.println("我是哪吒, 魔法攻击+0");
	}
	
	
}

class nezha1 extends nezha
{
	public void wuli()
	{
		System.out.println("我是哪吒1，物理攻击+1");
	}
	public void mofa()
	{
		System.out.println("我是哪吒1，魔法攻击+1");
	}
}

class nezha2 extends nezha
{
	public void wuli()
	{
		System.out.println("我是哪吒2，物理攻击+2");
	}
	public void mofa()
	{
		System.out.println("我是哪吒2，魔法攻击+2");
	}
}

/*报错
 * interface jiekou
{
	public void mofa();
}
*/

















