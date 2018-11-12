package com.randy.pattern.builder;

/**
 * @author chenming
 * @data 2018/11/12 15:24
 * @filename
 * @describle 抽象建造者
 * 给出一个抽象结论，以规范产品对象的各个组成成分的建造。这个接口规定要实现复杂对象的那些部分的创建，并不涉及具体的对象部件的创建
 * @email chenming@evergande.com
 */

public interface ICarBuilder {
    void buildWheel();

    void buildSkeleton();

    void buildEngine();

    Car2 buildCar();
}
