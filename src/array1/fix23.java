/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array1;

/**
 *
 * @author Lenovo
 */
public class fix23 {
public static int[] fix(int[]nums){
    for(int i=0;i<nums.length-1;i++){
    if(nums[i]==2&& nums[i+1]==3){
    nums[i+1]=0;
    }
    }
    return nums;
}    
    public static void main(String[] args) {
        int arr[]={1,2,3};
        arr=fix(arr);
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
