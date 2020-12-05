package com.spring.playground.producer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Component;

@Component
@EnableBinding(Source.class)
public class Producer {
	
	private Source source;
	
	@Autowired
	public Producer(Source source) {
		this.source=source;
	}

	public void publishMessage(String message) {
		System.out.println("Message::"+message);
		source.output().send(MessageBuilder.withPayload(message).build());
	}
	
}
