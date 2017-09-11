public class Driver
{
   public static void main(String[] args)
   {
      HashTable<String, Integer> ht = new HashTable<String, Integer>(20);

      System.out.println("The size of the table: " + ht.size());

      System.out.println("Is table empty? " + ht.isEmpty());

      //ht.delete("k");

      //ht.delete("l");

      ht.get("ID: 7289");

      ht.put("ID: 3456", 3);
      ht.put("ID: 9045", 5);

      System.out.println("The size of the table: " + ht.size());

      System.out.println("Is table empty? " + ht.isEmpty());

      System.out.println("Key 7298 exist in table. " + ht.contains("ID: 7289"));
   }
}
