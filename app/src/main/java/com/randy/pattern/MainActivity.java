package com.randy.pattern;

import android.app.ActivityManager;
import android.app.NotificationManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.randy.pattern.builder.BuilderDemo;
import com.randy.pattern.observer.ObserverDemo;
import com.randy.pattern.proxy.ProxyDemo;
import com.randy.pattern.singleton.SingletonDemo;
import com.randy.pattern.strategy.StrategyDemo;

import java.lang.reflect.Proxy;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /**
         1.设计模式学习
         1）工厂模式
         2）代理模式     ok
         3）策略模式     ok
         4）构建者模式    ok
         5）责任链模式
         6）单例模式     ok
         7）观察者模式    ok
         */
        new SingletonDemo().testSingleton();
        new ObserverDemo().testObserver();
        new ProxyDemo().testProxyDemo();
        new BuilderDemo().testBuilder();
        new StrategyDemo().testStrategy();
    }
}
