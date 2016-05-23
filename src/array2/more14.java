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
public class more14 {
public static boolean more(int [] nums){
int countONe=0,countFour=0;
for(int i=0;i<nums.length;i++){
if(nums[i]==1) countONe++;
if(nums[i]==4) countFour++;
}
return countONe>countFour;
}    
    public static void main(String[] args) {
        int arr[]={5,6};
        System.out.println(more(arr));
    }
}
