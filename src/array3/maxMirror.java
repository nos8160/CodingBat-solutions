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
       int count=0,i=0,j=nums.length-1;
       int res=0;
      while(i<nums.length && j>=0){
      if(nums[i]==nums[j]){
    count++;
      i++;
      j--;
      res=count;
      }
      else
      {
          if(count>res){
              res=count;
              count=0;
          }
      i++;
      j--;
      }
       
    
    
      }
      return  res;
    }
    public static void main(String[] args) {
    int arr[]={1,2,1,4};
        System.out.println(maxMirror(arr));
    }
}
