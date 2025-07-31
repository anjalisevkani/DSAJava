public class FunctionOverloading {
    public static void main(String[] args) {
        //fun(67);
        //fun("anjali");
        int ans=sum(5,8);
        System.out.println(ans);
    }
    static int sum(int a,int b){
        return a+b;
    }
    static int sum(int a,int b,int c){
        return a+b+c;
    }
    static void fun(int a){

    }
    static void fun(String name){

    }
}
