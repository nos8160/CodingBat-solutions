/*
a * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Warmup_2;

/**
 *
 * @author Lenovo
 */
public class has271 {
    public static boolean has271(int nums[]){
       boolean b=false;
    for(int i=0;i<nums.length-2;i++){
    if(nums[i]+5==nums[i+1]&& ((nums[i+2]-nums[i])<2 &&(nums[i]-nums[i+2])<=3))
 {     
   b=true;
 }

     }
    return b;}
public static void main (String ars[]){
int nums[]={2, 7, -2};
    System.out.println(has271(nums));
}    
}
