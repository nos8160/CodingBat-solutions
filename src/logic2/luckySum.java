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
public class luckySum {
public static int luckySum(int a, int b, int c){
      if(a==13)
    return 0;
if(b==13)
    return a;
if(a!=13 && b!=13 && c!=13)
    return a+b+c;
else
    return a+b;
}  
    public static void main(String[] args) {
        int a=4,b=6,c=5;
        System.out.println(luckySum(a, b, c));
    }
}
