package com.randy.pattern.singleton;

/**
 * @author chenming
 * @data 2018/11/9 15:34
 * @filename
 * @describle 双重检查锁单例模式
 * @email chenming@evergande.com
 */

public class Singleton1 {
    private Singleton1() {

    }

    private static volatile Singleton1 mInstance;

    public static Singleton1 getInstance() {
        if (mInstance == null) {
            synchronized (Singleton1.class) {
                if (mInstance == null) {
                    mInstance = new Singleton1();
                }
            }
        }
        return mInstance;
    }

    public void doSomething(){

    }
}
