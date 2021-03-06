package de.htwg.monopoly.entities.impl;

import java.util.Deque;
import java.util.LinkedList;

import de.htwg.monopoly.entities.ICards;

public class CommunityCardsStack extends CardsStack {

	private Deque<Integer> position;


	/**
	 * Constructor for testing
	 * 
	 * @param card
	 */
	public CommunityCardsStack(ICards card) {
		super();
		pushOnTop(card);
		position = new LinkedList<Integer>();
	}

	public CommunityCardsStack() {
		super();
		position = new LinkedList<Integer>();
		
		init(this.getClass());
	}
	
	public CommunityCardsStack(int position) {
		this();
		this.position.push(position);
	}

	@Override
	public char getType() {
		// g wie Gemeinschaftsfeld.
		return 'g';
	}

	@Override
	public String toString() {
		return "Gemeinschaftsfeld";
	}
	
	/**
	 * Using a deque, because we need all position of the singleton stack.p
	 * after we poll the last value we push it back to the top of the list. 
	 * Because the gui call a lot of time the same function.. !?
	 * 
	 */
	@Override
	public int getPosition() {
		int ret = this.position.pollLast();
		this.position.push(ret);
		return ret;
	}

	public void setPosition(Integer position) {
		this.position.push(position);
		
	}
	
	
}
