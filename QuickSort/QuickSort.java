/*
Satbir Dhaliwal
Apr 28, 2017
App: QuickSort
Purpose: implement a method of quick sort.
*/
public class QuickSort
{
  private int QuickComparisons = 0;
  // Method is used to sort an array.
  public void quickSort(int[] list)
  {
     quickSort(list, 0, list.length - 1);
  }
  // This method is a helper method
  // Sorts a partial array with a specified range.
  public void quickSort(int[] list, int first, int last)
  {
     if(last  > first)
     {
        QuickComparisons++;
        int pivotIndex = partition(list, first, last);
        quickSort(list, first, pivotIndex - 1);
        quickSort(list, pivotIndex + 1, last);
     }
  }
  // Partition the array list[first...last] using the pivot
  public int partition(int[] list, int first, int last)
  {
     int pivot = list[first];  // Choose the first element as the pivot
     int low   = first + 1;    // Index for forward search
     int high  = last;         // Index for backward search

     while(high > low)
     {
        // Search forward from left
        while(low <= high && list[low] <= pivot)
        {
           low++;
        }
        // Search beackward from right
        while(low <= high && list[high] > pivot)
        {
           high--;
        }

        // Swap two element in the list
        if(high > low)
        {
           int temp = list[high];
           list[high] = list[low];
           list[low] = temp;
        }
     }

     while(high > first && list[high] >= pivot)
     {
        high--;
     }

     // Swap pivot with list[high]
     if(pivot > list[high])
     {
        list[first] = list[high];
        list[high] = pivot;
        return high;
     }
     else
     {
        return first;
     }
  }

  public int getQuickComparisons()
  {
     System.out.println("Number of Comparisons: " + QuickComparisons);
     return QuickComparisons;
  }
}
