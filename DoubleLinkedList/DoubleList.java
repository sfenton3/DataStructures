public class DoubleList<T>{
  private DoubleNode<T> first; //actually the first node
  private DoubleNode<T> last; //actually the last node
  private int count;
  
  public DoubleList(){
    count = 0;
    first = last = null;
  }
  
  public void addFirst(T element){
    DoubleNode<T> newNode = new DoubleNode<T>(element);
    if (count == 0){
      first = last = newNode;
    }
    else {
      newNode.setNext(first);
      newNode.setPrev(first.getPrev()); //not needed null
      first.setPrev(newNode);
      first = newNode;
  
}
    count++;
  }
  
  public void removeFirst(){  
    if(count == 0)  {
      first = last;
      System.out.println("throw some error");
    }
    else if(count == 1){
      first = last = null;
      count--;}
    else{
      DoubleNode tmp = first;
      first = first.getNext();
      first.setPrev(null);
      count--;
      
      
    }
      
  }
  
  public void addLast(T element){
    DoubleNode<T> newNode = new DoubleNode<T>(element);
    if (count == 0){
      last = first = newNode;
    }
    else {
      newNode.setNext(null);
      newNode.setPrev(last.getNext());
      last.setNext(newNode);
      last = newNode;
    
    
  }
    count++;
  }
  public void removeLast(){
    DoubleNode tmp = last;
    if (count == 0){
     first = last;
     System.out.println("throw some error");
    }
   else if (count == 1){
      first = last = null;
      count--;
   }
   else{
     last = last.getPrev();
     last.setNext(null);
     count--;
    
  }
  }

  public void printFront(){
    DoubleNode temp = first;
    while(temp != null){
        System.out.println(temp.getElement());
        temp = temp.getNext();
        
    }

 
  }
  
  public void printBack(){
    DoubleNode temp = last;
    while(temp != null){
        System.out.println(temp.getElement());
        temp = temp.getPrev();
        
    }

 
  }
  
  public static void main(String[] args){
    DoubleList<Integer> dll = new DoubleList<Integer>();
    dll.addLast(5);
    dll.addFirst(5);
    dll.addFirst(5);
    dll.removeFirst();
    dll.printFront();
    System.out.println(".............." + dll.count);
    
  }
  
}
  
  