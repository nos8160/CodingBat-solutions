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
public class commonEnd {
public static boolean commonEnd(int[] a, int[] b) {
if(a[0]==b[0] || a[a.length-1]==b[b.length-1])
return true;
else return false;
  
}
    public static void main(String[] args) {
        int[] arr1={1,5,5,8,87};
        int[] arr2={1,5,5,8,87};
        System.out.println(commonEnd(arr2, arr1));
    }
}
