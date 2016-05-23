/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package String3;

/**
 *
 * @author USER
 */
public class withoutString {
    
    public static String withoutstring(String base,String remove){
     
       
       
    for(int i=0;i<base.length()-remove.length()+1;i++){
    if(base.substring(i, i+remove.length()).equalsIgnoreCase(remove)){
    base=base.replace(base.substring(i, i+remove.length()), "");
    
    }
        
    }
    
    return base;
    }
public static void main(String arsgs[]){
String base="xyzzy";
String remove="Y";
    System.out.println(withoutstring(base,remove));

}    
}
