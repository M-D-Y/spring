package com.annotations.spring.core.loggers;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

import com.annotations.spring.core.beans.Event;

public class FileEventLogger implements EventLogger {

	File file;

	public void logEvent(String msg) {
		writeStringToFile(msg);
	}

	public void logEvent(Event event) {
		writeStringToFile(event.toString());
	}

	public void writeStringToFile(String msg) {
		try {
			FileUtils.writeStringToFile(file, msg + "\r\n", true);
			System.out.println("Message '" + msg + "' was writted to file:" + file);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public FileEventLogger(String fileName) {
		super();
		file = new File(fileName);
	}

	public void init() throws IOException {
		file.canWrite();
	}
}
