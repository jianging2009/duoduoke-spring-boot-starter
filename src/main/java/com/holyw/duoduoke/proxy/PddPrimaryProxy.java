package com.holyw.duoduoke.proxy;

import com.holyw.duoduoke.client.IClient;
import com.holyw.duoduoke.support.DuoduokeSupportRepository;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;


public class PddPrimaryProxy implements InvocationHandler {


    IClient client;

    public PddPrimaryProxy(IClient client) {
        this.client = client;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        if (method.getName().equals("hashCode")) {
            return 0;
        }
        if (method.getName().equals("toString")) {
            return DuoduokeSupportRepository.class.getName();
        }
        try {
            return client.getDefaultClient().syncInvoke((PopBaseHttpRequest) args[0]);
        } catch (NullPointerException e) {
        }
        return null;
    }

    public <T> T getProxy(Class<T> clazz) {
        return (T) Proxy.newProxyInstance(this.getClass().getClassLoader(), new Class[]{clazz}, this);
    }
}
