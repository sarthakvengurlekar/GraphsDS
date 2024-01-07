package Recursion;

public class BinarySearch {

    public int look(int[] nums, int target, int left, int right){
        if(right < left){
            return -1;
        }

        int middle = (left + right) / 2;
        if(nums[middle] == target){
            return middle;
        }
        if(nums[middle] < target){
            return look(nums, target, middle + 1, right);
        }
        else{
            return look(nums, target, left, middle - 1);
        }
    }
    
}
