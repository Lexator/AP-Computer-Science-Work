// Example 15.6: Tests a PriorityQueue

import java.util.PriorityQueue;

public class TestPriorityQueue{

   public static void main(String[] args){
      // Create a list and add some strings
      PriorityQueue <String> que = new PriorityQueue<String>(); 
      for (int i = 1; i <= 5; i++)
         que.add("String" + i);
      // Add one more to show prioritization
      que.add("String" + 0);

      // Remove and display objects from the queue
      while (! que.isEmpty())                       
         System.out.println(que.remove());

      // Cause an NoSuchElementException
      que.remove();
   }
}
