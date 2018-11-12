package com.randy.pattern.strategy;

/**
 * @author chenming
 * @data 2018/11/12 15:51
 * @filename
 * @describle
 * @email chenming@evergande.com
 */

public class Operation {
    private IOperationStrategy mOperation;

    public void setOperation(IOperationStrategy mOperation) {
        this.mOperation = mOperation;
    }

    public int operation(int num1, int num2) {
        return mOperation.operation(num1, num2);
    }
}
