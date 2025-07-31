import java.util.Arrays;
import java.util.Scanner;
public class VarArgs {
    public static void main(String[] args) {
        //fun();
        //multiple(2,6,"Kunal", "Anjali");
        //demo(); // this is known as ambiguity....it cannot be empty
    }
    static void demo(int ...v){
        System.out.println(Arrays.toString(v));
 
    }
    static void demo(String ...v){
        System.out.println(Arrays.toString(v));
 
    }
    static void fun(int ...v){  //v is implicitly declared of an array of type int
        System.out.println(Arrays.toString(v));
 
    }
    //multiple arguments
    static void multiple(int a, int b, String ...v){  // variale length arguments should always come at the end
        System.out.println(a+" "+ b +" "+Arrays.toString(v));
    }

    //In varialle length arguments, length is not constant..it varies towards the vary of input we provide.
}
