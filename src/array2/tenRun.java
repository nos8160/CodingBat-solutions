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
public class tenRun {
public static int[] tenRun(int [] nums){
for(int i=0; i<nums.length;i++){
if(nums[i]%10==0 &&nums[i+1]%10!=0){
nums[i+1]=nums[i];

}
}
   return nums; 
}
    public static void main(String[] args) {
        int arr[]={5,4};
        System.out.println(Arrays.toString(tenRun(arr)));
    }
}
