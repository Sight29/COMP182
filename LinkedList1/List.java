/*
Satbir Dhaliwal
Mar, 29 2017
App: List.java
Purpose: implement signature list.
*/
public interface List<T>
{
   public int size();
   public boolean isEmpty();
   public boolean contains(Object o);
   public void add(T input);
   public boolean remove(Object o);
   public void clear();
   public void print();
}
