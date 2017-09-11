/*
Satbir Dhaliwal
Mar, 14 2017
App: DoubleLinkedList
Purpose: implement doublelinkeslist methods and Iterator methods.
*/

import java.util.ListIterator;
import java.util.NoSuchElementException;

public class DoubleLinkedList<T> implements Iterable<T>
{
   private int     size;     //size of the list
   private Node<T> start;    //Start Node<T> of the list
   private Node<T> end;      //end Node<T> of the list

   /*
   *init. membet variable to null or 0
   *
   * @param  - none
   * @throws - n/a
   * @return - n/a
   *
   */
   public DoubleLinkedList()
   {
      size  = 0;
      start = null;
      end   = null;
   }

   /*
   * Insert a new Node<T> of the start of the list
   *
   * @param  - input - the item being inserted
   * @throws - n/a
   * @return - n/a
   *
   */
   public void insertStart(T input)
   {
      Node<T> newNode = new Node<T>(input, null, null);
      if( start == null)
      {
         start = newNode;
         end   = start;
      }
      else
      {

         start.setPrev(newNode);
         newNode.setNext(start);
         start = newNode;
      }
      size++;
   }

   /*
   * Insert a new Node<T> at some position in the list.
   *
   * @param  - t - item beong inserted pos - position in the list.
   * @throws - n/a
   * @return - n/a
   *
   */
   public void insertAtPos(T input, int pos)
   {
      Node<T> newNode = new Node<T>(input, null, null);

      if(pos == 1)
      {
         insertStart(input);
      }
      Node<T> node = start;
      for(int i = 2; i <= size; i++)
      {
         if(i == pos)
         {
            Node<T> temp = node.getNext();
            node.setNext(newNode);
            newNode.setPrev(node);
            newNode.setNext(temp);
            temp.setPrev(newNode);

         }
         node = node.getNext();
      }
      size++;
   }


   /*
   * Insert a new Node<T> at the end of the list.
   *
   * @param  - t - the item being inserted.
   * @throws - n/a
   * @return - n/a
   *
   */
   public void insertEnd(T input)
   {
      Node<T> temp = new Node<T>(input, null, null);
      if(start == null)
      {
         start = temp;
         end   = start;
      }
      else
      {
         temp.setPrev(end);
         end.setNext(temp);
         end = temp;
      }
      size++;
   }

   /*
   * Remove a Node<T> at some position in the list.
   *
   * @param  - pos - the index to the Node<T> being removed
   * @throws - n/a
   * @return - n/a
   *
   */
   public void remove(int pos)
   {
      if (start == null) return;
      if (pos < 1 || pos > size) return;

      Node<T> current = start;
      int i = 1;
      while (i < pos)
      {
         current = current.next;
         i++;
      }
      if(current.next == null)
      {
         current.prev.next = null;
      }
      else if (current.prev == null)
      {
         current = current.next;
         current.prev = null;
         start = current;
      }
      else
      {
         current.prev.next = current.next;
         current.next.prev = current.prev;
      }
      size--;
   }


   /*
   * Return the size of the double linked list.
   *
   * @param  - n/a
   * @throws - n/a
   * @return - the number of items in this list.
   *
   */
   public int size()
   {
      return size;
   }

   /*
   * Check if size() is zero.
   * @param  - n/a
   * @throws - n/a
   * @return - true if the size() of the list is 0, false otherwise.
   *
   */
   public boolean isEmpty()
   {
      return size == 0;
   }

   /*
   * Print the double linked list.("<->" to show the link between prev/next node)
   *   i.e. Node1 <-> Node2 <-> Node3 <-> null
   *
   * @param  - n/a
   * @throws - n/a
   * @return - n/a
   */
   public void print()
   {

      if(size == 0)
      {
         System.out.println("Double Linked List is empty.");
         return;
      }
      if(start.getNext() == null)
      {
         System.out.println(start.getData());
         return;
      }
      Node<T> temp = start;
      System.out.print("Double Linked List: " + start.getData() + " <-> ");
      temp = start.getNext();
      System.out.print(" ");
      while (temp.getNext() != null)
      {
         System.out.print(temp.getData() + " <-> ");
         temp = temp.getNext();
      }
      System.out.println(temp.getData() + " ");
   }

   /*
   * @Override: Returns a new DoubleLinkedListIterator which implements ListIterator.
   *
   * @param  - n/a
   * @throws - n/a
   * @return - ListIterator<T>
   *
   */
   @Override
   public ListIterator<T> iterator()
   {
      return new DoubleLinkedListIterator();
   }

   // assumes no add(...) call during iteration
   private class DoubleLinkedListIterator implements ListIterator<T>
   {
      private Node<T> current   = start;

      // The last Node<T> to be returned by prev() or next()
      private Node<T> lastAccessed = null;

      private int index = 0;

      public boolean hasNext()
      {
         return index < size;
      }

      public boolean hasPrevious()
      {
         return index > 0;
      }

      public int nextIndex()
      {
         return index;
      }

      public int previousIndex()
      {
         return index - 1;
      }

      public void add(T input)
      {
         Node<T> last  = current.prev;
         Node<T> first = current;
         Node<T> temp = new Node<T>();
         temp.setData(input);
         last.next = temp;
         temp.next = first;
         temp.prev = last;
         first.prev = temp;
         size++;
         index++;
         lastAccessed = null;
      }

      public void set(T input)
      {
         if(lastAccessed == null) throw new IllegalStateException();
         lastAccessed.setData(input);
      }

      public void remove()
      {
         Node<T> last  = lastAccessed.prev;
         Node<T> first = lastAccessed.next;
         last.next  = first;
         first.prev = last;
         size--;
         if(current == lastAccessed)
         {
            current = first;
         }
         else
         {
            index--;
         }
         lastAccessed = null;
      }

      public T previous()
      {
         if(!hasPrevious())
         {
            throw new NoSuchElementException();
         }
         current = current.prev;
         index--;
         lastAccessed = current;
         return current.getData();
      }

      public T next()
      {
         if(!hasNext()) throw new NoSuchElementException();
         lastAccessed = current;
         T input = current.getData();
         current = current.next;
         size++;
         return input;
      }
   }
}
