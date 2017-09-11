public class MyClass implements Comparable<MyClass>
{
   int key;
   int val;

   private MyClass(){}

   public MyClass(int key)
   {
      this.key = key;
      val = (int) (Math.random() * 500);
   }

   @Override
   public int compareTo(MyClass that)
   {
      if(this.key > that.key)
      {
         return 1;
      }
      else if (this.key < that.key)
      {
         return -1;
      }
      return 0;
   }

   public int getKey()
   {
      return key;
   }
   public int getVal()
   {
      return val;
   }

}
