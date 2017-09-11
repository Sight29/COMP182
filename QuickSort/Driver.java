public class Driver
{
   public static void main(String[] args)
   {
      QuickSort QS = new QuickSort();
      final int size;
      size = 50;

      int[] quickArray = new int[size];
      // printing unsorted list of Quick Sort.
      System.out.println("Unsorted QuickSort List: ");
      for(int i = 0; i < quickArray.length; i++)
      {
         quickArray[i] = ((int) (Math.random() * 50));
         System.out.print(quickArray[i] + " ");
      }
      System.out.println(" ");

      // printing sorted list of Quick Sort.
      System.out.println("Sorted QuickSort list: ");
      for(int i = 0; i < quickArray.length; i++)
      {
         QS.quickSort(quickArray);
         System.out.print(quickArray[i] + " ");
      }
      System.out.println(" ");

      // Time it takes to sort the algorithm
      long start = System.nanoTime();
      long end   = System.nanoTime();
      long finalTime = (end - start);
      System.out.println("Time in ns: " + finalTime);
      // Number of comparisons.
      QS.getQuickComparisons();


   }
}
