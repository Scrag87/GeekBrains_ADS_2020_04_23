package ru.geekbrains.ads.lesson4;

public interface LinkedList<E> extends Iterable<E> {

    //O(1)
    void insertFirst(E value);

    //O(1)
    E removeFirst();

    //O(n)
    boolean remove(E value);

    //O(n)
    boolean contains(E value);

    default boolean isEmpty() {
        return size() == 0;
    }

    int size();

    void display();

    E getFirst();

    Entry<E> getFirstElement();


    class Entry<E> {
        public E value;
        public Entry<E> next;

        @Override
        public String toString() {
            return "Entry{" +
                "value=" + value +
                '}';
        }

        public Entry(E value) {
            this.value = value;
        }
    }
}
