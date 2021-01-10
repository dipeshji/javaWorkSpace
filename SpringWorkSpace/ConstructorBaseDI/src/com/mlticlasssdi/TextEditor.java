package com.mlticlasssdi;

public class TextEditor {
	private SpellChecker spellChecker;

	TextEditor(SpellChecker spellC) {
		System.out.println("Inside textEditor constructor");
		this.spellChecker = spellC;
	}

	public void spellCheck() {
		this.spellChecker.checkSpelling();
	}
}
