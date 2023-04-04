package com.bridgelab;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter mood to analyze");
		String message=sc.nextLine();
		MoodAnalyser mood=new MoodAnalyser();
		System.out.println(mood.analyseMood(message));
	
	}

}
