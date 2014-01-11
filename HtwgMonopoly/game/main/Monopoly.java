package main;

import java.util.Scanner;

import de.htwg.monopoly.controller.IController;
import de.htwg.monopoly.controller.impl.Controller;
import de.htwg.monopoly.view.GraphicUI;
import de.htwg.monopoly.view.TextUI;

public class Monopoly {

	private static Scanner scanner;

	public static void main(String[] args) {
		IController controller = new Controller();
		TextUI tui = new TextUI(controller);
;
		scanner = new Scanner(System.in);
		
		tui.startGame();
		
		GraphicUI gui = new GraphicUI(controller);
		boolean run = true;
		while (run) {
			run = tui.processInputLine(scanner.next());
		}
		System.out.println("Spiel beendet!");
	}
}
