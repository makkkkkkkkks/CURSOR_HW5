package main.java.com.makkkkkkkks.generic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MyList<T extends Comparable<? super T>> {

    private final List<T> list;

    public MyList() {
        this.list = new ArrayList<>();
    }

    public void add(T t) {
        list.add(t);
    }

    public T getMax() {
        return Collections.max(list);
    }

    public T getMin() {
        return Collections.min(list);
    }
}
