package vvv;

public class Main 
{

	public static void main(String[] args) {
		
	

		
		Employee member1=new Employee("С��",1,1000);//����
		
		//�����
		System.out.println(member1.getBase_money());
	
			
		member1.setBase_money(10);
		//member1.count_sum(1020.0,2.0);//������н��Ĺ���
		
		System.out.println(member1.getBase_money());//�鿴����
	
	
	}

}

class Employee{
	
	String name;
	private double base_money;
	double increse;
	int num;
	
	//���� ʹ�ù��췽��ʵ�� �������ʽ�
	public Employee(String name,int num,double base_money)
	{
		this.name=name;
		this.num=num;
		this.base_money=base_money;
		
	}
	
	public void count_sum( double base_money,double increse)
	{
		
		this.base_money=  base_money*(1+increse);
		
	}

	
	public double getBase_money()
	{
		return base_money;
	}
	
	public void setBase_money(double base_money) {
		this.base_money = base_money;
	}




	
	
	
}