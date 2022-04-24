package BalancedParenthesisChecking;

import java.util.*;

public class parenthesis
{
  private final Deque<Character> stack = new ArrayDeque<>();

  public boolean checkParentheses(ArrayList<Character> input)
  {
    for(Character i : input){ //loop the ArrayList with the '[',']' and '(',')'
      if(i.equals('[') || i.equals('(')) { //if char equals '[' or '('
        stack.push(i); //push the char into the stack
      } else if(i.equals(']')) { //if it equals to ']'
        if(stack.isEmpty() || stack.pop() != '[') { // if the stack is empty  or the last stack element is different than '['
          return false;
        }
      } else if(i.equals(')')) { //if it equals to ')'
        if(stack.isEmpty() || stack.pop() != '(') { //if the stack is empty or the last stack element is different than '('
          return false;
        }
      }
    }
    return stack.isEmpty(); //if stack is empty return true, else return false
  }
}
