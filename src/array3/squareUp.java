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
    int pos=0;
        int arr[]=new int[n*n];
    for(int i=1;i<n+1;i++){
    for(int j=n;j>0;j--){
    if(i/j<1){
    arr[pos++]=0;
    }
    else
    {
    arr[pos++]=j;
    }
    
    }
    }
    return arr;
    }
    public static void main(String[] args) {
        int n=3;
        System.out.println(Arrays.toString(squareUp(n)));
    }
}
