package com.mlticlasssdi;

public class SpellChecker {
	private String spell;

	SpellChecker(String spell) {
		System.out.println("inside spell checker constructor");
		this.spell = spell;
	}

	public void checkSpelling() {
		System.out.println("checking spelling of " + this.spell);
	}

	public void setSpell(String spell) {
		this.spell = spell;
	}

}
