/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array1;

/**
 *
 * @author Lenovo
 */
public class firstLast6 {
    public static boolean firstLast6(int[] nums) {
  if(nums[0]==6 | nums[nums.length-1]==6)
return true;
else
return false;
}

    public static void main(String[] args) {
        int num[]=new int[5];
        System.out.println(firstLast6(num));
        
    }
    
}
