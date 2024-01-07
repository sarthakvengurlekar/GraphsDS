package Recursion;

public class reverseString {

    public String reverse(String s){
        if(s.equals("")){
            return s;
        }
        return s.substring(1) + s.charAt(0);
    }
    
}
