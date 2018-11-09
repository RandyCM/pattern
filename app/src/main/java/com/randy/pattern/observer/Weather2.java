package com.randy.pattern.observer;

import java.util.Observable;

/**
 * @author chenming
 * @data 2018/11/9 16:23
 * @filename
 * @describle 被观察者 发生改变通知观察者
 * @email chenming@evergande.com
 */

public class Weather2 extends Observable {
    private String tmp;
    private String pm25;
    private String des;

    public Weather2(String tmp, String pm25, String des) {
        this.tmp = tmp;
        this.pm25 = pm25;
        this.des = des;
    }

    public String getTmp() {
        return tmp;
    }

    public void setTmp(String tmp) {
        this.tmp = tmp;
        setChanged();
        notifyObservers(this);
    }

    public String getPm25() {
        return pm25;
    }

    public void setPm25(String pm25) {
        this.pm25 = pm25;
        setChanged();
        notifyObservers(this);
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
        setChanged();
        notifyObservers(this);
    }

    @Override
    public String toString() {
        return "Weather{" +
                "tmp='" + tmp + '\'' +
                ", pm25='" + pm25 + '\'' +
                ", des='" + des + '\'' +
                '}';
    }
}
