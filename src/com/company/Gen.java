package com.company;

/**
 * Created by Student on 01.04.2018.
 */
public class Gen<T> {
    T ob;

    public Gen(T o) {
        this.ob = o;
    }
    T getOb(){
        return ob;
    }
    void showType(){
        System.out.println("Type of T is " + ob.getClass().getName());
    }
}
