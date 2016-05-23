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
public class no14 {
public static boolean no(int nums[]){
int countOne=0,countFour=0;
for(int i=0;i<nums.length;i++){
if(nums[i]==1) countOne++;
if(nums[i]==4) countFour++;

}
return countOne==0|| countFour==0;
}   
    public static void main(String[] args) {
        int arr[]={5,6};
        System.out.println(no(arr));
    }
}
