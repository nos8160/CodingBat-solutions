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
public class monkeytrouble {
    public static boolean monkeytrouble(boolean asmile,boolean bsmile){
    if(asmile==true && bsmile==true || asmile==false && bsmile==false)
        return true;
    else 
        return false;
    }
    
public static void main(String asfd[])
{
boolean mone,mtwo;
Scanner scan=new Scanner(System.in);
mone=scan.nextBoolean();
mtwo=scan.nextBoolean();
boolean b=monkeytrouble(mone, mtwo);
    System.out.println(b);

}
}
