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
public class powerN {
public static int powerN(int base, int n){
if(n==0)
    return 1;
else
    return base*powerN(base, n-1);

}    
    public static void main(String[] args) {
        int b=5,i=3;
        System.out.println(powerN(b, i));
    }
}
