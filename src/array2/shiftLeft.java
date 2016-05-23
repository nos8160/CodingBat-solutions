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
public class shiftLeft {
    
    public static int[] arr(int[] nums){
    int arr[]=new int[nums.length];
    int pos=0;
    int last=nums.length-1;
    for(int i=0;i<nums.length;i++){
    if(i==0){
    arr[last]=nums[0];
    }
    else
        arr[pos++]=nums[i];
    }
    return arr;
    }
    public static void main(String[] args) {
        int[] array={5,2,3};
        System.out.println(Arrays.toString(arr(array)));
    }
    
}
