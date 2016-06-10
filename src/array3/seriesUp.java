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
public class seriesUp {
    public static int[] seriesUp(int n){
    int arr[]=new int[n*(n+1)/2];
   int pos=0;
   for(int i=1;i<n+1;i++){
   for(int j=1;j<=i;j++)
   arr[pos++]=j;
   }
   return arr;
    }
    public static void main(String[] args) {
        int n=3;
        System.out.println(Arrays.toString(seriesUp(n)));
    }
    
}
