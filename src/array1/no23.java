/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array1;

/**
 *
 * @author Lenovo
 */
public class no23 {
public static boolean no(int[] nums){
if(((nums[0]==2 ||nums[0]==3)||nums[1]==2 ||nums[1]==3))
    return false;
else
        return true;
}    
    public static void main(String[] args) {
        int[] arr={2,5};
        System.out.println(no(arr));
    }
}
