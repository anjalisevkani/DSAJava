import java.util.Scanner;

public class Temperature{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("please enter temp in c: ");
        float tempc = in.nextFloat();
        float tempf = (tempc * 9/5) + 32;
        System.out.println(tempf);
    }
}