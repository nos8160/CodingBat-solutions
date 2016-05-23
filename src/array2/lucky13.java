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
public class lucky13 {
public static boolean lucky(int nums[]){
boolean b=true;
for(int i=0;i<nums.length;i++){
if(nums[i]==1 || nums[i]==3){
b=false;
}

}
return b;
}    

    public static void main(String[] args) {
        int arr[]={5,6,8};
        System.out.println(lucky(arr));
    }

}
