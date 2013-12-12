package de.htwg.monopoly.cards;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CommunityCardsStackTest {

	CommunityCardsStack stack;
	
	@Before
	public void setUp() throws Exception {
		stack = new CommunityCardsStack();
		stack.pushOnTop(new ChanceCard("Gehe in das Gef�ngnis", "move"));
	}

	@Test
	public void testCommunityCardsStack() {
		assertEquals("Gehe in das Gef�ngnis", stack.getNextCard().getDescription());
		assertEquals('g', stack.getType());
	}

}
