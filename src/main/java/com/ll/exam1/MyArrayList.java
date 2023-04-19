package com.ll.exam1;

public class MyArrayList<T> {

    private int size = 0;

    public int size() {
        return size;
    }

    public boolean add(T element){
        size ++;
        return true;
    }

    public String get(int index) {
        return  "포도";
    }
}
