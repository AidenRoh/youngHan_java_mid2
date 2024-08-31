package collection.array;

import java.util.Arrays;

public class MyArrayListV4<T> {
    //범위 초과일 때, 새로운 배열 생성 후 복사 붙이기 하는 과정 추가

    private static final int DEFAULT_CAPACITY = 5;

    private Object[] elementData;
    private int size = 0;

    public MyArrayListV4() {
        elementData = new Object[DEFAULT_CAPACITY];
    }

    public MyArrayListV4(int initialCapacity) {
        elementData = new Object[initialCapacity];
    }

    public int size() {
        return size;
    }

    public void add(T element) {
        // additional code
        if (size == elementData.length) {
            grow();
        }
        elementData[size] = element;
        size++;
    }

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

    public T remove(int index) {
        T oldValue = get(index);
        //데이터 이동
        shiftLeftFrom(index);

        size--;
        elementData[size] = null;
        return oldValue;
    }


    @SuppressWarnings("unchecked")
    public T get(int index) {
        return (T) elementData[index];
    }

    public T set(int index, T element) {
        T oldValue = get(index);
        elementData[index] = element;
        return oldValue;
    }

    public int indexOf(T element) {
        for (int i = 0; i < size; i++) {
            if (element.equals(elementData[i])) {
                return i;
            }
        }
        return -1;
    }

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