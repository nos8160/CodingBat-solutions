/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package warmup1;

import java.util.Scanner;

/**
 *
 * @author lenovo
 */
public class makes10 {
public static boolean makes10(int x,int y){
if((x==10 || y==10) ||(x+y)==10)
    return true;
else 
    return false;

}
    
    public static void main(String arsg[]){
int a,b;
Scanner scan=new Scanner(System.in);
a=scan.nextInt();
b=scan.nextInt();
boolean c=makes10(a, b);
        System.out.println(c);

}    
}
