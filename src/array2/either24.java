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
public class either24 {
    public static boolean either(int [] nums){
    int count2=0,count4=0;
    for(int i=1;i<nums.length;i++){
    if((nums[i]==2 && nums[i-1]==2)){
        count2++;
    
    }
    if((nums[i]==4 && nums[i-1]==4)){
    count4++;
    }
    
    }
    return count2!= count4;
    }
    
    public static void main(String[] args) {
        int[] arr={2,70,6};
        System.out.println(either(arr));
    }
    
}
