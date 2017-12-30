public class hashMap<K,V> {
  
  private int position;
  private int capacity = 100;
  private K[] keyArray;
  private V[] valArray;
  
 
  @SuppressWarnings("unchecked")
  public hashMap(){
    keyArray = (K[]) new Object[capacity];
    valArray = (V[]) new Object[capacity];
    position = 0;
    
  }
  
  @SuppressWarnings("unchecked")
  public hashMap(int capacity){
    this.capacity = capacity;
    K[] keyArray1 = (K[]) new Object[capacity];
    V[] valArray1 = (V[]) new Object[capacity];
    
    //Copy array Keys
    
    
    //Copy array Values
    
    
  }
  
  private void doubleHashMap(){
    int x = capacity*capacity;
    hashMap<K,V> temp = new hashMap<K,V>(x);

  }
  
  
  public int getCapacity(){
    return capacity;
  }
  
  public int getPosition(){
    return position;
    
  }
}

  
  
  