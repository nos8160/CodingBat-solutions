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
public class start1 {
    public static int start(int[]a,int[]b){
    int count=0;
    if(a.length!=0&&a[0]==1){
    count=count+1;}
    if(b.length!=0&&b[0]==1){
    count=count+1;
    }
    return count;
        
    }
    public static void main(String[] args) {
        int array1[]={};
        int array2[]={4,5};
        System.out.println(start(array1, array2));
    }
}
