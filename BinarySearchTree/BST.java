public class BST{
  
  public static BSTNode root;
  public static BSTNode current;
  
  public static void main(String[] args){
    BST bst = new BST();
    
    
  }
  public BST(){
    root = null;
  }

  
  public void insert(int data){
    if(root == null){
      root = new BSTNode(10); 
      current = root;
    }     
    
  }
  public void root(){
    System.out.println(root.data);
  }
  
  public boolean isEmpty(){
    return root == null;
  }
 
  public class BSTNode{
    
    public BSTNode left;
    public BSTNode right;
    public int data;
    
    public BSTNode(int d){
      data = d;
    }
  }
  
}