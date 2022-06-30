package com.sheinfeld.cli.commands;

public enum StatType {
	FORKS("Forks"), 
	CONTRIBUTORS("Contributors"), 
	LANGUAGES("Languages"), 
	STARS("Stars");
	
    public final String label;

    private StatType(String label) {
        this.label = label;
    }
}
