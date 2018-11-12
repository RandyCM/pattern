package com.randy.pattern.proxy.dynamic;

import android.util.Log;
/**
 * @author chenming
 * @data 2018/11/12 11:08
 * @filename
 * @describle
 * @email chenming@evergande.com
 */

public class RealImage1 implements Image1 {
    private String fileName;

    public RealImage1(String fileName) {
        this.fileName = fileName;
        loadFromDisk(fileName);
    }

    @Override
    public void display() {
        Log.d("RealImage1", "RealImage1 Display!!!");
    }

    private void loadFromDisk(String fileName) {
        Log.d("RealImage1", "Loading " + fileName);
    }
}
