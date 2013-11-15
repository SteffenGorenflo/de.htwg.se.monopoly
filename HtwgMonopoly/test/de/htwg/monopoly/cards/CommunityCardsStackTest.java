package de.htwg.monopoly.cards;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CommunityCardsStackTest {
	
	CommunityCardsStack stack;

	@Before
	public void setUp() throws Exception {
		stack = new CommunityCardsStack();
	}

	@Test
	public void testGetNextCard() {
		assertEquals(new CommunityCard("Gehe in das Gef�ngnis" , "move"), stack.getNextCard());
	}

}
