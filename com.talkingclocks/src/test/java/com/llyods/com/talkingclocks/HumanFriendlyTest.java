package com.llyods.com.talkingclocks;

import static org.junit.Assert.*;

import org.junit.Test;

public class HumanFriendlyTest {

	@Test
	public void TalkingClockprintwordstest() {
		
		StringClock clock = new StringClock();
		
		assertEquals("1", clock.checkclockisequals("1"));
	
	}

}
