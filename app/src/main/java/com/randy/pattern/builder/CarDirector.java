package com.randy.pattern.builder;

/**
 * @author chenming
 * @data 2018/11/12 15:29
 * @filename
 * @describle 指导者
 * 调用具体建造者来创建复杂对象的各个部分，在指导者中不涉及具体产品的信息，只负责保证对象各部分完整创建或按某种顺序创建。
 * @email chenming@evergande.com
 */

public class CarDirector {

    public Car2 constructCar(ICarBuilder builder) {
        builder.buildEngine();
        builder.buildSkeleton();
        builder.buildWheel();
        return builder.buildCar();
    }

}
