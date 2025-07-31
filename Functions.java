import java.util.Scanner;
public class Functions {
    public static void main(String[] args) {
        //sum();
        //int sum = sum2();
        //System.out.println(sum);
        //int sum= sum3(4,8);
        //System.out.println(sum);
        String personalised = myGreet("Anjali Sevkani");
        System.out.println(personalised);

    }

    static void sum(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number 1: ");
        int num1 = sc.nextInt();
        System.out.println("Enter number 2: ");
        int num2 = sc.nextInt();
        int sum= num1 + num2;
        System.out.println("The sum = " + sum);
    }
    //return the value
    static int sum2(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number 1: ");
        int num1 = sc.nextInt();
        System.out.println("Enter number 2: ");
        int num2 = sc.nextInt();
        int sum= num1 + num2;
        return sum;
    }
    //pass the value of numbers when you are calling the method in main()
    static int sum3(int a,int b){
        int  sum = a+b;
        return sum;
    }
    //String example
    static String myGreet(String name){
        String message= "Hello " + name;
        return message;
    }
    
    
}
