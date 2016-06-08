/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array3;

import java.util.Arrays;

/**
 *
 * @author nazrul
 */
public class fix45 {
public static int[] fix45(int[] nums){
      int loc=0;
for(int i=0;i<nums.length;i++){
//    System.out.println(i);
if(nums[i]==4 && nums[i+1]!=5 ){
for(int j=0;j<nums.length;j++){
    if(nums[j]==5 && j==0){

    int temp=nums[i+1];
nums[i+1]=nums[j];
nums[j]=temp;
loc=j;
break;

}

   
if(nums[j]==5 && j>loc && nums[j-1]!=4){
//    System.out.println("s");
    System.out.println(i);
    int temp=nums[i+1];
//    System.out.println(temp);
nums[i+1]=nums[j];
nums[j]=temp;

loc=j;
break;

}





  
}


}

}
return nums;
}    
    public static void main(String[] args) {
//        int arr[]={4,5,4,1,5};
        int arr[]={4, 5, 4, 1, 5};
        System.out.println(Arrays.toString(fix45(arr)));
    }
}
