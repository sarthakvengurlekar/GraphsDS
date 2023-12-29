package Recursion;

public class TowersofHanoi {

    public void solve(int disk, char source, char middle, char destination){
        if(disk == 0){
            System.out.println("Plate " + disk + " from " + source + " to " + destination);
            return;
        }
        //n - 1 to middle rod to move largest to destination rod
        solve(disk - 1, source, destination, middle);
        System.out.println("Plate " + disk + " from " + source + " to " + destination);

        solve(disk - 1, middle, source, destination);
    }
    
}
