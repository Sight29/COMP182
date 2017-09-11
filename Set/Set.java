/*
Satbir dhaliwal
App: Set
*/
import java.util.TreeSet;
import java.util.Iterator;

public class Set<T extends Comparable<T>> implements Iterable<T>
{
   private TreeSet<T> set = new TreeSet<>();

   /*
      * Add input to this set. (if it doesnt exist)
      *
      * @param - input is the key to add
      * @throws - IllegalArgumentException if the input is null
      * @return  - n/a
      *
      */
   public void add(T input)
   {
      if (input == null)
      {
         throw new IllegalArgumentException("The inpute is null");
      }
      set.add(input);
   }

   /*
     * Remove input from this set. (if it exists)
     *
     * @param - input is the key to remove
     * @throws - IllegalArgumentException if the input is null
     * @return  - n/a
     *
     */
   public void remove(T input)
   {
      if (input == null)
      {
         throw new IllegalArgumentException("The input is null");
      }
      set.remove(input);
   }
   /*
      * Check if input exists in this set.
      *
      * @param - input is the key to check
      * @throws - IllegalArgumentException if the input is null
      * @return  - true if the set contains this input, false otherwise
      *
      */
   public boolean contains(T input)
   {
      if ( input == null)
      {
         throw new IllegalArgumentException("The input is null");
      }
      return set.contains(input);
   }
   /*
     * Check if this set size is 0.
     *
     * @param - none
     * @throws - n/a
     * @return  - true if the size of the set is 0, false otherwise
     *
     */

   public boolean isEmpty()
   {
      return set.isEmpty();
   }
   /*
      * Return the size (number of elements) of this set.
      *
      * @param - none
      * @throws - n/a
      * @return  - return the number of elements in this set.
      *
    */


   public int size()
   {
      return set.size();
   }
   /*
      * Remove all elements from this set.
      *
      * @param - none
      * @throws - n/a
      * @return  - n/a
      *
      */
   public void clear()
   {
      set.clear();
   }
   /*
      * @Override method to return an iterator for all the elements of this set.
      *
      * @param - none
      * @throws - n/a
      * @return  - Iterator<T>
      *
      */
   public Iterator<T> iterator()
   {
      return set.iterator();
   }

}
