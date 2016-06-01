/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursion1;

/**
 *
 * @author nazrul
 */
public class array6 {
    public static boolean array6(int[] nums, int index){
        
    if(index==nums.length-1)
        return false;
    else
        if(nums[index]==6)
            return true;
    else
            return array6(nums, index+1);
    }

    public static void main(String[] args) {
        int arr[]={5,6,8};
        System.out.println(array6(arr, 0));
    }
}
