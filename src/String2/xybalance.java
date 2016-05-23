/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package String_2;

/**
 *
 * @author USER
 */
public class xybalance {
    public static boolean xybalance(String str){
    
    boolean b=true;
    if(str.lastIndexOf("x")>-1)
    {
    if(str.indexOf('y', str.lastIndexOf('x'))<0)
    {
    b=false;
    }
    
    }
    return b;
    }
    
    public static void main(String sasr[]){
    String ss="asdxf";
        System.out.println(xybalance(ss));
    
    }
    
}
