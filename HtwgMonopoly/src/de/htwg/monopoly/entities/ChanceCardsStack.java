package de.htwg.monopoly.entities;

import java.util.Deque;
import java.util.LinkedList;

public class ChanceCardsStack implements ICardStack {

	private Deque<ICards> Cards = new LinkedList<ICards>();

	public ChanceCardsStack() {
		// Cards.push(new Card()); //TODO elemente und Inhalte (Texte)
		// hinzuf�gen
	}

	@Override
	public ICards getNextCard() {
		ICards tmp = Cards.pollFirst();
		Cards.offerLast(tmp);
		return tmp;
	}
}
