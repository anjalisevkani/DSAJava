import java.util.*;
import java.util.Scanner;
public class Arrays{
    public static void main(String[] args) {
        //q. store a roll number
       // int a= 19;

        //q. store a person's name
        //String name= "Anjali";

        //q. store 5 roll numbers
        //int rno1 = 23;
        //int rno2 = 55;
        //int rno3 = 18;

        //syntax
        //datatype[] variable_name = new datatype[size];
        // store 5 rollnos
        //int[] rnos = new int[5];
        //or directly
        //int[] rnos2 ={23,12,45,32,15};
        Scanner sc = new Scanner(System.in);
        //array of primitives
        int arr[] = new int[5];
        arr[0] = 23;
        arr[1] = 45;
        arr[2] = 133;
        arr[3] = 49;

        //[23,45,133,49]
        System.out.println(arr[3]);

        //input using loops
        
        
        /*for(int i=0;i<arr.length;i++){
            arr[i]= sc.nextInt();
        }*/

        //System.out.println(java.util.Arrays.toString(arr));
        /*for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]+ " ");
        }
        //for-each loop
        for(int num: arr){
            System.out.println(num + " ");
            //for every element in array, print the element
            //here num represents element of the array
        }*/

       // System.out.println(arr[5]); //index out of bound error


    //array of objects
    String[] str= new String[4];
    for(int i=0;i<str.length;i++){
        str[i] = sc.next();
    } 
    System.out.println(java.util.Arrays.toString(str));
    //modify
    str[1]= "anjali";
    System.out.println(java.util.Arrays.toString(str));
    }

    public static char[] toString(int[] search) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'toString'");
    }

    public static Object asList(String string) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'asList'");
    }

   
    
    
}