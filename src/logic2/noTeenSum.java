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
public class noTeenSum {
    public static int fixTeen(int n){
if((n>12 && n<15)||(n>16&&n<20))
   return 0;
else
    return n;
}
public static int noTeen(int a,int b, int c){
return fixTeen(a)+fixTeen(b)+fixTeen(c);

}

    public static void main(String[] args) {
        int a=5,b=5,c=6;
        System.out.println(noTeen(a, b, c));
    }
       
}
