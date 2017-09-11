/*
Satbir Dhaliwal
Mar 9, 2017
App: MyClass
Purpose: USer defined class to implement string an int type data
*/

public class MyClass
{
   private String name;
   private int    age;
   private String SSN;

   public MyClass(String name, int age, String SSN)
   {
      this.name = name;
      this.age  = age;
      this.SSN  = SSN;
   }

   @Override
   public String toString()
   {
      return "name: " + name + " age: " + age + " SSN: " + SSN;
   }

   @Override
   public boolean equals(Object obj)
   {
      if (obj == null)
      {
         return false;
      }
      MyClass mc = (MyClass) obj;
      if(mc.name.equals(this.name))
      {
         return true;
      }
      else if(mc.age == this.age)
      {
         return true;
      }
      else if (mc.SSN.equals(this.SSN))
      {
         return true;
      }
      return false;
   }
}
