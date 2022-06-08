package com.javainuse.service;

import com.javainuse.model.MessageEntity;
import com.javainuse.repository.MessageRepository;
import com.javainuse.wsdl.Example;
import com.javainuse.wsdl.My_0020SOAP_0020Forum;
import com.javainuse.wsdl.xsd.Message;
import com.javainuse.wsdl.xsd.Resultcode;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import java.util.concurrent.CompletableFuture;

@Service
public class MessageService {

    private final MessageRepository messageRepository;

    public MessageService(MessageRepository messageRepository) {
        this.messageRepository = messageRepository;
    }

    @Async("threadPoolWSDLServiceExecutor1")
    public CompletableFuture<Integer> asyncCallWSDLService1(String message) {
        try {
            Example e = new Example();
            My_0020SOAP_0020Forum my = e.getExemple1();
            Message msg = new Message();
            msg.setValue(message);
            Resultcode r = my.postMessage(msg);
            return CompletableFuture.completedFuture(r.getValue());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Async("threadPoolWSDLServiceExecutor2")
    public CompletableFuture<MessageEntity> asyncSaveMessage(MessageEntity message) {
        MessageEntity messageEntity = messageRepository.save(message);
        System.out.println("messageEntity = " + messageEntity);
        return CompletableFuture.completedFuture(messageEntity);
    }

}
