/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array2;



/**
 *
 * @author nazrul
 */
public class zeroFront {
    public static int[] zeroFront(int[] nums){
  for(int j=0;j<nums.length-1;j++){
        for(int i=0;i<nums.length-1;i++){
    
   if(nums[i]!=0 && nums[i+1]==0){ 
   int temp=nums[i];
   nums[i]=nums[i+1];
    
   nums[i+1]=temp;
   }
    }
}
        return nums;
    }
    
    
    public static void main(String[] args) {
int arr[]={3,3,2};
        
      int larr[]=zeroFront(arr);
    for(int i=0;i<arr.length;i++)
        System.out.println(arr[i]);
    }
        
    
}