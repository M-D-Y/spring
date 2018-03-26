package com.xml.spring.core;

import java.util.Random;

import com.xml.spring.core.beans.Event;
import com.xml.spring.core.beans.EventType;

public class EventTypeRandomizer {

	static Random random = new Random();	
	
	public static EventType getRandomType() {	
		EventType[] types = EventType.values();
		int rnd=random.nextInt(types.length+1);		
		if (rnd>=types.length) return null;
		else return types[rnd];
	}
}
