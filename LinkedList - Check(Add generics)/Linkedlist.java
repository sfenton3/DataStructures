//singly linked list
public class Linkedlist{
  
  private static node head; 
  private static node current;
  
  public Linkedlist(){
    head = null;       
  }
  //Deal with initial case, and next cases of adding
  public void add(int data){
    if(head == null){
      head = new node(data);
      current = head;
    }
    else{
      current.next = new node(data);
      current = current.next;
      current.next = null;
    }
    
  }
  //Iterate through until data == node value, and remove links to that node
  public void remove(int data){
    node temp = head;
    //hand case where removing head
    while(head != null){
      if(head.next != null && head.next.data == data){
        head.next = head.next.next;
      }
      else
        head = head.next;
    }
    head = temp;
  }
  
  
  
  //print every node value
  public void printall(){
    node temp = head;
    while(temp != null){
      temp.printn();
      temp = temp.next;
    }  
  }
  
  public void printLast(){
    current.printn();
  }
  public void printFirst(){
    head.printn();
    
  }
  
  
  public static void main(String[] args){
    Linkedlist ll = new Linkedlist(); 
    ll.add(10);
    ll.add(12);
    ll.add(13);
    ll.add(15);
    ll.remove(13);
    ll.remove(15);
    ll.printall();
   
    
    
  }
  
  
  
  //A link to next node
  public class node{
    
    public int data;
    //link to next node
    public node next;
    
    public node(int d1){  
      data = d1; 
    }
    public void printn(){
      System.out.println("Node data: " + data);
    }
  }
  
}