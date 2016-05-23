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
public class countyz {
  public static int countyz(String str){
      int count=0;
  
  for(int i=0;i<str.length();i++){
  if((str.substring(i, i+1).equalsIgnoreCase("y") ||str.substring(i, i+1).equalsIgnoreCase("z")) )
if(i<str.length()-1 && Character.isLetter(str.charAt(i+1))==false)
{count++;}
  if(i==str.length()-1 && (str.charAt(i)=='y'||str.substring(i).equalsIgnoreCase("z"))){
  
  count++;
  
  }
  }
  return count;
  }  
    public static void main(String arfsdf[]){
    
    String ss="DAY abc XYZ";
        System.out.println(countyz(ss));
    
    
    }
    
}
