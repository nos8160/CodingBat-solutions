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
public class evenlySpaced {
    public static boolean evenlySpace(int a, int b, int c){
int x=Math.abs(a-b);
int y=Math.abs(a-c);
if(x==y || x*2==y)
    return true;
else
    return false;
    }
    public static void main(String[] args) {
        int a=3,b=4,c=8;
        System.out.println(evenlySpace(a, b, c));
    }
}
