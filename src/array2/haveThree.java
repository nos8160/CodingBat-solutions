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
public class haveThree {
    static public boolean haveThree(int[] nums){
        int count=0;
    for(int i=1;i<nums.length;i++){
    if(nums[i]==3){
        if(nums[i-1]==3) return false;
        count++;
        
        
    }}
    if(nums[0]==3) count++;
    return count==3;
    }
    
    public static void main(String[] args) {
     int arr[]={3, 4, 3, 4, 3, 4, 4};
        System.out.println(haveThree(arr));
    }
    
}
