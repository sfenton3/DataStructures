import java.util.*;

//make a generic class eventually
public class StackArray{
  
  private static Integer[] arr;
  private static int count;
  private static int maxSize = 200;
  
  public StackArray(){
    arr = new Integer[maxSize];
    Arrays.fill(arr, null);
    count = 0;
  }
  
  //Double array length, and padd with null
  public void resize(){
    Integer[] temp = new Integer[maxSize*=2];
    for(int i=0;i<count;i++)
      temp[i] = arr[count];
    arr = temp;
  }
    
  //each push increments count
  public void push(int x){
    if(count == maxSize - 2)
      resize();
    arr[count++] = x;
  }
  //dec count to set prev val to null
  public void pop(){
    count--;
    arr[count] = null;
    
  }
  //dec count, rets value, incs count to keep position
  public Integer peek(){
    int ret = arr[--count];
    count++;
    return ret;
  }
  public Integer search(int data){
    int index = 0;
    for(int i=0;i<count; i++){
      if(arr[i] == data)
        return index;
      index++;
    }
    return null;
  }
  
  public void printStack(){
    for(int i=0;i<count;i++)
      System.out.print(arr[i] + " ");
    System.out.println();
  }
  
  public boolean isEmpty(){
    return arr[0] == null;
  }
    
  public static void main(String[] args){
    StackArray sa = new StackArray();
    for(int i=0;i<101;i+= 2)
      sa.push(i);    
    for(int i=0;i<20;i++)
      sa.pop();
    System.out.println(sa.search(22));
  }
    
  
}
    
    