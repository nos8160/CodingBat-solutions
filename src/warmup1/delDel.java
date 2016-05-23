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
public class delDel {
    public static String delDel(String str){
   StringBuffer a=new StringBuffer(str);
       String ss=a.substring(1, 4);
       if(ss.equals("del"))
return a.delete(1, 4).toString();
        else
        return a.toString();
    
    
    }
public static void main(String ars[]){

String s="adelop";
String ss=delDel(s);
    System.out.println(ss);
    
}    
}
