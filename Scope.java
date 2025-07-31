 
public class Scope {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        String name = "Kunal";

        {
            //int a = 78;  // already initialised outside the block in the same method, hence you cannot initialize again
            a=100; //reassign the original reference variable to some other block
            int c=99;
            //values initialised in this block,will remain in block
            name="Rahul";
            System.out.println(name);
        }
        System.out.println(a);
        System.out.println(name);
        //System.out.println(c); //cannot use outside the block

        //scoping in for loops
        for(int i=0;i<4;i++){
            System.out.println(i);
            //int num=90;
            //int a=10;

        }
        //System.out.println(i);//cannot access i outside the loop
    
    
    
    }
    static void random(int marks){
        int num=67;
        System.out.println(num);
        System.out.println(marks);
    }
    
}
