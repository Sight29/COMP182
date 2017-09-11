public class MergeSort
{
   private int mergeComparisons = 0;
   //THe method for sorting the numbers
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
         mergeComparisons++;
         if(list1[current1] < list2[current2])
         {
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

   public int getMergeComparisons()
   {
      System.out.println("Number of comparisons: " + mergeComparisons);
      return mergeComparisons;
   }
}
