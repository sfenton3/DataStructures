//import java.util.*;

public class doubleLinked{
  
  public static node head;
  public static node current;
  
  public doubleLinked(){
    head = null;
  }
  
  public void add(int x){
    
  }
  
  public void remove(int x){
    
    
  }
  
  
  public static void main(String[] args){
    doubleLinked dl = new doubleLinked();
    dl.add(10);
    
  }
  
  //Link to next and prev node
  public class node{
    
    public int data;
    public node next;
    public node prev;
    
    public node(int d){
      data = d;
      
    }
  }
  
}
      