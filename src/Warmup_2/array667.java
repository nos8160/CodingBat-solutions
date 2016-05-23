/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Warmup_2;

/**
 *
 * @author Lenovo
 */
public class array667 {
public static int array667(int[] nums){
int count=0;
    for(int i=0;i<nums.length-1;i++){
if(nums[i]==6&&(nums[i+1]==6 ||nums[i+1]==7))
        count=count+1;
}
return count;
}
    public static void main(String args[]){
        int[] nums={6,6,8,98,6,6};
        System.out.println(array667(nums));


}    
}
