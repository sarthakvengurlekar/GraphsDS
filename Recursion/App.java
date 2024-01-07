package Recursion;

public class App {

    public static void main(String[] args) {
        Factorial f1 = new Factorial();
        System.out.println(f1.head(6));

        Factorial f2 = new Factorial();
        System.out.println(f2.tail(5, 1));

        Fibonacci fibh = new Fibonacci();
        System.out.println(fibh.tail(5, 0, 1));

        TowersofHanoi t1 = new TowersofHanoi();
        t1.solve(2, 'A', 'B', 'C');

        reverseString s = new reverseString();
        System.out.println(s.reverse("Hellooooze"));

        GCD x = new GCD();
        System.out.println(x.getGCD(24, 9));
        System.out.println(x.getGCD_iteration(24, 60));

        int[] nums = {4, 5, 7, 11, 90, 2, 55, 21};
        LinearSearchh l = new LinearSearchh();
        System.out.println(l.find(nums, 90));
        System.out.println(l.recursive_search(nums, 11, 0));
        
    }
    
}
