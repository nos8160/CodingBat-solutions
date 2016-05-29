/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logic2;

/**
 *
 * @author nazrul
 */
public class loneSum {
public static int loneSum(int a, int b, int c){
if(a==b && b==c)
    return 0;
if(a==b)
    return c;
if(b==c)
    return a;
if(c==a)
    return b;
else
    return a+b+c;


}    
    public static void main(String[] args) {
        int a=4,b=6,c=8;
        System.out.println(loneSum(a, b, c));
    }
}
