package a123;

public class Az//������
{
	public static void main(String[] args)
	{
		
		desk xx=new desk(1,"��");
		desk yy=new desk(2,"��");
		math hehe=new math();
				System.out.println(hehe.add(0,1));
				System.out.println(hehe.add("app","le"));
				System.out.println(hehe.add(10,52,"love"));
				System.out.println(xx.hair);
				System.out.println("ֱ�����˫�����ڵ��ַ���");
				System.out.println(xx.name);
				System.out.println(yy.name);
				
				
		for(int i=0;i<5;i++){
			
			for(int j=4-i;j>0;j--){
				System.out.print(" ");
			}
			for(int h=0;h<2*i+2;h++){
				System.out.print("*");
			}
			for(int k=4-i;k>0;k--){
				System.out.print(" ");
			}
			System.out.print("\n");
		}
		
		
		
		count count_a=new count();
		System.out.println(count_a.factorial(1.0));
		
		
		
	}

}

class math//��ͨ�࣬�ڲ�������3���βθ�ʽ��ͬ�ĺ���
{
	
	int add(int a,int b) {
		return a+b;
	}
	String add(String a,String b)
	{
		return a+"v"+b;
	}
	String add(int c,int d,String e)
	{
		return c*d+" == "+e;
	}
}
class desk//��ͨ�࣬�ڲ���1������������ĺ��� ʵ��������ʱҪ�������ڼ�ʵ��
{
	String name="��д��Ϊnull��д��ΪĬ����";
	int hair=7;
	desk (int hair,String namex)
	{
		System.out.println("good~");
		name=namex;
	}
	
}

class count//�ݹ�
{
	int function_add(){
		return 1;
	}
	  double factorial(double i){
		//  count count_b=new count();
		  if(i>0)
			 return i+factorial(i-0.1)	;
		  else
			 return 1.0;
	}
	
}



