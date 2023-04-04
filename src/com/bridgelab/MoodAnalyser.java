package com.bridgelab;

public class MoodAnalyser {
	static String message;
	static String analysedResult = " ";

	public MoodAnalyser() {

	}

	public MoodAnalyser(String message) {

		this.message = message;
	}

	public static String analyseMood() {
		boolean analyse = message.toUpperCase().contains("SAD");
		if (analyse == true) {
			analysedResult = "SAD";
		} else {
			analysedResult = "HAPPY";
		}
		return analysedResult;
	}

}
