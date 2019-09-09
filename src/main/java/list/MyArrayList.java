package list;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class MyArrayList<String> implements List<String> {

    private int size;
    private String[] array;

    public MyArrayList() {
        this.size = 0;
        this.array = (String[]) new Object[5];
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public void clear() {
        size = 0;
    }

    @Override
    public String get(int index) {
        if (index < 0 || index >= size)
            throw new IndexOutOfBoundsException();
        return array[index];
    }

    private boolean equals(Object target, Object element) {
        if (target == null)
            return element == null;
        else return target.equals(element);
    }

    @Override
    public int indexOf(Object o) {
        for (int i = 0; i < size; i++) {
            if (equals(o, array[i]))
                return i;
        }
        return -1;
    }

    @Override
    public boolean add(String element) {
        if (size >= array.length) {
            String[] bigger = (String[]) new Object[array.length * 2];
            System.arraycopy(array, 0, bigger, 0, array.length);
            array = bigger;
        }
        array[size] = element;
        size++;
        return true;
    }

    @Override
    public void add(int index, String element) {
        if (index < 0 || index >= size)
            throw new IndexOutOfBoundsException();
        add(element);
        for (int i = size - 1; i > index; i--) {
            array[i] = array[i - 1];
        }
        array[index] = element;
    }

    @Override
    public boolean addAll(Collection<? extends String> c) {
        boolean flag = true;
        for (String element : c) {
            flag &= add(element);
        }
        return flag;
    }

    @Override
    public boolean addAll(int index, Collection<? extends String> c) {
        boolean flag = true;
        String[] tmp = array;
        String[] bigger = (String[]) new Object[array.length + c.size()];
        System.arraycopy(array, 0, bigger, 0, index - 1);
        array = bigger;
        for (String element : c) {
            flag &= add(element);
        }
        System.arraycopy(array, index + c.size(), tmp, index, tmp.length);
        return flag;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public Iterator<String> iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return null;
    }

    @Override
    public boolean remove(Object o) {
        if (indexOf(o) == -1)
            return false;
        remove(indexOf(o));
        return true;
    }

    @Override
    public String remove(int index) {
        String deleteElement = get(index);
        for (int i = index; i < size - 1; i++) {
            array[i] = array[i + 1];
        }
        array[size - 1] = null;
        size--;
        return deleteElement;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        for (Object element : c) {
            while (indexOf(element) != -1)
                remove(element);
        }
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public String set(int index, String element) {
        return null;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public ListIterator<String> listIterator() {
        return null;
    }

    @Override
    public ListIterator<String> listIterator(int index) {
        return null;
    }

    @Override
    public List<String> subList(int fromIndex, int toIndex) {
        return null;
    }
}
