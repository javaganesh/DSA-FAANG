package com.dsa.generic;

public class ImplGeneri<T> implements Igener<Integer> {
    private Integer valuel;
    @Override
    public void add(Integer val) {
        this.valuel=valuel;
    }

    @Override
    public Integer get() {
        return valuel;
    }
}
