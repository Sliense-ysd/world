package overloading;

public class base_type {
	
	int num;
	int tel;
	String name;
	String say;
	
	//���⣺��һ����������int������Ҫ��new����ʱͨ�����췽����ֱ�Ӹ���Ա���ԣ�Ӧ����ô������
	//��һ��  //���ڸ����ж��int��Ա���ԣ����췽��ֻ����һ������int���βΣ���������һ���ж�
	public base_type(int number)//���췽���Ĳ�����һ��int��
	{
		if(number>10000)      
			this.tel=number;
		else
			this.num=number;
		
	}
	//�ڶ���  ʹ�������β�
	public base_type(int num,int  tel)//���췽���Ĳ�����һ��int��
	{
		this.tel=tel;
		this.num=num;
	}
	//�ڶ��ֵ��Ż� ʹ��this�ؼ���ȥ���ù��췽��()

/**
 		public base_type(int num)//���췽���Ĳ�����һ��int��
		{
			this.num=num;
			
		}
	  
	 
		public base_type(int num,int  tel)//���췽���Ĳ�����һ��int��
		{
			this(num);  //���ִ��������
			this.tel=tel;
		}
 * 
 *
 */
	
	
	 
	
}

