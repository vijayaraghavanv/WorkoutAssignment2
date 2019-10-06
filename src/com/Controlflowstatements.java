package com;

import java.util.*;


//Sample program to extensively use if, for, while and switch cases.
public class Controlflowstatements {

	public static void main(String[] args) {
		ArrayList<String> playingxi = new ArrayList<String>();
		playingxi.add("jadeja");
		playingxi.add("ashwin");
		playingxi.add("rohit");
		// use for and if statements
		if (playingxi.size() < 5) {
			for (int i = 0; i < playingxi.size(); i++) {
				System.out.println(playingxi.get(i));
				// use of switch statements
				switch (playingxi.get(i)) {
				case "jadeja":
					System.out.println("left arm spinner");
					break;
				case "ashwin":
					System.out.println("right arm spinner");
					break;
				case "rohit":
					System.out.println("opening right batsman");
					break;
				case "virat":
					System.out.println("captain of the team");
					break;
				default:
					System.out.println("bench palyers");
				}

				if (playingxi.get(i).equalsIgnoreCase("jadeja")) {
					int k = 0;
					while (k < 5) {
						System.out.println("jadeja" + k);
						k++;
					}
				} else if (playingxi.get(i).equalsIgnoreCase("ashwin")) {
					int l = 0;
					while (l < 3) {
						System.out.println("ashwin" + l);
						l++;
					}
				} else if (playingxi.get(i).equalsIgnoreCase("rohit")) {
					int m = 0;
					while (m < 4) {
						System.out.println("rohit" + m);
						m++;
					}
				}

			}
		}
	}
}
