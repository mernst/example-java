package org.jacoco.examples.maven.java;

public class HelloWorld {
	
	public String getMessage(boolean bigger) {
		if (bigger) {
			return "Hello Universe!";
		} else {
			return "Hello World!";
		}
	}

	public String getOtherMessage(boolean bigger) {
		if (bigger) {
			return "Hola Universio!";
		} else {
			return "Hola Mundo!";
		}
	}

}
