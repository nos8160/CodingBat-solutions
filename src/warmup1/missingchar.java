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
public class missingchar {
    public static StringBuffer missingchar(StringBuffer str){
     return str.deleteCharAt(5);
    
    }
public static void main(String ar[]){
StringBuffer s=new StringBuffer("dont mess with me");
StringBuffer ss=missingchar(s);
    System.out.println(ss);

}    
}
