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
public class syzmiddle {
public static boolean xyz(String str){
boolean b = true;
if(str.length()<3)
    return false;
   
        for (int i = 0; i < str.length()-2; i++) {
            if(str.substring(i, i+3).equals("xyz")){
                System.out.println("1");
                if(Math.abs(str.substring(0, i).length()-str.substring(i+3).length())<2)
                {b=true;
                    System.out.println(true);
                    break;
                }
                else{
                    b=false;
                }
            }
            
        }
    
return b;
}
    
    public static void main(String args[]){

String s="xyzaxyzaxyzxyzxy";
        System.out.println(xyz(s));
}    
}
