package com.xml.spring.core.beans;

import java.text.DateFormat;
import java.util.Date;

import com.xml.spring.core.EventTypeRandomizer;
import com.xml.spring.core.beans.EventType;

public class Event {
	private static int counter;
	int id;
	String msg;
	private DateFormat df;
	private EventType type;
	Date date;

	public EventType getEventType() {
		return type;
	}

	public Event(Date date, DateFormat df) {
		super();
		this.date = date;
		this.df = df;
		this.id = incrementId();
		EventType[] types = EventType.values();		
		this.type = EventTypeRandomizer.getRandomType();
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public String toString() {
		return "Event id=" + id + ", date=" + date.toString() + ", message=" + msg;

	}

	public int incrementId() {
		return ++counter;
	}
}
