package com.randy.pattern.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author chenming
 * @data 2018/11/9 16:17
 * @filename
 * @describle 被观察者抽象
 * @email chenming@evergande.com
 */

public abstract class Observable<T> {
    private List<Observer> observers = new ArrayList<>();

    public void registerObserver(Observer<T> observer) {
        if (!observers.contains(observer)) {
            observers.add(observer);
        }
    }

    public void unregisterObserver(Observer<T> observer) {
        observers.remove(observer);
    }

    public void notifyUpdate(T t) {
        for (Observer observer : observers) {
            observer.onUpdate(t);
        }
    }
}
