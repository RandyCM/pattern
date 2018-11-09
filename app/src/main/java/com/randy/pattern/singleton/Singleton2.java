package com.randy.pattern.singleton;

/**
 * @author chenming
 * @data 2018/11/9 15:38
 * @filename
 * @describle 静态内部类实现单例
 * @email chenming@evergande.com
 */

public class Singleton2 {
    private Singleton2(){}

    private static class SingletonHolder{
        private static final Singleton2 mInstance = new Singleton2();
    }

    public static final Singleton2 getInstance(){
        return SingletonHolder.mInstance;
    }

    public void doSomething(){

    }
}
