public class mergeSort{
  
  public static void main(String[] args){
    int result = recPow(3, 5, 1);
    System.out.println(result);
    
    
  }
  
  public static int recPow(int base, int power, int result){
    int x = 0;
    
    if(power == 0)
      return result;
    if(power > 0){
      x = recPow(base, --power , base*result);
    }
    
    //should never hit this
    return x;
  }
}