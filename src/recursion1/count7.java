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
public class count7 {
public static int count7(int n){
if(n<=10 && n==7)
    return 1;
if(n<=10) return 0;
else
    if(n%10==7){
    return 1+count7(n/10);
    }
else
        return count7(n/10);
}    
    public static void main(String[] args) {
        int i=727;
        System.out.println(count7(i));
    }
}
