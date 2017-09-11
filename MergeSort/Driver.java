public class Driver
{
   public static void main(String[] args)
   {
      MergeSort sort = new MergeSort();
      final int size;
      size = 40;

      int[] mergeArray = new int[size];

      // Print the unsorted array of MergeSort
      System.out.println("Unsorted list of MergeSort:");
      for(int i = 0; i < mergeArray.length; i++)
      {

         mergeArray[i] = ((int) (Math.random() * 40 + 1));
         System.out.print(mergeArray[i] + " ");
      }
      System.out.println(" ");
      //Print the Sorted array of MergeSort
      System.out.println("Sorted list of MergeSort:");
      for(int i = 0; i < mergeArray.length; i++)
      {
         sort.mergeSort(mergeArray);
         System.out.print(mergeArray[i] + " ");
      }
      System.out.println(" ");
      // Time it takes to sort the array
      long start = System.nanoTime();
      long end   = System.nanoTime();
      long finalTime = (end - start);
      System.out.println("Time in ns: " + finalTime);
      // get the nunmber of camoprisons.
      sort.getMergeComparisons();
   }
}
