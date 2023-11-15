package com.llyods.com.talkingclocks;

public class TalkingClock {


	private String message;

	public TalkingClock (String message) {
		this.message = message;
		
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "TalkingClock [message=" + message + "]";
	}
}
