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
public class sameEnds {
    public static boolean sameEnds(int nums[],int len){
    boolean b=true;
    for(int i=0;i<len;i++,len--){
    if(nums[len-1]!=nums[nums.length-i-1]){
    b=false;
    }
    
    }
    return b;
    }
    
    public static void main(String[] args) {
        int arr[]={5, 6, 45, 99, 13, 5, 6};
        int len=2;
        System.out.println(sameEnds(arr, len));
    }
    
}
