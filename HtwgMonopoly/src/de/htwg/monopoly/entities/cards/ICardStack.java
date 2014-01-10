package de.htwg.monopoly.entities.cards;


public interface ICardStack {
	
	/**
	 * Return the first Card off a cardstack and put it back under the
	 * stack. Not yet implemented: "Du kommst aus dem Gef�ngnis frei"-Karte 
	 * 
	 * @return Card
	 */
	ICards getNextCard();
	
	/**
	 * Push a new card on top of the Stack.
	 * @param newCard
	 */
	void pushOnTop(ICards newCard);

}
