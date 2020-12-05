package com.spring.playground.listener;

import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.stereotype.Component;

import com.spring.playground.customsink.CustomSink;

@Component
@EnableBinding(CustomSink.class)
public class Listener {
	
	@StreamListener(CustomSink.INPUT_NAME)
	public void getMessage(String message) {
		
		System.out.println("Input::"+message);
		
		
	}
	
	@StreamListener(CustomSink.CUSTOM_INPUT_NAME)
	public void getFailedMessage(String message) {
		
		System.out.println("Custom Input::"+message);
		
	}

}
