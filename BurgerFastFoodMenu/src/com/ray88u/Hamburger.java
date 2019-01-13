/**
 * 
 */
package com.ray88u;

public class Hamburger {

	private String AddMore1;
	private double AddPrice1;

	private String AddMore2;
	private double AddPrice2;

	private String AddMore3;
	private double AddPrice3;

	private String AddMore4;
	private double AddPrice4;

	private String AddMore5;
	private double AddPrice5;

	private String AddMore6;
	private double AddPrice6;

	private String AddMore7;
	private double AddPrice7;

	private String AddMore8;
	private double AddPrice8;

	private String AddMore9;
	private double AddPrice9;

	private String name;
	private String rollBread;
	private String meat;
	private double price;
	private double finalPrice;

	public Hamburger() {
		super();
	}

	public Hamburger(String name, String rollBread, String meat, double price) {
		super();
		this.name = name;
		this.rollBread = rollBread;
		this.meat = meat;
		this.price = price;
	}

	public void finalPrice() {
		this.setFinalPrice(this.price + this.AddPrice1 + this.AddPrice2 + this.AddPrice3 + this.AddPrice4
				+ this.AddPrice5 + this.AddPrice6 + this.AddPrice7 + this.AddPrice8 + this.AddPrice9);

	}

	public void addition1(String name, double price) {
		this.AddMore1 = name;
		this.AddPrice1 = price;
	}

	public void addition2(String name, double price) {
		this.AddMore2 = name;
		this.AddPrice2 = price;
	}

	public void addition3(String name, double price) {
		this.AddMore3 = name;
		this.AddPrice3 = price;
	}

	public void addition4(String name, double price) {
		this.AddMore4 = name;
		this.AddPrice4 = price;
	}

	public void addition5(String name, double price) {
		this.AddMore5 = name;
		this.AddPrice5 = price;
	}

	public void addition6(String name, double price) {
		this.AddMore6 = name;
		this.AddPrice6 = price;
	}

	public void addition7(String name, double price) {
		this.AddMore7 = name;
		this.AddPrice7 = price;
	}

	public void addition8(String name, double price) {
		this.AddMore8 = name;
		this.AddPrice8 = price;
	}

	public void addition9(String name, double price) {
		this.AddMore9 = name;
		this.AddPrice9 = price;
	}

	public String getName() {
		return name;
	}

	public String getRollBread() {
		return rollBread;
	}

	public String getMeat() {
		return meat;
	}

	public double getPrice() {
		return price;
	}

	public String getAddMore1() {
		return AddMore1;
	}

	public double getAddPrice1() {
		return AddPrice1;
	}

	public String getAddMore2() {
		return AddMore2;
	}

	public double getAddPrice2() {
		return AddPrice2;
	}

	public String getAddMore3() {
		return AddMore3;
	}

	public double getAddPrice3() {
		return AddPrice3;
	}

	public String getAddMore4() {
		return AddMore4;
	}

	public double getAddPrice4() {
		return AddPrice4;
	}

	public String getAddMore5() {
		return AddMore5;
	}

	public double getAddPrice5() {
		return AddPrice5;
	}

	public String getAddMore6() {
		return AddMore6;
	}

	public double getAddPrice6() {
		return AddPrice6;
	}

	public String getAddMore7() {
		return AddMore7;
	}

	public double getAddPrice7() {
		return AddPrice7;
	}

	public String getAddMore8() {
		return AddMore8;
	}

	public double getAddPrice8() {
		return AddPrice8;
	}

	public String getAddMore9() {
		return AddMore9;
	}

	public double getAddPrice9() {
		return AddPrice9;
	}

	
	
	
	public void setMeat(String meat) {
		this.meat = meat;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	public void setRollBread(String rollBread) {
		this.rollBread = rollBread;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getFinalPrice() {
		return finalPrice;
	}

	public void setFinalPrice(double finalPrice) {
		this.finalPrice = finalPrice;
	}

	
}
