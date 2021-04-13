package 反射机制;

public class 单例模式
{ 
	private static 单例模式 _a =new 单例模式();
	private String string="shabi";

    private 单例模式(){
	this.string="adc";
	}

	public String getstring() {
	return string;
	}

    public void setstring(String string){
	this.string = string;
    }


	public static 单例模式 get_a(){
		return _a;
	}

	public static void set_a(单例模式 _a) {
		单例模式._a = _a;
	}

	
	
	public static void main(String[] args)
	{
		
	}

}
