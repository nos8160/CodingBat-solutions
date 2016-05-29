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
public class makeChocolate {
public static int makeChocolate(int small, int big,int goal){
int dig=5*big;
if(dig<goal && goal-dig<=small){
return goal-dig;
}
if(dig>goal && goal%5<=small){
return goal-((goal/5)*5);
}
return -1;
}    
    public static void main(String[] args) {
        int s=1,b=55,c=78;
        System.out.println(makeChocolate(s, b, c));
    }
}
