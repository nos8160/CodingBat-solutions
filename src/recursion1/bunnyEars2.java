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
public class bunnyEars2 {
public static int bunnyEars2(int bunnies){
if(bunnies==0)
    return 0;
else
    if(bunnies%2==0)
        return 3+bunnyEars2(bunnies-1);
else
        return 2+bunnyEars2(bunnies-1);

}    
    public static void main(String[] args) {
        int n=2;
        System.out.println(bunnyEars2(n));
    }
}
