package title;

public class t4 {
    public static void main(String[] args) {
        new c1(){
            @Override
            public void hanshu() {

                System.out.println("override");
            };

        }.hanshu();


    }

}

class c1{
    public void hanshu(){
        System.out.println("print");
    }
}
