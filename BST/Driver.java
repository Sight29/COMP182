/*
Satbir Dhaliwal
Mar 5, 2017
App: Driver.java
Purpose: Test the BST.
*/
public class Driver
{
   public static void main(String[] args)
   {

      // Intializing a BST using Interger for key and Integer for value.
      BST<Integer, Integer> bst = new BST<Integer, Integer>();

      // Check to see if the tree is empty.
      System.out.println("The Tree is empty. " + bst.isEmpty());

      // insert key with random values to the tree.
      bst.put(25,29);
      bst.put(101,35);
      bst.put(10,99);
      bst.put(45,61);
      bst.put(90,60);
      bst.put(110,45);
      bst.put(13,109);
      bst.put(11,120);
      bst.put(40,37);
      bst.put(60,78);
      bst.put(99,135);
      bst.put(105,73);
      bst.put(234,69);
      bst.put(17,90);
      bst.put(20,101);
      bst.put(67,59);
      bst.put(175,81);

      // Print level 5.
      bst.printLevel(5);
      // Check the size of the tree.
      System.out.println("The size of the tree: " + bst.size());

      // Count the levels.
      System.out.println("Total number of levels: " + bst.levels());

      // Check if the tree is empty.
      System.out.println("The Tree is empty. " + bst.isEmpty());

      // Check if the key is in the tree.
      System.out.println("Key 45 is present in the tree. " + bst.contains(45 ));

      // print all the levels
      bst.printAllLevels();

      //Delete the key 67
      bst.delete(67);

      System.out.println("Key 67 has been deleted.");

      // Check the size of the tree after deleting one key.
      System.out.println("The size of the tree: " + bst.size());

      // Count the levels again.
      System.out.println("Total number of levels: " + bst.levels());



      // Check if the key is in the tree.
      System.out.println("Key 67 is present in the tree. " + bst.contains(67));

      // print all the levels
      bst.printAllLevels();

      // Print level 5.
      bst.printLevel(5);



   }
}
