/*
Satbir Dhaliwal
Apr 24,2017
App: Driver
Purpose: test a insertionSort method
*/
public class Driver
{
   public static void main(String[] args)
   {
      InsertionSort IS = new InsertionSort();

      final int size;
      size = 40;

      int[] insertionArray = new int[size];
      // Print unsorted list of Insertion Sort
      System.out.println("Unsorted List of InsertionSort: ");
      for(int i = 0; i < insertionArray.length; i++)
      {
         insertionArray[i] = ((int) (Math.random() * 40 + 1));
         System.out.print(insertionArray[i] + " ");
      }
      System.out.println(" ");

      System.out.println("Sorted List of InsertionSort: ");
      for(int i = 0; i < insertionArray.length; i++)
      {
         IS.insertionSort(insertionArray);
         System.out.print(insertionArray[i] + " ");
      }
      System.out.println(" ");

      // Time it takes to sort the algorithm
      long start = System.nanoTime();
      long end   = System.nanoTime();
      long finalTime = (end - start);
      System.out.println("Time in ns: " + finalTime);
      // Number of comparisons
      IS.getInsertionSort();
   }
}
