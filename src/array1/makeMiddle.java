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
public class makeMiddle {
    public static int[] makeMiddle(int[] nums){
    if(nums.length==2)
        return nums;
    int[] arr=new int[2];
    arr[0]=nums[nums.length/2-1];
    arr[1]=nums[nums.length/2];
    return arr;
    }
    public static void main(String[] args) {
        int arr[]={5,8,6,7};
        arr=makeMiddle(arr);
        for(int i=0;i<arr.length;i++){
        System.out.println(arr[i]);
        }
        
        
    }
}
