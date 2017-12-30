public class bit{
  public static void main(String[] args){
    long n = 10000000000l;
    long start = System.currentTimeMillis();
    mod(n);
    long end = System.currentTimeMillis();
    System.out.println(end - start);
  
    
    
  }
  
  public static void bits(long n){
    for(long i = 0; i < n; i++){
      if((n & 1) == 0)
        ;
    }
  }
  
  public static void mod(long n){
    for(long i = 0; i < n; i++){
      if(n % 2 == 0)
        ;
    }
  }
}