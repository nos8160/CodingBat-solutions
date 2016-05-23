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
public class has23 {
public static boolean has(int []a){
if(((a[0]==2 ||a[0]==3)||a[1]==2 ||a[1]==3))
    return true;
else
        return false;
}
    public static void main(String[] args) {
        int[] a={5,8};
        System.out.println(has(a));
    }
}
