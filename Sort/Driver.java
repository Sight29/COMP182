/*
Satbir Dhaliwal
Apr 29. 2017
App: Driver
Purpose: test the all the sorts method in Sort.java
*/
public class Driver
{
   public static void main(String [] args)
   {

      /////Bubble Sort
      Sort sort = new Sort();
      final int size;
      size = 50;

      int[] bubbleArray = new int [size];
      System.out.println("BubbleSort");
      // Print the unsorted list of bubblesort.
      System.out.println("Unsorted List of Bubblesort: ");
      for (int i = 0; i < bubbleArray.length; i++)
      {
         bubbleArray[i] = ((int) (Math.random() * 50));
         System.out.print(bubbleArray[i] + " ");
      }
      System.out.println(" ");

      // Print the sorted list of the bubblesort.
      System.out.println("Sorted List of BubbleSort: ");
      for (int i = 0; i < bubbleArray.length; i++)
      {
         System.out.print(bubbleArray[i] + " ");
         sort.bubbleSort(bubbleArray);
      }
      System.out.println(" ");

      //Time it takes to sort the algorithm
      long start = System.nanoTime();
      long end   = System.nanoTime();
      long finalTime = (end - start);
      System.out.println("Time in ns: " +finalTime);

      // Get number of comparisons.
      sort.getComparisons();



      //// Selection Sort

      int[] selectionArray = new int[size];
      System.out.println("------------------------------------------------------");
      System.out.println("SelectionSort");
      // Print Unsorted list.
      System.out.println("Unsorted List of SelectionSort: ");
      for(int i = 0; i < selectionArray.length; i++)
      {
         selectionArray[i] = ((int) (Math.random() * 50 + 1));
         System.out.print(selectionArray[i] + " ");
      }
      System.out.println(" ");

      // Print Sorted List.
      System.out.println("Sorted List SelectionSort: ");
      for(int i = 0; i < selectionArray.length; i++)
      {
         sort.selectionSort(selectionArray);    //Sort the list.
         System.out.print(selectionArray[i] + " ");
      }
      System.out.println(" ");

      // time is takes to sort the array.
      long timeStart = System.nanoTime();
      long timeEnd   = System.nanoTime();
      long totalTime = (timeEnd - timeStart);
      System.out.println("Time in ns: " + totalTime);
      // get number of comparisons.
      sort.getComparisons();

      ///// Insertion Sort
      System.out.println("------------------------------------------------------");
      System.out.println("InsertionSort");
      int[] insertionArray = new int[size];
      // Print unsorted list of Insertion Sort
      System.out.println("Unsorted List of InsertionSort: ");
      for(int i = 0; i < insertionArray.length; i++)
      {
         insertionArray[i] = ((int) (Math.random() * 50 + 1));
         System.out.print(insertionArray[i] + " ");
      }
      System.out.println(" ");

      System.out.println("Sorted List of InsertionSort: ");
      for(int i = 0; i < insertionArray.length; i++)
      {
         sort.insertionSort(insertionArray);
         System.out.print(insertionArray[i] + " ");
      }
      System.out.println(" ");

      // Time it takes to sort the algorithm
      long st = System.nanoTime();  //st = start Time
      long et = System.nanoTime();  //et = end time
      long ft = (et - st);          //ft = final time
      System.out.println("Time in ns: " + ft);
      // Number of comparisons
      sort.getComparisons();


      ////// Merge Sort  ///////
      System.out.println("------------------------------------------------------");
      System.out.println("MergeSort");
      int[] mergeArray = new int[size];
      // Print the unsorted array of MergeSort
      System.out.println("Unsorted list of MergeSort:");
      for(int i = 0; i < mergeArray.length; i++)
      {
         mergeArray[i] = ((int) (Math.random() * 50 + 1));
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
      long startTime = System.nanoTime();
      long endTime   = System.nanoTime();
      long time = (endTime - startTime);
      System.out.println("Time in ns: " + time);
      // get the nunmber of comparisons.
      sort.getComparisons();



      //// Quick Sort /////
      System.out.println("------------------------------------------------------");
      System.out.println("QuickSort");
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
         sort.quickSort(quickArray);
         System.out.print(quickArray[i] + " ");
      }
      System.out.println(" ");
      // Time it takes to sort the algorithm
      long s = System.nanoTime();
      long e = System.nanoTime();
      long f = (e - s);
      System.out.println("Time in ns: " + f);
      // Number of comparisons.
      sort.getComparisons();

   }
}
