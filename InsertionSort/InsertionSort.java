/*
Satbir Dhaliwal
Apr 24, 2017
App: insertionSort
Purpose: implement a insertionSort method
*/
public class InsertionSort
{
   private int InsertionComparisons = 0;

   public void insertionSort(int[] arr)
   {
      int a = arr.length;
      for(int i = 1; i < a; i++)
      {
         /*
         * Insert arr[i] into sorted sublist arr[0..i - 1] so that
         * arr[o..1] is sorted.
         */
         int temp = arr[i]; //item temp to be inserted.
         int j = i - 1;
         while(j > -1 && temp < arr[j]) //smalled values are moveing up.
         {
            arr[j + 1] = arr[j];
            j--;
         }
         // Insert the current element into arr[j]
         arr[j + 1] = temp;
         InsertionComparisons++;
      }
   }

   public int getInsertionSort()
   {
      System.out.println("Number of comparisons: " + InsertionComparisons);
      return InsertionComparisons;
   }
}
