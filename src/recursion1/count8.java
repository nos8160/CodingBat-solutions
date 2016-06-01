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
public class count8 {
public static int count8(int n){
if(n<=10 && n==8)
    return 1;
if(n<10)
    return 0;
if(n%10==8 && (n/10)%10==8)
    return 2+count8(n/10);
if(n%10==8)
    return 1+count8(n/10);
else
    return count8(n/10);

}    
    public static void main(String[] args) {
        int i=456;
        System.out.println(count8(i));
    }
}
