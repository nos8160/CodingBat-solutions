/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package warmup1;

/**
 *
 * @author lenovo
 */
public class parrottrouble {
    public static boolean parrottrouble(int hour,boolean talking){
    if(hour<7 || hour>20 && talking==true)
        return true;
    else
        return false;
    
    }
    
    
    public static void main(String ars[]){
    boolean b=true;
    int time=13;
    boolean a=parrottrouble(time, b);
        System.out.println(a);
        
    }
    
}
