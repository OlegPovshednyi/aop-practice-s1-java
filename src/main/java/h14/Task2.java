package h14;

import java.util.Stack;

// https://leetcode.com/problems/implement-queue-using-stacks/
public class Task2 {
  Stack<Integer> stack1 = new Stack<>();
  Stack<Integer> stack2 = new Stack<>();

  public Task2() {}

  public void push(int x) {
    stack1.push(x);
  }

  public int pop() {
    if (stack2.isEmpty()) {
      while (!stack1.isEmpty()) {
        stack2.push(stack1.pop());
      }
    }
    return stack2.pop();
  }

  public int peek() {
    if (stack2.isEmpty()) {
      while (!stack1.isEmpty()) {
        stack2.push(stack1.pop());
      }
    }
    return stack2.peek();
  }

  public boolean empty() {
    return stack1.isEmpty() && stack2.isEmpty();
  }
}
