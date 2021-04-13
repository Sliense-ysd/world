package 包和类;

class mc
{
	public int gaozi;
	public mc(int gaozi)
	{
		this.gaozi=gaozi;
	}
	public mc() 
	{
	
	}
	
}




public class 包里面的类
{

	public static void main(String[] args)
	{
mc steve =new mc();
System.out.println("12131");
System.out.println(new mc(5));//仅在输出时例化 （不知道是不是输出后就随着内存释放掉）
System.out.println("12131");
System.out.println(steve.gaozi);
System.out.println("12131");


	

	

	}

}
