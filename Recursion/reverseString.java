package Recursion;

public class reverseString {

    public String reverse(String s){
        if(s.equals("")){
            return s;
        }
        return reverse(s.substring(1)) + s.charAt(0);
    }
    
}
