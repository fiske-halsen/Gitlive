
package javaapplication1;


public class ArrayØvelse {

   
    public static void main(String[] args) {
        
    int[] a = {10,200,30,40};     
        
   int indexOfMax = indexOfMax(a);    
        
        System.out.println(indexOfMax);     
    }
    
  public static int indexOfMax(int[] a) {
     int indexOfMax = 0;
     
      for (int i = 0; i < a.length; i++) {
      
       if(a[indexOfMax] < a[i]){
           
       indexOfMax = i;    
           
           
       }   
          
      }
      
     return indexOfMax; 
  } 
    
    
}
