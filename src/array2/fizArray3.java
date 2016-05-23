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
public class fizArray3 {
    public static int[] fizArray3(int start,int end){
    int [] arr=new int[end-start];
        for(int i=0,j=start;i<arr.length;i++,j++){
    arr[i]=j;
    }
    return arr;
    }
    public static void main(String[] args) {
        int start=5,end=8;
        int [] arr=fizArray3(start, end);
        System.out.println(Arrays.toString(arr));
    }
    
}
