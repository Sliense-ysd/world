package 数组;

public class 数组 
{

	public static void main(String[] args)
	{
		int l=0,m;
		//定义数组三种方式
		int a[]=new int [] {8,2,3,5,1};
		int arr[] =new int [3];//类数组的定义: lei []duixiang=new lei[3];
		int c[]=new int [5];
		
		
		
		
		//遍历数组两种方式for(int b=0;b<a.length;b++)println(a[b])  for(int b:a)println(b)
		for(int x=0;x<arr.length;x++)
		{
			arr[x]=x;
			System.out.println(arr[x]);
		}
		System.out.println("...........................");
		
		//foreach ：将data的值依次赋给x
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
		//二维数组静态初始化
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
		//二维数组动态初始化
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
