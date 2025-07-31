import java.util.Scanner;
public class SwitchCases {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*System.out.println("Enter fruit: ");
        String fruit = sc.next();

        switch(fruit){
            case "Mango" -> System.out.println("King of fruits");
            case "Apple" -> System.out.println("a sweet red fruit");
            case "Orange" -> System.out.println("round fruit");
            case "Grapes" -> System.out.println("a small fruit");
            default -> System.out.println("Please enter valid fruit.");
        }*/

        System.out.print("Enter a day: ");
        int day = sc.nextInt();

        switch(day){
            case 1, 2, 3, 4, 5 -> System.out.println("WEEKDAY");
            case 6, 7 -> System.out.println("WEEKEND");
            default -> System.out.println("INVALID INPUT!!");
        }
    
    }
}
