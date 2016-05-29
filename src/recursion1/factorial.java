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
public class factorial {
    public static int factorial(int n){
    if(n==0)
        return 1;
    else
        return n*factorial(n-1);
    }

    public static void main(String[] args) {
        int n=5;
        System.out.println(factorial(n));
    }
}
