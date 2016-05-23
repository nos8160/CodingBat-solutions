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
public class plus2 {
public static int[] plus(int[]a,int[]b){
int arr[]={a[0],a[1],b[0],b[1]};
return arr;


}    
    public static void main(String[] args) {
         int arr1[]={5,8};
      int arr2[]={5,5};
      arr2=plus(arr2, arr1);
    
        for(int i=0;i<arr2.length;i++){
        System.out.println(arr2[i]);
    }
}}
