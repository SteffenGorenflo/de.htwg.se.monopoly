package de.htwg.monopoly.cards;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CardsStackTest {
	
	CommunityCardsStack stack;

	@Before
	public void setUp() throws Exception {
		stack = new CommunityCardsStack();
		stack.pushOnTop(new CommunityCard("Gehe in das Gef�ngnis" , "move"));
	}

	@Test
	public void testGetNextCard() {
		assertEquals("Gehe in das Gef�ngnis", stack.getNextCard().getDescription());
	}
}
