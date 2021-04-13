package learn_class;

import com.sun.xml.internal.ws.api.streaming.XMLStreamWriterFactory;

/*继承,this,super*/
public class t3_extends {
    public static void main(String[] args) {

        son s1=new son();
        s1.function_1();
    }
}

class father{
    protected void function_1(){
        System.out.println("protected father");
    }
     void function_2(){
        System.out.println("default father");
    }


}

/*this 和super的调用查找范围优先的区别*/
class son extends father{
    public son(){
        super();
        //this();  报错，调用无论是子类还是父类的构造方法必须写在"第一句",换句话说，在一个普通|构造方法里,只能调用一句构造方法，两句都不行

        System.out.println("son_function_1");
        this.function_2();
        super.function_1(); //使用super.方法  this.方法() 调用普通方法可以放在任意位置

    }

    @Override  //给用于覆写的方法前面追加override能对你覆写是否正确进行校验，并方便以后的阅读
    public void function_1(){
        //super(); 报错，构造方法的调用必须写在“构造方法”内的“第一句”

        System.out.println("son_function_1");


        this.function_2();
        super.function_1();
        super.function_2();
        super.function_2();
        /*function_1();  不写则默认表示this.*/

        System.out.println("son_function_1");
    }
}
