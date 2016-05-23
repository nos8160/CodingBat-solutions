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
public class makeLast {
public static int[] maketh(int[] arr){
int arr2[]=new int[arr.length*2];
arr2[arr2.length-1]=arr[arr.length-1];
return arr2;
}    

    public static void main(String[] args) {
        int array[]={1,5,58};
        array=maketh(array);
        for(int i=0;i<array.length;i++){
            System.out.println(array[i]);        }
    }
}
