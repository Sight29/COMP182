 public class HashTable<Key, Value>
{
   private HashItem[] hashTable; // array of linked-list symbol tables
   private int pairs;            // number of key-value pairs
   private int size;             // hashTable size

   private static class HashItem
   {
      private final Object key;
      private Object val;
      private HashItem next;

      public HashItem(Object key, Object val)
      {
         this.key = key;
         this.val = val;

      }

   }

   public HashTable(int size)
   {
      hashTable = new HashItem[size];
      this.size = size;
      pairs = 0;
   }

   /*
   * Return true if this table is empty, false otherwise.
   */
   public boolean isEmpty()
   {
      return size() == 0;
   }

   /*
   * Return the size of the key-value pairs in this table.
   */
   public int size()
   {
      return pairs;
   }

   /*
   * return value assiciated with key, null if no such key is find.
   */
   @SuppressWarnings("Unchecked")
   public Value get(Key key)
   {
      if(key == null)
      {
         throw new IllegalArgumentException("Item is not found.");
      }
      int hashKey=hash(key);
      if(hashTable[hashKey] != null)
      {
         return (Value)hashTable[hashKey];
      }
      System.out.println("Value for key is not found.");
      return null;
   }


   /*
   * insert ket-value pair into the table.
   */
   public void put(Key key, Value val)
   {
      if(key == null || val == null)
      {
         throw new IllegalArgumentException("The table is empty.");
      }
      int hashKey = hash(key);
      if(hashTable[hashKey] == null)
      {
         hashTable[hashKey] = new HashItem(key, val);
      }



   }

   /*
   * delete key and value from the table.
   */
   /*public void delete(Key key)
   {
      if(key == null)
      {
         throw new IllegalArgumentException("Key is not in the table.");
      }

      int hash = hash(key);
      if()

   }*/

   /*
   * Return true if this symbol table contains the specified key.
   */
   public boolean contains(Key key)
   {
      if(key == null)
      {
         throw new IllegalArgumentException("Key doesnt exist in the table.");
      }
      return get(key) != null;
   }


   /*
   * hash function for keys returns value between o and m - 1
   */
   private int hash(Key key)
   {
      return (key.hashCode() & 0x7fffffff) % size;
   }
}
