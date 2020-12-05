package com.spring.playground.customsink;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;

public interface CustomSink {
	String INPUT_NAME = "input";
	String CUSTOM_INPUT_NAME = "custominput";
	
	 @Input(CustomSink.INPUT_NAME)
	SubscribableChannel input();
	 
	 @Input(CustomSink.CUSTOM_INPUT_NAME)
		SubscribableChannel custominput();

}
