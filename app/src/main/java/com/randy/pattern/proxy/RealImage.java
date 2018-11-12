package com.randy.pattern.proxy;

import android.util.Log;

/**
 * @author chenming
 * @data 2018/11/12 11:08
 * @filename
 * @describle
 * @email chenming@evergande.com
 */

public class RealImage implements Image {
    private String fileName;

    public RealImage(String fileName) {
        this.fileName = fileName;
        loadFromDisk(fileName);
    }

    @Override
    public void display() {
        Log.d("RealImage", "RealImage Display!!!");
    }

    private void loadFromDisk(String fileName) {
        Log.d("RealImage", "Loading " + fileName);
    }
}
