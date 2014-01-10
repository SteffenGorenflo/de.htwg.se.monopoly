package de.htwg.monopoly.entities;


public abstract class Card implements ICards {

	private String description;
	private String actionType;
	private int money;
	private int move;
	private boolean receiveFromBank;
	private boolean payBank;

	/**
	 * Create a new Card with the text on it. The parameter "action" defines the
	 * action, which will be performed in the game after the card is drawn.
	 * 
	 * @param descr
	 * @param action
	 */
	public Card(String descr, String action) {
		this.description = descr;
		this.actionType = action;
	}

	/**
	 * Set the description of this Card
	 * 
	 * @param description
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String getDescription() {
		return this.description;
	}

	@Override
	public String getActionType() {
		return this.actionType;
	}
	
	@Override
	public String toString() {
		return getDescription();
	}

}
