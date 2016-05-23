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
public class sum13 {
public static int sum13(int[] nums){
int sum=0;
    for(int i=0;i<nums.length;i++){
if(nums[i]==13){
i=i+1;
}
else
    sum=sum+nums[i];

}
return sum;
}

    public static void main(String[] args) {
        int [] arr={45,8,6,6};
        System.out.println(sum13(arr));
    }
}
