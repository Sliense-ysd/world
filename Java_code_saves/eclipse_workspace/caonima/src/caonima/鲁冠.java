package caonima;//���������ļ̳й�ϵ
class Father
	{
		private int money=100;
		long i=199l;			//�����ж��������Ĭ��Ϊpublic
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
	
public class ³�� {


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
