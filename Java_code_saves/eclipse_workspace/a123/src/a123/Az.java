package a123;

public class Az//公共类
{
	public static void main(String[] args)
	{
		
		desk xx=new desk(1,"早");
		desk yy=new desk(2,"晚");
		math hehe=new math();
				System.out.println(hehe.add(0,1));
				System.out.println(hehe.add("app","le"));
				System.out.println(hehe.add(10,52,"love"));
				System.out.println(xx.hair);
				System.out.println("直接输出双引号内的字符串");
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

class math//普通类，内部定义了3个形参格式不同的函数
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
class desk//普通类，内部有1个用类名定义的函数 实例化该类时要在括号内加实参
{
	String name="不写则为null，写则为默认名";
	int hair=7;
	desk (int hair,String namex)
	{
		System.out.println("good~");
		name=namex;
	}
	
}

class count//递归
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




