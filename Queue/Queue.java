 /*
Satbir Dhaliwal
Feb 27,2017
App: Queue
Purpose: Implement methods of Queue.
*/
import java.util.NoSuchElementException;
public class Queue<Item>
{
   //helper class
   private class Node
   {
      private Item item;
      private Node next;
   }

   private int size;
   private Node first;
   private Node last;

   public Queue()
   {
      size = 0;       //Size of the node
      first = null;   //front of the queue.
      last = null;    //rear of the queue.
   }

   /*
   *Add an item to queue.
   *
   *@param - the item to add to this queue.
   *@throws - n/a
   *@return - none
   *
   */
   public void add(Item item)
   {
       Node oldNode = last;
       last = new Node();
       last.item = item;
       last.next = null;
       if (isEmpty())
       {
          first = last;
       }
       else
       {
          oldNode.next = last;
       }
       size++;
   }

   /*
   *Removes and returns the next item to be processed.
   *
   *@param - none
   *@throws - NoSuchElementException if this queue is empty.
   *@return - Removes and returns the next item to be processed.
   */
   public Item poll()
   {
      if (isEmpty()) throw new NoSuchElementException("Queue is Empty.");
      Item item = first.item;
      first = first.next;
      size--;
      if(isEmpty())
      {
        last = null;
      }
      return item;
   }

    /*
    *Returns ( but does not remove) the next item to be processed.
    *
    *@param - none
    *@throws - NoSuchElementException if this queue is empty.
    *@return - The next item to be processed.
    *
    */

   public Item peek()
   {
      if(isEmpty())
      {
         throw new NoSuchElementException("Queue is Empty.");
      }
      return first.item;
   }

   /*
   *Check if item exists in this queue.
   *
   *@param - item is the element to check.
   *@throw - IllegalArgumentException if the input is null.
   *@return - true if the queue contains the item, false otherwise.
   *
   */
   public boolean contains(Item item)
   {
      if (item == null)
      {
         throw new IllegalArgumentException("Queue is Empty.");
      }
      Node current = first;
      if(current.item == item)
      {
         return true;
      }
      else
      {
         while (current.next != null)
         {
            if(current.item == item)
            {
               return true;
            }
            current = current.next;
         }
         return false;
      }
   }

   /*
   *Check if this queue size is 0;
   *
   *@param - none.
   *@throws - n/a
   *@return - true if the size of the queue is 0, false otherwise.
   *
   */

   public boolean isEmpty()
   {
      return first == null;
   }

   /*
   *Returns the number of elements in this queue.
   *
   *@param - none.
   *@throws - n/a.
   *@return - the number of item in queue.
   *
   */
   public int size()
   {
      return size;
   }
 }
