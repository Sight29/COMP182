import java.util.Iterator;

public class Driver
{
   public static void main(String [] args)
   {
      Set<String> set = new Set<String>();

      set.add("James");
      set.add("Kobe");
      set.add("Cesar");

      System.out.println("The size of the set: " + set.size());

      for (Iterator<String> i = set.iterator(); i.hasNext();)
      {
         String tst = i.next();
         System.out.println("Key: " + tst);
      }

      System.out.println("Looking for the Kobe key. " + set.contains("Kobe"));

      System.out.println("Looking for the Lakers key. " + set.contains("Lakers"));

      set.remove("Cesar");

      set.remove("Lakers");

      System.out.println("The size of the set: " + set.size());

      set.clear();

      System.out.println("THe size of the set: " + set.size());

      Set<MyClass> mc = new Set<MyClass>();

      mc.add(new MyClass(65));
      mc.add(new MyClass(545));
      mc.add(new MyClass(5));
      mc.add(new MyClass(55));

      System.out.println("Size of the set: " + mc.size());

      for (Iterator<MyClass> i = mc.iterator(); i.hasNext();)
      {
         MyClass tst = i.next();
         int k = tst.getKey();
         int v = tst.getVal();
         System.out.println("Key: " + k + " Val: " + v);
      }

   }
}
