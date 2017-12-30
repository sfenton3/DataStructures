public class Example{
  
  public static void main(String[] args){
    float x = recPow(5, 3);
    float y = recPow(5, -1);
    float q = recPow(5, -3);
    float z = recPow(5,1);

    System.out.println(x);
    System.out.println(y);
    System.out.println(z);
    System.out.println(q);

       
  }
  
  //Linear method to calculate a base integer to
  //the power pow. 
  public static float recPow(int base, int pow){
    
    if (pow == 0)
      return 1f;
    
    if(pow > 0){
      pow--;   
      return ( base * recPow(base , pow));
    }
    
    if(pow < 0){
      pow++;   
      return ( 1f/base * recPow(base , pow));
    }
      
    //Should never reach
    return 1f;
  }
}
  

  