 /*
Satbir Dhaliwal
Mar 5, 2017
App: BST.java
Purpose: Implement methods of Binary search tree.
*/
import java.util.NoSuchElementException;
public class BST<Key extends Comparable<Key>, Value>
{
   private Node root;        // root of the BST

   private class Node
   {
      private Key   key;
      private Value val;   // associated data
      private Node  left;    // left subtree
      private Node  right;   // right subtree
      private int   size;    // number of nodes in subtree.

      //Constructor.
      public Node(Key key, Value val, int size)
      {
         this.key  = key;
         this.val  = val;
         this.size = size;
      }
   }


   /*
   * return true if tree is empty.
   */
   public boolean isEmpty()
   {
      return size() == 0;
   }

   /*
   * Return number of key value pairs in the tree.
   */
   public int size()
   {
      return size(root);
   }
   // return number of key-value paris in BST rooted at n.
   private int size(Node n)
   {
      if(n == null)
      {
         return 0;
      }
      return n.size;
   }
   /*
   * Check to see if this tree contains the given key
   *
   * @param  - key
   * @throws - IllegalArgumentException if key is null.
   * @return - true if tree contains the key, false otherwise.
   */
   public boolean contains(Key key)
   {
      if(key == null)
      {
         throw new IllegalArgumentException("key doesn't exist in tree.");
      }
      return get(key) != null;
   }
   private Value get(Key key)
   {
      return get(root, key);
   }
   private Value get(Node n, Key key)
   {
      if(key == null)
      {
         throw new IllegalArgumentException("Key doesnt exist is tree.");
      }
      if(n == null)
      {
         return null;
      }
      int cmp = key.compareTo(n.key);
      if(cmp < 0)
      {
         return get(n.left,key);
      }
      else if(cmp > 0)
      {
         return get(n.right,key);
      }
      return n.val;
   }
   /*
   * Insert the specified key-value pair into the tree.
   *
   * @param  - key and value
   * @throws - IllegalArgumentException if key is null.
   * @return - n/a
   */
   public void put(Key key, Value val)
   {
      if(key == null || val == null)
      {
         throw new IllegalArgumentException("Key and value is empty.");
      }
      root = put(root, key, val);
   }
   private Node put(Node n, Key key, Value val)
   {
      if(n == null)
      {
         return new Node(key, val, 1);
      }
      int cmp = key.compareTo(n.key);
      if(cmp < 0)
      {
         n.left = put(n.left, key, val);
      }
      else if(cmp > 0)
      {
         n.right = put(n.right, key, val);
      }
      else
      {
         n.val = val;
      }
      n.size = size(n.left) + size(n.right) + 1;
      return n;
   }

   /*
   * Find the key to delete in the tree.
   *
   * @param  - key
   * @throws - IllegalArgumentException if the key is null.
   *
   */
   public void delete(Key key)
   {
      if(key == null)
      {
         throw new IllegalArgumentException("Key is empty.");
      }
      root = delete(root, key);
   }
   private Node delete(Node n, Key key)
   {
      if(n == null)
      {
         return null;
      }
      int cmp = key.compareTo(n.key);
      if(cmp < 0 )
      {
         n.left = delete(n.left, key);
      }
      else if(cmp > 0)
      {
         n.right = delete(n.right, key);
      }
      else     //found the key to delete.
      {
         if(n.right == null)
         {
            return n.left;
         }
         if(n.left == null)
         {
            return n.right;
         }
         Node temp = n;                   // temp copy of address of watching node.
         n = min(temp.right);             // make n point ot he smallest key to the right of n
         n.right = deleteMin(temp.right); // get rid of the smalledt key to the right of n.
         n.left  = temp.left;             // attach left side back,
      }
      n.size = size(n.left) + size(n.right) + 1;
      return n;
   }
   private Node min(Node n)
   {
      if(n.left == null)
      {
         return n;
      }
      return min(n.left);
   }
   private Node deleteMin(Node n)
   {
      if(n.left == null)
      {
         return n.right;
      }
      n.left = deleteMin(n.left);
      n.size = 1 + size(n.left) + size(n.right);
      return n;
   }

   /*
   * Get the numbers of levels of the treee.
   *
   * @param  - none
   * @throws - n/a
    @return - n/a
   */
   public int levels()
   {
      return levels(root);
   }

   private int levels(Node n)
   {
      if( n == null)
      {
         return 0;
      }
      int leftLevels  = levels(n.left);
      int rightLevels = levels(n.right);
      if(leftLevels < rightLevels)
      {
         return rightLevels + 1;
      }
      return leftLevels + 1;
   }


   public void printLevel(int level)
   {
      System.out.println("Level: " + level);
      printLevel(root, level);
   }
   private void printLevel(Node n, int levels)
   {
      if (n != null)
      {
         if(levels == 0)
         {
            System.out.println("( " + n.key + ", " + n.val + " )" + " ");
         }
         printLevel(n.left, levels - 1);
         printLevel(n.right,levels - 1);
       }

   }

   public void printAllLevels()
   {
      int height = 0;
      int numOfLevels = levels();
      int lev = 0;
      while (height < numOfLevels)
      {
         System.out.println("Level: " + lev);
         printLevel(root, height);
         System.out.println(" ");
         height++;
         lev++;
      }
   }
}
