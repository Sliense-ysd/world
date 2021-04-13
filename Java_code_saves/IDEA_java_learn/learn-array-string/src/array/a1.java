package array;

public class a1 {
    public static void main(String[] args) {

        /*多个基本类型的数组*/

        int array[]=new int[]{1,2,3};
        int array1[]=new int[]{1,2,3};
        char c1[]=new char[]{'H','i'};  //等效于string
        byte b1[]=new byte[]{1,2};
        String s1=new String("abcd"); //string类的构造方法: public String(byte[] bytes) 将全部字节数组变为字符串
        String s2=new String("abcd"); //string类的构造方法: public String(byte[] bytes) 将全部字节数组变为字符串
        long l1[]=new long[]{100,200};
        System.out.println(array==array1);
        System.out.println(c1);
        System.out.println(l1);
        /*想用foreach没法输出非int类型的数组
        for(int i:l1)  System.out.println(l1[i]);
        for(int i:c1)  System.out.println(c1[i]);*/


        int a[]=new int[10];

        for(int x=0;x<a.length;x++){
            a[x]=x+1;
        }
        for(int x=0;x<a.length;x++){
            int t;
            t=a[x];
            a[x]=a[a.length-1-x];
            a[a.length-1-x]=t;
        }
        for(int x:a)
            System.out.println(x+" ");
    }
}
