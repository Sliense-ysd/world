package �������;

import java.util.Random;

public class string�� {

	public static void main(String[] args)
	{
		Random rd=new Random();//  1:��Random��������������
		System.out.println(rd.nextInt());
		System.out.println(rd.nextInt(100));//0-100����
		System.out.println(rd.nextLong());
		System.out.println(rd.nextDouble()); 
		System.out.println("-------------------------------"); 
		
		//2:����һ����Χ�ڵ������
		System.out.println(Math.round(Math.random()*10)); //Math.round()�������뺯��        
		System.out.println("------------------------------"); 
		
		
		//3:��������   Random������ints��������
		rd.ints();    //�������޸�int�ͷ�Χ������  ints(x);  ints(x,y,z) ����x������ ����y-z��x����
		
		int[] arr=rd.ints(10).toArray();//����10��int��Χ�ڵĸ���
		for(int i=0;i<arr.length;i++)
		System.out.println(arr[i]); 
		System.out.println("-------------------------------"); 
		
		arr=rd.ints(5,10,100).toArray(); //����5���� 10-100֮��
		for(int i=0;i<arr.length;i++)
			System.out.println(arr[i]); 
		System.out.println("-------------------------------"); 
		
		
		
		arr=rd.ints(10,1,10).limit(5).toArray();//����10��1-10���������Ʒ���5��
		for(int i=0;i<arr.length;i++)
			System.out.println(arr[i]);
		
		

	}

}
