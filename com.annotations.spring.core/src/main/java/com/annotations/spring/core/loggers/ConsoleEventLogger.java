package com.annotations.spring.core.loggers;


import com.annotations.spring.core.beans.Event;

public class ConsoleEventLogger implements EventLogger{
	public void logEvent(String msg) {
		System.out.println(msg);
	}

	public void logEvent(Event event) {
		System.out.println(event);
		
	}
}
