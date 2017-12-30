public class Example1{
  
  
  public static void main(String[] args){
    hashMap<String, Integer> h = new hashMap<String, Integer>();
    hashMap<String, Integer> h2 = new hashMap<String, Integer>(1000);
    
    System.out.println(h.getCapacity());
    System.out.println(h2.getCapacity());  
    System.out.println(h.getPosition());
  }
  
}