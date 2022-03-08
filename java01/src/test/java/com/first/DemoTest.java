package com.first;

import org.junit.Assert;
import org.junit.Test;

/**
 * @create 2022-03-2022/3/5-17:01
 */
public class DemoTest {
    @Test
    public void  testSay(){
        Demo a =new Demo();
        String k=a.say("Aka");
        Assert.assertEquals("helloAka",k);
    }
}
