// Example 15.5: Interface for a restricted queue

public interface TrueQueue<E>{

   public boolean add(E element);

   public boolean isEmpty();
   
   public E peek();

   public E remove();    public int size();
}
