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
public class middleWay {
public static int[] middleWay(int[] a,int[] b){
    int[] arr={a[1],b[1]};
    return arr;
    

}    
    public static void main(String[] args) {
        int[] a={1,2,3};
        int[] b={4,5,6};
        int[]c=middleWay(a, b);
        for(int i=0;i<c.length;i++){
            System.out.println(c[i]);
        }
    }
}
