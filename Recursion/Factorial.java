package Recursion;

public class Factorial {

    public int head(int n){
        if(n == 1){
            return 1;
        }

        int res1 = head(n - 1);
        int result = n * res1;

        return result;
    }
    
}
