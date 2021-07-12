package com.sample.java8features;

import java.util.HashMap;
import java.util.Map;
import java.util.function.IntFunction;

public class LambdaPrimitivedatauses {

	public static void main(String[] args) {
		//<String> is a Return type and (days) input to method apply() which present in IntFunction
		IntFunction<String> daysofweek = (days) -> {
			Map<Integer, String> dayMap = new HashMap<Integer, String>();
			dayMap.put(1, "Sunday");
			dayMap.put(2, "Monday");
			dayMap.put(3, "Tuesday");
			dayMap.put(4, "Wednesday");
			dayMap.put(5, "Thursday");
			dayMap.put(6, "Friday");
			dayMap.put(7, "Saturday");
			
			if(dayMap.get(days) != null){
				return dayMap.get(days);
			}else{
				return "Days not available for inputed Number";
			}

			

		};
		int input = 1;

		System.out.println("days corresponds to 1 :" + daysofweek.apply(input));

		input = 2;
		System.out.println("days corresponds to 2 :" + daysofweek.apply(input));

		input = 9;
		System.out.println("days corresponds to 9 :" + daysofweek.apply(input));
	}

}
