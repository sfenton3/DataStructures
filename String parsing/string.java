public class string{
  
  public static void main(String[] args){
    String result = "passage   is  the end of the road";
    String[] resultArr = result.split("");
    boolean space = false;
    
    for(int i = 0; i < resultArr.length; i++){
      if(resultArr[i] == " " && space == false){
      System.out.print(resultArr[i]);
      space = true;
    }
      if(space == false)
        System.out.print(resultArr[i]);
    }
    
  }
}
    
    