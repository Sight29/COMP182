/*
Satbir Dhaliwal
Mar, 13, 2017
App: Node
Purpose: Node class contains data member type and getter and setters for member types.
*/
public class Node<T>
{
   T       data;  //payload
   Node<T> prev;  //prev node
   Node<T> next;  //next node

   public Node()
   {
      data = null;
      prev = null;
      next = null;
   }

   public Node(T data, Node<T> prev, Node<T> next)
   {
      this.data = data;
      this.next = next;
      this.prev = prev;
   }

   //setter and getter for Data, Next and Prev.
   public T getData()
   {
      return data;
   }

   public void setData(T data)
   {
      this.data = data;
   }

   public Node<T> getNext()
   {
      return next;
   }

   public void setNext(Node<T> next)
   {
      this.next = next;
   }

   public Node<T> getPrev()
   {
      return prev;
   }

   public void setPrev(Node<T> prev)
   {
      this.prev = prev;
   }
}
