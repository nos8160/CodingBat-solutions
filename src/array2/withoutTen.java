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
public class withoutTen {
    public static int[] withoutTen(int[] nums){
        int arr[]=new int[nums.length];
    int pos=0;
    int tens=nums.length-1;
      
        for(int i=0;i<nums.length;i++){
    if(nums[i]==10){
    
        arr[tens--]=0;
        System.out.println(tens);
    
    }
    if(nums[i]!=10){
        System.out.println("numsI"+nums[i]);
   arr[pos++]=nums[i];
    
        System.out.println("pso"+pos);
    }
    
    }
        return arr;
    }
    public static void main(String[] args) {
        int [] arr={1, 10,5,5};
        System.out.println(Arrays.toString(withoutTen(arr)));
    }
    
}
