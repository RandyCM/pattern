package com.randy.pattern.proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author chenming
 * @data 2018/11/12 19:09
 * @filename
 * @describle 动态代理
 * @email chenming@evergande.com
 */

public class ProxyHandler implements InvocationHandler {
    Object obj = null;

    public Object newProxyInstance(Object realObj) {
        this.obj = realObj;
        Class<?> classType = this.obj.getClass();
        /**
         *
         loader:　　一个ClassLoader对象，定义了由哪个ClassLoader对象来对生成的代理对象进行加载
         interfaces:　　一个Interface对象的数组，表示的是我将要给我需要代理的对象提供一组什么接口，如果我提供了一组接口给它，那么这个代理对象就宣称实现了该接口(多态)，这样我就能调用这组接口中的方法了
         h:　　一个InvocationHandler对象，表示的是当我这个动态代理对象在调用方法的时候，会关联到哪一个InvocationHandler对象上
         */
        return Proxy.newProxyInstance(classType.getClassLoader(), classType.getInterfaces(), this);
    }

    /**
     * proxy:　　指代我们所代理的那个真实对象
     * method:　　指代的是我们所要调用真实对象的某个方法的Method对象
     * args:　　指代的是调用真实对象某个方法时接受的参数
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //反射掉对应方法
        /**
         * obj 要代理的对象
         * args 方法参数
         * return 方法返回值
         */
        return method.invoke(obj, args);
    }
}
