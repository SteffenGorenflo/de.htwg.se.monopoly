package de.htwg.monopoly.controller;

import de.htwg.monopoly.entities.Player;
import de.htwg.monopoly.util.IMonopolyUtil;

/**
 * 
 * @author RuprechtT
 *
 */
public class PlayerController {
	
	private Player[] players;
	private int numberOfPlayer;
	private int currentPlayer;
	
	/**
	 * Constructor
	 * @param numberOfPlayer
	 */
	public PlayerController (int numberOfPlayer) {
		this.players = new Player[numberOfPlayer];
		this.numberOfPlayer = numberOfPlayer;
		/* set current player to the last index, that function getNextPlayer
		 * return the first player by initial call */
		this.currentPlayer = numberOfPlayer;
		init();
	}
	
	private void init() {
		/* Wird das ben�tigt? */
		for (int i = 0; i < numberOfPlayer; i++) {
			players[i] = new Player();
		}
	}
	/**
	 * 
	 * @return player
	 */
	public Player getNextPlayer() {
		currentPlayer++;
		if (currentPlayer >= numberOfPlayer) {
			currentPlayer = IMonopolyUtil.FIRST_PLAYER;
		}
		return players[currentPlayer];
	}
	
	
	

	
	
}
