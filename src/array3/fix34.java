/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array3;

import java.util.Arrays;

/**
 *
 * @author nazrul
 */
public class fix34 {
    public static int [] fix34(int [] nums){
        int loc=0;
    for(int i=0;i<nums.length;i++){
    if(nums[i]==3){
    for(int j=0;j<nums.length;j++){
    if(nums[j]==4 && j>loc ){
    int temp=nums[i+1];
    nums[i+1]=nums[j];
    nums[j]=temp;
    loc=i+1;
    }
     }
    } 
    }
    return nums;
    }
public static void main(String[] args) {
        int arr[]={3, 1, 1, 3, 4, 4};
        System.out.println(Arrays.toString(fix34(arr)));
    }
}
