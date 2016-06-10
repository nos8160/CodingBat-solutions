/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursion1;

/**
 *
 * @author nazrul
 */
public class array220 {
public static boolean array220(int [] nums,int index){
    if(nums.length<2) return false;
if(index==nums.length-2 && nums[index+1]==nums[index]*10)
    return true;
else
    if(index==nums.length-2)
    return false;


if(nums[index+1]==nums[index]*10)
    return true;
else
    return array220(nums, index+1);


}    
    public static void main(String[] args) {
        int arr[]={4,5,6};
        int index=0;
        System.out.println(array220(arr, index));   
    }
}
