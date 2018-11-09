package com.randy.pattern.observer;

import android.util.Log;

/**
 * @author chenming
 * @data 2018/11/9 16:30
 * @filename
 * @describle 观察者 传入被观察者
 * @email chenming@evergande.com
 */

public class Observer1 extends Observer<Weather> {

    public Observer1(Weather weather) {
        t = weather;
        t.registerObserver(this);
    }

    @Override
    public void onUpdate(Weather weather) {
        Log.d("Observer1", weather.toString());
    }
}
