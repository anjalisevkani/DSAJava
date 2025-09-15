import java.util.*;
public class SwappingNibbles {
    public static void main(String[] args) {
        int num =177;
        int result= swap(num);
        System.out.println("original number : " + num);
        System.out.println("After Swapping: " + result);
    }
    static int swap(int x){
        return ((x & 0x0F)<<4) | ((x & 0xF0)>>4);

    }
    
}
