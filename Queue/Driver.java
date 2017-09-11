/*
Satbir Dhaliwal
Feb 27, 2017
App: Driver
Purpose: Test the methods of queue class.
*/
public class Driver
{
   public static void main(String[] args)
   {
      Queue<String> queue = new Queue<String>();

      //add 13 items.
      queue.add("Logic");
      queue.add("Kendrick");
      queue.add("Tupac");
      queue.add("Kobe");
      queue.add("Jcole");
      queue.add("Wisdom");
      queue.add("Faith");
      queue.add("truth");
      queue.add("Lakers");
      queue.add("World");
      queue.add("Apple");
      queue.add("Logo");
      queue.add("Camarillo");

      //Check to see if queue is Empty.
      System.out.println("Is queue empty." + queue.isEmpty());

      //Size of the queue.
      System.out.println("Size of the Queue: " + queue.size());

      //return the queue.
      System.out.println("Item: " + queue.peek());

      //check to see if item exists in queue.
      System.out.println("Item Tupac exists? " + queue.contains("Tupac"));
      System.out.println("Item Logo exists? " + queue.contains("Logo"));
      System.out.println("Item Magic exists? " + queue.contains("Magic"));

      //Remove the first item to be processed.
      System.out.println("Pull an item: " + queue.poll());

      //return an item.
      System.out.println("Item: " + queue.peek());

      //Check the size of the queue.
      System.out.println("Size of the Queue: " + queue.size());

      //Removing all the items out of the queue.
      System.out.println("Pull an Item: " + queue.poll());
      System.out.println("Pull an Item: " + queue.poll());
      System.out.println("Pull an Item: " + queue.poll());
      System.out.println("Pull an Item: " + queue.poll());
      System.out.println("Pull an Item: " + queue.poll());
      System.out.println("Pull an Item: " + queue.poll());
      System.out.println("Pull an Item: " + queue.poll());
      System.out.println("Pull an Item: " + queue.poll());
      System.out.println("Pull an Item: " + queue.poll());
      System.out.println("Pull an Item: " + queue.poll());
      System.out.println("Pull an Item: " + queue.poll());
      System.out.println("Pull an Item: " + queue.poll());
      System.out.println("Pull an Item: " + queue.poll());

   }
}
