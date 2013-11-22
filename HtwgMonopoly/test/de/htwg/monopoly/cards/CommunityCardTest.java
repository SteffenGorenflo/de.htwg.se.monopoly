package de.htwg.monopoly.cards;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CommunityCardTest {
	
	CommunityCard card;

	@Before
	public void setUp() throws Exception {
		card = new CommunityCard("Gehe in das Gef�ngnis", "move");
	}
	

	@Test
	public void testCommunityCard() {
		CommunityCard card2 = new CommunityCard("Gehe in das Gef�ngnis", "move");
		assertEquals("Gehe in das Gef�ngnis",card2.getDescription());
	}

}
