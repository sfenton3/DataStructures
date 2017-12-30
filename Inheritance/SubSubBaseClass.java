public class SubSubBaseClass extends SubBaseClass{
  
  public static void main(String[] args){
    SubSubBaseClass ssbc = new SubSubBaseClass();
    ssbc.barkS();
    
  }
  
  @Override
  public void barkS(){
    System.out.println("bark");
  }
}