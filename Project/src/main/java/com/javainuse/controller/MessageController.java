package com.javainuse.controller;

import com.javainuse.model.MessageEntity;
import com.javainuse.service.MessageService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import reactor.core.publisher.Flux;

import javax.servlet.http.HttpServletRequest;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;


@Controller
@RequestMapping
public class MessageController {

	private final MessageService messageService;

	public MessageController(MessageService testService) {
		this.messageService = testService;
	}

	@GetMapping("/messages/welcome/{message}")
	public Flux<Integer> welcome(@PathVariable(name = "message") String message, HttpServletRequest request) throws ExecutionException, InterruptedException {
		CompletableFuture<MessageEntity> messageEntityCompletableFuture = null;
		CompletableFuture<Integer> integerCompletableFuture = messageService.asyncCallWSDLService1(message);
		Integer wsdlServiceResultCode = integerCompletableFuture.get();
		System.out.println("wsdlServiceResultCode = " + wsdlServiceResultCode);
		MessageEntity messageEntity = new MessageEntity();
		messageEntity.setMessage(message);
		int msgId = 0;
		if(wsdlServiceResultCode == 200) {
			messageEntityCompletableFuture = messageService.asyncSaveMessage(messageEntity);
			 msgId = messageEntityCompletableFuture.get().getId();
			System.out.println("msgId = " + msgId);
		}
		return Flux.just(msgId);
		 
	}
}
