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
public class fibonacci {
    public static int fibonacci(int n){
    if(n==0)
        return 0;
    if(n==1)
        return 1;
    else
        return fibonacci(n-1)+fibonacci(n-2);
    
    }
    public static void main(String[] args) {
        int i=5;
        System.out.println(fibonacci(i));
    }
}
