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
public class has22 {
public static boolean has22(int[] nums){
boolean b=false;
    
    for(int i=1;i<nums.length;i++){
if(nums[i]==2 && nums[i-1]==2)
{
b=true;

}
}
return b;        
}    
    public static void main(String[] args) {
        int arr[]={5,6,8,8};
        System.out.println(has22(arr));    }
}
