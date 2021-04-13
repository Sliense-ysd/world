package learn_class;

import java.util.concurrent.RecursiveAction;

/*对象多态性：向上转型和向下转型
* 方法多态性：override | overload*/

/*有几个问题？*/
public class t4_polymorphism {

    public static void receive_object(Person p){  //不加static 主函数就不能访问到，为什么？
        p.say();
    }

    public static void main(String[] args) {
        receive_object(new Old_person());  //来了一个向上转型
        receive_object(new Young_person());
        Person p2=new Old_person();
        p2.say();
        /*p2.stand();  没有，因为虽然本质是子类，但转型以后，栈内存和堆内存发生了什么变化呢？ 原来的子类的方法被隐藏了？*/
        System.out.print( "使用instanceof p2是否为Oldperson  :" ); System.out.println(p2 instanceof  Old_person);
        System.out.print( "使用instanceof p2是否为Person  :" ); System.out.println(p2 instanceof  Person);
        if(p2 instanceof Old_person) {
            Old_person o2 = (Old_person) p2;  //向下转型 和向上转型的 左边是一样的，要转型的类和对象名，右边有所不同
            o2.stand();
        }

        System.out.println(p2);

        /*Object类和String类的equals的区别*/
        /*Object类的equals进行地址比较*/
        Object obj1=new Object();
        Object obj2=new Object();
        System.out.println(obj1.equals(obj2));

        /*String类的equals进行对象内容比较*/
        String str1=new String();
        String str2=new String();
        System.out.println(str1.equals(str2));


    }
}

/*重写*/
class Person{
    public void say(){
        System.out.println("a");
    }
    @Override
    public String toString(){
        return "我是Person类";
    }
}
class Old_person extends Person{
    @Override
    public void say(){
        System.out.println("i am old");
    }
    public void stand(){
        System.out.println("oldman stand");
    }
}
class Young_person extends Person{
    @Override
    public void say(){
        System.out.println("i am young");
    }
    public void stand(){
        System.out.println("youngman stand");
    }
}

//研究object
class Obj{

    public Obj(){
        super();

    }
}





