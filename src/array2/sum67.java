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
public class sum67 {
    public static int sum67(int nums[]){
    boolean b=true;
    int sum=0;
    for(int i=0;i<nums.length;i++){
    if(nums[i]==6 || b==false){
    b=false;
     if(nums[i]==7){
        nums[i]=0;
    b=true;
    }
    }
   
        if(b==true){
    sum=sum+nums[i];
            
            }
            }
    
    return sum;
    }
    public static void main(String[] args) {
        int arr[]={1,6,7,7};
        System.out.println(sum67(arr));
    }
}
