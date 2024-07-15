import java.util.Collection;
import java.util.Comparator;

public class MyArrayList<T> implements MyCollection<T> {
    private boolean sortFlag = false;
    private final int init_size = 1;
    private int pointer = 0;
    private Object[] array = new Object[init_size];

    @Override
    public void add(T o) {
        sortFlag = false;
        if (pointer == array.length) {
            Object[] newArray = new Object[array.length * 2];
            System.arraycopy(array, 0, newArray, 0, array.length);
            array = newArray;
        }
        array[pointer++] = o;
    }

    @Override
    public T remove(int index) {
        if (pointer >= array.length) {
            return null;
        }
        Object[] newArray = new Object[array.length];
        System.arraycopy(array, 0, newArray, 0, index);
        System.arraycopy(array, index+1, newArray, index, array.length-index-1);
        array = newArray;
        pointer--;
        return (T) array[index];
    }

    @Override
    public T get(int index) {
        if (pointer >= array.length) {
            return null;
        }
        return (T) array[index];
    }

    @Override
    public void addAll(Collection<T> c) {
        sortFlag = false;
        for(T o : c) {
            add(o);
        }
    }

    public void sort(Comparator<T> comparator){
        if(sortFlag){
            return;
        }
        for (int out = pointer - 1; out >= 1; out--) {
            for (int in = 0; in < out; in++) {
                if (comparator.compare((T) array[in], (T) array[in + 1])>0) {
                    T temporaryVariable = (T) array[in];
                    array[in] = array[in+1];
                    array[in+1] = temporaryVariable;
                }
            }
        }
        sortFlag = true;
    }

    public int size(){
        return pointer;
    }
}
