package com.randy.pattern.chain;

import android.util.Log;

/**
 * @author chenming
 * @data 2018/11/14 15:31
 * @filename
 * @describle
 * @email chenming@evergande.com
 */

public class FileLogger extends AbstractLogger {
    private static final String TAG = FileLogger.class.getName();

    public FileLogger(int level) {
        this.level = level;
    }

    @Override
    protected void write(String message) {
        Log.d(TAG, "FileLogger write:" + message);
    }
}
