/*
Satbir Dhaliwal
Apr 29, 2017
App: Sort.java
Purpose: implement a method of BubbleSort
*/
public class Sort
{
   private int comparisons = 0;
   // This method will sort the array
   public void bubbleSort(int[] arr)
   {
      int a = arr.length;
      //The outer loop positions (i) at the last element to
      // compare during each pass through the array.
      for (int i = 0; i < a - 1; i++)
      {
         //The inner loop strps through the array, comparing
         // each element with its neighbor. ALl of the elements from
         // (j) 0 through (i) are involved in the comparisons.
         for (int j = 0; j < a - i - 1; j++)
         {
            //compare an element with its neighbor
            if (arr[j] > arr[j + 1])
            {
               swap(j, arr);
               comparisons++;
            }
         }
      }
   }
   //Swap the two elements
   public void swap(int j, int[]arr)
   {
      int temp   = arr[j + 1];
      arr[j + 1] = arr[j];
      arr[j] = temp;
   }

   // Selection Sort method
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
               comparisons++;
            }
         }
         //swap largest item with arr[i]
         int swap = arr[pos];
         arr[pos] = arr[i];
         arr[i] = swap;
      }
   }

   // insertionSort method
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
         comparisons++;
      }
   }

   // Merge Sort method
   public void mergeSort(int[] list)
   {
      int a = list.length;
      if(a > 1)
      {
         // Merge sort the first half.
         // temp array for first half
         int[] firstHalf = new int[a/2];
         // Sorts the temp array.
         System.arraycopy(list,0, firstHalf,0, a/2);
         // merges firsthalf into original array
         mergeSort(firstHalf);

         // Merge sort the second half
         int secondHalfLength = a - a/2;
         // temp array for second half
         int[] secondHalf = new int[secondHalfLength];
         // Sorts the temp array.
         System.arraycopy(list, a/2, secondHalf,0, secondHalfLength);
         // merges second half into original half.
         mergeSort(secondHalf);

         //Merge firshalf with secondhalf into list.
         merge(firstHalf, secondHalf, list);
      }
   }
   //merges two sorted lists.
   public void merge(int[] list1, int[] list2, int[] temp)
   {

      int n = list1.length;
      int k = list2.length;
      int current1 = 0;  // current index in list1
      int current2 = 0;  // current index in list2
      int current3 = 0;  // current index in temp

      while(current1 < n && current2 < k)
      {

         if(list1[current1] < list2[current2])
         {
            comparisons++;
            temp[current3++] = list1[current1++];

         }
         else
         {
            temp[current3++] = list2[current2++];

         }
      }
      while(current1 < n)
      {
         temp[current3++] = list1[current1++];
      }
      while(current2 < k)
      {
         temp[current3++] = list2[current2++];
      }
   }

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
         
         int pivotIndex = partition(list, first, last);
         // Recursively call quickSort with left part of the partiioned array
         quickSort(list, first, pivotIndex - 1);
         // Recursively call quickSort with right part of the partitioned array
         quickSort(list, pivotIndex + 1, last);
      }
   }
   /*
   * Divides(partitions) array from pivot, left sied contains element less than
   * Pivot while right side contains elements greater than pivot.
   */
   public int partition(int[] list, int first, int last)
   {
      int pivot = list[first];  // Choose the first element as the pivot
      int low   = first + 1;    // Index for forward search
      int high  = last;         // Index for backward search

      while(high > low)
      {
         // Searching number which is greater than pivot, top down
         while(low <= high && list[low] <= pivot)
         {
            low++;
         }
         // Searching number which is less than pivot, top down
         while(low <= high && list[high] > pivot)
         {
            high--;
         }

         // Swap two element in the list
         if(high > low)
         {
            comparisons++;
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

   public int getComparisons()
   {
      System.out.println("Number of comparisons: " + comparisons);
      return comparisons;
   }
}
