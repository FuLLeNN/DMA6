package QueueSimulation;

import java.util.*;

public class QueueSimulation
{
  private final Deque<Integer> stack = new ArrayDeque<>();
  //1 declarition and 1 incialization =2
  public int simulate(ArrayList<Integer> input)
  {
    stack.addAll(input); //put array list inside the queue
    // 1 "addAll"  = 1 
    while(stack.size()>=2){ //while stack size is bigger than 2 elements do
      //1 ">=" 1 size call = 2 
      
      stack.removeFirst(); //remove the first element
      //1 remove  = 1
     
      stack.addLast(stack.removeFirst()); //remove the second element and add it to the end of the queue
      //1 add , 1 remove
    }
    return stack.getLast(); //return the end of stack when the while finish
    // 1 return 
    //
    //T(n) = 2 + 1 + n*(2+1+2) + 1
    //T(n)=5n
    //T(n)=n
    //O(n)
  }
}
