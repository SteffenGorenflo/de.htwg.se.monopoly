package de.htwg.monopoly.cards;

import java.util.Collections;
import java.util.Deque;
import java.util.LinkedList;

public abstract class CardsStack implements ICardStack {

	private Deque<ICards> cards = new LinkedList<ICards>();

	public CardsStack() {
		// Idee: For-Schleife �ber ein bestimmtes FILE und dann pushOnTop() entweder hier oder im Controller
				//TODO elemente und Inhalte (Texte)
				//TODO generelle Frage: Werden die Karteninhalte am Anfang eingelesen, oder hardcodiert von vornerein drin?
				// denn dann muss evtl die Fehlerbehandlung erweitert werden.
	}

	@Override
	public ICards getNextCard() {
		ICards tmp = cards.pollFirst();
		cards.offerLast(tmp);
		return tmp;
	}

	@Override
	public void pushOnTop(ICards newCard)
	{
		cards.push(newCard);
	}
	

	@Override
	public void shuffle() { 
		Collections.shuffle((LinkedList<ICards>) this.cards);
	}
}
