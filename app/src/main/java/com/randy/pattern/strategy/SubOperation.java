package com.randy.pattern.strategy;

/**
 * @author chenming
 * @data 2018/11/12 15:51
 * @filename
 * @describle
 * @email chenming@evergande.com
 */

public class SubOperation implements IOperationStrategy {
    @Override
    public int operation(int num1, int num2) {
        return num1 - num2;
    }
}
