package hashmap;



public class Solution1 {
    public int MoreThanHalfNum_Solution(int [] array) {
        int array_middle=array.length;

        int array_copy[]=new int[array.length];

        int index=0;  //索引，把数组元素存到索引，在copy数组里对对应的索引下标加1
        for(int i:array){
            index=array[i];
            array_copy[index]+=1;
        }

        for(int i:array){
            if(array[i]>array_middle)
                return i;
        }
        return 0;



    }


    public static void main(String[] args) {
        MoreThanHalfNum_Solution()
    }
}