/*
Satbir Dhaliwal
May 5, 2017
App: Heap
Purpose: implement methods of heap
*/
import java.util.NoSuchElementException;
public class Heap
{
   private int size;         // size of the array
   private int[] heap;
   private int currentSize;  // number of nodes in array

   public Heap()
   {
      size = 10;               // intial length of array
      currentSize = 0;         // limit of elements in array
      heap = new int[size];
   }

   /*
   * Functin to insert an item.
   */
   public void insert(int item)
   {
      if(isFull())
      {
         throw new NoSuchElementException("Overflow Exception.");
      }
      currentSize++;
      heap[currentSize - 1] = item;
      siftUp(currentSize  - 1);
   }

   // Remove the root
   public int deleteRoot()
   {
      int root = heap[0];
      heap[0] = heap[--currentSize];
      siftDown(0);
      return root;
   }

   /*
   * move item at location up to its correct position.
   */
   public void siftUp(int idx)
   {
      int parent = (idx - 1) / 2;
      int temp = heap[idx];
      while(idx > 0 && temp < heap[parent])
      {
         heap[idx] = heap[parent];
         idx = parent;
         parent = (parent - 1) / 2;
      }
      heap[idx] = temp;
   }

   // Move item at location down to its corrent position
   public void siftDown(int idx)
   {
      int largerChild;
      int top = heap[idx];             //Save root
      while(idx < currentSize/2)
      {
         int leftChild = 2 * idx + 1;
         int rightChild = leftChild + 1;
         // find larger child
         if(rightChild < currentSize && heap[leftChild] < heap[rightChild])
         {
            largerChild = rightChild;
         }
         else
         {
            largerChild = leftChild;
         }
         if(top >= heap[largerChild])
         {
            break;
         }
         // Shifr chidl up
         heap[idx] = heap[largerChild];
         idx = largerChild; // go down
      }
      heap[idx] = top;    // root to index
   }

   /*
   * return true if array(heap) is full, false otherwise
   */
   public boolean isFull()
   {
      return currentSize == heap.length;
   }

   // Sorting the heap tree.
   public void heapSort(int[] arr)
   {
      int n = arr.length;
      // rearrange array
      for(int i = n / 2; i >= 0; i--)
      {
         heapify(arr, n, i);
      }
      // One by one extract an element from help
      for(int i = n - 1; i >= 0; i--)
      {
         // Move current root to end
         int temp = arr[0];
         arr[0] = arr[i];
         arr[i] = temp;
         // Call max heapify on the reduced heap
         heapify(arr, i , 0);
      }
   }

   /*
   * To heapify a subtree rooted with node i which is
   * an index in arr[]. n is size of heap
   */
   public void heapify(int[] arr, int n, int i)
   {
      int larger = i;             // Initialize larger as root
      int leftChild = 2 * i + 1;
      int rightChild = 2 * i + 2;
      // If left child is lager than root
      if(leftChild < n && arr[leftChild] > arr[larger])
      {
         larger = leftChild;
      }
      if(rightChild < n && arr[rightChild] > arr[larger])
      {
         larger = rightChild;
      }
      if(larger != i)
      {
         int swap = arr[i];
         arr[i] = arr[larger];
         arr[larger] = swap;
         // Rrecursively heapify the affected sub-tree.
         heapify(arr, n, larger);
      }
   }
}
