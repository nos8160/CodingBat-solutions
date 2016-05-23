/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array2;

import java.util.Arrays;

/**
 *
 * @author nazrul
 */
public class trippleUP {
   public static boolean trippleUp(int [] nums){
   for(int i=0;i<nums.length-2;i++){
   if((nums[i]+nums[i+1]+nums[i+2])/3==nums[i+1] && (nums[i]+nums[i+1]+nums[i+2])%3==0 && nums[i+1]<nums[i]){
   return true;
   }
   
   }
   return false;
 
   }
   
    public static void main(String[] args) {
        int arr[]={5,6,8};
        System.out.println(trippleUp(arr));
    }
}
