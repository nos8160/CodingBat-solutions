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
public class has12 {
public static boolean has12(int[] nums){
    boolean b=false;
for(int i=0;i<nums.length;i++){
if(nums[i]==1){
while(i<nums.length){
if(nums[i]==2){
b=true;

}
i++;
}

}
}
return b;
}    

    public static void main(String[] args) {
        int [] arr={5,6,4};
        System.out.println(has12(arr));
    }
}
