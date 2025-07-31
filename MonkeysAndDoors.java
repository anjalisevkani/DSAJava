public class MonkeysAndDoors {
    public static void main(String[] args) {
        int numDoors=10;
        boolean[] doors = new boolean[numDoors];

        for(int monkey=1;monkey<=numDoors;monkey++){
            for(int door=monkey;door<=numDoors;door+=monkey){
                doors[door-1]=!doors[door-1];
            }
        }
        System.out.println("Doors that remain OPEN: ");
        for(int i=0;i<numDoors;i++){
            if(doors[i]){
                System.out.println("Door "+ (i+1));
            }
        }
    }
    
}
