package QueueSimulation;

import java.util.*;

public class QueueSimulation
{
  private final Deque<Integer> stack = new ArrayDeque<>();

  public int simulate(ArrayList<Integer> input)
  {
    stack.addAll(input); //put array list inside the queue
    while(stack.size()>=2){ //while stack size is bigger than 2 elements do
      stack.removeFirst(); //remove the first element
      stack.addLast(stack.removeFirst()); //remove the second element and add it to the end of the queue
    }
    return stack.getLast(); //return the end of stack when the while finish
  }
}
