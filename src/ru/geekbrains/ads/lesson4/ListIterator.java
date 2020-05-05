package ru.geekbrains.ads.lesson4;

import java.util.Iterator;


import ru.geekbrains.ads.lesson4.LinkedList.Entry;

public class ListIterator<E> implements Iterator<E> {
  private Entry<E> current;
  public  ListIterator(Entry<E> firstElement) {
    current=firstElement;
  }

  @Override
  public boolean hasNext() {
    return current != null;
  }

  @Override
  public E next() {
    Entry tmpEntry = current;
    current = current.next;

    return (E) tmpEntry;
  }
}
