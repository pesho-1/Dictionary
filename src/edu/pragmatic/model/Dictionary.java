package edu.pragmatic.model;

import java.util.*;

public class Dictionary {

	private Map<String, Entry> entries;
	
	public Dictionary() {
		entries = new HashMap<>();
	}
	
	/**
	 * Add entry to the dictionary
	 * @param e entry to add
	 */
	public void addEntry(Entry e) {
		entries.put(e.getWord(), e);
	}
	
	/**
	 * Search dictionary for a entry with the given word
	 * @param word to search for
	 * @return Reference to the Entry (if is found) or null otherwise
	 */
	public Entry search(String word) {
		return entries.get(word);		
	}
}
