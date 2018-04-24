package com.xml.spring.core;

import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ContextResource;

import com.xml.spring.core.beans.Client;
import com.xml.spring.core.beans.Event;
import com.xml.spring.core.beans.EventType;
import com.xml.spring.core.beans.Monitor;
import com.xml.spring.core.loggers.EventLogger;

public class App {
	
	private Client client;
	//private EventLogger eventLogger;
	private EventLogger eventLogger;
	private Map<EventType, EventLogger> loggers;
	private static Monitor monitor;

	public static void main(String[] args) {
		//ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-context.xml");
		ConfigurableApplicationContext ctx = new ClassPathXmlApplicationContext("spring-context.xml");
		App app = (App) ctx.getBean("app");
		
		
		// app.logEvent("Some event for 1");
		// app.logEvent("Some event for 2");
		Client client = (Client)ctx.getBean("client");
		System.out.println("Greeting = " + client.getGreeting()+ ", fullName = "+client.getFullName()+", id = "+client.getId());
		Event event;
		for (int i = 0; i < 15; i++) {
			event = (Event) ctx.getBean("event");
			app.logEvent(event);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		ctx.close();
	}

	private void logEvent(String msg) {
		String message = msg.replaceAll(client.getId(), client.getFullName());
		eventLogger.logEvent(message);
	}


	public App(Client client, EventLogger eventLogger) {
		super();
		this.client = client;
		this.eventLogger =  eventLogger;
	}


	private void logEvent(Event event) {
		eventLogger.logEvent(event);
	}

}
