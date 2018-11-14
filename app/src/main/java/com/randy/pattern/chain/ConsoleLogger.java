package com.randy.pattern.chain;

import android.util.Log;

/**
 * @author chenming
 * @data 2018/11/14 15:31
 * @filename
 * @describle
 * @email chenming@evergande.com
 */

public class ConsoleLogger extends AbstractLogger {
    private static final String TAG = ConsoleLogger.class.getName();

    public ConsoleLogger(int level) {
        this.level = level;
    }

    @Override
    protected void write(String message) {
        Log.d(TAG, "ConsoleLogger write:" + message);
    }
}
