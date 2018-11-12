package com.randy.pattern.builder;

/**
 * @author chenming
 * @data 2018/11/12 11:54
 * @filename
 * @describle 产品类
 * 要创建的复杂对象
 * @email chenming@evergande.com
 */

public class Car2 {
    private String wheel;
    private String skeleton;
    private String engine;

    public String getWheel() {
        return wheel;
    }

    public String getSkeleton() {
        return skeleton;
    }

    public String getEngine() {
        return engine;
    }

    public void setWheel(String wheel) {
        this.wheel = wheel;
    }

    public void setSkeleton(String skeleton) {
        this.skeleton = skeleton;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Car{" +
                "wheel='" + wheel + '\'' +
                ", skeleton='" + skeleton + '\'' +
                ", engine='" + engine + '\'' +
                '}';
    }
}
