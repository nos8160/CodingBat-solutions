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
public class fizzArray {
    public static int[] fizzArray(int n){
    int arr[]=new int[n];
    for(int i=0;i<arr.length;i++){
    arr[i]=i;
    }
    return arr;
    }
    public static void main(String[] args) {
        int n=4;
    int[] arr=fizzArray(n);
        System.out.println( Arrays.toString(arr));
    }
    
}
