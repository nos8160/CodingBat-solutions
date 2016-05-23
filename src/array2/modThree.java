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
public class modThree {
public static boolean modThree(int [] nums){
 
for(int i=2;i<nums.length;i++){
if(nums[i]%2==0){
if(nums[i-1]%2==0 && nums[i-2]%2==0){
return true;
}
}
    if(nums[i]%2!=0){
if(nums[i-1]%2!=0 && nums[i-2]%2!=0){
return true;
    
    }
}
    
    
}
return false;
}
    public static void main(String[] args) {
        int arr[]={9,9,9};
        System.out.println(modThree(arr));
    }

}
