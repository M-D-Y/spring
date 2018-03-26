package com.xml.spring.core.loggers;

import java.util.Collection;
import java.util.Map;

import com.xml.spring.core.beans.Event;
import com.xml.spring.core.beans.EventType;

public class CombinedEventLogger implements EventLogger {
	Map<EventType, EventLogger> loggers;
	private static EventLogger defaultEventLogger;


	public static void setDefaultEventLogger(EventLogger defaultEventLogger) {
		CombinedEventLogger.defaultEventLogger = defaultEventLogger;
	}

	public void logEvent(Event event) {
		EventLogger logger = loggers.get(event.getEventType());		
		if (logger == null) logger = defaultEventLogger;
		System.out.println(logger.getClass().getName());
		logger.logEvent(event.getMsg());
	}

	public CombinedEventLogger(Map<EventType, EventLogger> loggers) {
		super();
		this.loggers = loggers;
	}


	public void logEvent(String msg) {
		System.out.println("Class: "+getClass().getName());
		logEvent(msg);
		
	}
}
