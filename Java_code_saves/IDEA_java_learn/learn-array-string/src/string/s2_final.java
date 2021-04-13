package string;

public class s2_final {

    public static void main(String[] args) {
        String s1="helloworld";
        final String  s2_changliang="world"; //经过final定义后是常量，就会在静态常量池中开辟
        String s2_bianliang="world";   //变量，定义后在静态常量池中开辟 但上面已经开辟，故这里会引用原有的final常量
        System.out.println(s2_changliang==s2_bianliang);

        String s3="hello"+s2_changliang;
        String s4="hello"+s2_bianliang;

        System.out.println(s1.equals(s3));
        System.out.println(s1.equals(s4));




    }
}



