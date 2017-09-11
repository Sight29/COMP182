/*
Satbir Dhaliwal
Mar, 15, 2017
App: Driver
Purpose: test the double linked list moethods.
*/
import java.util.NoSuchElementException;
import java.util.ListIterator;
import java.util.Iterator;


public class Driver
{
   public static void main(String[] args)
   {
      DoubleLinkedList<String> dll = new DoubleLinkedList<>();
      // Print the list.
      dll.print();

      // Insert 5 Strings at start.
      dll.insertStart("Petty");
      dll.insertStart("Lucifer");
      dll.insertStart("Guap");
      dll.insertStart("Face");
      dll.insertStart("Little");

      //Print the list.
      System.out.println("-------------------------------------");
      dll.print();
      System.out.println("-------------------------------------");

      //Check to see if the list isEmpty.
      System.out.println("list is Empty? " + dll.isEmpty());

      //check the size of the list.
      System.out.println("Size of the list. " + dll.size());

      //Insert a new string at some postition.
      dll.insertAtPos("asus",2);

      //print the list.
      System.out.println("-------------------------------------");
      dll.print();
      System.out.println("-------------------------------------");

      //Insert a new string at some position.
      dll.insertAtPos("Mac",4);

      //print the list
      dll.print();
      System.out.println("-------------------------------------");


      //insert the item at the end.
      dll.insertEnd("Light");
      System.out.println("-------------------------------------");
      dll.print();
      System.out.println("-------------------------------------");

      //Check the size of the list.
      System.out.println("Size of the list: " + dll.size());

      //Remove a string at some postition.
      dll.remove(3);
      System.out.println("Item Face has been removed.");
      System.out.println("-------------------------------------");
      dll.print();
      System.out.println("-------------------------------------");
      dll.remove(5);
      System.out.println("Item Lucifer has been removed.");
      System.out.println("-------------------------------------");
      dll.print();
      System.out.println("-------------------------------------");
      dll.remove(4);
      System.out.println("Item Guap has been removed.");
      System.out.println("-------------------------------------");
      dll.print();
      System.out.println("-------------------------------------");

      //print the list after removing the items.
      System.out.println("-------------------------------------");
      dll.print();
      System.out.println("-------------------------------------");

      //Declare an iterator
      ListIterator<String> iterator = dll.iterator();

      //calling next() of iterator.
      System.out.println(iterator.next());
      System.out.println(iterator.next());
      System.out.println(iterator.next());
      System.out.println(iterator.next());
      dll.print();
      //calling prevoius() of iterator.
    /*System.out.println(iterator.previous());
      System.out.println(iterator.previous());
      System.out.println(iterator.previous());
      System.out.println(iterator.previous());*/




   }
}
