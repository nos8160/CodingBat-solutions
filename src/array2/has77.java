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
public class has77 {
public static boolean has77(int [] nums){
    boolean b=false;
for(int i=2;i<nums.length;i++){
if((nums[i]==7 &&(nums[i-2]==7 || nums[i-1]==7)) || (nums[i-2]==7 && nums[i-1]==7)){
b=true;
}
}
return b;
}
    public static void main(String[] args) {
        int arr[]={2,7,2,2,7,2};
        System.out.println(has77(arr));
    }
    
}
