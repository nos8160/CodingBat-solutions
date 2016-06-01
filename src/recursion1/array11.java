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
public class array11 {
public static int array11(int nums[],int index){
    if(nums.length==0)
        return 0;
    if(index==nums.length-1 )
    return 0;
if(index==nums.length-1 && nums[index]==11)
    return 1;
if(index==nums.length-1 )
    return 0;
else

if(nums[index]==11)
    return 1+array11(nums, index+1);
else
    return array11(nums, index+1);

}    
    public static void main(String[] args) {
        int arr[]={};
        System.out.println(array11(arr, 0));
    }
}
