/*
Satbir Dhaliwal
Mar 29, 2017
App: ADT
Purpose: Implement Linked List methods using interface.
*/
public class LinkedList1<T> implements List<T>
{

   int     size;
   Node<T> head;
   Node<T> tail;

   //Default constructor.
   public LinkedList1()
   {
      size = 0;
      head = null;
      tail = null;
   }

   /*
   * Return the size of the list.
   *
   * @param  - n/a
   * @throws - n/a
   * @return - n/a
   *
   */
   public int size()
   {
      return size;
   }

   /*
   * Check if size is 0.
   *
   * @param  - n/a
   * @throws - n/a
   * @return - true if the size of the list in 0,false othrewise.
   */
   public boolean isEmpty()
   {
      return head == null;
   }

   /*
   * Check to see if the given object is present on this list.
   *
   * @param  - o an Object
   * @throws - n/a
   * @return - true if this list contains the given object, false otherwise.
   *
   */
   @Override
   public boolean contains(Object o)
   {
      Node<T> curr = head;
      while (curr != null && !curr.data.equals(o))
      {
         curr = curr.getNext();
      }
      return curr != null;
   }

   /*
   * Insert a new Node in the list.
   *
   * @param  - imput : the new Node to add
   * @throws - n/a
   * @return - n/a
   */

   public void add(T input)
   {
      Node<T> newNode = new Node<>(input);
      newNode.next = head;   //Link the new Node with the head.
      head = newNode;        //head points to the next Node.
      size++;
      if(tail == null)
      {
         tail = head;
      }
   }

   /*
   * Remove the given item from this list.
   *
   * @param  - o an Object.
   * @throws - none
   * @return - true if and only if there was an object to remove.
   *
   */
   @Override
   public boolean remove(Object o)
   {
      if(head == null)
      {
         return false;
      }
      else if(head.data.equals(o))
      {
         if(size == 1)
         {
            clear();
         }
         else
         {
            head = head.getNext();
            size--;
         }
         return true;
      }
      else
      {
         //find the node before the one to remove
         Node<T> before = head;
         while(before != tail && !before.getNext().getData().equals(o))
         {
            before = before.getNext();
         }
         if(before != tail)
         {
            //found thing to remove; link around it.
            Node<T> after = before.getNext().getNext();
            before.next = after;
            size--;
            if(after == null)
            {
               tail = before;
            }
            return true;
         }
         else
         {
            return false;
         }
      }
   }

   /*
   * Remove all the nodes in the list.
   *
   * @param  - n/a
   * @throws - n/a
   * @return - n/a
   */
   public void clear()
   {
      head = null;
   }

   /*
   * Print the list.
   *
   * @param  - n/a
   * @throws - n/a
   * @return - n/a
   */

   public void print()
   {
      if(isEmpty())
      {
         System.out.println("Print the List: The list is empty.");
      }
      else
      {
         System.out.print("List: " + head.getData());
         Node<T> printNode = head;
         while(printNode != tail)
         {
            printNode = printNode.getNext();
            System.out.print(" -> " + printNode.getData());
         }
         System.out.println(" ");
      }
   }
}
