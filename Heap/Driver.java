public class Driver
{
   public static void main(String[] args)
   {
      Heap h = new Heap();

      int[] arr = new int[10];
      for(int i = 0; i < arr.length; i++)
      {
         h.insert(arr[i]);
      }
      for(int i = arr.length  - 1; i >= 0; i--)
      {
         arr[i] = h.deleteRoot();
      }
      // Check to see if tree is full.
      System.out.println("Check to see if heap is full. " + h.isFull());
      // Insert elemnts untill heap if full
      int[] n = {40, 20, 50, 10, 80, 60, 70, 90, 100, 30};

      h.heapSort(n);

      System.out.println("List of Heap Array: ");
      for(int i = 0; i < n.length; i++)
      {

         System.out.print(n[i] + " ");
      }
      System.out.println(" ");

      //h.deleteRoot();

      //Print the list
      System.out.println("List of Heap Array: ");
      for(int i = 0; i < n.length; i++)
      {
         System.out.print(n[i] + " ");
      }
      System.out.println(" ");

      //Generate 10 random numbers
      int[] heapArray = new int[10];
      System.out.println("Unsorted List of HeapSort: ");
      for (int i = 0; i < heapArray.length; i++)
      {
         heapArray[i] = ((int) (Math.random() * 100));
         System.out.print(heapArray[i] + " ");
      }
      System.out.println(" ");

      //heapify heap
      h.heapify(heapArray, 10, 37);

      // Sort the list.
      System.out.println("Sorted List of HeapSort: ");
      for (int i = 0; i < heapArray.length; i++)
      {
         System.out.print(heapArray[i] + " ");
         h.heapSort(heapArray);
      }
      System.out.println(" ");
   }
}
