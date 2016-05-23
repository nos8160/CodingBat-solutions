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
/*this is a little bit exaggerated.But it is the properway.*/
public class arrayfont9 {
 public static boolean arrayfont9(int[] nums){
     int count=0;
 if(nums.length<4){
 for(int i=0;i<nums.length;i++){
 if(nums[i]==9)
     count=count+1;
 }
 if(count>0)
 return true;
 else
     return false;
 }
 
 else
 for(int i=0;i<4;i++){
    if(nums[i]==9)
        count=count+1;
     }
 if(count>0)
 return true;
 else
     return false;
 
 
 }
 
    public static void main(String arsg[]){

int nums[]={9,54,5545};
        System.out.println(arrayfont9(nums));
}    
}
