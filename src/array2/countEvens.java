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
public class countEvens {
    public static int count(int nums[]){
    int count=0;
        for (int i = 0; i < nums.length; i++) {
     if(nums[i]%2==0){
     count++;
     }
      
            }
    
      return count;
    }
        
    
    
    
    public static void main(String[] args) {
        int arr[]={5,8,5,2};
        System.out.println(count(arr));
    }
    


}