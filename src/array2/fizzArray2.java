/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array2;

import java.util.Arrays;

/**
 *
 * @author nazrul
 */
public class fizzArray2 {
public static String[] arr(int n){
String[] arr=new String[n];
for(int i=0;i<arr.length;i++){
arr[i]=String.valueOf(i);
}
return arr;
}    
    public static void main(String[] args) {
        int n=4;
        String [] arr=arr(n);
        System.out.println(Arrays.toString(arr));
        System.out.println(arr.getClass());
    }
}
