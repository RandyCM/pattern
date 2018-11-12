package com.randy.pattern.builder;

/**
 * @author chenming
 * @data 2018/11/12 11:54
 * @filename
 * @describle
 * @email chenming@evergande.com
 */

public class Car {
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

    public static class Builder {
        private String wheel;
        private String skeleton;
        private String engine;

        public Builder setWheel(String wheel) {
            this.wheel = wheel;
            return this;
        }

        public Builder setSkeleton(String skeleton) {
            this.skeleton = skeleton;
            return this;
        }

        public Builder setEngine(String engine) {
            this.engine = engine;
            return this;
        }

        public Car build() {
            return new Car(this);
        }
    }

    private Car(Builder builder) {
        this.engine = builder.engine;
        this.skeleton = builder.skeleton;
        this.wheel = builder.wheel;
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
