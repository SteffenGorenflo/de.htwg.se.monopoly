package de.htwg.monopoly.entities;

public class Card {
	private String description = "";
	
	public Card(String description) {
		setDescription(description);
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
