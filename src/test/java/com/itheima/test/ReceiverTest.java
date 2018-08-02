package com.itheima.test;

import com.itheima.activeMQ.QueueReceiver1;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class ReceiverTest {


//    @Resource
//    private JmsTemplate jmsTemplate;
//    @Resource
//    private QueueReceiver1 qwe;

    @Test
    public void test01() {
        while (true) {


        }


    }

}
