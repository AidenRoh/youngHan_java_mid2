package collection.list;

public interface MyList<T> {

    int size();

    void add(T element);

    void add(int index, T element);

    T get(int index);

    T set(int index, T element);

    T remove(int index);

    int indexOf(T element);
}
