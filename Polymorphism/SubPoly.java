public class SubPoly{

  

  public static void main(String[] args){
    String line = "27 3 7";
    System.out.println(test(line));
    
    
    
  }
  
  public static String test(String val){
    String result = "";
    String[] temp = val.split(" ");
    int n = Integer.valueOf(temp[0]);
    int p = Integer.valueOf(temp[1]);
    int q = Integer.valueOf(temp[2]);
    
    
    for(; n > 0; n--){
      if( (n % p) == 0 && (n % q) == 0)
       result += "THINK,";
      else if( (n % p) == 0 || (n % q) == 0)
        result += "OUT,";
    else
        result += String.valueOf(n) + ",";
   }
    
    return result;
           
  }
}
  