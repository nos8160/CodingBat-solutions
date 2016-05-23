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
public class pre4 {
public static int[] pre4(int[] nums){

    int [] arr=new int[0];
for(int i=0;i<nums.length;i++){

    if(nums[i]==4){
    System.out.println(i);
    arr=new int[i];
    int j=arr.length-1;//last index of new array 'árr';
    while(i>0){
arr[j--] = nums[i-1];
i--;

}
    break;

}

}
return arr;
}    
    public static void main(String[] args) {
        int arr[]={1, 2, 4, 1};
        System.out.println(Arrays.toString(pre4(arr)));
    }
}
