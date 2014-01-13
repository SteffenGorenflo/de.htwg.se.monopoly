package de.htwg.monopoly.entities.impl;

import de.htwg.monopoly.util.IMonopolyCards;

public class ChanceCardsStack extends CardsStack {

	public ChanceCardsStack() {
		super();

		for (String descr : IMonopolyCards.DESCR_CHANCE) {
			pushOnTop(new ChanceCard(descr, null, null, 0, 0, false));
		}
	}

	// @Override
	public char getType() {
		// e wie ereignisfeld.
		return 'e';
	}

	public String toString() {
		return "Ereignisfeld";
	}

}
