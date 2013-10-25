package de.htwg.monopoly.entities;

import java.awt.Color;

import de.htwg.monopoly.util.MonopolyUtil;


public class Street {
	String name;
	int priceForStreet;
	Color color;
	int rent;
	int pricePerHotel;
	int numberOfHotels;

	public Street(String name, int priceForStreet, Color color, int rent,
			int pricePerHotel, int numberOfHotels) {
		super();
		this.name = name;
		this.priceForStreet = priceForStreet;
		this.color = color;
		this.rent = rent;
		this.pricePerHotel = pricePerHotel;
		this.numberOfHotels = numberOfHotels;
	}

	public Street() {
		this.name = "empty";
		this.priceForStreet = MonopolyUtil.NULL;
		this.color = Color.black;
		this.rent = MonopolyUtil.NULL;
		this.pricePerHotel = MonopolyUtil.NULL;
		this.numberOfHotels = MonopolyUtil.NULL;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPriceForStreet() {
		return priceForStreet;
	}

	public void setPriceForStreet(int priceForStreet) {
		this.priceForStreet = priceForStreet;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public int getRent() {
		return rent;
	}

	public void setRent(int rent) {
		this.rent = rent;
	}

	public int getPricePerHotel() {
		return pricePerHotel;
	}

	public void setPricePerHotel(int pricePerHotel) {
		this.pricePerHotel = pricePerHotel;
	}

	public int getNumberOfHotels() {
		return numberOfHotels;
	}

	public void setNumberOfHotels(int numberOfHotels) {
		this.numberOfHotels = numberOfHotels;
	}

}
