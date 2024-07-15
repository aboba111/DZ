import java.util.Collection;

public interface MyCollection<E> {
    public void add(E e);
    public E remove(int index);
    public E get(int index);
    public void addAll(Collection<E> c);
}
