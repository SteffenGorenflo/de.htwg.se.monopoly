package de.htwg.monopoly.cards;

import java.util.Collections;
import java.util.Deque;
import java.util.LinkedList;

public class ChanceCardsStack implements ICardStack {

	private Deque<ICards> Cards = new LinkedList<ICards>();

	public ChanceCardsStack() {
		Cards.push(new CommunityCard("Gehe in das Gef�ngnis" , "move"));
		//TODO elemente und Inhalte (Texte) siehe CommunityCardsStack
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
	public void shuffle() { 
		Collections.shuffle((LinkedList<ICards>) this.Cards);
	}
}
