/*
Satbir Dhaliwal
Mar 31, 2017
App: ArrayList.java
Purpose: implement List using ArrayList
*/
public class ArrayList<T> implements List<T>
{
   private int size;     // current number of elements.
   private static final int INITIAL_CAPACITY = 20;   //default array capacity.
   private T[] data;     //generic array used for storge.

   public ArrayList( int initialCapacity)
   {
      data = (T[]) new Object[initialCapacity];   //safe cast: compiler may give warning.
   }

   public ArrayList()
   {
      this(INITIAL_CAPACITY);
      size = 0;
   }

   /*
   * Return the size of the list.
   *
   * @param  - n/a
   * @throws - n/a
   * @return - n/a
   */
   public int size()
   {
      return size;
   }

   /*
   * Check to see if the list is empty.
   *
   * @param  - n/a
   * @throws - n/a
   * @return - true if the list is empty, false otherwise.
   */
   public boolean isEmpty()
   {
      return size == 0;
   }

   /*
   * Return true if this list contains the specified element.
   */
   @Override
   public boolean contains(Object o)
   {

      if(size == 0)
      {
         System.out.println("Item is not in the list. ");
      }
      for(int i = 0; i < size; i++)
      {
         if(o.equals(data[i]))
         {
            return true;
         }

      }
      return false;
   }

   /*
   * If the array is full, replace it with a new, larger array;
   * strore the new input after the last input
   * and increment the count of the nu,ber of size in the list.
   * Add a nwe element at the specified index
   *
   * @param  - n/a
   * @throws - n/a
   * @return - n/a
   *
   */

   public void add(T input)
   {
      // add new input, update size
      data[size] = input;
      size++;
   }

   /*
   * Removes the element in the list at position.
   */
   @Override
   public boolean remove(Object o)
   {
      boolean result = false;
      T[] temp = data;

      if(isEmpty())
      {
         System.out.println("List is Empty.");
      }
      for(int i = 0; i < size; i++)
      {
         if(o == temp[i])
         {
            temp[i] = temp[i+1];
            result = true;
            size--;
         }
         temp[i] = temp[i + 1];
      }
      return result;
   }

   /*
   * Clear the list.
   */
   public void clear()
   {
      size = 0;
   }

   /*
   * Print the complete list.
   */

   public void print()
   {

      T[] temp = data;
      if(size == 0)
      {
         System.out.println("The List is Empty.");
      }
      else
      {
         System.out.println("The Array List: ");
         for( int i = 0; i < size; i++)
         {
            System.out.print(temp[i] + " -> ");


         }
         System.out.println(" ");
      }
   }
}
