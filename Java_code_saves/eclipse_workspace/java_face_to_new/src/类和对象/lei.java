package ��Ͷ���;//����ͱ�����ֵ��������
//������ָ�����˵�ǵ�ַ������2��ֵ������1���ǵ�ַ2������ַ1�����ڵ�ַ1==��ַ2������ָ��1ָ����ָ��2ָ��ĵ�ַ
//duixiang1=duixiang2
public class lei  //��������
{
	public static void main(String[] args) //��������������������,������������������������棬�����������ʱ����Ƕ�ף����ڶ��巽���ڵ��÷�������
	                                                                     
	{
		int a,b,c;
		int[] i=new int[5];
		lei1 duixiang1=new lei1();//�������ռ䣺  ����1�Ͷ���2    ������ָ�����˵�ǵ�ַ������1��ֵ������2���ǵ�ַ1��ָ�� �� �����Ǻ��Ӵ�ģ����Զ���ĸ�ֵ��ָ�븳ֵ������ָ��ָ��ͬһ���ڴ�
		lei1 duixiang2=new lei1();//���������ڴ��С���Ը�ֵ��ֱ�ӿ���������������ֵ���ڴ�����Ը�ֵ����ָ��ͬһ���ڴ���������׼�������С
		a=1;b=2;
		duixiang1.jiaohuan=10;//����1.����
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
	
	static int sb (int a[])//����
	{
		int b=1;
		for(b=1;b<5;b++)
		{
			a[b]=b;
		}
		
		return 0;
		
	}
	static void swap(int a,int b)//���� ����
	{
		int s;
		s=a;
		a=b;
		b=s;

	}
	static void swap(lei1 a,lei1 b)//�� ����
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




