package 常用类库;

import java.util.Random;

public class string类 {

	public static void main(String[] args)
	{
		Random rd=new Random();//  1:用Random类随机生成随机数
		System.out.println(rd.nextInt());
		System.out.println(rd.nextInt(100));//0-100整型
		System.out.println(rd.nextLong());
		System.out.println(rd.nextDouble()); 
		System.out.println("-------------------------------"); 
		
		//2:生成一个范围内的随机数
		System.out.println(Math.round(Math.random()*10)); //Math.round()四舍五入函数        
		System.out.println("------------------------------"); 
		
		
		//3:新增方法   Random类对象的ints（）函数
		rd.ints();    //返回无限个int型范围内数据  ints(x);  ints(x,y,z) 生成x个数， 生成y-z内x个数
		
		int[] arr=rd.ints(10).toArray();//生成10个int范围内的个数
		for(int i=0;i<arr.length;i++)
		System.out.println(arr[i]); 
		System.out.println("-------------------------------"); 
		
		arr=rd.ints(5,10,100).toArray(); //生成5个数 10-100之间
		for(int i=0;i<arr.length;i++)
			System.out.println(arr[i]); 
		System.out.println("-------------------------------"); 
		
		
		
		arr=rd.ints(10,1,10).limit(5).toArray();//生成10个1-10的数，限制返回5个
		for(int i=0;i<arr.length;i++)
			System.out.println(arr[i]);
		
		

	}

}
