package ��Ͷ���;//�ӿڵ���Լ��ƣ�gongji����ֻ�ͽӿ���������й����Ժܺñ�д����Ҫдÿһ������ķ�������������������������mofa��ͨ���������ʵ�ֵ�����������mofa
//�ӿ�Ҳ��������������ĸ�����Ϊ����������β� ������������д��Ҫ�����������Щ����

public class ��̬ extends duotaibaba
{

	
	public void violence()
	{
	System.out.println("���Ƕ��ӣ��ҿ��Ա���");
	}
	
	
	public static void gongji(nezha a)//�������࣬�β���ʵ�ι�ϵ:nezha a=new nezha1();  new��һ��nezha1��Ķ���   ǰ���Ǹ������������
	{
		a.mofa();
	}
	public static void gongji2(jiekou a)//�������࣬�β��ǽӿڣ��ӿ��Ǹ��ࣨ�����ࣩ
	{
		//a.mofa();����
	}
	
	
	public static void main(String[] args) //�����������dt1���տ�ʼ���������������е�һ��ǿ����ת�ͺ�õ�dt2��dt2ָ��dt1���ڴ棬�ڸ�ס����������������dt1 ��dt2
											//��ָ��ͬһ���ڴ�ͬʱֻ�ܵ��÷���Լ�ڣ�������������ס�����еڶ���ת�ͺ������±�����࣬ԭ������ס�ķ������Ե���
	{
		��̬ dt1=new ��̬();
		dt1.yp();
		dt1.violence();
		duotaibaba dt2=(duotaibaba) dt1;//����ֵ������һ������,dt2��dt1�ķ�ΧС�˵�ֻ�Ǳ��ڵ����෽�����ȼ���Ȼ���
		dt2.yp();
		
		��̬ dt3=(��̬) dt2;
		dt3.yp();
		dt3.violence();
		
		nezha[] a=new nezha[5];//����һ��nezhaΪ������� ��������a  ����Ϊ5
		a[0]=new nezha();//��������a��0��Ԫ����nezha1�Ķ���,�˴��൱�ڽ���һ��ǿ����ת�ͣ�������nezha��Ķ���a[0]ת����nezha1��Ķ���,��a[0]��nezha1�Ķ���
		a[1]=new nezha1();
		a[2]=new nezha2();
		a[0].wuli();
		a[1].wuli();
		a[2].wuli();//���ö���a��0����ħ������
		
		gongji(new nezha());//nezha a=new nezha();//�������������������ĵ����࣬ʵ����newһ����������Ⱥ��ұߵ������ lei duixiang1=new lei()
		gongji(new nezha1());//nezha a=new nezha1();//ǿ����ת�� lei duixiang1 =new leizilei1();����һ����������ٱ�ɸ������ ԭ����3.5 ���3
		gongji(new nezha2());//nezha a=new nezha2();
		
		
		
		gongji2(new jiekou()//ͬ���ǵ����࣬ʵ���ǵȺ��ұߵ���䣬��Ϊ�ǽӿڣ�����Ҫ��newһ���ӿھ�Ҫ��ȫ�ӿ��������������з���
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
		System.out.println("���ǰְ���ҪԼ��");
	}

}


 class  nezha
{
	public void wuli()
	{
		System.out.println("������߸��������+0");
	}
	public void mofa()
	{
		System.out.println("������߸, ħ������+0");
	}
	
	
}

class nezha1 extends nezha
{
	public void wuli()
	{
		System.out.println("������߸1��������+1");
	}
	public void mofa()
	{
		System.out.println("������߸1��ħ������+1");
	}
}

class nezha2 extends nezha
{
	public void wuli()
	{
		System.out.println("������߸2��������+2");
	}
	public void mofa()
	{
		System.out.println("������߸2��ħ������+2");
	}
}

/*����
 * interface jiekou
{
	public void mofa();
}
*/

















