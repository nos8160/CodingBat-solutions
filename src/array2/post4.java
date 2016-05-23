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
public class post4 {
public static int[] post4(int[] nums){
 int arr[]=new int[0];
    for(int i=nums.length-1;i>=0;i--){
 if(nums[i]==4){
 arr=new int[nums.length-i-1];
  int j=0;
 while(i<nums.length-1){

     arr[j++]=nums[i+1];
     i++;
     
 
 }
break;
 }
 }
return arr;
    
    
    
    }
    
        
        


    public static void main(String[] args) {
        int arr[]={4,4,3};
        System.out.println(Arrays.toString(post4(arr)));
    }
  
}
