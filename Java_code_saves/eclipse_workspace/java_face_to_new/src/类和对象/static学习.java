package ��Ͷ���;





public class staticѧϰ
{

	int a=10;
	static int b=20;
	
	public void putongfangfa()
	{
		System.out.println("fangfa1");
		System.out.println(a);
		System.out.println(b);
		jingtaifangfa();
	}
	public static void jingtaifangfa()
	{
		//int a=0;   �����ھ�̬�����ڶ�����ͨ������̬����
		
		System.out.println("fangfa2");
		System.out.println(a);//��̬����ֻ�ܵ��þ�̬�������ܵ�����ͨ����
		System.out.println(b);
		putongfangfa();//��̬�������ܵ�����ͨ����	
	}
	
	
	
	public static void main(String[] args) 
	{
		staticѧϰ.putongfangfa();  //������������ֱ�����÷Ǿ�̬����
		staticѧϰ.jingtaifangfa();//��������ֱ�����þ�̬����
		
		staticѧϰ a=new staticѧϰ();
		a.putongfangfa();//�����ö������þ�̬���߷Ǿ�̬����
		a.jingtaifangfa();
		
		
	}

}


class ������
{
	static
	{
		System.out.println("ֻ���һ�� ��һ�����");
	}
	{
		System.out.println("�����飬�ڶ������");
	}
	public ������()
	{
		System.out.println("���캯����������");
	}
	{
		System.out.println("�����飬���������");
	}
}





















