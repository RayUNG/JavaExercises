/**
 * 
 */
package com.ray88u;


import java.util.Scanner;

public class Main {
	
	static int i = 0;

	static Scanner sc = new Scanner(System.in);

	static Hamburger burger = new Hamburger();

	public static void main(String[] args) {

		greeting();
		menu();

	}

	public static void greeting() {

		System.out.println("********************************");
		System.out.println("*****Welcome to Ray's Burgers*****");
		System.out.println("********************************");
		System.out.println("\n" + "             Menu             ");
		System.out.println("1.Classic Hamburger");
		System.out.println("(on a sesame seed bun with beef at 8.50)");
		System.out.println("2.Healthy Hamburger");
		System.out.println("(on a brown rye bread roll with beef at 9.50)");
		System.out.println("3.Deluxe  Hamburger");
		System.out.println("(on a brioche bun with angus beef and free drinks and fries at 14.50)");
		System.out.println("Please enter the number corresponding with your choice:");

	}

	public static void menu() {

		while (!sc.hasNextInt()) {
			sc.next();
			System.out.println("No characters allowed.Try again:");
		}

		byte option = sc.nextByte();
		sc.nextLine();

		switch (option) {
		case 1:
			classic();
			break;
		case 2:
			healthy();
			break;
		case 3:
			deluxe();
			break;
		default:
			System.out.println("Please enter a valid option:");
			menu();

		}

	}

	public static void classic() {
		burger.setName("Classic Hamburger");
		burger.setRollBread("sesame seed bun");
		burger.setMeat("beef");
		burger.setPrice(8.50);

		System.out.println("You have chosen " + burger.getName() + " :\n" + "- " + burger.getRollBread() + "\n" + "- "
				+ burger.getMeat() + " \nPrice : £" + burger.getPrice() + "\n\n"
				+ "Please select up to 4 additions from the list below:");
		System.out.println("1.Lettuce     -  £0.50\t2.Tomato     -  £0.50\t3.Carrots        -  £0.50\n"
				+ "4.Onion       -  £0.50\t5.Salad      -  £0.50\t6.Cheese        -  £1.50\n"
				+ "7.House Mayo  -  £1.00\t8.BBQ Sauce  -  £1.00\t9.Crispy Bacon  -  £2.00\n"
				+ "0.No more additions");
		for (i = 0; i < 4; i++) {
			add();
		}
		yourOrder();

	}

	public static void healthy() {
		burger.setName("Healthy Hamburger");
		burger.setRollBread("brown rye bread roll");
		burger.setMeat("beef");
		burger.setPrice(9.50);
		
		System.out.println("You have chosen " + burger.getName() + " :\n" + "- " + burger.getRollBread() + "\n" + "- "
				+ burger.getMeat() + " \nPrice : £" + burger.getPrice() + "\n\n"
				+ "Please select up to 6 additions from the list below:");
		System.out.println("1.Lettuce     -  £0.50\t2.Tomato     -  £0.50\t3.Carrots        -  £0.50\n"
				+ "4.Onion       -  £0.50\t5.Salad      -  £0.50\t6.Cheese        -  £1.50\n"
				+ "7.House Mayo  -  £1.00\t8.BBQ Sauce  -  £1.00\t9.Crispy Bacon  -  £2.00\n"
				+ "0.No more additions");
		for (i=0; i < 6; i++) {
			add();
		}
		yourOrder();
	}

	public static void deluxe() {
		burger.setName("Deluxe Hamburger");
		burger.setRollBread("brioche bun");
		burger.setMeat("angus beef");
		burger.setPrice(14.50);

		System.out.println("You have chosen " + burger.getName() + " :\n" + "- " + burger.getRollBread() + "\n" + "- "
				+ burger.getMeat() + " \nPrice : £" + burger.getPrice() + "\n\n"
				+ "Please select the type of fries and drinks you want:");
		System.out.println("Fries : \n1.Skinny Fries   \t2.Chunky Fries   \t3.Sweet Potato Fries      \n"
						  +"0.No Fries");
		fries();
		System.out.println("Drinks :\n1.Diet Coke      \t2.Sprite         \t3.Coke Zero               \n"
						  +"0.No Drinks");
		drinks();
		yourOrder();
	}

