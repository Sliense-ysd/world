package 类和对象;

public class 实验 
{

	public static void main(String args[])
	{	
	number dx1=new number(3);
	System.out.println(dx1.sum());	
	}
}
	
class number//普通的类 属性写private 方法写public
{
	private int m,n;
	
	public number()
	{
		this(0,0);
	}
	
	public number(int m)
	{
		this(m,3);//也就是number (3,0)
	}
	
	public number(int m,int n)  //构造函数不写void int 只写函数名（也就是类名）
	{
		this.m=m;
		this.n=n;
	}
	
	public int sum()
	{
		return this.add(m,n);//调用这个类里面的add函数，类里面的私有成员m，n作为实参
	}
	public int add(int a,int b)
	{
		return a+b;
	}
}
	
class getset
{
	private int height;
	private int weight;
	private int money;
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
}













	
	