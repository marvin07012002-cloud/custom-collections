package com.pluralsight.collection;

import java.util.ArrayList;

public class FixedList<E> {
    private ArrayList<E> items = new ArrayList<>();
    private int maxSize;


    public FixedList(int maxSize) {
        this.maxSize = maxSize;
    }

    public void add(E item) {
        if (items.size() < maxSize) {
            items.add(item);
        } else {
            throw new IndexOutOfBoundsException("You can't add more than " + this.maxSize + " items, mate");
        }
    }

    public E get(int index) {
        if (index > (maxSize - 1)){
            int maxIndex = maxSize - 1;
            throw new IndexOutOfBoundsException("This collection can't contain more than " + this.maxSize+ " items");
        }

            return items.get(index);
    }


}
