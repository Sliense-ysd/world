package �̳�;

class grandfather
{
	int a;
	//��������ĸ��๹�캯��
	public grandfather ()
	{
		System.out.println("zuzong wucan");
	}
	public grandfather (int a)
	{
		//this();  ��ʾ���ô�����޲ι��캯��
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
	
	
	//��������Ĺ��캯��
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




public class �̳� extends father
{

//��������Ĺ��캯��
	public �̳� ()//���ຬ�λ��޲ι��캯���еĵ�һ�����Ĭ����super();�����ø�����޲ι��캯��,����һ�����super(1);����������ø����вζ�Ӧ���캯��
	{
		int �̳е����ͱ���=14;
		System.out.println(�̳е����ͱ���);
		System.out.println("zileiwuwuwuwucan");
	}
	public  �̳� (int a)
	{
		super(1);
		System.out.println("zileiyoucan");
	}
	
	
	public static void main(String[] args) 
	{
	
		�̳� s=new �̳�();
		s.sb(5);
		s.sq(19);//��������ǰ�����public private ���ӣ��������� public==����,private ��˽�У�˽�����Ժ�˽�з���������ֱ�ӷ��ʣ�������.����(������=��ֵ  ����
		�̳�  a=new �̳�();
		�̳� b=new �̳�(1);
		
	}
}


