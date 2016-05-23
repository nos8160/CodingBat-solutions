/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array1;

/**
 *
 * @author Lenovo
 */
public class make2 {
    public int[] make2(int[] an, int[] b) {
if(an.length>1)
return an;

 if(an.length==0)
  return new int[]{b[0],b[1]};

  if(an.length==1)
  return new int[]{an[0],b[0]};
  else 
      return null;
  
}
    
}
