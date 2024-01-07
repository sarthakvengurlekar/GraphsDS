package Recursion;

public class LinearSearchh {

    public int find(int[] nums, int n){
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == n){
                return i;
            }
        }
        return -1;
    }

    public int recursive_search(int[] nums, int n, int i){
        if(i == nums.length){
            return -1;
        }

        if(nums[i] == n){
            return i;
        }

        return recursive_search(nums, n, i + 1);
    }
    
}
