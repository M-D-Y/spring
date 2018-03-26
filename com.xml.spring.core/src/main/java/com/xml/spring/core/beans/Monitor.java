package com.xml.spring.core.beans;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;

import com.xml.spring.core.loggers.EventLogger;

public class Monitor implements ApplicationListener {
	private EventLogger eventLogger;
	
	public Monitor(EventLogger eventLogger) {
		this.eventLogger = eventLogger;
	}

	public void onApplicationEvent(ApplicationEvent event) {
		//eventLogger.logEvent(event.getClass().getName());
	}

	public EventLogger getEventLogger() {
		return eventLogger;
	}

	public void setEventLogger(EventLogger eventLogger) {
		this.eventLogger = eventLogger;
	}

}
