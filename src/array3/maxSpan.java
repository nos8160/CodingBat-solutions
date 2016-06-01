/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array3;

/**
 *
 * @author nazrul
 */
public class maxSpan {
    public static int maxSpan(int[] nums){
    int lastOccurence=0;
    int maxSpan=0;
    for(int i=0;i<nums.length;i++){
        int firstOccurence=i;
    for(int j=0;j<nums.length;j++){
    if(nums[i]==nums[j]){
    lastOccurence=j;
    }
    
    }
    if(maxSpan<(lastOccurence-firstOccurence)+1){
    maxSpan=lastOccurence-firstOccurence+1;
    }
    }
    return maxSpan;
    }
    public static void main(String[] args) {
        int arr[]={3,9,3};
        System.out.println(maxSpan(arr));
    }
    
}
