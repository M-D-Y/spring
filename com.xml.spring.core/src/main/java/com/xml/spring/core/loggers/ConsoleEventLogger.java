package com.xml.spring.core.loggers;


import com.xml.spring.core.beans.Event;

public class ConsoleEventLogger implements EventLogger{
	public void logEvent(String msg) {
		System.out.println(msg);
	}

	public void logEvent(Event event) {
		System.out.println(event);
		
	}
}
