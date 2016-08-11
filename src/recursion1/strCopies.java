/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursion1;

/**
 *
 * @author nazrul
 */
public class strCopies {
public static boolean strCopies(String str, String sub, int n){
  if (str.length() < sub.length()) return (n <= 0);
    if (str.substring(0, sub.length()).equals(sub))
        return strCopies(str.substring(1), sub, n - 1);
    return strCopies(str.substring(1), sub, n);

}    
    public static void main(String[] args) {
        
    }
}