	public static void yourOrder() {

		System.out.println("\nYour order is:\n" + burger.getName() + " on a " + burger.getRollBread() + " with "
				+ burger.getMeat() + " - £" + burger.getPrice());
		for (int i = 0; i < 10; i++) {
			switch (i) {
			case 1:
				if (burger.getAddPrice1() > 0) {
					System.out.println("Added " + burger.getAddMore1() + " for an extra - £" + burger.getAddPrice1());
				}
				break;
			case 2:
				if (burger.getAddPrice2() > 0) {
					System.out.println("Added " + burger.getAddMore2() + " for an extra - £" + burger.getAddPrice2());
				}
				break;
			case 3:
				if (burger.getAddPrice3() > 0) {
					System.out.println("Added " + burger.getAddMore3() + " for an extra - £" + burger.getAddPrice3());
				}
				break;
			case 4:
				if (burger.getAddPrice4() > 0) {
					System.out.println("Added " + burger.getAddMore4() + " for an extra - £" + burger.getAddPrice4());
				}
				break;
			case 5:
				if (burger.getAddPrice5() > 0) {
					System.out.println("Added " + burger.getAddMore5() + " for an extra - £" + burger.getAddPrice5());
				}
				break;
			case 6:
				if (burger.getAddPrice6() > 0) {
					System.out.println("Added " + burger.getAddMore6() + " for an extra - £" + burger.getAddPrice6());
				}
				break;
			case 7:
				if (burger.getAddPrice7() > 0) {
					System.out.println("Added " + burger.getAddMore7() + " for an extra - £" + burger.getAddPrice7());
				}
				break;
			case 8:
				if (burger.getAddPrice8() > 0) {
					System.out.println("Added " + burger.getAddMore8() + " for an extra - £" + burger.getAddPrice8());
				}
				break;
			case 9:
				if (burger.getAddPrice9() > 0) {
					System.out.println("Added " + burger.getAddMore9() + " for an extra - £" + burger.getAddPrice9());
				}
				break;
			}
		}
		burger.finalPrice();
		System.out.println("Your final order price is: £"+burger.getFinalPrice());
	}

	public static void add() {

		while (!sc.hasNextInt()) {
			sc.next();
			System.out.println("No characters allowed.Try again:");
		}

		byte add = sc.nextByte();
		sc.nextLine();

		switch (add) {
		case 0:
			i = 10;
			break;
		case 1:
			System.out.println("1.Lettuce  -  £0.50");
			burger.addition1("Lettuce", 0.50);
			break;
		case 2:
			System.out.println("2.Tomato  -  £0.50");
			burger.addition2("Tomato", 0.50);
			break;
		case 3:
			System.out.println("3.Carrots  -  £0.50");
			burger.addition3("Carrots", 0.50);
			break;
		case 4:
			System.out.println("4.Onion    -  £0.50");
			burger.addition4("Onion", 0.50);
			break;
		case 5:
			System.out.println("5.Salad  -  £0.50");
			burger.addition5("Salad", 0.50);
			break;
		case 6:
			System.out.println("6.Cheese    -  £1.50");
			burger.addition6("Cheese", 1.50);
			break;
		case 7:
			System.out.println("7.House Mayo    -  £1.00");
			burger.addition7("Bacon", 1.50);
			break;
		case 8:
			System.out.println("8.BBQ Sauce    -  £1.00");
			burger.addition8("BBQ Sauce", 1.00);
			break;
		case 9:
			System.out.println("9.Crispy Bacon    -  £2.00");
			burger.addition9("Crispy Bacon", 2.00);
			break;
		default:
			System.out.println("Please enter a valid option:");
			add();
		}
	}

	public static void drinks() {

		while (!sc.hasNextInt()) {
			sc.next();
			System.out.println("No characters allowed.Try again:");
		}

		byte add2 = sc.nextByte();

		switch (add2) {
		case 0:
			break;
		case 1:
			System.out.println("1.Diet Coke\n");
			burger.addition2("Diet Coke", 0.01);
			break;
		case 2:
			System.out.println("2.Sprite\n");
			burger.addition2("Sprite", 0.01);
			break;
		case 3:
			System.out.println("3.Coke Zero\n");
			burger.addition2("Coke Zero", 0.01);
			break;
		default:
			System.out.println("Please enter a valid option:");
			drinks();
		}

	}

	public static void fries() {

		while (!sc.hasNextInt()) {
			sc.next();
			System.out.println("No characters allowed.Try again:");
		}

		byte add2 = sc.nextByte();

		switch (add2) {
		case 0:
			break;
		case 1:
			System.out.println("1.Skinny Fries\n");
			burger.addition1("Skinny Fries", 0.01);
			break;
		case 2:
			System.out.println("2.Chunky Fries\n");
			burger.addition1("Chunky Fries", 0.01);
			break;
		case 3:
			System.out.println("3.Sweet Potato Fries\n");
			burger.addition1("Sweet Potato Fries", 0.01);
			break;
		default:
			System.out.println("Please enter a valid option:");
			fries();
		}

	}

}
