package ����;

public class ���� 
{

	public static void main(String[] args)
	{
		int l=0,m;
		//�����������ַ�ʽ
		int a[]=new int [] {8,2,3,5,1};
		int arr[] =new int [3];//������Ķ���: lei []duixiang=new lei[3];
		int c[]=new int [5];
		
		
		
		
		//�����������ַ�ʽfor(int b=0;b<a.length;b++)println(a[b])  for(int b:a)println(b)
		for(int x=0;x<arr.length;x++)
		{
			arr[x]=x;
			System.out.println(arr[x]);
		}
		System.out.println("...........................");
		
		//foreach ����data��ֵ���θ���x
		for(int i:arr)
		{
			System.out.println(i);
		}
		System.out.println("...........................");
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length-1;j++)
			{
				if(a[j]>a[j+1])
				{
					m=a[j];
					a[j]=a[j+1];
					a[j+1]=m;
				}
			}
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.print(i);
		}
		System.out.println();
		System.out.println("......................");
		
		
		//.................................................................................
		//��ά���龲̬��ʼ��
		System.out.println();
		int [][]b=new int [][]{{1,2,3},{4,5,6}};
		for(int j=0;j<b.length;j++ )
		{
			for(int j1=0;j1<b[j].length;j1++)
			{
				System.out.print(b[j][j1]);
			}
			System.out.println();
		}
		
		System.out.println("...........................");
		
		//.................................................................................
		//��ά���鶯̬��ʼ��
		int w[][]=new int [3][3];
		for(int j=0;j<w.length;j++ )
		{
			for(int j1=0;j1<w[j].length;j1++)
			{
				System.out.print(w[j][j1]);
			}
			System.out.println();
		}
		

	}

}
