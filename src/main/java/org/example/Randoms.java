package org.example;

import java.util.Iterator;
import java.util.Random;

public class Randoms implements Iterable<Integer> {
    protected Random random;
    private final int min;
    private final int max;

    public int getMin() {
        return min;
    }

    public int getMax() {
        return max;
    }

    public Randoms(int min, int max) {
        random = new Random();
        this.min = min;
        this.max = max;
    }


    @Override
    public Iterator<Integer> iterator() {
        return new RandomsIterator(this);
    }

}