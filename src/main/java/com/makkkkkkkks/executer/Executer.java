package main.java.com.makkkkkkkks.executer;

import main.java.com.makkkkkkkks.generic.MyList;

public class Executer<T extends Comparable<? super T>> {
    private MyList<T> myList;
    private T[] t;

    public Executer(T... t) {
        myList = new MyList<>();
        this.t = t;
        for (int i = 0; i < t.length; i++) {
            this.myList.add(t[i]);
        }
    }

    public void getInfo() {
        System.out.println("Max long element " + myList.getMax());
        System.out.println("Min long element " + myList.getMin());
    }
}
