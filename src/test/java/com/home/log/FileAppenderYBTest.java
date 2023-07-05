package com.home.log;

public class FileAppenderYBTest {
	
	public FileAppenderYBTest() {
	}

	public static void main (String[] args) {
		FileAppenderYBV1.write("FileAppenderV1YB - Message YB");
		FileAppenderYBV2.write("FileAppenderV2YB - Message YB");
	}
}