package lei;

public class constant extends lei0
{
		public final static int b=3;
		public final static int a=999;
		public static final  String name="shencongwen";

		
		
		public static int fangfa1()
{
	int nb=8;
	
	System.out.println("b1="+b);//���static��b��ȫ��
	return nb;
}
	
		
		
	public static void main(String[] args) 
	{
		fangfa1();
		//public final static int a=3;//�����Ķ���ֻ����һ��,staticͬ������������ֻ����һ�����ڸ��������ڿ��Ը��������һ��
		int b=0;//��final�ַ����Խ�����b�ٴ��޸�  final int b=0;   
	
		System.out.println("a="+a);//����ı������ȼ����
		System.out.println("b2="+b);//��������������ı���b
		System.out.println("b3="+constant.b);//����������ı���b
		System.out.println("name="+name);	
		lei0 dx=new lei0();
	
		dx.output();	//���ø��෽���õ������a
		
		
		int s1=10;//������
		Integer s2=10;//�����Ͱ�װ�ɶ���
		Integer s3=new Integer(10);//����s3==10
		Integer s4=new Integer(5);//����s4==5
		Integer s5=new Integer(5);//����s5==5
		Integer s6=s4+s5;//�����Ͱ�װ�ɶ��� �ȶ���Ͷ������,�õ�����10 s6==10
		System.out.println(s1==s2);//true  �����Ͷ���Ƚϣ��������ɻ��� �Ƚ�ֵ
		System.out.println(s1==s3);//true  �����Ͷ���Ƚϣ��������ɻ��� �Ƚ�ֵ
		System.out.println(s2==s3);//false  ����Ͷ��� �Ƚϣ��Ƚϵ�ַ
		System.out.println(s1==(s4+s5));//true �ȶ���Ͷ�����㣬��������ͬʱ����ɻ�����������������ٺͻ����Ƚϣ��Ƚ�ֵ
		System.out.println(s2==(s4+s5));//true �ȶ���Ͷ�����㣬��������ͬʱ����ɻ�����������������ٺͶ���Ƚϣ��������Ƚ�ֵ
		System.out.println(s3==(s4+s5));//true �ȶ���Ͷ�����㣬��������ͬʱ����ɻ�����������������ٺͶ���Ƚϣ��������Ƚ�ֵ
		System.out.println(s1==s6);//true  �����Ͷ���
		System.out.println(s2==s6);//true  ����Ͷ�����Ϊ������ջ�ڴ棬��ֵλ�ڳ�������ֵҲ�������ָ��ĵ�ַ��ͬ
		System.out.println(s3==s6);//false ����Ͷ���һ��ջ�ڴ棬һ�����ڴ��ַ��ͬ
		
		String c1="abc";  //string���࣬abc�ǳ��� c1�Ǳ���,λ��ջ�ڴ泣����
		String c2="abc";  
		String c3=new String("abc");//string���࣬abc�ǳ��� c3�Ƕ���,λ�ڶ��ڴ�
		String c4=new String("abc");
		String c5="abcdef";
		String c6="abc"+"def";//���ǳ������������Ż���abcdef
		String c7=c1+"def";//c1�Ǳ��� Ψ��ȷ���ĳ������Ż������Դ˴����������Ż�
		String c8="abc"+new String("def");//�漰��new���󣬱��������Ż�
		
		
		
		
		System.out.println(c1==c2);//true  ������
		System.out.println(c1==c3);//false �����Ͷ���Ƚϣ�һ��ջ�ڴ�һ�����ڴ�
		System.out.println(c3==c4);//false ����Ͷ���Ƚϣ��Ƚϵ�ַ�������ڴ���Դ洢
		
		System.out.println(c5==c6);//true ������ ����һ������
		System.out.println(c5==c7);//false ����ͬһ�ڴ�
		System.out.println(c5==c8);//false ����ͬһ�ڴ�
		System.out.println(c7==c8);//false ����ͬһ�ڴ�
	
		
		
		
		
		
		
	
	

	}

}

class lei0
{
	public final static int a=666;
	
	public void output()
	{
	System.out.println(a);
	}
	public static int fangfa1()
	{
		int nb=8;
		System.out.println("nb="+nb);
		return nb;
	}
	
}

interface  jiekou//�ӿ��ڶ���ı���Ĭ��Ϊ����,�޷��޸�
{
	String name="yangshengdong";//Ĭ��Ϊpublic static final String name
//	private String java="java";
	
}













