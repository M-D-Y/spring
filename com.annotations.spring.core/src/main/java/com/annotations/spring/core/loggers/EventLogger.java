package com.annotations.spring.core.loggers;

import com.annotations.spring.core.beans.Event;

public interface EventLogger {
	public void logEvent(String msg);
	public void logEvent(Event event);
}
