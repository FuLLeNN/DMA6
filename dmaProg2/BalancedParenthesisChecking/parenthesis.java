package BalancedParenthesisChecking;

import java.util.*;

public class parenthesis
{
  private final Deque<Character> stack = new ArrayDeque<>(); //1 declaration 1 initialization = 2

  public boolean checkParentheses(ArrayList<Character> input)
  {
    for(Character i : input){ //loop the ArrayList with the '[',']' and '(',')'
      //we have no recursion so we don't need a base case
      //We have a loop O(n)
      if(i.equals('[') || i.equals('(')) { //if char equals '[' or '('
        //2 comparisons = 2
        stack.push(i); //push the char into the stack
        //1 call method = 1
      } else if(i.equals(']')) { //if it equals to ']'
        //1 comparison = 1
        if(stack.isEmpty() || stack.pop() != '[') { // if the stack is empty  or the last stack element is different than '['
          //2 comparisons = 2
          return false;
          //1 return = 1
        }
      } else if(i.equals(')')) { //if it equals to ')'
        //1 comparison = 1
        if(stack.isEmpty() || stack.pop() != '(') { //if the stack is empty or the last stack element is different than '('
          //2 comparisons = 2
          return false;
          //1 return = 1
        }
      }
    }
    return stack.isEmpty(); //if stack is empty return true, else return false
    //1 return = 1
  }
}
/*
In the worst case we can get
T(n) = 2 + n( 1 + 2 + 1 ) 
T(n) = 2 + n(10) + 1
So ignoring constants
T(n) = n
T(n) = O(n)
*/
