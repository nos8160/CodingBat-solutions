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
public class equalisnot {
    public static boolean equalisnot(String str){
        int isCount=0;
        int notCount=0;
    for(int i=0;i<str.length()-2+1;i++)
    {
    if(str.substring(i, i+2).equals("is"))
    isCount++;
    } 
    for(int i=0;i<str.length()-3+1;i++)
    {
    if(str.substring(i, i+3).equals("not"))
    notCount++;
    } 
  if(isCount==notCount)
      return true;
  else
      return false;
    
    }
    public static void main(String ars[]){
    String s="asd";
        System.out.println(equalisnot(s));
    }
}
