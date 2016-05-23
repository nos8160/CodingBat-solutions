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
public class isEveryWhere {
public static  boolean isEverywhere(int[] nums,int val){
    boolean b=true;
for(int i=1;i<nums.length;i++){
if(nums[i]!=val && nums[i-1]!=val)
{
b=false;
}
}
return b;
}    

    public static void main(String[] args) {
        int [] arr={1,5,6};
        int val=2;
        System.out.println(isEverywhere(arr, val));
    }
}
