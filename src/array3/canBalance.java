/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array3;

/**
 *
 * @author nazrul
 */
public class canBalance {
public static boolean canBalance(int [] nums){
int sumI=0;
int sumJ=0;
boolean b=false;
for(int i=0;i< nums.length;i++){
sumI=sumI+nums[i];
for(int j=i+1;j<nums.length;j++){
sumJ=sumJ+nums[j];
}
    System.out.println(sumI+" \t"+sumJ);
if(sumI==sumJ){
    b=true;
break;
}

sumJ=0;
}
return b;
}    
public static void main(String[] args) {
   int arr[]={1,1,1,3};
    System.out.println(canBalance(arr));
    }
}
