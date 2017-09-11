public class Heap
{
   private int size;
   private int[] heap;
   private int currentSize;
   public Heap()
   {
      size = 10;
      currentSize = 0;
      heap = new int[size];
   }

   public void insert(int item)
   {
      if(isFull())
      {
         throw new NoSuchElementException("Tree is full.");
      }
      currentsize++;
      heap[currentsize - 1] = item;
      siftUp(currentsize - 1);
   }

   public int deleteRoot()
   {
      int root = heap[0];
      heap[0] = heap[--currentSize];
      siftDown(0);
      return root;
   }

   public void siftUp(int idx)
   {
      int parent = (idx - 1)/2;
      int temp = heap[idx];
      while(idx > 0 && temp < heap[parent])
      {
         heap[idx] = heap[parent];
         idx = parent;
         parent = (parent - 1) / 2;
      }
      heap[idx] = temp;
   }

   public boolean isFull()
   {
      return currentSize = heap.length;
   }

   public void heapSort(int[] arr)
   {
      int n = arr.length;
      for(int i = n / 2; i >= 0; i++)
      {
         heapify(arr, n, i);
      }
      for(int i = n - 1; i >= 0; i++)
      {
         int temp = arr[0];
         arr[0] = arr[i];
         arr[i] = temp;
         heapify(arr, i, 0);
      }
   }

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
