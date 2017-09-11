public class Driver
{
   public static void main(String[] args)
   {

      System.out.println("Testing LinkeList.");
      //Declare the Linked List for ADT.
      LinkedList1<String> ll = new LinkedList1<String>();
      //Remove the item from list.
      System.out.println("Remove Light from list. " + ll.remove("Light"));
      //Print the List
      ll.print();
      //Check to see if the list is empty
      System.out.println("Is List Empty. " + ll.isEmpty());
      //Print the size of the list.
      System.out.println("The size of the List: " + ll.size());
      // Add three items in the list.
      ll.add("Flight");
      ll.add("Hip-Hop");
      ll.add("Avatar");
      //Print the list after adding item to the list.
      ll.print();

      System.out.println("Flight is in the list. " + ll.contains("Flight"));
      System.out.println("Light is in the list. " + ll.contains("Light"));
      //Remove Hip-Hop off the list.
      System.out.println("Remove Hip-Hop off item in list. " + ll.remove("Hip-Hop"));
      //Print the list after removing one item off list.
      ll.print();
      //Check to see if the List is empty.
      System.out.println("Is List Empty. " + ll.isEmpty());
      //Print the size of the list after item is added.
      System.out.println("The size of the List: " + ll.size());
      // Print the list
      ll.print();
      // Clear the full list.
      ll.clear();
      // Print the size of the list.
      System.out.println("The size of the List: " + ll.size());
      // Print the list.
      ll.print();

      //Declare the Linked List for ADT.
      ArrayList<String> al = new ArrayList<String>();
      System.out.println("Testing ArrayList.");
      //Remove the item from list.
      System.out.println("Remove Kid from Arraylist. " + al.remove("Kid"));

      al.print();

      // Check to see if the list empty.
      System.out.println("The list is empty. " + al.isEmpty());

      // Check the size of the list.
      System.out.println("The size of the list: " + al.size());

      // Add 3 items to the arralist.
      al.add("Punch");
      al.add("Kick");
      al.add("Spin");

      // Print the list after adding 3 items.
      al.print();

      // Remove the item from arraylist.
      System.out.println("Item Kick has been removed. " + al.remove("Kick"));

      al.print();

      // Check to see if the list empty.
      System.out.println("The list is empty. " + al.isEmpty());

      // Check to see if the item is in the list.
      System.out.println("Does list contain Kid: " + al.contains("Kid"));
      System.out.println("Does list contain Spin: " + al.contains("Spin"));

      // Check the size of the list.
      System.out.println("The size of the list: " + al.size());

      al.print();

      // Clear the list.
      al.clear();

      // Check the size of the list.
      System.out.println("The size of the list: " + al.size());

      al.print();
   }
}
