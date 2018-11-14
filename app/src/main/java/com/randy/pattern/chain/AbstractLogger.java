package com.randy.pattern.chain;

/**
 * @author chenming
 * @data 2018/11/14 15:29
 * @filename
 * @describle 定义一个抽象类，每一个都继承此类。提供一个设置下一个处理的方法。
 * @email chenming@evergande.com
 */

public abstract class AbstractLogger {
    public static int INFO = 1;
    public static int DEBUG = 2;
    public static int ERROR = 3;

    protected int level;

    //责任链中的下一个元素
    protected AbstractLogger nextLogger;

    public void setNextLogger(AbstractLogger nextLogger) {
        this.nextLogger = nextLogger;
    }

    public void logMessage(int level, String message) {
        if (this.level <= level) {
            write(message);
        }
        //处理完成后交给下一个链处理
        if (nextLogger != null) {
            nextLogger.logMessage(level, message);
        }
    }
    //子类处理message
    abstract protected void write(String message);
}
