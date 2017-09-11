/*
Satbir Dhaliwal
Apr 24, 2017
App: Driver
Purpose: Test the selectionSort method
*/
public class Driver
{
   public static void main(String[] args)
   {
      SelectionSort sort = new SelectionSort();
      final int size;
      size = 30;

      int[] selectionArray = new int[size];
      //Unsorted list.
      System.out.println("Unsorted List of SelectionSort: ");
      for(int i = 0; i < selectionArray.length; i++)
      {
         selectionArray[i] = ((int) (Math.random() * 30 + 1));
         System.out.print(selectionArray[i] + " ");
      }
      System.out.println(" ");

      // Sorted List.
      System.out.println("Sorted List SelectionSort: ");
      for(int i = 0; i < selectionArray.length; i++)
      {
         sort.selectionSort(selectionArray);    //Sort the list.
         System.out.print(selectionArray[i] + " ");
      }
      System.out.println(" ");

      // time is takes to sort the array.
      long start = System.nanoTime();
      long end   = System.nanoTime();
      long finalTime = (end - start);
      System.out.println("Time in ns: " + finalTime);

      // get number of comparisons.
      sort.getSelectionSort();
   }
}
