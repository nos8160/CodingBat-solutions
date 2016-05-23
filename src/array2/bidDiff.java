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
public class bidDiff {
public static int bigDiff(int nums[]){
    int min=nums[0],max=nums[0];
for(int i=0;i<nums.length;i++){
if(nums[i]<min){
min=nums[i];
}
if(nums[i]>max){
max=nums[i];
}
}
  
return max-min;
}
    
    public static void main(String[] args) {
        int arr[]={5,9,10};
        System.out.println(bigDiff(arr));
    }
    
}
