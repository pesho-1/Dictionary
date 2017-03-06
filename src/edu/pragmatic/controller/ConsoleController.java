package edu.pragmatic.controller;

import java.util.Scanner;

import edu.pragmatic.model.Dictionary;
import edu.pragmatic.model.Entry;

public class ConsoleController {

	private Scanner sc;
	private Dictionary dictionary;
	
	private enum UserChoice {
		ADD_WORD,
		SEARCH,
		EXIT,
		INVALID
	}
	
	public void start() {
		
		sc = new Scanner(System.in);
		dictionary = new Dictionary();
		
		boolean shouldContinue = true;
		do {
			UserChoice choice = displayMenu();
			switch(choice) {
			case ADD_WORD:
				addWord();
				break;
			case SEARCH:
				search();
				break;
			case INVALID:
				System.out.println("Invalid option. Try again.");
				break;
			case EXIT:
				shouldContinue = false;
				break;
			}
			
		} while(shouldContinue);
	}
	
	private UserChoice displayMenu() {
		System.out.println("--MENU--");
		System.out.println("1. Add");
		System.out.println("2. Search");
		System.out.println("3. Exit");
		System.out.print("Enter option: ");
		int choice = sc.nextInt();
		sc.nextLine();
		
		switch(choice) {
		case 1: return UserChoice.ADD_WORD;
		case 2: return UserChoice.SEARCH;
		case 3: return UserChoice.EXIT;
		default: return UserChoice.INVALID;
		}
	}
	
	private void addWord() {
		System.out.println("Enter word: ");
		String word = sc.nextLine();
		System.out.println("Enter translation: ");
		String translation = sc.nextLine();
		
		Entry e = new Entry(word, translation);
		dictionary.addEntry(e);
		System.out.println("Done");
	}
	
	private void search() {
		System.out.println("Enter word to search: ");
		String word = sc.nextLine();
		
		Entry e = dictionary.search(word);
		if(e == null) {
			System.out.println("No such word exist");
		} else {
			System.out.println("Translation is: " + e.getTranslation());
		}
	}
	
}
