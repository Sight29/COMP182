/*
Satbir Dhaliwal
Mar 6, 2017
App: LinkedList
Purpose: implement methods of Linked list.
*/

public class LinkedList<T>
{
   private int     size;  //size of the List
   private Node<T> head;  //head node of the List
   private Node<T> tail;  //tail node of the list

   public LinkedList()
   {
      size = 0;
      head = null;
      tail = null;
   }

   /*
   *Insert new mode on the front of the list(replacing old head), inc. size.
   *
   * @param - input: the new node to add
   * @throws - n/a
   * @return - n/a
   *
   */
   public void newHead(T input)
   {
      Node<T> newNode = new Node<>(input);
      newNode.next = head;  //link the new node with the head
      head = newNode;       //head points to the new node
      size++;

      if(tail == null)
      {
         tail = head;
      }
   }

   /*
   * If head is not null, head points to next node, dec.size
   *
   * @param - n/a
   * @throws - n/a
   * @return - n/a
   *
   */
   public T deleteHead()
   {
      if(size == 0)
      {
         return null;
      }
      else
      {
         Node<T> temp = head; // Keep the first node temporarily
         head = head.next;    //Move head to point to next node
         size--;
         if(head == null)
         {
            tail = null;      //List become empty
         }
         return temp.data;    //return the deleted data
      }
   }

   /*
   *Insert new mode on the tail of the list, inc, size/
   *
   * @param - input: the new node to add
   * @throws - n/a
   * @return - n/a
   *
   */
   public void newTail(T input)
   {
      Node<T> newNode = new Node<>(input);
      if( tail == null)
      {
         head = tail = newNode; //The only node in list
      }
      else
      {
         tail.next = newNode;  //Link the new node with the last node
         tail = tail.next;     //tail now points to the last node
      }
      size++;
   }

   /*
   *Remove node on the tail end of the list, dec, size.
   *
   * @param  - n/a
   * @throws - n/a
   * @return - n/a
   *
   */
   public T deleteTail()
   {
      if (size == 0)
      {
         return null;
      }
      else if(size == 1)
      {
         Node<T> temp = head;
         head = tail = null;  ///List become empty
         size = 0;
         return temp.data;
      }
      else
      {
         Node<T> current = head;
         for(int i = 0; i < size - 2; i++)
         {
            current = current.next;
         }

         Node<T> temp = tail;
         tail = current;
         tail.next = null;
         size--;
         return temp.data;
      }
   }

   /*
   *Search for a node in the list.
   *
   * @param  - input: the item to search.
   * @throws - n/a
   * @return - true if it exists, false otherwise
   *
   */
   public boolean search(T input)
   {
      if(input == null)
      {
         throw new IllegalArgumentException("List is empty.");
      }
      Node temp = head;
      while(temp != null)
      {
         if (temp.data == input)
         {
            return true;
         }
         temp = temp.next;
      }
      return false;
    }


   /*
   * Delete an item in the list.
   *
   * @param  - input: the item to delete.
   * @throws - n/a
   * @return - n/a
   *
   */
   public void delete(T input)
   {
      if (head == null)
      {
         throw new RuntimeException("cannot delete");
      }


      Node<T> current  = head;
      Node<T> previous = null;
      while (current != null)
      {
         previous = current;
         current  = current.next;
      }

      previous.next = current.next;

   }

   /*
   *Remove all nodes in the list.
   *
   * @param - n/a
   * @throws - n/a
   * @return - n/a
   *
   */
   public void clear()
   {
      head = null;
   }

   /*
   *Return the size of the linked list
   *
   * @param - n/a
   * @throws - n/a
   * @return - n/a
   *
   */
   public int size()
   {
      return size;
   }

   /*
   *Check if size() is zero
   *
   * @param - n/a
   * @throws - n/a
   * @return - true if the size of the list is 0, false otherwise.
   *
   */
   public boolean isEmpty()
   {
      return head == null;
   }

   public void print()
   {
      if(isEmpty())
      {
         System.out.println("Print the List: The list is empty.");
      }
      else
      {
         System.out.println(head.getData());
         Node<T> printNode = head;

         while(printNode != tail)
         {
            printNode = printNode.getNext();
            System.out.println(printNode.getData());
         }
      }
   }
}
