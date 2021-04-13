package title;

import org.omg.Messaging.SyncScopeHelper;

public class t1 {
    public static void main(String[] args) {


        Address a=new Address("中国","武汉","湖北","yiyuan");
        System.out.println(a.getAddress());
    }
}

class Address{
    private String guojia;
    private String shengfen;
    private String chengshi;
    private String jiedao;


    public Address(String guojia,String shegnfen, String chengshi,String jiedao){
        this.chengshi=chengshi;
        this.guojia=guojia;
        this.jiedao=jiedao;
        this.shengfen=shegnfen;

    }

    public String getAddress(){
        return "国家"+this.guojia+this.shengfen+this.chengshi+this.jiedao;
    }
}
