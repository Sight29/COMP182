public class Node<T>
{
    T       data;  //payload
    Node<T> next;  //next Node

   //constructor 1
   public Node(T data)
   {
      this.data = data;
      next = null;
   }

   //constructor 2
   public Node(T data, Node<T> next)
   {
      this.data = data;
      this.next = next;
   }

   //getter and setter methods for DATA and NEXT

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
}
