package org.example;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class RandomsIterator implements Iterator<Integer> {
    private final Randoms rnd;

    public RandomsIterator(Randoms randoms) {
        this.rnd = randoms;
    }

    @Override
    public boolean hasNext() {
        return true;
    }

    @Override
    public Integer next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        return rnd.random.nextInt(rnd.getMin(), rnd.getMax() + 1);
    }

}
