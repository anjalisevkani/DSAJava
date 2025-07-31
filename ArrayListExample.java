import java.util.*;
public class ArrayListExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Syntax
        ArrayList<Integer> list = new ArrayList<>(10);

       /*  list.add(67);
        list.add(123);
        list.add(66);
        list.add(88);
        list.add(98);
        System.out.println(list.contains(67));
        list.set(0,99);
        list.remove(2);
        System.out.println(list);*/

        //input
        for(int i=0;i<5;i++){
            list.add(sc.nextInt());
        }
        //get item at any index
        for(int i=0;i<5;i++){
            System.out.println(list.get(i));   //pass index here,list[index] syntax will not work here
        }
        System.out.println(list);


    }
}
