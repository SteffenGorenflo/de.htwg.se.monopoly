package de.htwg.monopoly.cards;

import java.util.Collections;
import java.util.Deque;
import java.util.LinkedList;

public class ChanceCardsStack implements ICardStack {

	private Deque<ICards> Cards = new LinkedList<ICards>();

	public ChanceCardsStack() {
		Cards.push(new CommunityCard("Gehe in das Gef�ngnis" , "move"));
		// Cards.push(new Card()); //TODO elemente und Inhalte (Texte)
		// hinzuf�gen
	}

	@Override
	public ICards getNextCard() {
		ICards tmp = Cards.pollFirst();
		Cards.offerLast(tmp);
		return tmp;
	}

	@Override
	public void pushOnTop(ICards newCard)
	{
		Cards.push(newCard);
	}
	

	@Override
	public void shuffle() { //TODO Randomseed �bergeben und �berhaupt mal blicken was der seed macht...
		Collections.shuffle((LinkedList<ICards>) this.Cards);
	}
}
