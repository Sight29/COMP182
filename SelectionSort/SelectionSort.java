/*
Satbir Dhaliwal
Apr 24,2017
App: SelectionSort
Purpose: java methods to selection sort.
*/
public class SelectionSort
{
   private int selectionComparisons = 0;
   public void selectionSort(int[] arr)
   {
      int a = arr.length;
      for(int i = 0; i < a - 1; i++)
      {
         int pos = i;  //position of smallest remaining value.
         for(int j = i + 1; j < a; j++)
         {
            if(arr[j] < arr[pos])
            {
               pos = j; //searching for lowest index
               selectionComparisons++;
            }
         }
         //swap largest item with arr[i]
         int swap = arr[pos];
         arr[pos] = arr[i];
         arr[i] = swap;
      }
   }

   public int getSelectionSort()
   {
      System.out.println("Number of comparisons: " + selectionComparisons);
      return selectionComparisons;
   }
}
