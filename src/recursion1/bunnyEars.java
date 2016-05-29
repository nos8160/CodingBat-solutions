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
public class bunnyEars {
public static int bunnyEars(int bunnies){
if(bunnies==0)
    return 0;
else
    return 2+bunnyEars(bunnies-1);

}    
    public static void main(String[] args) {
        int bunnies=2;
        System.out.println(bunnyEars(bunnies));
    }
}
