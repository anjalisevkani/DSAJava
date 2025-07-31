import java.util.Scanner;
import javax.sound.sampled.SourceDataLine;
public class Loops {
    public static void main(String[] args) {
        /* Syntax of for loops:

        for(initialisation;condition;increment/decrement){
               //body
        }
         
        */

        // Print numbers from 1 to 5
        /*for(int num=1;num<=5;num+=2){
            System.out.println(num);
        }*/

        //print numbers from 1 to n
        Scanner sc = new Scanner(System.in);
        /*int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            System.out.println(i);
        }*/

        /*syntax for while loops

          while(condition){
              //body
           }
        */

        /*int n =1;
        while(n<=5){
            System.out.println(n);
            n++;
        }*/
       //Use while loop when you don't know how many times you have to run the code...and vice versa for the other

       /* syntax for do while loop
        * 
        do{
        //body
        }while(condition)
        */

        int n =1;
        do { 
            System.out.println(n);
            n++;
        } while(n<=5);
        // It will run atleast once
    }
    
}
