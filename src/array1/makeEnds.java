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
public class makeEnds {
public static int[] makeEnds(int[] nums){

int arr[]={nums[0],nums[nums.length-1]};
return arr;
}    

    public static void main(String[] args) {
        int[] a={4,5,8,5};
        a=makeEnds(a);
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}
