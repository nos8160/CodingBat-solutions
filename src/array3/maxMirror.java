/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array3;

/**
 *
 * @author nazrul
 */
public class maxMirror {
    public static int maxMirror(int[] nums){
        int count=0,max=0,len=nums.length;
        boolean b=true;
        int nums2[]=new int[nums.length];
        for(int i=nums.length-1,j=0;i>=0;i++){
        nums2[j]=nums[i];
        }
        for(int i=0;i<nums.length;i++){
        for(int j=0;j<len;j++){
        while(b==true && j<=i ){
        if(nums[i]==nums2[j]){
        count++;
        
        j++;
       
        }
        else{
        b=false;
        
       }
       }
          i++;
        if(count>max){
        max=count;
        count=0;
        }
        else{
        count=0;
        }
        
      
        }
        
        }
   return max;
    }
  
    public static void main(String[] args) {
    int arr[]={1,2,1,4};
        System.out.println(maxMirror(arr));
    }
}
