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
public class notAlone {
public static int[] notAlone(int nums[],int val){
for(int i=1;i<nums.length-1;i++){
if(nums[i]==val && val!=nums[i-1] && val !=nums[i+1]){
nums[i]=Math.max(nums[i-1], nums[i+1]);

}

}

return nums;
}    

    public static void main(String[] args) {
        int val=1;
        int arr[]={1,1,1,2};
        System.out.println(Arrays.toString(notAlone(arr, val)));
    }
}
