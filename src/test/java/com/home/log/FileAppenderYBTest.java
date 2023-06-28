package com.home.log;

public class FileAppenderYBTest {
	
	public FileAppenderYBTest() {
	}

	public static void main (String[] args) {
		FileAppenderV1YB.write("FileAppenderV1YB - Message YB");
		FileAppenderV2YB.write("FileAppenderV2YB - Message YB");
	}
}