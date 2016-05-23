/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array2;

/**
 *
 * @author nazrul
 */
public class centeredAverage {
    public static int avg(int [] nums){
    int max=nums[0],min=nums[0],sum=0;
    for(int i=0;i<nums.length;i++){
    if(nums[i]<min){
    min=nums[i];
    }
    if(nums[i]>max){
    max=nums[i];
    }
    sum=sum+nums[i];
    
    }
    return (sum-(min+max))/(nums.length-2);
    }
    
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,100};
        System.out.println(avg(arr));
    }
    
}
