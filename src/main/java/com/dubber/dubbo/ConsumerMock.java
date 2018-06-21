package com.dubber.dubbo;

/**
 * Created on 2018/6/21.
 *
 * @author dubber
 */
public class ConsumerMock implements DemoService{
    @Override
    public String sayHello(String msg) {
        return "现在繁忙,稍后重试！";
    }

    @Override
    public String saySeeYou(String msg) {
        return "现在繁忙,稍后重试！";
    }
}
