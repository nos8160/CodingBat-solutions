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
public class closeFar {
public static boolean closeFar(int a, int b, int c){
if(((Math.abs(a-b)<=1) && (Math.abs(c-a)>=2)&& (Math.abs(c-b)>=2))||(((Math.abs(a-c)<=1) && (Math.abs(b-a)>=2)&& (Math.abs(c-b)>=2)))){
return true;
}
else
    return false;
}
    public static void main(String[] args) {
        int a=45,b=78,c=74;
        System.out.println(closeFar(a, b, c));
    }
}
