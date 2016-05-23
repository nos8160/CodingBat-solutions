/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array1;

import java.util.Arrays;

/**
 *
 * @author Lenovo
 */
public class reverse3 {
public static int[] reverse3(int[] arr) {
int[] arr2=new int[arr.length];
    int j=arr.length-1;   
    for(int i=0;i<arr2.length;i++){
    arr2[i]=arr[j];
    j=j-1;
    }
    return arr2;
  
}    
    public static void main(String[] args) {
        int[] nr={5,8,6,7,3};
        nr=reverse3(nr);
//        for (int i = 0; i < nr.length; i++) {
//            System.out.println(nr[i]);
//            
//        }
        System.out.println(Arrays.toString(nr));
        
    }
}
