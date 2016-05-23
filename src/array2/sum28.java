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
public class sum28 {
    
    public static boolean sum28(int nums[]){
    int sum =0;
        for(int i=0;i<nums.length;i++)
    {
    if(nums[i]==2)
    {
    sum=sum+nums[i];
    }
    }
        return 8==sum;
    }
    public static void main(String[] args) {
        int arr[]={55,78,5};
        System.out.println(sum28(arr));
    }
    
}
