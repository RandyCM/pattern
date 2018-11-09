package com.randy.pattern.observer;

/**
 * @author chenming
 * @data 2018/11/9 16:15
 * @filename
 * @describle 观察者抽象
 * @email chenming@evergande.com
 */

public abstract class Observer<T> {
    protected T t;
    abstract void onUpdate(T t);
}
