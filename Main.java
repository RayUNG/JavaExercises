package com.ray10pm;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

/**
 * Created by Ray on 01.01.2019
 * Revised by Ray on 
 * @author Ray
 *
 */

public class Main {
	
	private static List<Album> albums = new ArrayList<Album>();
	
	public static void main(String[] args) {

		Album album = new Album("Kamikaze", "Eminem");
		album.addSong("The Ringer", 5.37);
		album.addSong("Greatest", 3.46);
		album.addSong("Lucky You", 4.04);
		album.addSong("Paul", 0.35);
		album.addSong("Normal", 3.42);
		album.addSong("Em Calls Paul", 0.49);
		album.addSong("Stepping Stone", 5.09);
		album.addSong("Not Alike", 4.48);
		album.addSong("Kamikaze", 3.36);
		album.addSong("Fall", 4.22);
		album.addSong("Nice Guy", 2.30);
		album.addSong("Good Guy", 2.22);
		album.addSong("Venom", 4.29);
		albums.add(album);
		System.out.println("\n----------------------------------------------\n");
		System.out.println("1st Album:\n");
		System.out.println(albums.get(0).getArtist() + " - " + albums.get(0).getName());
		albums.get(0).showAlbumSongs();
		System.out.println("\n----------------------------------------------\n");
		
		album = new Album("Oceanborn", "Nightwish");
		album.addSong("Stargazers", 4.28);
		album.addSong("Gethsemane", 5.22);
		album.addSong("Devil & the Deep Dark Ocean", 4.46);
		album.addSong("Sacrament of Wilderness", 4.12);
		album.addSong("Passion and the Opera", 4.50);
		album.addSong("Swanheart", 4.44);
		album.addSong("Moondance", 3.31);
		album.addSong("The Riddler", 5.16);
		album.addSong("The Pharaoh Sails to Orion", 6.26);
		album.addSong("Walking in the Air", 5.31);
		albums.add(album);
		System.out.println("\n----------------------------------------------\n");
		System.out.println("2nd Album:\n");
		System.out.println(albums.get(1).getArtist() + " - " + albums.get(1).getName());
		albums.get(1).showAlbumSongs();
		System.out.println("\n----------------------------------------------\n");
		
		album = new Album("Metallica", "Metallica");
		album.addSong("Enter Sandman", 5.34);
		album.addSong("Sad nut True", 5.24);
		album.addSong("Holier Than Thou", 3.48);
		album.addSong("The Unforgiven", 6.26);
		album.addSong("Wherever I May Roam", 6.44);
		album.addSong("Don't Tread on Me", 4.01);
		album.addSong("Throungh the Never", 4.03);
		album.addSong("Nothing Else Matters", 6.30);
		album.addSong("Of Wolf and Man", 4.17);
		album.addSong("The God THat Failed", 5.09);
		album.addSong("My Friend of Misery", 6.48);
		album.addSong("The Struggle Within", 3.56);
		albums.add(album);
		System.out.println("\n----------------------------------------------\n");
		System.out.println("3rd Album:\n");
		System.out.println(albums.get(2).getArtist() + " - " + albums.get(2).getName());
		albums.get(2).showAlbumSongs();
		System.out.println("\n----------------------------------------------\n");
		
		
		
		
		List<Song> playList = new ArrayList<Song>();
		albums.get(2).addToPlayList("Don't Tread on Me", playList);
		albums.get(0).addToPlayList("Test", playList);
		albums.get(1).addToPlayList("Gethsemane", playList);
		albums.get(0).addToPlayList("Normal", playList);
		albums.get(1).addToPlayList("Swanheart", playList);
		albums.get(2).addToPlayList("The God THat Failed", playList);
		albums.get(0).addToPlayList(9, playList);
		albums.get(1).addToPlayList(8, playList);
		albums.get(2).addToPlayList(3, playList);
		albums.get(0).addToPlayList(2, playList);
		albums.get(0).addToPlayList(24, playList);
		
		play(playList);	
		
		
		
	}
	
	private static void play(List<Song> playList) {
		Scanner scanner = new Scanner(System.in);
		boolean quit = false;
		boolean forward = true;
		
		ListIterator<Song> listIterator = playList.listIterator();
		if(playList.size() == 0) {
			System.out.println("No song in playlist");
		}else {
			System.out.println("Now playing " + listIterator.next().toString());
			printMenu();
		}
		
		while(!quit) {
			int action = scanner.nextInt();
			scanner.nextLine();
			
			switch(action) {
			case 0:
				System.out.println("Playlist complete.");
				quit = true;			
				break;
			case 1:
				if(!forward) {
					if(listIterator.hasNext()) {
						listIterator.next();
					}
					forward = true;
				}
				if(listIterator.hasNext()) {
					System.out.println("Now playing " + listIterator.next().toString());
				}else {
					System.out.println("We have reached the end of the playlist");
					forward = false;
				}
				break;
			case 2:
				if(forward) {
					if(listIterator.hasPrevious()) {
						listIterator.previous();
					}
					forward = false;
				}
				if(listIterator.hasPrevious()) {
					System.out.println("Now playing " + listIterator.previous().toString());
				}else {
					System.out.println("We are at the start of the playlist");
					forward = true;
				}
				break;
			case 3:
				if(forward) {
					if(listIterator.hasPrevious()) {
						System.out.println("Now replaying "+listIterator.previous().toString());
						forward = false;
					}else {
						System.out.println("Weare at the start of the list");
					}
				}else {
					if(listIterator.hasNext()) {
						System.out.println("Now replaying "+listIterator.next().toString());
						forward = true;
					}else {
						System.out.println("We have reached the end of the list");
					}
				}
				break;
			case 4:
				printList(playList);
				break;
			case 5:
				printMenu();
				break;
			case 6:
				if(playList.size() > 0) {
					listIterator.remove();
					if(listIterator.hasNext()) {
						System.out.println("Now playing " + listIterator.next());
					}else if(listIterator.hasPrevious()) {
						System.out.println("Now playing " + listIterator.previous());
					}
				}
			}
		}
		scanner.close();
	}
	
	private static void printMenu() {
		System.out.println("Available actions:\npress");
		System.out.println("0 - to quit\n"+"1 - to play next song\n"+"2 - to play previous song\n"+
		"3 - to replay the current song\n"+"4 - list songs in the playlist\n"+"5 - print available actions.\n"+
				"6 - delete current song from playlist");
	}
	
	private static void printList(List<Song> playList) {
		Iterator<Song> iterator = playList.iterator();
		System.out.println("===================================");
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		System.out.println("===================================");
	}

}
