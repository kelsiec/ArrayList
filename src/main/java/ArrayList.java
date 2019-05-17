import java.util.Arrays;
import java.util.Iterator;

public class ArrayList<E> implements Iterable<E> {
    private int size = 0;
    private E[] elements = (E[]) new Object[10];

    public void add(E e) {
        if (size >= elements.length) {
            this.expandSize();
        }
        elements[size] = e;
        ++size;
    }

    public E get(int index) {
        if (index >= size)
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        return elements[index];
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < size - 1; i++) {
            sb.append(elements[i].toString());
            sb.append(", ");
        }

        sb.append(elements[size - 1].toString());
        sb.append("]");

        return sb.toString();
    }

    @Override
    public Iterator<E> iterator() {
        return new Iterator<>() {
            private int currentIndex = 0;

            @Override
            public boolean hasNext() {
                return currentIndex < size;
            }

            @Override
            public E next() {
                return elements[currentIndex++];
            }
        };
    }

    private void expandSize() {
        int increasedSize = elements.length * 2;
        elements = Arrays.copyOf(elements, increasedSize);
    }
}