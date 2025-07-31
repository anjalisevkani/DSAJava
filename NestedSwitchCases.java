import java.util.Scanner;
public class NestedSwitchCases {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int empID = sc.nextInt();
        String department = sc.next();

        switch(empID){
            case 1:
               System.out.println("Kunal Kushwaha");
               break;
            case 2:
               System.out.println("Rahul Kumar");
               break;
            case 3:
               System.out.println("Emp number 3");
               switch(department){
                  case "IT" -> System.out.println("IT department");
                  case "Management" -> System.out.println("Management department");
                  default -> System.out.println("No department entered");
               }
            default:
                System.out.println("Enter correct empID");


        }
    }
    
}
