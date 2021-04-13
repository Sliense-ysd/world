package caonima;//父类和子类的继承关系
class Father
	{
		private int money=100;
		long i=199l;			//在类中定义的类型默认为public
		public int num=14;
		public void hello()
		{ 
			
			System.out.println("i have not money");
		}
	}
	
	//baba
	class son extends Father
	{
		public void hi()
		{
			System.out.println("i am your father");
		}
	}
	
public class 鲁冠 {


	public static void main(String[] args)
	{
		son s=new son();
		System.out.println(s.i);
		System.out.println(s.num);
		//System.out.println(s.money);
		s.hello();
		s.hi();

	}

}
