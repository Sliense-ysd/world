package ��Ͷ���;//���еĶ���������еı���������

class different_class
{
	int duixiangdenum=10;
	int duixiangdeji=10;
}


public class different 
{

public static void main(String[] args) 
	{
	
		int a,b;//�����еı���
		a=1;
		b=2;
		System.out.println(a+""+b);
	
		a=b;
		System.out.println(a+""+b);
	
	
	
	
		different_class duixiang1=new different_class();//���еĶ���
		different_class duixiang2=new different_class();
		  duixiang2.duixiangdenum=20;
		  duixiang2.duixiangdenum=20;
	    System.out.println(duixiang1.duixiangdenum+""+duixiang2.duixiangdenum);
	    System.out.println(duixiang1.duixiangdeji+""+duixiang2.duixiangdeji);
	 
	    duixiang2=duixiang1;//������ָ�룬����2��ָ��ָ�����1��ָ����ָ������Ҳ���Ƕ���1�Լ������Ժͱ���
	    duixiang2.duixiangdenum=5;//�޸�ָ��2��ָ��num��ֵ����ʱ����1��2��num����5
	
		System.out.println(duixiang1.duixiangdenum+""+duixiang2.duixiangdenum);
		 System.out.println(duixiang1.duixiangdeji+""+duixiang2.duixiangdeji);
		
	
	}

}



