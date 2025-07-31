public class Shadowing {
    static int x=90; //this will be shadowed at line 5
    public static void main(String[] args) {
        System.out.println(x); //90
        int x;// the class variable at line 3 is shadowed by this
        //System.out.println(x);  //scope will begin when the value is initialised
        x=40;
        System.out.println(x); //40
        fun();

    }
    static void fun(){
        System.out.println(x);
    }
    //Shadowing in java is basically a practice of using two variables with the same name within the scope that overlaps 
    //  It does not take place in methods
}
