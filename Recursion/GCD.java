package Recursion;

public class GCD {

    public int getGCD(int a, int b){
        if(a % b == 0){
            return b;
        }

        return getGCD(b, a % b);
    }

    public int getGCD_iteration(int a, int b){
        int temp = 0;

        while(b != 0){
            temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    
}
