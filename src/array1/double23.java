/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array1;

/**
 *
 * @author Lenovo
 */
public class double23 {
public static boolean double23(int[] nums){
    if(nums.length<2)
        return false;
if(nums[0]==2 &&nums[1]==2||nums[0]==3 &&nums[1]==3)
{
return true;

}
else
    return false;
}    

    public static void main(String[] args) {
        int arr[]={2,3};
        System.out.println(double23(arr));
    }
}
