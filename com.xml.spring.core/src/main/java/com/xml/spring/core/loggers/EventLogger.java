package com.xml.spring.core.loggers;

import com.xml.spring.core.beans.Event;

public interface EventLogger {
	public void logEvent(String msg);
	public void logEvent(Event event);
}
