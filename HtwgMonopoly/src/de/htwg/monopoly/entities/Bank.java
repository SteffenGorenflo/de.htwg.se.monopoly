package de.htwg.monopoly.entities;

public final class Bank {

	private static int parkingMoney = 0;

	private Bank() {
	}

	/**
	 * The current Player pays the rent of the current Street to its owner. Note
	 * that the currentField-Object must be a Street-Object.
	 * 
	 * @param currentPlayer
	 * @param currentField
	 */
	public static void payRent(Player currentPlayer, IFieldObject currentField) {
		Street currentStreet = (Street) currentField;
		int rent = currentStreet.getRent();
		Player owner = currentStreet.getOwner();

		currentPlayer.setBudget(currentPlayer.getBudget() - rent);
		owner.setBudget(owner.getBudget() + rent);

	}

	/**
	 * The current Player receives money from the Bank. It is possible, that the amount of
	 * money is negative. In that case, the player pays money to the Bank.
	 * 
	 * @param currentPlayer
	 * @param money
	 */
	public static void receiveMoney(Player currentPlayer, int money) {
		currentPlayer.setBudget(currentPlayer.getBudget() + money);
	}

	/**
	 * Returns and "removes" the money in the middle of the playfield.
	 * 
	 * @return int
	 */
	public static int getParkingMoney() {
		int returnvalue = parkingMoney;
		parkingMoney = 0;
		return returnvalue;
	}

	/**
	 * priceToPay is added to the parking Money (Which is in the "middle" of the
	 * playfield)
	 * 
	 * 
	 * @param priceToPay
	 * @return void
	 */
	public static void addParkingMoney(int priceToPay) {
		parkingMoney += priceToPay;
	}

	/**
	 * Money is transferred from [receive] to [send]. If Money is a negative
	 * number, its the other way.
	 * 
	 * @param receive
	 * @param send
	 * @param money
	 */
	public static void receiveMoneyFromPlayer(Player receive, Player send,
			int money) {
		receive.setBudget(receive.getBudget() + money);
		send.setBudget(send.getBudget() - money);
	}
}
