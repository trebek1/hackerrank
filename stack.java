import java.util.*;
class Solution{
   
   public static void main(String []argh)
   {
      Scanner sc = new Scanner(System.in); 
       
      Map<String, String> map = new HashMap<>(); 
      map.put("}", "{"); 
      map.put(")", "("); 
      map.put("]", "["); 
       
      
      while (sc.hasNext()) {
         String input=sc.next();
         String[] nextString = input.split("");  
         Stack<String> stack = new Stack<>(); 
          for(int i = 0; i<nextString.length; i++){
            String str = nextString[i]; 
              if(i == 0 || stack.isEmpty()){
                  stack.push(str);
              }else if(stack.peek().equals(map.get(str))){
                  stack.pop(); 
              }else{
                  stack.push(str); 
              }
          }
          if(stack.isEmpty()){
            System.out.println("true");
          }else{
              System.out.println("false"); 
          }
      }
      
   }
}