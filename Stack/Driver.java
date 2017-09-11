/*
Satbir dhaliwal
Feb 20,2017
App: Driver
Purpose: Test the stack Class here.
*/

public class Driver
{
   public static void main(String[] args)
   {
      Stack<String> stack = new Stack<String>();

      //Check the size of the stack.
      System.out.println("Size of the stack: " + stack.size());

      //check if this stack is 0.
      System.out.println("Stack is Empty. " + stack.isEmpty());

      //add an item to stack.
      stack.push("one");

      //Print the last item was added to stack.
      System.out.println("Item: " + stack.peek());

      //check the size of the stack.
      System.out.println("Size of the stack: " + stack.size());

      //check if this stack is 0.
      System.out.println("Stack is Empty. " + stack.isEmpty());


      //Remove and return the last item was added to the stack.
      System.out.println(stack.pop());

      //check the size of the stack.
      System.out.println("Size of the stack: " + stack.size());

      //Check if this stack is 0.
      System.out.println("Stack is Empty. " + stack.isEmpty());

      //Add 5 items to this stack.
      stack.push("s");
      stack.push("t");
      stack.push("a");
      stack.push("c");
      stack.push("k");


      //System.out.println("Item L exist in stack. " + stack.contains("L"));

      //Check the size of the stack.
      System.out.println("Size of the stack: " + stack.size());



      //Removes and returns the last 5 items was added to the stack.
      System.out.println(stack.pop());
      System.out.println(stack.pop());
      System.out.println(stack.pop());
      System.out.println(stack.pop());
      System.out.println(stack.pop());

      //Check the size of the stack.
      System.out.println("Size of the stack: " + stack.size());

      //remove and return the item was added to this stack.
      System.out.println(stack.pop());

   }
}
