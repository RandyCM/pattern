package com.randy.pattern.proxy;

/**
 * @author chenming
 * @data 2018/11/12 11:09
 * @filename
 * @describle
 * @email chenming@evergande.com
 */

public class ImageProxy implements Image {
    private String fileName;
    private RealImage mRealImage;

    public ImageProxy(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void display() {
        if (mRealImage==null){
            mRealImage = new RealImage(fileName);
        }
        mRealImage.display();
    }
}
