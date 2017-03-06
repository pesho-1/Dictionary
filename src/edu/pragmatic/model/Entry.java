package edu.pragmatic.model;

/**
 * Keeps information for entry in the dictionary
 * @author Plamen Terziev
 *
 */
public class Entry {

	private String word;
	private String translation;
	
	public Entry(String word, String translation) {
		
		this.translation = translation;
	}
	
	public String getWord() {
		return word;
	}
	
	public String getTranslation() {
		return translation;
	}

	public String toString() {
		return "Gosho is the best";
	}
}
