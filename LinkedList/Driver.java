/*
Satbir Dhaliwal
Mar 9,20`7
App: Driver
Purpose: Test the user defined class and also Linked List methods.
*/
public class Driver
{
   public static void main(String[] args)
   {
      /*LinkedList<MyClass> mc = new LinkedList<MyClass>();

      mc.print();

      mc.newHead(new MyClass("Kobe",39,"12-23-1981"));

      mc.print();





      System.out.println("Size: " + mc.size());

      System.out.println(mc.search("Kobe"));*/



      LinkedList<String> mc = new LinkedList<String>();
      mc.newHead("Kobe");
      mc.newHead("Hello");

      System.out.println(mc.search("Kobe"));
    }


}
