package com.Logback.example;

import com.Logback.example.Logs.Log;

public class  Main {
	
	public static void main(String[] args) {

		Log.warn("Warn Message");
		Log.error("Err Message");
		Log.debug("Debug Message");
		Log.info("Info Message");
		Log.trace("Trace Messahe");
	}
}
