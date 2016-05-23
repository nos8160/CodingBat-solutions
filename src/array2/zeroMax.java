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
public class zeroMax {
    public static int[] zeroMax(int[] nums){
    int max=0;
    for(int i=nums.length-1;i>=0;i--){
    if(nums[i]==0){
    nums[i]=max;
    }
    if(nums[i]%2!=0 && nums[i]>max){
    max=nums[i];
    }
    
    }
    return nums;
    }
    public static void main(String[] args) {
        int []arr={0,5,0,3};
        System.out.println(Arrays.toString(zeroMax(arr)));
    }
    
}
