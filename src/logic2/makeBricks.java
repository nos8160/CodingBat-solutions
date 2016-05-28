/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logic2;

/**
 *
 * @author nazrul
 */
public class makeBricks {
    public static boolean makeBricks(int small,int big,int goal){
       int dig=5*big;
     
        
    
   return goal - dig<= small
            && goal % 5 <= small;
    }
    public static void main(String[] args) {
        int small=5,big=2,goal=10;
        System.out.println(makeBricks(small, big, goal));
    }
    
}
