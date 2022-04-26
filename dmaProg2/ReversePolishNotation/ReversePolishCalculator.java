package ReversePolishNotation;

import java.util.*;

public class ReversePolishCalculator
{
  private final Deque<Integer> stack = new ArrayDeque<>();

  public void push(int n) {
    // TODO Insert your method here
    //add an integer "n" to the stack
    stack.add(n); //we call a method so it's a constant of 1
  }
//we have no recursion so we don't need a base case
//T(n)= 1 So ignoring constants
// T(n)= O(1)
  
  
  
  public void plus() {
    // TODO Insert your method here
    //use the method addLast (to add to the end of the stack) the sum of the first 2 elements
    // by calling the function poll that remove the first element and return it
    stack.addLast(stack.pollLast()+stack.pollLast()); //we have 3 methods and 1 "+"
  }

  //we have no recursion so we don't need a base case
//T(n)= 4 So ignoring constants
// T(n)= O(1)

  public void minus() {
    // TODO Insert your method here
    // Calling the function poll to remove the first element and saving it in a variable
    int a = stack.pollLast(); // This takes 1 for the method call and 1 "="
    int b = stack.pollLast(); // This takes 1 for the method call and 1 "="
    //add to the end of stack the subtraction of the first 2 elements previously saved
    stack.addLast(b-a); // we have 1 method call and 1 "-" 
  }

  //we have no recursion so we don't need a base case
//T(n)= 2+2+2 = 6 So ignoring constants
// T(n)= O(1)

  public void times() {
    // TODO Insert your method here
    // Reusing the poll method to get multiply the 2 first elements and then add them to the end
    stack.addLast(stack.pollLast()*stack.pollLast()); //we have 3 methods and 1 "*"
  }
  //we have no recursion so we don't need a base case
//T(n)= 4 So ignoring constants
// T(n)= O(1)
  

  public int read() {
    // TODO Insert your method here and update the return statement
    // read the last element of the stack
    return stack.getLast(); // 1 return
  }
}
//we have no recursion so we don't need a base case
//T(n)= 1 So ignoring constants
// T(n)= O(1)


//we have no recursion so we don't need a base case
//if we cal all the functions of the program we have a 
// T(n)= 1 + 4 + 1 + 2 + 2 + 2 + 4 + 1 = 17 So ignoring constants
//we get :
//T(n)= O(1);

