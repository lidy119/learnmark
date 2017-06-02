package com.mode.proxy;

import java.lang.reflect.Proxy;

public class MainTest {

    public static void main(String[] args) {
        RealWork rw = new RealWork();
        ProxyWork pw = new ProxyWork();
        pw.setRealWork(rw);
        Work work = (Work) Proxy.newProxyInstance(rw.getClass().getClassLoader(), rw.getClass().getInterfaces(), pw);
        work.doWork();
    }

}
