package a123;



public class solution {


	public static void main(String[] args)
	{
		vehical car=new vehical(100);
		vehical bus=new vehical(3290);
		car.y=11;
		bus.y=11231;
		car.heavy();
		bus.heavy();
		
	}




	
}

class vehical {
	
	int weight;//��Ա���� ÿ�������и��Եĳ�Ա����
	static int y=0;//����� �������������ж���ָ����е������
	
	vehical(int num)
	{
		System.out.println("it can run ");
		this.y=10;
		this.weight=1;
	}
	

	void heavy()
	{
		
		System.out.println("weight=="+this.weight);
		System.out.println("y=="+y);
	}
	
	
	
}
