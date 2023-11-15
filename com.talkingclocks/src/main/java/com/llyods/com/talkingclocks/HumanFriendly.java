package com.llyods.com.talkingclocks;

public class HumanFriendly {

		static void printWords(int h, int m) 
		{ 
			String nums[] = { "Zero", "One", "Two", "Three", "Four", 
								"Five", "Six", "Seven", "Eight", "Nine", 
								"Ten", "Eleven", "Twelve", "Thirteen", 
								"Fourteen", "Fifteen", "Sixteen", "Seventeen", 
								"Eighteen", "Nineteen", "Twenty", "Twenty One", 
								"Twenty Two", "Twenty Three", "Twenty Four", 
								"Twenty Five", "Twenty Six", "Twenty Seven", 
								"Twenty Eight", "Twenty Nine", 
							}; 
		
			if (m == 0) 
				System.out.println(nums[h] + " o'clock "); 
		
			else if (m == 1) 
				System.out.println("One Minute Past " + 
												nums[h]); 
		
			else if (m == 59) 
				System.out.println("One Minute To " + 
								nums[(h % 12) + 1]); 
		
			else if (m == 15) 
				System.out.println("Quarter Past " + nums[h]); 
		
			else if (m == 30) 
				System.out.println("Half Past " + nums[h]); 
		
			else if (m == 45) 
				System.out.println("Quarter To " + 
									nums[(h % 12) + 1]); 
		
			else if (m <= 30) 
				System.out.println( nums[m] + " Minutes Past " + 
														nums[h]); 
		
			else if (m > 30) 
				System.out.println( nums[60 - m] + " Minutes To " +	 
													nums[(h % 12) + 1]); 
		} 
		
		public static void main(String []args) 
		{ 
			int h = 1; 
			int m = 0; 
			printWords(h, m); 
		} 
	} 
