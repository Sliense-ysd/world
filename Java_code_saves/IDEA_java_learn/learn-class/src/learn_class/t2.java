package learn_class;

/*
* 实现一个数据表 父结构包含子结构
* 可以获取父结构的信息
* 可以根据父结构获取其对应的所有子结构的信息
* */
public class t2 {
    public static void main(String[] args) {

        //第一步，定义各个数据表
        father_struct f=new father_struct("老大","大佬");
        son_struct son[]=new son_struct[]{
                new son_struct("老二","采集"),new son_struct("老三","菜鸡")//对象数组的定义，使用静态初始化
        };
        //第二步，联系(设置)各个数据表 set
        f.setson_struct(son);//设置数组


        //第三步，获取各个数据表  get
        System.out.println(f.getinfo());

        for(int a=0;a<son.length;a++)
        System.out.println( f.getson_struct()[a].getinfo() );

        /*调用t3_extends类中的public方法*/
        /*public权限:对于整个包，都能访问到它*/
        father f1=new father();
        f1.function_1();


    }
}


class father_struct{
    private String fid;
    private String fname;
    private son_struct s[];

    public father_struct(String fid,String fname){
        this.fid=fid;
        this.fname=fname;
    }
    public son_struct[] getson_struct(){
        return this.s;  //返回对象数组名
    }

    public void setson_struct(son_struct s[]){
        this.s=s;
    }
    public String getinfo(){
        return this.fid+this.fname;
    }



}
class son_struct{
    private String sid;
    private String sname;

    public son_struct(String sid,String sname){
        this.sid=sid;
        this.sname=sname;

    }

    public String getinfo(){
        return this.sid+this.sname;
    }
}









/*
class quanxian{
    private String quanxian_id;
    private String juese_id;
    private String name;

}

class juese{
    private String juese_id;
    private String
}

*/
