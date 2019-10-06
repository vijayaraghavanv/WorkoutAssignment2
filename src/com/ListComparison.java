package com;

import java.util.*;

//Write a program to find the added, modified and deleted items in a list. For example, I have list of string which has A, B and C in it and input list contains A, D, C then A is modified, D is added and C is modified and B is deleted
public class ListComparison {

	private static List<String> originalValue = new ArrayList<>();
	private static List<String> newValue = new ArrayList<>();
	private static List<String> addedValue = new ArrayList<>();
	private static List<String> modifiedValue = new ArrayList<>();
	private static List<String> deletedValue = new ArrayList<>();
	private static Map<List<String>, String> map = new HashMap<>();
	private static Set<String> set = new HashSet<>(addedValue);

	private void originalValues() {
		originalValue.add("A");
		originalValue.add("B");
		originalValue.add("C");

	}

	private void newValues() {
		newValue.add("A");
		newValue.add("D");
		newValue.add("C");
	}

	private void comparator() {
		for (int i = 0; i < originalValue.size(); i++) {

			if (!newValue.contains(originalValue.get(i))) {
				deletedValue.add(originalValue.get(i));

			} else if (newValue.contains(originalValue.get(i))) {
				modifiedValue.add(originalValue.get(i));
			}
		}

		newValue.removeAll(modifiedValue);

		System.out.println("Modified Value" + modifiedValue);
		System.out.println("Deleted Value" + deletedValue);
		System.out.println("Added value " + newValue);

	}

	public static void main(String[] args) {

		ListComparison list = new ListComparison();
		list.originalValues();
		list.newValues();
		Collections.sort(originalValue);
		Collections.sort(newValue);
		list.comparator();

	}

}