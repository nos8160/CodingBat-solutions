/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursion1;

/**
 *
 * @author nazrul
 */
public class sumDigits {
public static int sumOfDigits(int n){
if(n<=1)
    return n;
    else
    return n%10+sumOfDigits(n/10);
}    
    public static void main(String[] args) {
        int i=423;
        System.out.println(sumOfDigits(i));
    }
}
