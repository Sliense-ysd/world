package ��Ͷ���;

public class ʵ�� 
{

	public static void main(String args[])
	{	
	number dx1=new number(3);
	System.out.println(dx1.sum());	
	}
}
	
class number//��ͨ���� ����дprivate ����дpublic
{
	private int m,n;
	
	public number()
	{
		this(0,0);
	}
	
	public number(int m)
	{
		this(m,3);//Ҳ����number (3,0)
	}
	
	public number(int m,int n)  //���캯����дvoid int ֻд��������Ҳ����������
	{
		this.m=m;
		this.n=n;
	}
	
	public int sum()
	{
		return this.add(m,n);//��������������add�������������˽�г�Աm��n��Ϊʵ��
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













	
	