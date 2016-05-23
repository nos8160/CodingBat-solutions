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
public class array123 {
public static boolean array123(int[] nums){
  boolean b=false;   
for(int i=0;i<nums.length-2;i++){
 
    if(nums[i]==1 &&nums[i+1]==2 && nums[i+2]==3)
    b=true;
}
return b;
}
    
    public static void main(String arsg[]){

        int[] nums={0,1,2,3,8};
        System.out.println(array123(nums));
        
        
}    
}
