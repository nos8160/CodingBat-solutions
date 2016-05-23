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
public class only14 {
public static boolean only14(int [] nums){
for(int i=0;i<nums.length;i++){
if(nums[i]!=1 && nums[i]!=4) return false;

}
return true;
}    

public static void main(String[] args) {
int arr[]={4,5};
    System.out.println(only14(arr));
    }
}
