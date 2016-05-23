/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Warmup_2;

/**
 *
 * @author Lenovo
 */
public class count9 {
public static int count9(int[] nums){
    int count=0;
for(int i=0;i<nums.length;i++){
if(nums[i]==9)
    count=count+1;
}
return count;
}
    
    public static void main(String args[]){
        int num[]={54,8,8,7,9,54,8,589,9,9,9,554};
        System.out.println(count9(num));

}    
}
