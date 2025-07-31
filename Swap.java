
import java.util.Arrays;

public class Swap {
    public static void main(String[] args) {
         int a =10;
         int b=30;
         int arr[] ={1,2,3,4,5,6};
         change(arr);
         System.out.println(Arrays.toString(arr));


        //swap two numbers
        /*int temp =a;
        a=b;
        b=temp;
        System.out.println(a + " "+ b);*/

       // swap(a,b);
        //System.out.println(a + " "+ b);

    
    }
    //not happening
    static void swap(int a, int b){
        int temp =a;
        a=b;
        b=temp;

    }

    static void change(int[] nums){
        nums[0]=99;// if you make a change to the object via this ref variable, same object will be changed
    }
    
}
