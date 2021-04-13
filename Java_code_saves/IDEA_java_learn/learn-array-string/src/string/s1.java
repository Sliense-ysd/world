package string;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane;

/*
string 基本学习
* */
public class s1 {
    public static void main(String[] args) {


        /*字符串定义*/
        /*直接赋值和实例化字符串的区别 直接赋值会在堆内存的字符串常量池中检测是否已有，若没有则开辟一个字符串，实例化会先在常量池开辟，再从堆内存中开辟对象*/
        String string1="hello";
        String string2=new String("hello");


        /*字符串比较*/
        /*  ==号和 equals() 的区别
         *  == 进行数值比较 更精确的说是栈内的数值比较，但对象与对象之间的栈的值是地址，
         *     不能用于对象、数组、字符串(引用数据类型)的数值比较，此时相当于进行地址比较*/
        String a="asdfgh";
        String b="asdfgh";
        String c=new String("asdfgh");
        String d=null;
        System.out.println(a==b);
        System.out.println(a==c);
        //System.out.println(d.equals("aa"));//抛出异常，为什么呢？空对象不能调用方法
        System.out.println("aa".equals(d));//以后要将字符串常量写在前面，由于字符串常量是匿名对象,匿名对象不可能为空所以不会导致空指向异常



        /*字符串方法*/
        /*toCharArray*/
        /*构造方法 将字符数组转为字符串*/
        String s1="hello,world";
        char c1[]=new char[20];
        c1=s1.toCharArray();     //字符串的本质就是字符数组 转成字符数组有利于修改
        String s3=new String(c1); //c1是字符数组

        System.out.println("toCharArray:"+c1);//这里的加号运算，参数必须同类型，所以输出char[] 的首地址
        System.out.print("toCharArray:"); System.out.println(c1);

        /*charAt*/
        String s2="hello";
        char c2=s2.charAt(2);
        System.out.println("charAt:"+c2);

        /*indexOf*/
        String s4=new String("helloworld");
        System.out.println("indexOf："+s4.indexOf("ow"));














    }
}
