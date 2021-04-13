package title;

import com.sun.jmx.snmp.SnmpUnknownModelLcdException;
import sun.applet.Main;

/*
* 实现用静态变量为对象编号赋值，每添加一个对象就增加记录对象总数的静态变量
* */
public class t2 {
    public static void main(String[] args) {
        new Book("tiancai");
        new Book("sfd");
        new Book("xc");
        new Book("vv");
        Book.print();


    }
}

class Book{

    static int sum=0;
    int book_num;
    String book_name;

    public Book(String book_name){
        this.book_name=book_name;
        sum=sum+1;
        this.book_num=sum;
        System.out.println(this.book_name+"是"+this.book_num);
    }

    public static void print(){
        System.out.println("图书总数=="+sum);
    }
}
