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
public class loneteen {
    public static boolean loneteen(int x,int y){
    
    if((x>12 && x<20)&&(y>12&&y<20))
        return false;
    else
        return true;
    
    }
public static void main(String arsgs[]){
int a,b;
    Scanner scan=new Scanner(System.in);
    a=scan.nextInt();
    b=scan.nextInt();
    boolean c=loneteen(a, b);
    System.out.println(c);

}    
}
