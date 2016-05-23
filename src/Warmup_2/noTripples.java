/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Warmup_2;

/**
 *
 * @author Lenovo
 */
public class noTripples {
    public static boolean notripples(int[] nums){
        boolean b=true;
        for(int i=0;i<nums.length-2;i++){
        if(nums[i]==nums[i+1]&& nums[i+1]==nums[i+2])
            b=false;
            }
        return b;
    }
    
public static void main(String ars[]){
int[] nums={1,1,1,5,4,85,58};
    System.out.println(notripples(nums));
}
  
}

