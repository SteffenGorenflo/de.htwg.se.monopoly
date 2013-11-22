package de.htwg.monopoly.cards;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ChanceCardsStackTest {

	ChanceCardsStack stack;
	
	@Before
	public void setUp() throws Exception {
		stack = new ChanceCardsStack();
		stack.pushOnTop(new ChanceCard("Gehe in das Gef�ngnis", "move"));
	}

	@Test
	public void testChanceCardsStack() {
		assertEquals("Gehe in das Gef�ngnis", stack.getNextCard().getDescription());
	}

}
