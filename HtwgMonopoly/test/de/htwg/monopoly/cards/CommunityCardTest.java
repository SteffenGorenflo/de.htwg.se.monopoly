package de.htwg.monopoly.cards;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import de.htwg.monopoly.entities.impl.CommunityCard;

public class CommunityCardTest {

	CommunityCard card;

	@Before
	public void setUp() throws Exception {
		card = new CommunityCard("Gehe in das Gef�ngnis", "move", null, 0, 0,
				false);
	}

	@Test
	public void testCommunityCard() {
		CommunityCard card2 = new CommunityCard("Gehe in das Gef�ngnis",
				"move", null, 0, 0, false);
		assertEquals("Gehe in das Gef�ngnis", card2.getDescription());
	}

}
