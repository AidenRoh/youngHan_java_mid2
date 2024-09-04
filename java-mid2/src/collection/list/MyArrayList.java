package collection.list;

import java.util.Arrays;

public class MyArrayList<T> implements MyList<T> {
    //범위 초과일 때, 새로운 배열 생성 후 복사 붙이기 하는 과정 추가

    private static final int DEFAULT_CAPACITY = 5;

    private Object[] elementData;
    private int size = 0;

    public MyArrayList() {
        elementData = new Object[DEFAULT_CAPACITY];
    }

    public MyArrayList(int initialCapacity) {
        elementData = new Object[initialCapacity];
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void add(T element) {
        // additional code
        if (size == elementData.length) {
            grow();
        }
        elementData[size] = element;
        size++;
    }

    @Override
    public void add(int index, T element) {
        // additional code
        if (size == elementData.length) {
            grow();
        }

        //데이터 이동
        shiftRightFrom(index);
        elementData[index] = element;
        size++;
    }

    @Override
    public T remove(int index) {
        T oldValue = get(index);
        //데이터 이동
        shiftLeftFrom(index);

        size--;
        elementData[size] = null;
        return oldValue;
    }


    @Override
    @SuppressWarnings("unchecked")
    public T get(int index) {
        return (T) elementData[index];
    }

    @Override
    public T set(int index, T element) {
        T oldValue = get(index);
        elementData[index] = element;
        return oldValue;
    }

    @Override
    public int indexOf(T element) {
        for (int i = 0; i < size; i++) {
            if (element.equals(elementData[i])) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public String toString() {
        //[1,2,3,null,null] : size = 3
        //[1,2,3] : size = 3
        return Arrays.toString(Arrays.copyOf(elementData, size)) +
                " size= " + size + ", capacity= " + elementData.length;
    }


    // additional code
    private void grow() {
        int oldCapacity = elementData.length;
        int newCapacity = oldCapacity * 2;
        //배열을 새로 만들고, 기존 배열을 새로운 배열에 복사
        elementData = Arrays.copyOf(elementData, newCapacity);
/*
        Object[] newArr = new Object[newCapacity];

        for (int i = 0; i < elementData.length; i++) {
            newArr[i] = elementData[i];
        }
*/
    }

    private void shiftRightFrom(int index) {
        for (int i = size; i > index; i--) {
            elementData[i] = elementData[i - 1];
        }
    }

    private void shiftLeftFrom(int index) {
        for (int i = index; i < size - 1 ; i++) {
            elementData[i] = elementData[i + 1];
        }
    }
}