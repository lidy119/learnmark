package com.mode.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class ProxyWork implements InvocationHandler {

    private RealWork realWork;

    @Override
    public Object invoke(Object proxy, Method method, Object[] args)
            throws Throwable {
        Object result = null;
        beforeSing();
        result = method.invoke(realWork, args);
        afterSing();
        return result;
    }

    private void beforeSing() {
        System.out.println("入座、关机...");
    }

    private void afterSing() {
        System.out.println("鼓掌、离座...");
    }

    /**
     * 获取realWork
     * 
     * @return the realWork
     */
    public RealWork getRealWork() {
        return realWork;
    }

    /**
     * 设置realWork
     * 
     * @param realWork
     *            the realWork to set
     */
    public void setRealWork(RealWork realWork) {
        this.realWork = realWork;
    }

}
