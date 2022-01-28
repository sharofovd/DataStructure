package rumail.Datastructure;

import java.util.Iterator;

public interface SimpleList<E> extends Iterable<E>{
    void add(E e);
    int get(int index);
    int size();

    @Override
    Iterator<E> iterator();
}
