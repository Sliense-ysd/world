package ���߳�;//������������1.���캯��2.Thread�Դ�����


class son extends Thread //�߳��� ʵ�����ɵõ��̶߳���
{
	private int siyou;
	public son()
	{
	}
	public son(int siyou)//���캯��������
	{
		this.siyou=siyou;//������������Ϊ��Ǹ���son���������
	}
	public void run()
{
	for(int a=0;a<3;a++)
	{
		System.out.println(this.siyou+"����"+" "+a);//��siyou������ͱ����Զ����������
	}
}
}

class son1 extends Thread
{
	public void run()
	{
		for(int a=0;a<3;a++)
		{
		System.out.println(Thread.currentThread().getName()+"   "+a);
		}//Thread�Դ�������ȡ���߳���
	}
}



public class ���߳�ʵ�� 
{

	public static void main(String[] args)
	{
		new son().start();//�ڶ������У��β�int siyouĬ�ϵ�����
		new son(1).start();
		new son(2).start();
		
		son1 duixiang=new son1();//һ���̶߳���������ö���̣߳��ö���߳���������ǵ�����״̬
		new Thread(duixiang,"xiancheng1").start();//��Thread������������  ���̶߳��������߳�����
		new Thread(duixiang,"xiancheng2").start();
		new Thread(duixiang).start();//�Զ����� �߳���
		

	}

}
