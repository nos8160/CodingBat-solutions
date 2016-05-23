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
public class posneg {
    public static boolean posneg(int a,int b,boolean negative){
    int res=a*b;
    if(res<0 && negative==false)
        return true;
    else 
        if(res>0 && negative==true)
            return true;
    else
            return false;
    }
    public static void main(String af[]){
    Scanner scan=new Scanner(System.in);
    int x=scan.nextInt();
    int y=scan.nextInt();
    boolean baa=false;
       boolean bat= posneg(x, y, baa);
        System.out.println(bat);
    
    }
    
}
