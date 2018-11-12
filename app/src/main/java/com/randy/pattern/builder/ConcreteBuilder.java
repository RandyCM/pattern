package com.randy.pattern.builder;

/**
 * @author chenming
 * @data 2018/11/12 15:25
 * @filename
 * @describle 具体建造者
 * 实现Builder接口，针对不同的商业逻辑，具体化复杂对象的各部分的创建。在构造过程完成后，提供产品的实例。
 * @email chenming@evergande.com
 */

public class ConcreteBuilder implements ICarBuilder {
    private Car2 mCar;

    public ConcreteBuilder(){
        mCar = new Car2();
    }

    @Override
    public void buildWheel() {
        mCar.setWheel("轮子");
    }

    @Override
    public void buildSkeleton() {
        mCar.setSkeleton("车身结构");
    }

    @Override
    public void buildEngine() {
        mCar.setEngine("发动机");
    }

    @Override
    public Car2 buildCar() {
        return mCar;
    }
}
