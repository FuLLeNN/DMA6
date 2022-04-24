package ReversePolishNotation;

import java.util.*;

public class ReversePolishCalculator
{
  private final Deque<Integer> stack = new ArrayDeque<>();

  public void push(int n) {
    //add N to the Stack
    stack.add(n);
  }

  public void plus() {
    try{
      if(stack.size()>=2) {
        //store last number and remove it from the stack
        int lastNumber = stack.removeLast();
        //store penultimate number and remove it from the stack
        int penultimateNumber = stack.removeLast();
        //push the number after addition
        push((lastNumber + penultimateNumber));
      }
    }catch (Exception e){
      e.printStackTrace();
    }
  }

  public void minus() {
    try{
      if(stack.size()>=2){
        //store last number and remove it from the stack
        int lastNumber = stack.removeLast();
        //store penultimate number and remove it from the stack
        int penultimateNumber = stack.removeLast();
        //push the number after addition
        push((penultimateNumber - lastNumber));
      }
    }catch (Exception e){
      e.printStackTrace();
    }
  }

  public void times() {
    try{
      if(stack.size()>=2) {
        //store last number and remove it from the stack
        int lastNumber = stack.removeLast();
        //store penultimate number and remove it from the stack
        int penultimateNumber = stack.removeLast();
        //push the number after addition
        push((lastNumber * penultimateNumber));
      }
    }catch (Exception e){
      e.printStackTrace();
    }
  }

  public int read() {
    try{
      //if stack is not empty
      if(!stack.isEmpty())
        //return the last element in the stack
        return stack.getLast();
    }catch (Exception e){
      e.printStackTrace();
    }
    return 0;
  }
}
