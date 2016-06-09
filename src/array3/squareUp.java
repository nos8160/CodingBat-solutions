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
public class squareUp {
    public static int[] squareUp(int n){
    int pos=n*n-1;
        int arr[]=new int[n*n];
    for(int i=4;i>0;i--){
    for(int j=0;j<4;j++){
    arr[pos--]=i-j;
    
    }
    
    }
    return arr;
    }
    public static void main(String[] args) {
        int n=4;
        System.out.println(Arrays.toString(squareUp(n)));
    }
}
