package learn_inner_class;

import java.lang.invoke.VolatileCallSite;
import java.security.acl.Acl;

/*
* 学习内部类各种实例化
* */
public class t2 {
    public static void main(String[] args) {
        Aclass.Bclass a=new Aclass.Bclass(2);  //当内部类被static修饰，则内部类名称=外部类.内部类
        a.fun2();
        Aclass.Cclass b=new Aclass().new Cclass();//当内部类不被static修饰，要先实例化外部类再实例化内部类
        b.fun3();
        new Aclass().fun1();
        new Aclass().new Cclass(); //普通类套一个普通内部类，只能这么做，一个个实例化外部类才能实例化内部类
        new Aclass.Bclass(1).fun2();//外部类.内部类(构造方法参数).方法();
        new Iinter.Iinter2.Cimplements();//外部接口.内部接口.方法()  直接调用接口内的方法





    }
}

class Aclass{
    public void fun1(){};

    public Aclass(){
        System.out.println("a");
        new Bclass(1);
    }


    static class Bclass{
        public Bclass(int a){
            System.out.println(a);
        }
        public void fun2(){};
        public void fun2_1(){};
        public void fun2_2(){};

        class Bbclass{
            public void show(){
            }
        }
    }

    class Cclass{

        public void fun3(){};
        class Dclass{
            public void fun4(){};
        }
    }
}

interface Iinter{
    interface Iinter2{
        class Cimplements{

        }

    }
}


class S1{
    private int sd=1;
    public void fs(){
        S2 s2=new S2();
        s2.print();
    }
    class S2{
        public void print(){
            System.out.println(S1.this.sd);//一定要写外部类.内部类对象.属性 为什么？ 可不可以内部类对象.属性
        }
    }
}
