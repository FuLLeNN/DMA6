package ReversePolishNotation;

import java.util.*;

public class ReversePolishCalculator
{
  private final Deque<Integer> stack = new ArrayDeque<>();

  public void push(int n) {
    // TODO Insert your method here
    stack.add(n);
  }

  public void plus() {
    // TODO Insert your method here
    stack.addLast(stack.pollLast()+stack.pollLast());
  }

  public void minus() {
    // TODO Insert your method here
    int a = stack.pollLast();
    int b = stack.pollLast();
    stack.addLast(b-a);
  }

  public void times() {
    // TODO Insert your method here
    stack.addLast(stack.pollLast()*stack.pollLast());
  }

  public int read() {
    // TODO Insert your method here and update the return statement
    return stack.getLast();
  }
}
