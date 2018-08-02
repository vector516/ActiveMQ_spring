package com.itheima.test;


import com.itheima.activeMQ.QueueReceiver1;
import com.itheima.activeMQ.QueueSender;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class QueueTest {
    @Autowired
    private QueueSender queueSender;



    @Test
    public void test01() {
        queueSender.send("test.queue", "hello world");

    }

}
