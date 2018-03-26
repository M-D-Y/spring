package com.xml.spring.core.loggers;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import com.xml.spring.core.beans.Event;

public class CacheFileEventLogger extends FileEventLogger {
	private int cacheSize;

	public void setCacheSize(int cacheSize) {
		this.cacheSize = cacheSize;
	}

	private List<Event> cache;

	public CacheFileEventLogger(String fileName) {
		super(fileName);
		cache = new ArrayList<Event>();
	}

	public void logEvent(Event event) {
		cache.add(event);
		if (cache.size() >= cacheSize) {
			writeEventsToFile();
			cache.clear();
		}
	}

	private void writeEventsToFile() {

		Iterator<Event> iterator = cache.iterator();
		while (iterator.hasNext()) {
			Event event = (Event) iterator.next();
			super.logEvent(event);
		}
		/*
		 * for (Event event : cache) super.logEvent(event);
		 */		
	}

	public void destroy() {
		Event event = new Event(new Date(), DateFormat.getDateTimeInstance());
		event.setMsg("Application destroy!");
		cache.add(event);
		if (!cache.isEmpty())
			writeEventsToFile();
	}
}
