package com.randy.pattern.observer;

import android.util.Log;

import java.util.Observable;
import java.util.Observer;

/**
 * @author chenming
 * @data 2018/11/9 17:10
 * @filename
 * @describle
 * @email chenming@evergande.com
 */

public class Observer2 implements Observer {
    @Override
    public void update(Observable observable, Object o) {
        Weather2 weather2 = (Weather2)o;
        Log.d("Observer2", weather2.toString());
    }
}
