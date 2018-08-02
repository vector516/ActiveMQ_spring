package com.itheima.activeMQ;

import org.springframework.stereotype.Component;

import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;

@Component
public class QueueReceiver1 implements MessageListener {


    public void onMessage(Message message) {
        try{
            System.out.println("1接收到消息"+((TextMessage)message).getText());
        }catch (Exception e){
            e.printStackTrace();
        }



    }
}
