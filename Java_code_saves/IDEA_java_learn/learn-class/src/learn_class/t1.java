package learn_class;

        import java.lang.invoke.VolatileCallSite;

/*
 * 学习类和方法的使用
 *
 * 类可以定义属性、方法、类(接口)，属性包括基本数据类型和引用数据类型
 *
 * main方法和普通方法一样可以做的事情有：
 * 属性：定义非static等的属性， 实例化属性
 * 方法：不可定义方法
 * 类：可以定义内部的类(接口) 但内部类不能使用方法里的属性
 * 所有的处理 如计算属性，调用方法 */
public class t1 {
    public static void main(String[] args) {

      F f=new F();
        f.fun();
        f.fun1();
        F.x_static=22;
//
//    Double d1=new Double(100.2);
//    Double d2=new Double(100.2);
//
//    Learn_1 l1=new Learn_1();
//    Learn_1 l2=new Learn_1();
////    l2.x1=1000;
//    System.out.println(l1.equals(l2));
//    System.out.println(d1.equals(d2));



    }
}

class Learn_1{
    /*属性*/
    public int x1=11;
    /*方法*/
    public void learn_fun(){
        System.out.println(1);
    }
    /*类*/
    class Learn_2{
    }
    /*抽象类*/
    abstract class Learn_3{
    }
    /*接口*/
    interface ILearn_3{
    }

}
    /*不能在类以外定义方法*/
//    public void fun11(){
//        System.out.println("sadf");
//    }
class F{
    int a1;
    int x[]=new int[10];
    String s1=new String("实例化字符串");
    String s2="直接赋值字符串";
    Learn_1 obj1=new Learn_1(); //实例化对象
    /*类不能调用方法*/
//    obj1.learn_fun();

    public void fun(){
        System.out.println("方法1");

    }
    //属性：定义的位置不影响
    int zy=10;
    static int x_static=100;
    final int x_final=8;
    volatile int x_volatile=255;//不易变

    /*方法可以定义，处理*/
    public void fun1(){
        /*方法里不能定义非final类型*/
//        static int s12=12;
//        volatile int s23=11;
//        public int sdd=100;
        /*不能定义方法*/
//        public void fun3(){
//            System.out.println("sdfa");
//        }

        System.out.println("方法2");
        Learn_1 l2=new Learn_1();
        l2.learn_fun();
        l2.x1+=11;
        System.out.println(l2.x1);

        /*定义类 但在方法里定义类是无法使用的*/
        class F2{

            public void fun2(){
                System.out.println("调用F fun1 F2 fun2方法");
            }
        }

    }




}