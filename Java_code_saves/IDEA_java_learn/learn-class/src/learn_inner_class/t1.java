package learn_inner_class;
/*
* 1 学习在外部类中定义内部类
* 2 在类中只能够定义属性，方法，定义引用数据类型即new  不能做运算操作，调用操作
* 3 内部类使用外部类的私有属性
* 4 外部类使用内部类的私有属性
*
* */
public class t1 {
    public static void main(String[] args) {

//        out_class1.in_class1 obj=new out_class1().new in_class1();
//        obj.say();

        out_class1.in_class1.inner_inner_class1 obj=new out_class1().new in_class1(). new inner_inner_class1();
        obj.say_inner();

//        out_class1 o1=new out_class1();
//        o1.function();
    }
}


class out_class1{
    private int num=10;

    /*out_class1.in_class1 object=new out_class1().new in_class1();
    object.say();
    词句会警告say（）无效，因为这两句话，是写在class里面的 class里面只能用于定义属性，方法，不能做运算！
    如 num=num+10;*/

    public void function(){
        System.out.println(this.num);
//        in_class1 in1=new in_class1();//定义对象
//        in1.say();
//        System.out.println(in1.inner_num);//3 外部类的方法使用内部类的私有属性
    }
    class in_class1{
        private int inner_num=222;
        public void say(){
            System.out.println(out_class1.this.num);//4 内部类方法使用外部类的私有属性
        }
        class inner_inner_class1{
            private int num2;
            public void say_inner(){
                System.out.println(num2);
            }
        }
    }
}
