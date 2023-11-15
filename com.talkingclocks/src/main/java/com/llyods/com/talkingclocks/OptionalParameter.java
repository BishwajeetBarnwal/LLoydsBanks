package com.llyods.com.talkingclocks;

	import org.springframework.web.bind.annotation.GetMapping;
	import org.springframework.web.bind.annotation.PathVariable;
	import org.springframework.web.bind.annotation.RestController;

	@RestController
	public class OptionalParameter {
		
		@GetMapping(path = "/Talking-Clock/path-variable/{id}")
		public TalkingClock talkingClockPathVariable(@PathVariable String id) {
			return new TalkingClock(String.format(id , "O' Clock"));
		}
}
